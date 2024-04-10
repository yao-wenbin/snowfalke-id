区别于传统的19位的，能够使得前端JS更好接收的16位的雪花算法生成器。

- ``snowflake-id-core`` 雪花ID生成器核心模块
  - ``IDGenerator`` 16位雪花生成组件
- ``snowflake-mybatis-plus-spring-boot-stater`` springboot集成模块
  - ``IdentifierGeneratorImpl`` mybatis-plus Identifier接口实现类
  - ``IdentifierGeneratorAutoConfiguration`` Spring Boot自动注入