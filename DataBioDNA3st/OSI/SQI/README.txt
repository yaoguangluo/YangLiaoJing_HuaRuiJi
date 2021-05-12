This project bases on the Extension project of DETA Socket PLSQL DB.

### 20210320 Initon Math Yaoguang Luo
### 20210320 元基数学  罗瑶光

自从有了AOPM VECS IDUQ TXH DD ，16个元基成分，我今天定义为16进制的数字，对应为

#### 既然是严谨定义， 自然要用生化和语义双元基罗盘来进行推导开始。
##### 我先设未知的为X
##### A     XXXX
##### O     XXXX
##### P     XXXX
##### M     XXXX
##### V     XXXX
##### E     XXXX
##### C     XXXX
##### S     XXXX
##### I     XXX1 
##### D     XXX0
##### U     XXX2 
##### Q     XXX3
##### T     XXXX
##### X     XXXX
##### HE    XXXX
##### HC    XXXX
##### DD    补码

根据第一卷 和 第二卷283和284页，我能列出来的 新增 关系式 E -> HE, C -> HC.

根据 数字逻辑 和 离散数学 位列比 和 寄存法则 推导 VECS 为 ：
##### A     XXXX
##### O     XXXX
##### P     XXXX
##### M     XXXX

##### V     XXX1
##### E     XXX2
##### C     XXX0
##### S     XXX3

##### I     0001 
##### D     0000
##### U     0002 
##### Q     0003

##### T     XXXX
##### X     XXXX
##### HE    XXX2
##### HC    XXX0

##### DD    补码

准备写个欧拉路径算法开始计算 。 第一卷的 数据预测 包 此时派上了用场。

方便大家理解。

刚计算了欧拉元基环路 QUIVT+OSMAX-HEPCD
我定义17进制的数据为 
##### QUIVT+OSMAX-HEPCD DD 
##### GFEDCBA9876543210 CARRY
我在思考怎么缩进成16进制。
先保证逻辑的严谨性，
我先用17进制走一段路程。


#### 17进制数据已经问世，我今天深入下，进行元基础加法 探索，wechat已经发布了，在这里整理如下;
##### 元基础数字 =  元基符号 =  生化名称
##### 0	=		D  =   	胞嘧啶                     
##### 1	=		C  =	鸟嘌呤
##### 2 =		P  =	尿胞变鸟苷
##### 3 =		E  =	尿变嘌呤
##### 4 =		H  =	黄嘌呤
##### 5 =		-  =
##### 6 =		X  =	变感腺鸟苷
##### 7 =		A  =    变感腺腺苷
##### 8 =		M  =    鸟腺苷
##### 9 =		S  = 	 腺嘌呤
##### A =		O  =	 尿胞变腺苷
##### B =		+  =
##### C =		T  =    变感腺尿变苷
##### D =		V  = 	 变感腺嘌呤
##### E =		I  = 	尿嘧啶
##### F =		U  =  	变嘧啶
##### G =		Q  = 	 胸腺嘧啶

数字逻辑的推导(C=U+D+D)
#### 语义肽展公式推导
##### 元基数字    =元基符号 =   肽展公式数字变换
##### 0	=	    D	=  	0 + 0           
##### 1	=		C   =   0 + F
##### 2 =		P   =	3 + 1
##### 3 =		E   = 	F + 0
##### 4 =		H   = 	3 OR 1
##### 5 =		-   =    
##### 6 =		X   = 	D + - 
##### 7 =		A   = 	D + 9
##### 8 =		M   = 	- + 9
##### 9 =		S   = 	G + E
##### A =		O   = 	3 + 9
##### B =		+   =     
##### C =		T   = 	D + 3
##### D =		V   =   F + G
##### E =		I   =  	
##### F =		U   =  	
##### G =		Q   = 	




