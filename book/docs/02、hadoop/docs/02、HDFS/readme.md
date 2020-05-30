## HDFS

文件需要以多副本的方式存储

### 环境搭建

#### jdk安装
解压 `tar -zxvf jdk-8u161-linux-x64.tar.gz -C ~/app`                      
添加到系统变量： `sudo vim ~/.bash_profile`                  
```
PATH=$PATH:$HOME/.local/bin:$HOME/bin

export PATH
export JAVA_HOME=/home/vagrant/app/jdk1.8.0_161
export JRE_HOME=${JAVA_HOME}/jre
export CLASSPATH=.:${JAVA_HOME}/lib:${JRE_HOME}/lib:$CLASSPATH
export JAVA_PATH=${JAVA_HOME}/bin:${JRE_HOME}/bin
export PATH=$PATH:${JAVA_PATH}
```
使得环境变量生效 `source ~/.bash_profile`
验证Java是否安装成功： `java -v`

#### 安装SSH
如果没有SSH， 就直接安装： `sudo yun -y install ssh`                       
配置免密码登录： `ssh-keygen -t rsa`                    
拷贝密钥：`cp ~/.ssh/id_rsa.pub ~/.ssh/authorized_keys`                  

#### 安装hadoop安装包
解压安装包： `tar -zxvf hadoop-2.6.0-cdh5.7.0.tar.gz -C ~/app`                
配置 `hadoop_home/etc/hadoop/hadoop-env.sh` 文件 的Java home 目录位置
```
#export JAVA_HOME=${JAVA_HOME}
export JAVA_HOME=/home/vagrant/app/jdk1.8.0_161
```

单节点配置 etc/hadoop/core-site.xml:
```
<configuration>
    <property>
        <name>fs.defaultFS</name>
        <value>hdfs://localhost:8020</value>
    </property>
    <property>
        <name>hadoop.tep.dir</name>
        <value>/home/vagrant/app/tmp</value>
    </property>
</configuration>
```

配置一个副本节点：etc/hadoop/hdfs-site.xml:       
```
<configuration>
    <property>
        <name>dfs.replication</name>
        <value>1</value>
    </property>
</configuration>
```


#### 启动hdfs
格式化文件系统-需要切换到hadoop bin 下面：  `./hadoop namenode -format`                        
启动服务： `sudo ./start-dfs.sh`
查看节点：               
```
[vagrant@centos7-hadoop-node1 sbin]$ jps
19761 NameNode
20040 SecondaryNameNode
22713 Jps
19882 DataNode
```

访问地址： `http://66.66.66.67:50070/`

停止服务：`./stop-dfs.sh`


### 操作

#### shell操作
常用命令： `ls \ mkdir \ put \ get \ rm`
```
[vagrant@centos7-hadoop-node1 sbin]$ hdfs dfs
Usage: hadoop fs [generic options]
	[-appendToFile <localsrc> ... <dst>]
	[-cat [-ignoreCrc] <src> ...]
	[-checksum <src> ...]
	[-chgrp [-R] GROUP PATH...]
	[-chmod [-R] <MODE[,MODE]... | OCTALMODE> PATH...]
	[-chown [-R] [OWNER][:[GROUP]] PATH...]
	[-copyFromLocal [-f] [-p] [-l] <localsrc> ... <dst>]
	[-copyToLocal [-p] [-ignoreCrc] [-crc] <src> ... <localdst>]
	[-count [-q] [-h] [-v] <path> ...]
	[-cp [-f] [-p | -p[topax]] <src> ... <dst>]
	[-createSnapshot <snapshotDir> [<snapshotName>]]
	[-deleteSnapshot <snapshotDir> <snapshotName>]
	[-df [-h] [<path> ...]]
	[-du [-s] [-h] <path> ...]
	[-expunge]
	[-find <path> ... <expression> ...]
	[-get [-p] [-ignoreCrc] [-crc] <src> ... <localdst>]
	[-getfacl [-R] <path>]
	[-getfattr [-R] {-n name | -d} [-e en] <path>]
	[-getmerge [-nl] <src> <localdst>]
	[-help [cmd ...]]
	[-ls [-d] [-h] [-R] [<path> ...]]
	[-mkdir [-p] <path> ...]
	[-moveFromLocal <localsrc> ... <dst>]
	[-moveToLocal <src> <localdst>]
	[-mv <src> ... <dst>]
	[-put [-f] [-p] [-l] <localsrc> ... <dst>]
	[-renameSnapshot <snapshotDir> <oldName> <newName>]
	[-rm [-f] [-r|-R] [-skipTrash] <src> ...]
	[-rmdir [--ignore-fail-on-non-empty] <dir> ...]
	[-setfacl [-R] [{-b|-k} {-m|-x <acl_spec>} <path>]|[--set <acl_spec> <path>]]
	[-setfattr {-n name [-v value] | -x name} <path>]
	[-setrep [-R] [-w] <rep> <path> ...]
	[-stat [format] <path> ...]
	[-tail [-f] <file>]
	[-test -[defsz] <path>]
	[-text [-ignoreCrc] <src> ...]
	[-touchz <path> ...]
	[-usage [cmd ...]]
```


#### Java api 操作
添加依赖：
```xml
<?xml version="1.0" encoding="UTF-8"?>

<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
  xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
  <modelVersion>4.0.0</modelVersion>

  <groupId>com.yanle</groupId>
  <artifactId>hadoop-demo</artifactId>
  <version>1.0</version>
  <packaging>jar</packaging>

  <name>hadoop-demo</name>

  <properties>
    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    <hadoop.version>2.6.0-cdh5.7.0</hadoop.version>
  </properties>

  <repositories>
    <repository>
      <id>cloudera</id>
      <url>https://repository.cloudera.com/artifactory/cloudera-repos/</url>
    </repository>
  </repositories>


  <dependencies>
    <!--添加hadoop依赖-->
    <dependency>
      <groupId>org.apache.hadoop</groupId>
      <artifactId>hadoop-client</artifactId>
      <version>${hadoop.version}</version>
    </dependency>


    <!--添加单元测试的依赖-->
    <dependency>
      <groupId>junit</groupId>
      <artifactId>junit</artifactId>
      <version>4.10</version>
      <scope>test</scope>
    </dependency>
  </dependencies>

</project>
```

- 文件操作测试类
- HDFSApp


### 参考文件
- [Hadoop框架之HDFS的shell操作](https://www.cnblogs.com/hezhiyao/p/7627060.html)
- [shell 命令操作hdfs](https://blog.csdn.net/u012957549/article/details/78787742)