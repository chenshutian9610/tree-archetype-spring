# tree-archetype-spring 

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

----------------------------------------------------------------------------------------------------------------------

* 请自行在 resources/test 中建立 initialize.xls 和 expected.xls
* 如果需要使用数据库初始化功能请编辑 resources/ddl/ddl.sql 和 unitils.properties
* 默认使用 mysql 数据库,如果需要使用 oracle 只需要去掉 unitils-local 的注释并修改 pom 的 profile