### 元基数学加法表 根据 4 的归纳完整推导如下
#### 元基数字  =   元基符号=   肽展公式数字变换
#### 0	=		D  = 	0 + 0           
#### 1	=		C  =  	0 + F
#### 2 	=		P  = 	3 + 1
#### 3 	=		E  =  	F + 0
#### 4 	=		H  =  	3 OR 1
#### 5 	=		-  =    4 + 1
#### 6 	=		X  =  	D + 5 
#### 7 	=		A  = 	D + 9
#### 8 	=		M  = 	5 + 9
#### 9 	=		S  = 	G + E
#### A 	=		O  = 	3 + 9
#### B 	=		+  =    4 + 3
#### C 	=		T  = 	D + B
#### D 	=		V  = 	F + G
#### E 	=		I  = 	E
#### F 	=		U  = 	E++ OR G--
#### G 	=		Q  =    G

#### 20210322 今早把十七进制的元基组合数学变换 定义了，归纳整理如下：
#### 我的思路是 元基稳定化DEFG变换
#### 元基数字  =   元基符号=   肽展公式元基变换                         
##### 0	=		D  =    00               
##### 1	=		C  =  	02
##### 2 =		P  =    2002
##### 3 =		E  =  	20
##### 4 =		H  =  	20, 02
##### 5 =		-  =    2002, 0202
##### 6 =		X  =  	23(2002, 0202) 
##### 7 =		A  = 	2331
##### 8 =		M  = 	(2002, 0202)31
##### 9 =		S  = 	31
##### A =		O  = 	2031
##### B =		+  =    2020, 0220
##### C =		T  = 	23(2020, 0220)
##### D =		V  = 	23
##### E =		I  = 	1
##### F =		U  = 	2
##### G =		Q  =    3
#### 稳定化后于是元基替换为  0123-> DIUQ 如下

##### 0	=		D  =    D + D               
##### 1	=		C  =  	DU
##### 2 =		P  =    UDDU
##### 3 =		E  =  	UD
##### 4 =		H  =  	UD, DU
##### 5 =		-  =    (UD, DU)DU
##### 6 =		X  =  	UQ(UD, DU)DU
##### 7 =		A  = 	UQQI
##### 8 =		M  = 	(UD, DU)DUQI
##### 9 =		S  = 	QI
##### A =		O  = 	UDQI
##### B =		+  =    (UD, DU)UD
##### C =		T  = 	UQ(UD, DU)UD
##### D =		V  = 	UQ
##### E =		I  = 	I
##### F =		U  = 	U
##### G =		Q  =    Q

我在思考 这个括号内的元基如果进行之后计算的唯一化。
到现在 十进制常数进行元基码 变换的思路已经问世了，下一步，养疗经真实应用。
这里的 568B 我推测又是一组概率钥匙酸碱控制。我也会真实应用测试论证。


今天多做一点推导：我把0到G的欧拉顺序 改成 线性数学顺序观测如下：
##### 0	=		D  =    D + D   
##### E =		I  = 	I
##### F =		U  = 	U
##### G =		Q  =    Q
##### 1	=		C  =  	DU
##### D =		V  = 	UQ
##### 3 =		E  =  	UD
##### 9 =		S  = 	QI
##### 7 =		A  = 	UQQI
##### 2 =		P  =    UDDU
##### A =		O  = 	UDQI
##### 4 =		H  =  	UD, DU
##### 5 =		-  =    (UD, DU)DU
##### B =		+  =    (UD, DU)UD
##### 6 =		X  =  	UQ(UD, DU)DU
##### C =		T  = 	UQ(UD, DU)UD
##### 8 =		M  = 	(UD, DU)DUQI

#### 我想这个顺序别有用途，先搁置。
#### 下一步 H 化简HE+, HC- , 然后重新线性排列如下
##### 0	=		D  =    D   
##### E =		I  = 	I
##### F =		U  = 	U
##### G =		Q  =    Q
##### 1	=		C  =  	DU
##### 3 =		E  =  	UD
##### 4 =		H  =  	UD, DU
##### D =		V  = 	UQ
##### 9 =		S  = 	QI
##### 5 =		-  =    DUDU
##### 2 =		P  =    UDDU
##### B =		+  =    UDUD
##### A =		O  = 	UDQI
##### 7 =		A  = 	UQQI
##### 8 =		M  = 	DUDUQI
##### 6 =		X  =  	UQDUDU
##### C =		T  = 	UQUDUD

