## mybatis generator
#### this is a mybatis generator project!

## 使用maven plugins插件生成mbatis
````
	<build>
		<plugins>
			<plugin>
				<groupId>org.springframework.boot</groupId>
				<artifactId>spring-boot-maven-plugin</artifactId>
			</plugin>
			<!-- mybatis代码生成器 -->
			<!-- mybatis generator -->
			<plugin>
				<groupId>org.mybatis.generator</groupId>
				<artifactId>mybatis-generator-maven-plugin</artifactId>
				<version>1.3.2</version>
				<configuration>
					<verbose>true</verbose>
					<overwrite>true</overwrite>
				</configuration>
			</plugin>
		</plugins>
	</build>
````

## mybatis 生成策略相关配置


### 1.设置mysql-connect jar路径
````
 <classPathEntry
            location="/Users/nickbi/.m2/repository/mysql/mysql-connector-java/5.1.44/mysql-connector-java-5.1.44.jar"/>
````

### 2. 修改 ```generatorConfig.xml``` 设置数据库连接信息为开发数据库
````
 <!-- !!!! Database Configurations !!!! -->
        <jdbcConnection driverClass="com.mysql.jdbc.Driver" connectionURL="jdbc:mysql://127.0.0.1:3306/mybatis-test"
                        userId="root" password="111111"/>
````

### 3.设置Model生成的项目路径
````
 <!-- !!!! Model Configurations !!!! -->
        <!--生成实体类 指定包名 以及生成的地址 （可以自定义地址，但是路径不存在不会自动创建  使用Maven生成在target目录下，会自动创建） -->
        <javaModelGenerator targetPackage="com.nickbi.mybatisgenerator.model" targetProject="src/main/java">
            <property name="enableSubPackages" value="false"/>
            <property name="trimStrings" value="true"/>
        </javaModelGenerator>
````
### 4.设置mapper生成的项目路径
````
 <!-- !!!! Mapper XML Configurations !!!! -->
        <!--生成SQLMAP文件 -->
        <sqlMapGenerator targetPackage="mybatis.mapper" targetProject="src/main/resources">
            <property name="enableSubPackages" value="false"/>
        </sqlMapGenerator>

````

### 5.设置要生成的table信息
````
   <table tableName="t_mybatis_test" domainObjectName="VisitControl" enableCountByExample="false" enableSelectByExample="false"/>
````

