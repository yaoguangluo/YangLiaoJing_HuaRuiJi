# 函数名
DNA元基催化版本:德塔 Socket流可编程数据库
## 使用须知

##### ![实例](http://progressed.io/bar/100?title=completed)已完善功能：单表增删改查 。功能作者： 罗瑶光
##### ![实例](http://progressed.io/bar/100?title=completed)已完善功能：操作权限
##### ![实例](http://progressed.io/bar/100?title=completed)已完善功能：超时 (token的早期不可逆加密方式思路来自10年前的中科大的筛子加密论文，后本人修改为2次组合加密，并采用mine decode 方式解码，在这感谢中科大) 具体例子：https://blog.csdn.net/weizhiiceboy3/article/details/51955026 等， 感谢csdn 如果需要更高级别的需求，可以将该方法进行客户端2次加密， 形成广义非对称加密模型。

##### ![实例](http://progressed.io/bar/100?title=completed)已完善功能：hash存储。功能作者： 罗瑶光
##### ![实例](http://progressed.io/bar/100?title=completed)已完善功能：并发。功能作者： 罗瑶光
##### ![实例](http://progressed.io/bar/100?title=completed)已完善功能：数据库2级缓存。功能作者： 罗瑶光
##### ![实例](http://progressed.io/bar/100?title=completed)已完善功能：采用VPC/VPCS（作者罗瑶光）架构
##### ![实例](http://progressed.io/bar/100?title=completed)已完善功能：采用纯静态类接口。功能作者： 罗瑶光
##### ![实例](http://progressed.io/bar/100?title=completed)已完善功能：采用deta HTTP 服务器做 ADMIN。功能作者： 罗瑶光
##### ![实例](http://progressed.io/bar/100?title=completed)已完善功能：REST JSON 做第三方 request 扩展。。功能作者： 罗瑶光
##### ![实例](http://progressed.io/bar/100?title=completed)已完善功能：增加过滤，同源，限制机制。功能作者： 罗瑶光
##### ![实例](http://progressed.io/bar/100?title=completed)已完善功能：数据库查询映射区间。功能作者： 罗瑶光
##### ![实例](http://progressed.io/bar/100?title=completed)已完善功能：db plsql query设计 select。功能作者： 罗瑶光
##### ![实例](http://progressed.io/bar/100?title=completed)已完善功能：读写分离， 读操作全部3级缓存。。功能作者： 罗瑶光
##### ![实例](http://progressed.io/bar/100?title=completed)已完善功能：plsql 量子数据库语言去死锁机制。。功能作者： 罗瑶光
##### ![实例](http://progressed.io/bar/100?title=completed)已完善功能：德塔 PL/SQL 数据分析语言 定义规范。。功能作者： 罗瑶光
##### ![实例](http://progressed.io/bar/100?title=completed)已完善功能：前端angular html页面， 感谢webadmin 开源项目组，本人采用了bootstrap原生js组件。
##### ![实例](http://progressed.io/bar/100?title=completed)已完善功能：select功能的表join 函数功能作者： 罗瑶光
##### ![实例](http://progressed.io/bar/100?title=completed)已完善功能：select功能的表aggregation limit 函数功能作者： 罗瑶光
##### ![实例](http://progressed.io/bar/100?title=completed)已完善功能：semi join功能的表 relation 函数功能作者： 罗瑶光
##### ![实例](http://progressed.io/bar/100?title=completed)已完善功能：plsql changeDBPath/ setRoot函数；功能作者： 罗瑶光
##### ![实例](http://progressed.io/bar/100?title=completed)已完善功能：plsql create table函数；功能作者： 罗瑶光
##### ![实例](http://progressed.io/bar/100?title=completed)已完善功能：db plsql query设计 update 功能作者： 罗瑶光2019-01-22
##### ![实例](http://progressed.io/bar/100?title=completed)已完善功能：db plsql query设计 insert  功能作者： 罗瑶光2019-01-23 备注：没有检查，
##### ![实例](http://progressed.io/bar/100?title=completed)已完善功能：db plsql query设计 delete  功能作者： 罗瑶光2019-01-24 备注：已经检查，
##### ![实例](http://progressed.io/bar/100?title=completed)已完善功能：1 update rest接口涉及的缓存更新 功能作者：罗瑶光2019-01-24
##### ![实例](http://progressed.io/bar/100?title=completed)已完善功能：2 delete rest接口涉及的缓存更新 功能作者：罗瑶光2019-01-24
##### ![实例](http://progressed.io/bar/100?title=completed)已完善功能：3 insert rest接口涉及的缓存更新 功能作者：罗瑶光2019-01-24
##### ![实例](http://progressed.io/bar/100?title=completed)已完善功能：之前因为没有内存映射区间，所以操作都是硬盘方式，现在有了3， 4级缓存，所有读走2,3,4级buffer，所以之前导致的硬盘修改写操作都要进行缓存更新，我需要完成这个功能，同时我还做了网页cache，这些相关的地方也要及时更新。2019-01-25
##### ![实例](http://progressed.io/bar/100?title=completed)已完善功能：所有数据格式通过restcall的准备全部走gzip，功能已经实现在在另外一个项目中 https://github.com/yaoguangluo/Deta_VPCS_Frontend/blob/master/DetaSrc/org/deta/boot/vpc/vision/RestMapVision.java 到时候我会整合。2019-01-26~27
##### ![实例](http://progressed.io/bar/100?title=completed)已完善功能：update 的 nest join 函数 功能作者：罗瑶光2019-01-28 采用离散数学的conjunction 地摩根迭代化简进行多join表的选择条件区分。2019-01-28
##### ![实例](http://progressed.io/bar/100?title=completed)已完善功能：固定变量名称编程规范整体整理。动态集合先搁置。罗瑶光2019-01-29
##### ![实例](http://progressed.io/bar/100?title=completed)已完善功能：语音媒体文件的发送。 罗瑶光2019-01-29
##### ![实例](http://progressed.io/bar/100?title=completed)已完善功能：套接字阅读格式规范。 罗瑶光2019-01-29
##### ![实例](http://progressed.io/bar/100?title=completed)已完善功能：tcp 协议 header格式规范。 罗瑶光2019-01-29
##### ![实例](http://progressed.io/bar/100?title=completed)已完善功能：select where in 函数。罗瑶光2019-01-29
##### ![实例](http://progressed.io/bar/100?title=completed)已完善功能：select where !in 函数。罗瑶光2019-01-29
##### ![实例](http://progressed.io/bar/100?title=completed)已完善功能：日志管理系统的VPCS定义。罗瑶光2019-01-29
##### ![实例](http://progressed.io/bar/100?title=completed)已完善功能：plsql日志binlog 记录定义。罗瑶光2019-01-30
##### ![实例](http://progressed.io/bar/100?title=completed)已完善功能：plsql日志binlog 记录压缩简单实现。罗瑶光2019-01-30
##### ![实例](http://progressed.io/bar/100?title=completed)已完善功能：plsql日志binlog 逐行写记录为优化版实现。罗瑶光2019-01-30
##### ![实例](http://progressed.io/bar/100?title=completed)已完善功能：plsql编程规范文档1.0版发布。罗瑶光2019-01-30 https://github.com/yaoguangluo/VPCS_Theroy/blob/master/Deta_Database_PLSQL%20_V1.0.pdf
##### ![实例](http://progressed.io/bar/100?title=completed)已完善功能：plsql 日志读过滤 和 写安全机制。。罗瑶光2019-01-30 
##### ![实例](http://progressed.io/bar/100?title=completed)已完善功能：写错误的rollback 函数。 罗瑶光2019-01-30 
##### ![实例](http://progressed.io/bar/100?title=completed)已完善功能：REST CALL ROLLBACK函数。 罗瑶光2019-01-30 
##### ![实例](http://progressed.io/bar/100?title=completed)已完善功能：测试和真实运行plsql写操作 restcall 函数。方便为后端业务整体rollback功能打下扎实基础。罗瑶光2019-01-30 
//refer https://wenda.so.com/q/1512966734215123
##### ![实例](http://progressed.io/bar/100?title=completed)已完善功能：binlog 函数 数据压缩热备，解压zip 格式没有检查和测试。 罗瑶光2019-01-31
//refer http://www.blogjava.net/dreamstone/archive/2007/08/09/134986.html
##### ![实例](http://progressed.io/bar/100?title=completed)已完善功能：socket握手多核模式（该功能因需要硬件支持已去掉）。保证100,000 QPS 吞吐量.罗瑶光2019-02-02
##### ![实例](http://progressed.io/bar/100?title=completed)已完善功能：rollback写操作并 binlog gzip 压缩文件记录 带时间和操作人。 罗瑶光2019-02-07
##### ![实例](http://progressed.io/bar/100?title=completed)已完善功能：数据库热备函数已检测，运行成功。 罗瑶光2019-02-08
##### ![实例](http://progressed.io/bar/100?title=completed)已完善功能：数据库按时间点进行整库恢复已完成，待检测。 罗瑶光2019-02-08

#### 数据库1.0未检测版本已经小节。
##### ![实例](http://progressed.io/bar/100?title=completed)已完善功能：第二次固定变量名称编程规范整体整理 完成了编辑格式清理。 罗瑶光2019-03-05
##### ![实例](http://progressed.io/bar/100?title=completed)已完善功能：第二次固定变量名称编程规范整体整理 完成了命名格式清理。 罗瑶光2019-03-05


###### 预先搁置功能：table函数 的primary key， unique key函数管理系统设计。；（属于2级优先，先搁置）
######  正在完善功能：基于 VPCS 思想的写操作日志管理系统。
#####  ![实例](http://progressed.io/bar/90?title=completed)正在完善功能：已完成 并 准备检测  （binlog 函数 数据按时间恢复, 热备方式，按时间戳方式 恢复）。

等等更多细节... 

#### 引用
中华人民共和国 国家版权局 软著登字第4317518号 德塔 Socket流可编程数据库语言引擎系统 V1.0.0     
TCPIP标准协议下研发的.

###### 申明
GNU GPL 2.0 协议