修正后如下
##### 0	=		D  =    D   
##### E =		I  = 	I
##### F =		U  = 	U
##### G =		Q  =    Q
##### 1	=		C  =  	DI
##### 3 =		E  =  	UD
##### 4 =		H  =  	UD, DU
##### D =		V  = 	UQ
##### 9 =		S  = 	QI
##### 5 =		-  =    DUDU
##### 2 =		P  =    UDDU
##### B =		+  =    UDUD
##### A =		O  = 	UDQI
##### 7 =		A  = 	UQQI
##### 8 =		M  = 	DUDUQI
##### 6 =		X  =  	UQDUDU
##### C =		T  = 	UQUDUD

修正下 C=DU改成 DI, 因为肽展公式(补码计算) C= DDU, DD是补码
### 肽展公式的推导(肽展计算)(C=I+D)
### 开始语义肽展公式验证### 元基数学加法表 根据 4 的归纳完整推导如下
### 元基数字  =   元基符号=   肽展公式元基变换
#### 0	=		D  = 	D + D           
#### 1	=		C  =  	I + D 
#### 2 	=		P  = 	E + C
#### 3 	=		E  =  	I + U, D + U
#### 4 	=		H  =  	E OR C
#### 5 	=		-  =    H + C
#### 6 	=		X  =  	V + HC 
#### 7 	=		A  = 	V + S
#### 8 	=		M  = 	HC + S

#### 9 	=		S  = 	Q + I
#### A 	=		O  = 	E + S
#### B 	=		+  =    H + E

#### C 	=		T  = 	V + HE
#### D 	=		V  = 	U + Q
#### E 	=		I  = 	I
#### F 	=		U  = 	I++ OR Q--
#### G 	=		Q  =    Q

###于是元基数字归纳
#### 元基数字  =   元基符号=   肽展公式元基数字变换
#### 0	=		D  = 	0 + 0           
#### 1	=		C  =  	1 + 0 
#### 2 	=		P  = 	(12, 02) + 10
#### 3 	=		E  =  	1 + 2, 0 + 2
#### 4 	=		H  =  	(12, 02) OR 10
#### 5 	=		HC =    (12, 02) OR 10 + 10
#### 6 	=		X  =  	23 + (12, 02) OR 10 + 10
#### 7 	=		A  = 	23 + 31
#### 8 	=		M  = 	(12, 02) OR 10 + 10 + 31

#### 9 	=		S  = 	3 + 1
#### A 	=		O  = 	(12, 02) + 31
#### B 	=		HE =    (12, 02) OR 10 + 12, 02

#### C 	=		T  = 	23 + (12, 02) OR 10 + (12, 02)
#### D 	=		V  = 	2 + 3
#### E 	=		I  = 	1
#### F 	=		U  = 	1++ OR 3--
#### G 	=		Q  =    3

###于是元基肽展归纳如下
#### 元基数字  =   元基符号=   肽展公式元基数字变换
#### 0	=		D  = 	D + D           
#### 1	=		C  =  	I + D 
#### 2 	=		P  = 	(IU, DU) + ID
#### 3 	=		E  =  	I + U, D + U
#### 4 	=		H  =  	(IU, DU) OR ID
#### 5 	=		HC =    (IU, DU) OR ID + ID
#### 6 	=		X  =  	UQ + (IU, DU) OR ID + ID
#### 7 	=		A  = 	UQ + QI
#### 8 	=		M  = 	(IU, DU) OR ID + ID + QI

#### 9 	=		S  = 	Q + I
#### A 	=		O  = 	(IU, DU) + QI
#### B 	=		HE =    (IU, DU) OR ID + (IU, DU)

#### C 	=		T  = 	UQ + (IU, DU) OR ID + (IU, DU)
#### D 	=		V  = 	U + Q
#### E 	=		I  = 	I
#### F 	=		U  = 	I++ OR Q--
#### G 	=		Q  =    Q

