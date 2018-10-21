# tree-archetype-spring

## 1.0.0

* 默认值如下: (在初始化时可以修改)<br>
    package = com.tree<br>
    jdbc = mysql<br>
    database = testdb<br>
    username = root<br>
    password = 0009

* 包含<br>
    jdbc = mysql, oracle<br>
    framework = spring, mybatis, hibernate<br>
    test = unitils, testng, mockito, dbunit<br>

---

* 请自行在 resources/test 中建立 initialize.xls 和 expected.xls
* 如果需要使用数据库初始化功能请编辑 resources/ddl/ddl.sql 和 unitils.properties
* 默认使用 mysql 数据库,如果需要使用 oracle 只需要去掉 unitils-local 的注释并修改 pom 的 profile

---

## 2.0.0

* 新增特性（本次修改几乎在 test 中）<br>
    修改了 @Column 和 Ejb3Column 的代码，使之可以使用 comment 和 defaultValue 属性<br>
    修改了 PropertyContainer 的代码，使通过注解生成的表的字段顺序不乱<br>
    正向工程和逆向工程的融合<br>
    &emsp;在 domain 中添加类<br>
    &emsp;在 generatedConfig.xml 修改表配置<br>
    &emsp;最后启动 GenerateTableAndCode 类即可
    
* 修改了 pom.xml 文件，添加了公司 nexus 库的配置和 jrebel 配置