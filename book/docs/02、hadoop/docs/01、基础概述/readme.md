## hadoop 的基础概述

高可用、高扩展、分布式的计算框架。

包含模块                        
- Hadoop common
- Hadoop Distributed File System(HDFS)
- Hadoop Yarn
- Hadoop MapReduce

作用： 大数据仓库、PB级别数据存储、处理、分析、统计等业务

### 核心组件之HDFS
特点： 扩展性、容错高、海量数据存储

- 将文件切分为指定大小的数据快， 并且多副本的存储在多个机器上
- 数据的切分、多副本、容错等操作是对用户透、可操作可控制的

### 资源调度系统YARN
- Yet Another Resource Negotiator
- 负责集群的资源管理和调用
- 扩展、容错、多框架资源统一的调度

### 分布式计算框架MapReduce
- 扩展、容错、海量数据离线处理



### 参考文章
- [码说MapReduce ](https://www.sohu.com/a/108723970_362005)