###开始整理
#### 元基数字  =   元基符号=   肽展公式元基数字变换
#### 0	=		D  = 	DD           
#### 1	=		C  =  	ID 
#### 2 	=		P  = 	IUID, DUID
#### 3 	=		E  =  	IU, DU
#### 4 	=		H  =  	(IU, DU) OR ID
#### 5 	=		HC =    (IU, DU) OR ID + ID
#### 6 	=		X  =  	UQ + (IU, DU) OR ID + ID
#### 7 	=		A  = 	UQQI
#### 8 	=		M  = 	(IU, DU) OR ID + ID + QI

#### 9 	=		S  = 	QI
#### A 	=		O  = 	(IU, DU) + QI
#### B 	=		HE =    (IU, DU) OR ID + (IU, DU)

#### C 	=		T  = 	UQ + (IU, DU) OR ID + (IU, DU)
#### D 	=		V  = 	UQ
#### E 	=		I  = 	I
#### F 	=		U  = 	I++ OR Q--
#### G 	=		Q  =    Q


我得到一个结论，肽展公式的推导(C=I+D)比数字逻辑的推导(C=U+D+D)更准确。

###开始线性整理
#### 元基数字  =   元基符号=   肽展公式元基数字变换
#### 0	=		D  = 	DD           
#### E 	=		I  = 	I
#### F 	=		U  = 	I++ OR Q--
#### G 	=		Q  =    Q

#### 1	=		C  =  	ID 
#### 3 	=		E  =  	IU, DU
#### 4 	=		H  =  	(IU, DU) OR ID
#### D 	=		V  = 	UQ
#### 9 	=		S  = 	QI


#### 2 	=		P  = 	(IU, DU) + ID
#### A 	=		O  = 	(IU, DU) + QI
#### 5 	=		HC =    ((IU, DU) OR ID) + ID
#### B 	=		HE =    ((IU, DU) OR ID) + (IU, DU)
#### 8 	=		M  = 	((IU, DU) OR ID) + ID + QI

#### 7 	=		A  = 	UQQI
#### 6 	=		X  =  	UQ + ((IU, DU) OR ID) + ID
#### C 	=		T  = 	UQ + ((IU, DU) OR ID) + (IU, DU)


###线性整理优化
#### 元基数字  =   元基符号=   肽展公式元基数字变换
#### 0	=		D  = 	DD           
#### E 	=		I  = 	I
#### F 	=		U  = 	I++ OR Q--
#### G 	=		Q  =    Q

#### 1	=		C  =  	ID 
#### 3 	=		E  =  	IU, DU
#### 4 	=		H  =  	(IU, DU) OR ID
#### 5 	=		HC =    ((IU, DU) OR ID) + ID
#### B 	=		HE =    ((IU, DU) OR ID) + (IU, DU)
#### D 	=		V  = 	UQ
#### 9 	=		S  = 	QI


#### 2 	=		P  = 	(IU, DU) + ID
#### A 	=		O  = 	(IU, DU) + QI
#### 7 	=		A  = 	UQQI


#### 8 	=		M  = 	((IU, DU) OR ID) + ID + QI
#### 6 	=		X  =  	UQ + ((IU, DU) OR ID) + ID
#### C 	=		T  = 	UQ + ((IU, DU) OR ID) + (IU, DU)

### 我推导出语义元基的次序为 
#### A O P M - T X H DD - V E C S - I D U Q
### 现在的元基数字逻辑次序为
#### M X T - P O A - C E H HC HE V S - D I U Q



###酸碱肽展开归纳如下
#### 元基数字  =   元基符号=   肽展公式元基数字变换 = (肽概率展开数字逻辑集合)
#### 0	=		D  = 	DD =(D, DD)         
#### E 	=		I  = 	I  =(I) 
#### F 	=		U  = 	I++ OR Q--  =(I, Q) 
#### G 	=		Q  =    Q  =(Q) 

#### 1	=		C  =  	ID  =(ID) 
#### 3 	=		E  =  	IU, DU  =(IU, DU) 
#### 4 	=		H  =  	(IU, DU) OR ID  =(IU, DU, ID) 
#### D 	=		V  = 	UQ  =(UQ) 
#### 9 	=		S  = 	QI  =(QI) 


