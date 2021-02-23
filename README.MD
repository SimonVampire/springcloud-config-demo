SpringCloud CONFIG 高可用自动化配置
-------------------------------------------
因为配置一般很少改动，所以当配置修改的时候，这里采用手动刷新的方式：
http://${client.hostname}:${clent.port}}/actuator/refresh

如果不怕性能损耗，也可以使用自动刷新配置，使用Spring Cloud Bus结合MQ来实现。
单个人不推荐