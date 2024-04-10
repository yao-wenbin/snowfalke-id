区别于传统的19位的，能够使得前端JS更好接收的16位的雪花算法生成器。

- ``snowflake-id-core`` 雪花ID生成器核心模块
  - ``IDGenerator`` 16位雪花生成组件
- ``snowflake-mybatis-plus-spring-boot-stater`` springboot集成模块
  - ``IdentifierGeneratorImpl`` mybatis-plus Identifier接口实现类
  - ``IdentifierGeneratorAutoConfiguration`` Spring Boot自动注入


# 如何使用？

## Spring Boot项目集成
如果你是Spring Boot项目，并且使用了Mybatis-Plus作为ORM框架，那么可以直接通过引入以下依赖
```xml
<dependency>
  <groupId>com.entropy-valley</groupId>
  <artifactId>snowflake-mybatis-plus-spring-boot-starter</artifactId>
  <version>1.0-SNAPSHOT</version>
</dependency>
```
该依赖会自动的实现Mybatis-Plus的Identifier接口，并自动注入到Spring容器中。


## 普通项目集成
如果你是其他类型的项目，那么可以直接引入snowflake-id-core模块

```xml
<dependency>
  <groupId>com.entropy-valley</groupId>
  <artifactId>snowflake-id-core</artifactId>
  <version>1.0-SNAPSHOT</version>
</dependency>
```
然后通过IDGenerator类来生成16位的雪花ID。
```java
IDGenerator.generateId();
```