#### 2 	=		P  = 	(IU, DU) + ID  =(IUID, DUID) 
#### 5 	=		HC =    ((IU, DU) OR ID) + ID  =(IUID, DUID, IDID) 
#### B 	=		HE =    ((IU, DU) OR ID) + (IU, DU)  =(IUIU, IUDU, DUIU, DUDU, IDIU, IDDU) 
#### A 	=		O  = 	(IU, DU) + QI  =(IUQI, DUQI) 
#### 7 	=		A  = 	UQQI  =(UQQI) 


#### 8 	=		M  = 	((IU, DU) OR ID) + ID + QI  =(IUIDQI, DUIDQI, IDIDQI) 
#### 6 	=		X  =  	UQ + ((IU, DU) OR ID) + ID  =(UQIUID, UQDUID, UQIDID) 
#### C 	=		T  = 	UQ + ((IU, DU) OR ID) + (IU, DU)  =(UQIUIU, UQIUDU, UQDUIU, UQDUDU, UQIDIU, UQIDDU) 

### 归纳后的元基数字逻辑次序为
#### M X T - P HC HE O A - C E H V S - D I U Q

### 归纳后的元基数字活性次序为
#### T X M - HE HC O P A - H E C V S - U D I Q

### 准备应用于养疗经DNA视觉进行简单验证下，优化后用于DNA数据库的数字层计算。

在这次序表中D在I的前面，于是我准备修正C=ID为DI，于是如下：


### 修正C后的最新肽展计算公式观测
#### 元基数字  =   元基符号=   肽展公式元基数字变换 = (肽概率展开数字逻辑集合)
#### 0	=		D  = 	DD =(D, DD)         
#### E 	=		I  = 	I  =(I) 
#### F 	=		U  = 	I++ OR Q--  =(I, Q) 
#### G 	=		Q  =    Q  =(Q) 

#### 1	=		C  =  	DI  =(DI) 
#### 3 	=		E  =  	IU, DU  =(IU, DU) 
#### 4 	=		H  =  	(IU, DU) OR DI  =(IU, DU, DI) 
#### D 	=		V  = 	UQ  =(UQ) 
#### 9 	=		S  = 	QI  =(QI) 


#### 2 	=		P  = 	(IU, DU) + DI  =(IUDI, DUDI) 
#### 5 	=		HC =    ((IU, DU) OR DI) + DI  =(IUDI, DUDI, DIDI) 
#### B 	=		HE =    ((IU, DU) OR DI) + (IU, DU)  =(IUIU, IUDU, DUIU, DUDU, DIIU, DIDU) 
#### A 	=		O  = 	(IU, DU) + QI  =(IUQI, DUQI) 
#### 7 	=		A  = 	UQQI  =(UQQI) 


#### 8 	=		M  = 	((IU, DU) OR DI) + DI + QI  =(IUDIQI, DUDIQI, DIDIQI) 
#### 6 	=		X  =  	UQ + ((IU, DU) OR DI) + DI  =(UQIUDI, UQDUDI, UQDIDI) 
#### C 	=		T  = 	UQ + ((IU, DU) OR DI) + (IU, DU)  =(UQIUIU, UQIUDU, UQDUIU, UQDUDU, UQDIIU, UQDIDU) 


#### 继续跟进了下在离散数学中 H  =  	(IU, DU) OR DI= (IU, DU) + DI= IUDI, DUDI, 上面的肽展公式在 离散数学中可以继续展开如下

#### 元基数字  =   元基符号=   肽展公式元基数字变换 = (肽概率展开数字逻辑集合)
#### 0	=		D  = 	DD =(D, DD)         
#### E 	=		I  = 	I  =(I) 
#### F 	=		U  = 	I++ OR Q--  =(I, Q) 
#### G 	=		Q  =    Q  =(Q) 

