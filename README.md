# 养疗经 华瑞集 综合 元基催化与肽计算应用研究 版本18500
## 协议 GNU GPL-2.0 License

 这是一个 智慧医学 领域的 大数据电子医院辅助诊疗系统, 愿景:让人类更健康~ （这是一个完整调通的可直接运行版本源码，如果出现任何问题，请及时联系作者，电话：15116110525）  


### 介绍  
 1>华夏民族, 勤劳繁衍, 瑞雪丰年, 生生不息.  
 2>随着社会科技的日新月异, 人类的健康问题对各个产业有着千丝万缕的联系.   
 3>华瑞集的诞生, 为了方便群众更好的了解医学和养疗知识, 提高安全健康的保障意识.   
 4>并为社会提供了一整套先进的大数据专家系统, 从线上到线下, 从中医到西医, 从药理到心理6个纬度, 让人类更健康!  

### 组成 华瑞集由2 部分组成
 1> 线下养疗大数据学习处理产业.  
 2> 线上心理大数据推荐分析产业  

### 软件应用功能
 1> 1500 + 味药食同源进行4维学习,分析, 应用, 识别.  
 2> 1750 + 味西药急速索引推荐.  
 3> 包括处方优化处理的数据ETL节点流模拟分析系统.  
 4> 8100本+(无限扩充)专业书籍自适应阅读推荐.  
 5> 55个医学专业的中西医学索引包括1.6亿字推荐处理.  
 6> 声诊, 相诊, 计算机望, 闻, 问, 切,智能处理.  
 7> 多种心理和文本数据线上处理快速推荐.  
 8> DNA元基催化与肽计算 真实环境应用研究  

### 客户应用人群  
 1> 中医药大学  
 2> 理疗中心, 保健中心  
 3> 美体护理会所茶楼  
 4> 制药公司, 食品公司  
 5> 医院, 药店  
 6> 养老院  
 7> 按摩,休闲,餐饮中心  
 8> 所有对健康感兴趣的单位  

### 应用申明  
 1> 该软件的所有书籍, 文献, 资料, 要案来自各种经典医学著作, 从公元前1000年到现代, 保证了1.6亿字索引的数据相对完整性.  
 2> 该软件是大数据学习软件,不具备个人行医资格证和国家药师证行使权,私自用该软件给病人开药等一系列违法事件必遭法律制裁.  

### 系统研发和应用需求  
 1> Win 64位win7 以上操作系统, 桌面台式电脑,笔记本电脑皆可.  
 1.1> Linux, Unix, Solaris, IOS 系统需要 对应的JVM和版本. 我的import 包主要是基于win64.  
 1.2> Win 32位也可以研发,不过 第三方的语音等API,请到maven 去下32位的.  
 2> 内存4 GB 以上皆可.  
 3> 硬盘50 GB 以上皆可.  
 4> 普通显卡1GB 以上皆可.  
 5> 1200*800 以上像素显示皆可.  

### 源码使用方法：  
 1>将jacob语音发音文件放入jdk或者JRE的 BIN目录 下， system32 的 driver目录下 或者 将函数注释掉。  
 2>将DetaPLSQLDatabase项目目录下的DBconfig.zip文件解压缩在C盘下即可（注意路径名，去掉 副本 两个字），文件我已经裁掉了850个中药属性和 1550个西药属性，仅做数据库集成调试展示。  
 2.1> 注意 数据库的row文件夹下面请自行添加 is_delete_0 文件夹标识，不然 养疗经不显示哦，详细见《DETA socket流 plsql数据库》 著作的 语法。  
 2.1.1> is_delete_0 文件夹 压缩后被删除了，不是作者的问题，可自行百度为什么zip压缩后，系统的空文件夹会被自动删除掉。  
 2.2> 注意 数据库的row文件夹下面ID项目 sample数据 缺失, 如果想做 DMA 计算环境请 自己补充0,1,2 来标识.  
 3>，64位windows用eclipse即可打开运行调试。  
 3.1> 软件运行环境为 JDK1.8版本 及 以上.  
 4> 启动文件: DetaHRJ_YLJSrc.ME.APM.VSQ 的(YLJFrame 和 HRJFrame).  
 5> 工程函数整体为GBK, 有一些大sample文件和 字符处理的文本采用高级字符编辑为UTF8, 请注意, 避免乱码.#  
 5.1> 思路今天改变, 工程全局准备依旧使用GBK, 然后将所有字符串进行变量化, 然后变量全部放在变量STATBLE文件中用UTF8.  
 5.2> 工程中的4个 ETLNode 文件包工程, 除了 DetaETLNodeMedicine, DetaUnicornETLNodePGMedicine 用GBK, 其他两个 统一用UTF8, 已经矫正. 罗瑶光 20210413 20210425  
 5.3> 为什么工程用GBK,而下面的有些文件用UTF8, 因为, 很多操作系统默认字符集是GBK, 整体的UTF8工程在导入 和压缩后, 一些使用者解压稍微不注意会出现乱码. 而这个乱码不能再通过解码变成原文.  
 这是一个bug. 我测试了许多遍. 在这些年, 经常性出现这个问题. 我研究了后找到问题, 当系统自动将UTF8转码成GBK后,乱码中有 UTF8和GBK都不能识别的乱码符号, 当import转码失败后的乱码含有这种字符, 再转成正确的编码, 乱码只要有一个字符不能转成正确编码, 就会发生还是乱码的问题, 于是工程出错. 这就是我为什么要在GBK的主工程中下面个别用UTF8的动机.  
 6> 注意classpath 与 setting等 文件的运行配置, 环境配置和打包配置正确  
 6.1> 注意同名不同类的函数文件引用   

