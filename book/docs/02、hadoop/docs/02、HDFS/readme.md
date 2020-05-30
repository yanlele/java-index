## HDFS

文件需要以多副本的方式存储

### jdk安装
解压 `tar -zxvf jdk-8u161-linux-x64.tar.gz -C ~/app`                      
添加到系统变量： `~/.bash_profile`                  
```
export JAVA_HOME=/home/vagrant/app/java1.8.161
exprot PAHT=$JAVA_HOME/bin:$PATH
```
使得环境变量生效 `source ~/.bash_profile`
验证Java是否安装成功： `java -v`