#### 1	=		C  =  	DI  =(DI) 
#### 3 	=		E  =  	IU, DU  =(IU, DU) 
#### 4 	=		H  =  	(IU, DU) OR DI  =(IU, DU, DI) OR (IUDI, DUDI) 
#### D 	=		V  = 	UQ  =(UQ) 
#### 9 	=		S  = 	QI  =(QI) 


#### 2 	=		P  = 	(IU, DU) + DI  =(IUDI, DUDI) 
#### 5 	=		HC =    ((IU, DU) OR DI) + DI  =(IUDI, DUDI, DIDI) OR (IUDIDI, DUDIDI)
#### B 	=		HE =    ((IU, DU) OR DI) + (IU, DU)  =(IUIU, IUDU, DUIU, DUDU, DIIU, DIDU) OR (IUDIIU, IUDIDU, DUDIIU, DUDIDU) 
#### A 	=		O  = 	(IU, DU) + QI  =(IUQI, DUQI) 
#### 7 	=		A  = 	UQQI  =(UQQI) 


#### 8 	=		M  = 	((IU, DU) OR DI) + DI + QI  =(IUDIQI, DUDIQI, DIDIQI) OR (IUDIDIQI, DUDIDIQI) 
#### 6 	=		X  =  	UQ + ((IU, DU) OR DI) + DI  =(UQIUDI, UQDUDI, UQDIDI) OR (UQIUDIDI, UQDUDIDI)
#### C 	=		T  = 	UQ + ((IU, DU) OR DI) + (IU, DU)  =(UQIUIU, UQIUDU, UQDUIU, UQDUDU, UQDIIU, UQDIDU) OR (UQIUDIIU, UQIUDIDU, UQDUDIIU, UQDUDIDU) 

#### 似乎开始完美。于是活性顺序又打乱了，再整理下如下：

#### 元基数字  =   元基符号=   肽展公式元基数字变换 = (肽概率展开数字逻辑集合)
#### 1位  
##### E 	=		I  = 	I  =(I) 
##### F 	=		U  = 	I++ OR Q--  =(I, Q) 
##### G 	=		Q  =    Q  =(Q) 
#### 1~2位
##### 0		=		D  = 	DD =(D, DD)    
#### 2位
##### 1		=		C  =  	DI  =(DI) 
##### 3 	=		E  =  	IU, DU  =(IU, DU)
##### D 	=		V  = 	UQ  =(UQ) 
##### 9 	=		S  = 	QI  =(QI) 
#### 2~4位
##### 4 	=		H  =  	(IU, DU) OR DI  =(IU, DU, DI) OR (IUDI, DUDI) 
#### 4位
##### 2 	=		P  = 	(IU, DU) + DI  =(IUDI, DUDI) 
##### A 	=		O  = 	(IU, DU) + QI  =(IUQI, DUQI) 
##### 7 	=		A  = 	UQQI  =(UQQI) 
#### 4~6位
##### 5 	=		HC- =    ((IU, DU) OR DI) + DI  =(IUDI, DUDI, DIDI) OR (IUDIDI, DUDIDI)
##### B 	=		HE+ =    ((IU, DU) OR DI) + (IU, DU)  =(IUIU, IUDU, DUIU, DUDU, DIIU, DIDU) OR (IUDIIU, IUDIDU, DUDIIU, DUDIDU) 
#### 6~8位
##### 8 	=		M  = 	((IU, DU) OR DI) + DI + QI  =(IUDIQI, DUDIQI, DIDIQI) OR (IUDIDIQI, DUDIDIQI) 
##### 6 	=		X  =  	UQ + ((IU, DU) OR DI) + DI  =(UQIUDI, UQDUDI, UQDIDI) OR (UQIUDIDI, UQDUDIDI)
##### C 	=		T  = 	UQ + ((IU, DU) OR DI) + (IU, DU)  =(UQIUIU, UQIUDU, UQDUIU, UQDUDU, UQDIIU, UQDIDU) OR (UQIUDIIU, UQIUDIDU, UQDUDIIU, UQDUDIDU) 

