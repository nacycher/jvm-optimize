# jvm-optimize
jvm调优项目，真实jvm调优案例， JVM tuning project, real JVM tuning cases

## 案例一：插入数据的API，超时问题
- 背景：
一个向数据库插入数据的API，在极端情况下，需要插入大量数据，5张表，共2w条数据，但是耗时5分钟以上。
- 环境：jdk8 2核2g容器
- jvm参数： 
```jvm
JVM PARA=-server -XX:InitialRAMPercentage=90.0 -XX:MaxRAMPercentage=90.0 
-XX:MinRAMPercentage=90.0 -XX:+UseG1GC -XX:+PrintGCDetails -XX:+PrintGCDateStampsXX:+PrintHeapAtGC 
-XX:+PrintGCCause -XX:+PrintGCApplicationStoppedTime -XX:+PrintTenuringDistribution -Xloggc:D:\\log\\gc.log 
-XX:+UseGCLogFileRotation -XX:NumberOfGCLogFiles=14 -XX:GCLogFileSize=100M -XX:+HeapDumpOnOutOfMemoryError 
-XX:HeapDumpPath=D:\\log
-Dcom.sun.management.imxremote.port=9981 -Dcom.sun.management.imxremote.ssl=false 
-Dcom.sun.management.jmxremote.authenticate=falseagentlib:jdwp=transport=dt socket,server=y,suspend=n,address=11006
  ACTIVE=test
  
  JVM PARA=-server -XX:InitialRAMPercentage=90.0 -XX:MaxRAMPercentage=90.0 
-XX:MinRAMPercentage=90.0 -XX:+UseG1GC -XX:+PrintGCDetails -XX:+PrintGCDateStampsXX:+PrintHeapAtGC 
-XX:+PrintGCCause -XX:+PrintGCApplicationStoppedTime -XX:+PrintTenuringDistribution 
-XX:+UseGCLogFileRotation -XX:NumberOfGCLogFiles=14 -XX:GCLogFileSize=100M -XX:+HeapDumpOnOutOfMemoryError 
-Dcom.sun.management.imxremote.port=9981 -Dcom.sun.management.imxremote.ssl=false 
-Dcom.sun.management.jmxremote.authenticate=falseagentlib:jdwp=transport=dt socket,server=y,suspend=n,address=11006
  ACTIVE=test
```
