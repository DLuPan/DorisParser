package com.lfsenior.sql.parser.clickhouse.antlr4;

import java.util.HashSet;
import java.util.Set;

/**
 * @program: DorisParser
 * @package: com.lfsenior.sql.parser.clickhouse
 * @description: 字典数据结构
 * @author: DingLuPan
 * @create: 2021/11/1 15:10
 **/
public class Dictionary<T> {
    /***字典的的使用容器*/
    private Set<T> container = new HashSet<>();

    /**
     * 容器内添加值
     *
     * @param t 添加的对象
     */
    public void insert(T t) {
        container.add(t);
    }

    /**
     * 判断值是否已经在容器内了
     *
     * @param t 值对象
     * @return 是否包含对象
     */
    public boolean count(T t) {
        return container.contains(t);
    }
}