#### C还是 = DI 次序， 所以上一步的公式不用变动。
### 整理后：
#### 元基活性次序为 <IUQ D CEVS H POA -+ MXT>

#### 我得到一个结论：IDQ 是稳定元基， UH是活性元基.（2021024 结论更新， IQ是稳定元基， DUH是活性元基）

#### 归纳出核心
##### 黄嘌呤：用于肽展换元 计算
##### 变嘧啶：用于 血氧峰 计算
##### 胞嘧啶：用于 补码 计算


#### 肽展公式参考： 
##### AOPM VECS IDUQ 肽展公式推导与元基编码进化计算以及它的应用发现 1.2.2 国家软著申请 流水号 <2020Z11L0356797> 国作登字 2021-A-00942587 (中华人民共和国 国家版权局)
##### AOPM-VECS-IDUQ Catalytic INITONS PDE LAW and Its Application
##### https://gitee.com/DetaChina/collection-of-papers-by-deta/blob/master/%E8%91%97%E4%BD%9C%E6%9D%83%E7%89%88%E6%9C%ACPDE_Formular_1_2_2.pdf
##### https://github.com/yaoguangluo/Deta_Resource/blob/master/%E8%91%97%E4%BD%9C%E6%9D%83%E7%89%88%E6%9C%ACPDE_Formular_1_2_2.pdf

#### 元基命名参考：
##### <见类人DNA与 神经元基于催化算子映射编码方式 V_1.2.2版本国家软著申请 流水号 <2020Z11L0333706> 国作登字-2021-A-00097017
##### https://gitee.com/DetaChina/collection-of-papers-by-deta/blob/master/DNA%20%E7%BC%96%E7%A0%81%E6%96%B9%E5%BC%8F1.2.2%20%E4%B8%AD%E8%AF%91%E8%8B%B1%E6%B7%B7%E5%90%88%E7%89%88.pdf
##### https://github.com/yaoguangluo/Deta_Resource/blob/master/DNA%20%E7%BC%96%E7%A0%81%E6%96%B9%E5%BC%8F1.2.2%20%E4%B8%AD%E8%AF%91%E8%8B%B1%E6%B7%B7%E5%90%88%E7%89%88.pdf

#### DNA 催化 与 肽展计算 和 AOPM-TXH-VECS-IDUQ 元基解码 V013_026中文版本 国家著作申请 流水号 <2020Z11L0386462> 国作登字 2021-A-00942586 (中华人民共和国 国家版权局)
##### https://github.com/yaoguangluo/Deta_Resource/blob/master/DNA%20Initon%20解码%20013026软著申请中文最终版本.pdf
##### https://gitee.com/DetaChina/collection-of-papers-by-deta/blob/master/DNA%20Initon%20解码%20013026软著申请中文最终版本.pdf
##### https://gitee.com/DetaChina/collection-of-papers-by-deta/blob/master/DNA%20Initon%20解码%20013026软著申请中文最终版本%20修正'食'字.pdf
##### https://github.com/yaoguangluo/Deta_Resource/blob/master/DNA%20Initon%20解码%20013026软著申请中文最终版本%20修正'食'字.pdf

#### 元基欧拉环计算参考：
##### https://gitee.com/DetaChina/dna_-db/blob/master/Initon_Math/org/math/initon/ouler/FindOulerRing.java

#### 双元罗盘参考：
##### 多人著作(罗瑶光, 罗荣武) DNA元基催化与肽计算第二卷 养疗经应用研究 20210305 国家著作申请 流水号 <2021Z11L1057159> 
##### https://gitee.com/DetaChina/collection-of-papers-by-deta/blob/master/罗瑶光-DNA催化与肽计算第二卷20210305.pdf
##### https://github.com/yaoguangluo/Deta_Catalytic_DNA/blob/master/罗瑶光-DNA催化与肽计算第二卷20210305.pdf

走到这，元基数学 公式表已经出来了，下一步就开始简单应用。 


#### Yaoguang.Luo
#### 罗瑶光

##### 正在 将 eclipse 的工程往 idea上 部署调试。看了下 license， 教育版是侵权版本。 又改回eclipse