### 项目内容展示. 见工程的 doc 文件夹：

##### 养疗经和华瑞集的科研价值描述  
1>https://gitee.com/DetaChina/YangLiaoJing/blob/18111/doc/DetaOSSFINALV0_0_1.pdf  

##### DNA 第一卷  
1>https://gitee.com/DetaChina/YangLiaoJing/blob/18111/doc/罗瑶光---DNA%20催化与肽计算%20(第一卷)%20仅--++修正版本.pdf  
2>ttps://github.com/yaoguangluo/YangLiaoJing_HuaRuiJi/tree/18111/doc/罗瑶光---DNA%20催化与肽计算%20(第一卷)%20仅--++修正版本.pdf  

##### DNA 第二卷   
1>https://gitee.com/DetaChina/YangLiaoJing/blob/master/doc/罗瑶光-DNA催化与肽计算第二卷20210305.pdf  
2>https://github.com/yaoguangluo/DNA_Full_DOC/blob/main/罗瑶光-DNA催化与肽计算第二卷20210305.pdf  

##### DNA 第三卷  
1>源码:https://gitee.com/DetaChina/dna_-db  
2>文档:https://github.com/yaoguangluo/DNA_DB_DOC_BACKUP/blob/main/DNA元基催化与肽计算%20第三卷20210328.pdf  

### 华瑞集养疗经 资质 见工程的 证书 文件夹：  

1>国商字第 40126364 号 (中华人民共和国 国家知识产权局)  
2>国商字第 39193470 号 (中华人民共和国 国家知识产权局)  
3>国商字第 40126765 号 (中华人民共和国 国家知识产权局)  
4>国商字第 39183063 号 (中华人民共和国 国家知识产权局)  
5>华瑞集35, 42 CN TMZC00000039183063ZCSQ01, CN 39183063-TMZC39183063ZCSL01 (中华人民共和国 国家知识产权局)。  
6>养疗经35, 9 CN TMZC00000039193470ZCSQ01, CN 39193470-TMZC39193470ZCSL01 (中华人民共和国 国家知识产权局)。  
7>国作登字 2019-F-00943469 (中华人民共和国 国家版权局)  
8>国作登字 2019-F-00943471 (中华人民共和国 国家版权局)  
9>国作登字 2019-F-00943472 (中华人民共和国 国家版权局)  
10>国作登字 2019-F-00943473 (中华人民共和国 国家版权局)  
11>国作登字 2019-F-00943474 (中华人民共和国 国家版权局)  
12>国作登字 2019-F-00943475 (中华人民共和国 国家版权局)  

