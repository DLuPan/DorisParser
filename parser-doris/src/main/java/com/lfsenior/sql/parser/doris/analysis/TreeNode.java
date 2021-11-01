// Licensed to the Apache Software Foundation (ASF) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The ASF licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.

package com.lfsenior.sql.parser.doris.analysis;

import com.google.common.base.Predicate;
import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Generic tree structure. Only concrete subclasses of this can be instantiated.
 */
public class TreeNode<NodeType extends TreeNode<NodeType>> {
    protected ArrayList<NodeType> children = Lists.newArrayList();

    public NodeType getChild(int i) {
        return hasChild(i) ? children.get(i) : null;
    }

    public void addChild(NodeType n) {
        children.add(n);
    }

    public void addChildren(List<? extends NodeType> n) {
        children.addAll(n);
    }

    public boolean hasChild(int i) {
        return children.size() > i;
    }

    public void setChild(int index, NodeType n) {
        children.set(index, n);
    }

    public ArrayList<NodeType> getChildren() {
        return children;
    }

    public void clearChildren() {
        children.clear();
    }

    public void removeNode(int i) {
        if (children != null && i >= 0 && i < children.size()) {
            children.remove(i);
        }
    }


    /**
     * Add all nodes in the tree that satisfy 'predicate' to the list 'matches'
     * This node is checked first, followed by its children in order. If the node
     * itself matches, the children are skipped.
     */
    public <C extends TreeNode<NodeType>, D extends C> void collect(
            Predicate<? super C> predicate, Collection<D> matches) {
        // TODO: the semantics of this function are very strange. contains()
        // checks using .equals() on the nodes. In the case of literals, slotrefs
        // and maybe others, two different tree node objects can be equal and
        // this function would only return one of them. This is not intuitive.
        // We rely on these semantics to not have duplicate nodes. Investigate this.
        if (predicate.apply((C) this) && !matches.contains(this)) {
            matches.add((D) this);
            return;
        }
        for (NodeType child : children) child.collect(predicate, matches);
    }

    /**
     * Add all nodes in the tree that are of class 'cl' to the list 'matches'.
     * This node is checked first, followed by its children in order. If the node
     * itself is of class 'cl', the children are skipped.
     */
    public <C extends TreeNode<NodeType>, D extends C> void collect(
            Class cl, Collection<D> matches) {
        if (cl.equals(getClass())) {
            matches.add((D) this);
            return;
        }
        for (NodeType child : children) child.collect(cl, matches);
    }

    /**
     * Add all nodes in the tree that satisfy 'predicate' to the list 'matches'
     * This node is checked first, followed by its children in order. All nodes
     * that match in the subtree are added.
     */
    public <C extends TreeNode<NodeType>, D extends C> void collectAll(
            Predicate<? super C> predicate, List<D> matches) {
        if (predicate.apply((C) this)) matches.add((D) this);
        for (NodeType child : children) child.collectAll(predicate, matches);
    }

    /**
     * For each expression in 'nodeList', collect all subexpressions satisfying 'predicate'
     * into 'matches'
     */
    public static <C extends TreeNode<C>, D extends C> void collect(
            Collection<C> nodeList, Predicate<? super C> predicate, Collection<D> matches) {
        for (C node : nodeList) node.collect(predicate, matches);
    }

    /**
     * For each expression in 'nodeList', collect all subexpressions of class 'cl'
     * into 'matches'
     */
    public static <C extends TreeNode<C>, D extends C> void collect(
            Collection<C> nodeList, Class cl, Collection<D> matches) {
        for (C node : nodeList) node.collect(cl, matches);
    }


}
