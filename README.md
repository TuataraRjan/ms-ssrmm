# ms-ssrmm

针对springboot、springcloud、redis、mybatis、mariadb集成的demo代码

#准备工作
1、服务器一台，也可用本机代替

2、服务器需要安装java环境

3、服务器需要安装mariadb、redis，同时安装zookeeper用于支持springCloudBus，其中zookeeper采用standalone模式即可

4、本地机器需要安装kafak用于支持springCloudBus

5、eclipse或者idea的java开发环境一套，开发环境中需要准备好maven集成插件，确保外网连接，其中demo采用jdk1.8进行编译。

ps.1：中间件安装网上资料丰富，不再赘述

ps.2：kafka原本也应该装在服务器上，但是由于kafka配置中的listeners和advitised.listeners很混乱，无论怎么配置总是出现leader\_not\_available，网上也无法找到更好的解决办法，为了保证原计划进度，将kafka搭建在了本地机器中，顺利运行。对于leader\_not\_available问题，需要后续持续跟进。

#介绍

![Image text](ms-ssrmm/assets/Introduction-1.png)