### 软件思想架构 见工程的 doc 文件夹 <DNA催化与肽计算> 著作  
 1>(中华人民共和国 国家版权局).软著登字第3951366号 德塔自然语言图灵系统研发 作者CN: 2019SR0530609    
 见工程文件夹: DetaParserWordSegment, DetaParserNeroMap, DetaParserSensingMap, DetaParserBehaviorMap, DetaParserEmotionMap  
   
 2>(中华人民共和国 国家版权局).软著登字第4240558号 ETL数据流处理软件研发引擎 作者CN: 2019R11L803285   
 见工程文件夹: DetaUnicornNeroThemeETL, DetaUnicornUI,  
   
 3>(中华人民共和国 国家版权局).软著登字第4584594号 德塔数据分析算法 Java 引擎系统 作者CN: 2019R11L1122752    
 见工程文件夹: DetaDataProcessorYLJ  
  
 4>(中华人民共和国 国家版权局).软著登字第4317518号 德塔 PLSQL Socket数据库引擎研发 作者CN: 2019R11L885247    
 见工程文件夹: DetaPLSQL, DetaVPCSBackend, DetaVPCSFrontend, DetaPLSQLDBBootVPCS (最新VPCS public整合) DetaVPCSPublic,  
   
 5>(中华人民共和国 国家版权局).软著登字第4607950号 德塔数据结构变量快速转换 作者CN: 2019R11L1293422    
 见工程文件夹: DetaDataSwap,  
   
 6>(中华人民共和国 国家版权局).软著登字第5447819号 快速数据预测算法引擎系统 V1.0.0 作者CN: 2020R11L186818    
 见工程文件夹: DetaDataPrediction,  
   
 7>(中华人民共和国 国家版权局) 作者CN: 2020Z11L0333706 DNA 元基编码 类人DNA与 神经元基于催化算子映射编码方式 V_1.2.2    
   
 8>(中华人民共和国 国家版权局) 作者CN: 2020Z11L0356797 国作登字 2021-A-00042587  DNA 元基公式 AOPM VECS IDUQ 肽展公式推导与元基编码进化计算以及它的应用发现 1.2.2   
   
 9>(中华人民共和国 国家版权局) 作者CN: 2020Z11L0386462 国作登字 2021-A-00042586  DNA 元基解码 DNA催化与肽展计算 和 AOPM-TXH-VECS-IDUQ 元基解码 V013_026中文版本    
   
 https://gitee.com/DetaChina/YangLiaoJing/blob/18111/doc/罗瑶光---DNA%20催化与肽计算%20(第一卷)%20仅--++修正版本.pdf  
 https://github.com/yaoguangluo/YangLiaoJing_HuaRuiJi/tree/18111/doc/罗瑶光---DNA%20催化与肽计算%20(第一卷)%20仅--++修正版本.pdf  
   
 10>(中华人民共和国 国家版权局) CN:2021Z11L1057159 德塔DNA元基催化与肽计算第二卷  
 https://gitee.com/DetaChina/YangLiaoJing/blob/master/doc/罗瑶光-DNA催化与肽计算第二卷20210305.pdf  
 https://github.com/yaoguangluo/DNA_Full_DOC/blob/main/罗瑶光-DNA催化与肽计算第二卷20210305.pdf  
 10.1>元基,编码,公式,解码定义类 见工程文件夹 OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.ASU.MPE.procedure.pde  
 10.2>非卷积的语义元基视觉, 见工程文件 AVQ.OEQ.cap.Monitor.java 1022行起始等  
 10.3>语义的元基session, 见工程文件 OSI.AOP.MSU.AMS.VQS.SQV.SI.OSU.SMV.http.SessionValidation.java  
 10.4>非生化语义的物理元基加密, 见工程文件 ME.APM.VSQ.DictionaryFromDB.java  
 10.5>语义的肽展搜索, 见工程文件 OSI.VSQ.SSI.ASU.OSU.PSU.MSU.ASU.MPE.AOP.MEC.SIQ.search.ZhongYaoSearch.java   
 10.6>语义的肽展索引, 见工程文件 OSI.OSU.SI.OSI.AVI.AEI.ACI.ASI.OVI.OEI.OCI.OSI.PVI.PEI.PCI.PSI.addZYBCBook.dictionary.java 355行起始等  
 10.7>生化语义的八卦罗盘, 见工程文件 ME.APM.VSQ.xlx.CoAuthorForWord.java   

 统一社会信用代码 91430181MA4Q3REH6K 浏阳德塔软件开发有限公司 欢迎社会各界监督.  
 天眼查记录: https://www.tianyancha.com/company/3272761560

###  著作权申明:
 1>上述著作权 因 <德塔自然语言图灵系统> 和 <德塔Java数据分析算法> 是作者2019年 早期 第一次和国家知识产权局代理申请,    
 2>不清楚 已发表和未发表的明确法律意思, 根据字面理解为 申请著作权当天的就是已发表. 于是填写了 已发表.   
 3>本人开始重新申请改为未发表. 如果国际任何机构和个人因为这两个作品引用 产生司法纠纷, 请及时联系本人 电话及微信, 并拨打法院, 司法 公安等执法热线.  
 4>上述的 9个软著子作品 和 DNA思想论著 依旧使用Apache 2.0 协议 开源, 如果 国际任何机构和个人 在申请著作权受到第三方干扰, 请及时联系本人 并 司法报案维权.  

