当配置完 generatorConfig.xml 后(只需要改个表名)，只需要打开控制台，执行脚本：
java -jar mybatis-generator-core-1.3.2.jar -configfile generatorConfig.xml -overwrite  即可。
这样在生成之后，就可以在src目录下找到相应的文件夹，每个表格都会对应三个文件（实体类、接口、配置文件）。

此版本支持生成的实体带有数据字段注释，并且支持oracle版本。

