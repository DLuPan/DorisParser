### 1、背景

因为需要对执行SQL进行统一管理与风险控制，所以需要对不同引擎的SQL都需要统一解析转换为我们自己的模型对象。

目前的SQL解析实现列表

| 引擎       | 解析实现      | 备注 |
| ---------- | ------------- | ---- |
| Mysql      | druid         |      |
| Hive       | druid         |      |
| Doris      | javacup+jflex |      |
| Clickhouse | Antlr4        |      |

### 2、相关实现参考

- [Doris](./parser-doris/readme.md)
- [Clickhouse](./parser-clickhouse/readme.md)