### 当前第三卷华瑞集研究任务（如果有开源爱好者可自行开分支，注意协议为 GPL，避免法律纠纷）
##### 整体著作权版本组件优化和肽计算优化  
 1>函数名开始整体优化  
 2>重要函数开始详细注释描述  
 3>配置文件综合  
 4>SONAR 覆盖率测试  
 5>TVM 全文肽化  
 6>函数属性统一元基分类  
 7>变量前缀统一元基分类  
 8>开始2021年研究计划布局  
 9>生命肽花植株研究  


### 当前第三卷养疗经应用任务 （如果有开源爱好者可自行开分支，注意协议为 GPL，避免法律纠纷）  
##### 中西医结合检验报告组件功能优化。   
 1>西医检验报告功能优化  
 2>检验报告值校准  
 3>智慧化检验结果展示  
 4>肽计算函数集成  
 5>中西医检验报告合并  
 6>检验报告筛选综合用药推荐计算  
 7>检验报告元基化  
 8>开始2021年应用计划布局  
 9>德塔PLSQL医学数据库语言控制台

### 感谢：
 1>中国 人民教育出版社 作者的九年义务教育采用该出版社教材  
 2>中国 新华字典 作者的语文文字基础来源该书籍  
 3>中国 九年义务教育 作者享受了该教育政策  
 4>中国 总参解放军炮兵学院南京分院 作者在此 接受了四年全日制湖北省委培本科学历教育, 获得普通高等工学学士学位  
 5>印度 班加罗尔大学瑞拉理工学院, 基督学院 作者在此 接受了两年全日制 AICTE POST GRADUATE 研究生学历教育  
 6>美国 加州路德大学 作者在此 接受了两年全日制 WASC POST GRADUATE 研究生学历教育 获得WASC理学荣誉硕士学位  
 7>中国 卫健委 人民卫生出版社 作者的西医部分医学资料 用来大数据测试分析 来自该出版社书籍(豆丁 百度文库上购买)  
 8>硬件研发设备与软件系统: ECLIPSE, GRADLE, GITHUB, GITEE, WECHAT, 联想。  

### 第三方开源包引用情况
 1>(源码仅引用未修改) BSD APACHE GPL CDDL JOGL /官方 gleem DEMO   
 2>(源码仅引用未修改) APACHE SUN /官方AWT DEMO  
 3>(源码仅引用未修改) APACHE /Json, CacheManager    
 4>(源码仅引用未修改) APACHE /Jacob 中文发音 DEMO   
 5>(源码仅引用未修改) 美国卡内基梅隆大学 LGPL /CMU 语音识别 DEMO   
 6>(源码仅引用未修改) 新西兰维卡托大学 GPL /Weka 训练    
 7>(源码仅引用未修改) GPL /Japps ffmpeg 与 JavaCV 视频中图片提取  
 8>(源码仅引用未修改) EPL /Junit 测试组件    
 9>(源码仅引用未修改) BSD /JDK原生组件等  
 10>(源码仅引用未修改) APACHE /功能节点引用如POI, JFREECHAT, Gzip 等 略.  

### 开源动机：  
1>为什么开源并用GPL 协议，因为健康属于每一人。   
2>规避嫌疑， 代码和思想来自 罗瑶光先生 近三年的编著。让世界都能看到。   
3>项目越来越大，寻找对 数据生化计算 感兴趣的同志，一起研发。 

### 作者的梦想：
1>人造智慧  
2>长生不老     
3>看病便宜  
4>有病能治  

### 养疗经，华瑞集 开源参与者（2人） 参与标准为 其知识产权体系作品申请者集合：
 罗瑶光，罗荣武

#### Java引用
 高斯林

# 养疗经 华瑞集 Github 源码备份

##### (中国) Gitee: 18111分支+
https://gitee.com/DetaChina/YangLiaoJing

##### (欧美) Github: 18111分支+
https://github.com/yaoguangluo/YangLiaoJing_HuaRuiJi

##### (澳洲) Bitbucket: 18111分支+
https://bitbucket.org/luoyaoguang/yangliaojing

##### (非洲) CodingNet: 18111分支+
https://yaoguangluo.coding.net/public/YangLiaoJingHuaRuiJi/YangliaojingHuaruiji/git/files

DNA元基催化与肽计算第三卷 软著申请版本 起始分支号: 18111  
当前最新 元基化版本状态见分支号 18500~
