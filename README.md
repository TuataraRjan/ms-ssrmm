# ms-ssrmm

针对springboot、springcloud、redis、mybatis、mariadb集成的demo代码

# 准备工作
1、服务器一台，也可用本机代替

2、服务器需要安装java环境

3、服务器需要安装mariadb、redis，同时安装zookeeper用于支持springCloudBus，其中zookeeper采用standalone模式即可

4、本地机器需要安装kafak用于支持springCloudBus

5、eclipse或者idea的java开发环境一套，开发环境中需要准备好maven集成插件，确保外网连接，其中demo采用jdk1.8进行编译。

ps.1：中间件安装网上资料丰富，不再赘述

ps.2：kafka原本也应该装在服务器上，但是由于kafka配置中的listeners和advitised.listeners很混乱，无论怎么配置总是出现leader\_not\_available，网上也无法找到更好的解决办法，为了保证原计划进度，将kafka搭建在了本地机器中，顺利运行。对于leader\_not\_available问题，需要后续持续跟进。

# 介绍
区别于上一个repo，本次完成的内容完全基于spring cloud的组件进行搭建：

EurekaServer--注册中心，所有服务模块均作为EurekaClient注册于注册中心

ConfigServer--配置中心，时刻监听git服务器配置文件的变更，通过SpringCloudBus结合kafka和zookeeper发送RefreshRemoteApplicationEvent通知ConfigClient对相关配置进行更新操作

Turbine--监控中心，对部署过Hystrix的服务进行监控，通过图表化的方式HystrixDashboard进行展示

Feign--远程调用，默认已经使用ribbon进行负载均衡

Zuul--前置网关，对客户端请求进行分发，起到负载均衡的目的。但是该组件的性能并不如nginx，实际使用中需要二者进行结合使用


## 模块关系图
![Image text](https://github.com/TuataraRjan/ms-ssrmm/blob/master/assets/Introduction-1.png)

## local与remote
![Image text](https://github.com/TuataraRjan/ms-ssrmm/blob/master/assets/Introduction-3.png)

前文中已经对kafka部署的问题进行了描述，不再赘述

## spring cloud 关系图
![Image text](https://github.com/TuataraRjan/ms-ssrmm/blob/master/assets/Introduction-2.png)

## 请求流向
![Image text](https://github.com/TuataraRjan/ms-ssrmm/blob/master/assets/Introduction-4.png)

图中所示红色、绿色、紫色分别代表客户、配置管理、Admin三种不同的角色在对系统进行访问时的请求流向

## 特点
考虑到在实际生产环境中，所有服务器均不可能以单点的方式部署，所以在整个搭建过程中，使用sprig profile进行了集群的模拟，采用更改端口号的方式，分别对Server、Provider、CServer、Consumer模块进行了集群的模拟，在本地调试的过程中，可以采用命令行参数--spring.profiles.active=xxx进行环境指定启动。




# 后续内容






