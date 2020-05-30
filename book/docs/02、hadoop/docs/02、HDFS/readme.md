## HDFS

文件需要以多副本的方式存储

## 环境搭建

### jdk安装
解压 `tar -zxvf jdk-8u161-linux-x64.tar.gz -C ~/app`                      
添加到系统变量： `~/.bash_profile`                  
```
export JAVA_HOME=/home/vagrant/app/java1.8.161
exprot PAHT=$JAVA_HOME/bin:$PATH
```
使得环境变量生效 `source ~/.bash_profile`
验证Java是否安装成功： `java -v`

### 安装SSH
如果没有SSH， 就直接安装： `sudo yun -y install ssh`                       
配置免密码登录： `ssh-keygen -t rsa`                    
拷贝密钥：`cp ~/.ssh/id_rsa.pub ~/.ssh/authorized_keys`                  

### 安装hadoop安装包
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


