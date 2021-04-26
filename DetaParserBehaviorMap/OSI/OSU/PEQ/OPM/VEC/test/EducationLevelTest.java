package OSI.OSU.PEQ.OPM.VEC.test;
import java.io.IOException;

import OSI.OSU.AEU.OPM.VEC.ica.EducationRatio;
import OSI.OSU.ASQ.PSU.AVQ.ASQ.OVQ.OSQ.VSQ.stable.StableData;
public class EducationLevelTest{
	double[] EducationLevel;
	double EducationDuration;
	public void getEducationLevel(double[][] measurement) {
		EducationLevel = new double[measurement.length];
		for(int i = StableData.INT_ZERO; i < measurement.length; i++) {
			EducationLevel[i] = (measurement[i][StableData.INT_THREE] + measurement[i][StableData.INT_FOUR])
					/(measurement[i][StableData.INT_ONE] + measurement[i][StableData.INT_TWO] 
					+ measurement[i][StableData.INT_THREE] + measurement[i][StableData.INT_FOUR]
							+ measurement[i][StableData.INT_FIVE]);
			EducationDuration += EducationLevel[i];
			System.out.println("EducationLevel:" +EducationLevel[i]);
		}
		EducationDuration/=EducationLevel.length;
		System.out.println("EducationDuration:" + EducationDuration);
	}

	public static void main(String[] argv) throws IOException {
		String text1 = "关于成瘾性的戒除方式，上瘾在医学上普遍定义为?种具有精神依赖并长期导致健康危害性的行为。\r\n" + 
				"关于成瘾的溯源有很多因素，其中最重要的是依赖。因为长期的依赖导致自身某种缺陷逐渐丧失而\r\n" + 
				"对成瘾物体产生不可替�????过这个推论，可以初步来定义戒断瘾欲，�?有效的方式是替代和引�??\r\n" + 
				"替代物，本身也是有强烈制�??，和危害?，但是危害要小于原物??过替代和强制减少剂量和精洗\r\n" + 
				"脑教育，通过?个时间周期达到戒�??中间有戒断反应，�?要观�??引导，是在对没有成瘾并属于易\r\n" + 
				"感染群体进行教育和传授方式，提高群体的免疫力和排斥力。上瘾不是欲�??欲望是生物的�??性进\r\n" + 
				"化的产物，是与生俱来�??上瘾�??种外力干�??成的依赖?上瘾的级别有很多种�?�医学有相关严谨\r\n" + 
				"的打分段，其中毒瘾大于烟瘾大于网�??�?有效的戒除手段就是环境和生活方式�??择�?�很多时候\r\n" + 
				"环境不是很美好，生活方式充满了隐患，人的精神会产生误差，这个�??受体为不稳定?，极易接触\r\n" + 
				"成瘾�??当环境无法改变的时�?�，我们?要改变自己，选择?个愉悦的生活方式，进行自我心里疏导，\r\n" + 
				"很容易排斥上瘾源。其中这些词汇是非常有价值的精神药物：自信，豁达，友善，分享 等等。\r\n" + 
				"?些成瘾的受体，普遍有某种倾向: 奢靡，闭塞，强迫，空? 等等。这里不是贬义，只是因为长期的环境\r\n" + 
				"因素不是那么美好导致了一�??维误差�?�所以引导是非常重要�??改变人的不是能力，�?�是选择和环�??\r\n" + 
				"如果环境不是很完美，那么选择?个健康的生活方式，是非常重要�???";

		String text2 = "我们在这个三维世界能听到许多答案? 却无法解释它? ?后物理学用T来表�??�??这个疑问，我?始寻求答案来解释。语文和数学对时间的描述基于我罗瑶光的归纳为是事物发展过程中的某?点基于经典数学的观测参照。我??"
				+ "�??，既然是参照，那么必定是有参照物和观�??2种模�??? 我又�??，既�??2种模式改变，必定引起时间的不准确性，那么我定义为时间不是经典物理学中的概�??? 而是量子物理的一个分�??? 我又�??，如果时间因为参照物和观测物的不�?"
				+ "，那么这个时间肯定是有变化规律的，这个规律肯定是?个抽象函数，我定义为T（x�??么求解时函数�? 我深思了10�??或许我罗瑶光是世界第�?个定义时函数的人? 我可能成为不了第?"
				+ "个能够利用时函数穿梭高维空间的人。霍金死了， 傅里叶死了， 爱因斯坦也死了， 薛定谔死了， 海森堡死了， 狄拉克死了， 他们也许发现了时函数的一些规�??我又深�?�了许久? 时函数的解析?直困扰着�???么求解？这些先贤给我巨大的视野�?�\r\n" + 	
				"1 时间是一个事物发展的过程? 而事物发展，可以用p(t)表示? 狄拉克说事物的发�??常用向量集合表示，我归纳�? |p（t?> 在这里感谢狄拉克先生。\r\n" + 
				"2 因为观测物不?样和观测角度不一样， 那么这个 事物发展的向量集肯定也会被扭曲， 那么我用量子力学? <m(t)|p(t)> 来表? 观测点与事物运动点的内积的狄拉克本征量表�??\r\n" + 
				"3 以为2 是个非常复杂�??辑，我采用理想的正交表达�?<m(t)|p(t)> 其实是一个理想函�??\r\n" + 
				"4.1 怎么解析这个狄拉克方程我又深思的许久，我想到以前我写的狄拉克 傅里叶和薛定谔是好朋友， 于是我用薛定谔含时函数来解析，为?么用含时，因为它同时有时间和运动轨迹的观测点? 于是我得?(1-iht)|m(0)> ? (1-iht"
				+ ")|p(0)> 正交这个t无法消除，看来我方法也许是错�????\r\n" + 
				"4.2我想用傅里叶咋样? 于是我得出\r\n" + 
				"dp/sq(2*pi) * pof(m)(p) e**ipt ? dp/sq(2*pi) * pof (p) e**ipt 正交，结?4.1 ?4.2 我得?2个方程组\r\n" + 
				"1:(1-iht)|m(0)>=dp/sq(2*pi) * pof(m)(p) e**ipt \r\n" + 
				"2:(1-iht)|p(0)>=dp/sq(2*pi) * pof (p)(p) e**ipt \r\n" + 
				"5,1-2=> (1-iht)(|m(0)>-|p(0)>)=dp/sq(2*pi) ( pof(m)(p) e**ipt - pof (p)(p) e**ipt )\r\n" + 
				"6 事物运动??始一定是静止的，我可得到|m(0)>-|p(0)>=0\r\n" + 
				"7? dp/sq(2*pi) ( pof(m)(p) e**ipt - pof (p)(p) e**ipt )=0\r\n" + 
				"8? 我又想到了海森堡和斯塔函? 把傅里叶? dp/2pi*eip(x1-x0) 用deta 表示�???\r\n" + 
				"-? intel（dx?*deta (t1-t0) m(t) - intel（dx?*deta (t1-t0) p(t)=0 \r\n" + 
				"9: intel（dx?*deta (t1-t0) (m(t) -p(t))=0\r\n" + 
				"想到这里我发现我升华�?????\r\n" + 
				"deta (t1-t0)*m(t?=deta1(t1-t0)*p(t)�????\r\n" + 
				"我得到几个答案： \r\n" + 
				"1 事物运动 等于 观测运动，\r\n" + 
				"2 观测停止 等于 事物停止。\r\n" + 
				"3 观测轨迹 等于 事物轨迹�??这个轨迹就是�?个傅里叶的deta波函数\r\n" + 
				"4 核武器由磁暴?�??? \r\n" + 
				"5 纠缠态证? 平行宇宙存在。\r\n" + 
				"6 deta的概率集确定光纤通信基础。\r\n" + 
				"或许霍金真的无法接受这个答案? 宇宙没有?始，也没有结束，而万物始于一个deta弦，我又�??了许久，既然宇宙没有过去未来�? 那说明了?么？\r\n" + 
				"1 说明了我们的认知被时函数误导了， 因为我们这个世界?有的经典力学都是加入了时间变量进�???和运�??, 这是三维世界智慧体的禁区。\r\n" + 
				"2 我不敢再写下去， 因为这些思维完全违背了这个世界的经典定律�???\r\n" + 
				"如果我罗瑶光是世界以第一个定义时函数的人，那我今? 初步定义为：时函数代表物体的运动轨迹和观�??轨迹的量子函数关系式，是宇宙的维度的核心组成部分?这些年，�?"
				+ "总想成为?名程序员。很多年前，?位很有成就的教授跟我说程序员只是?个工人，如果我把才华定义为一个工人，那么我对?"
				+ "起我?20多年来的,理论研究功底? 因为很多程序员职�??过�?�成就能胜任。后来当我遇到一位顶级的科研工程师同事，我发现，他的编程能力我真不敢恭维? 可是他确是首�???�??这份不羁? 我慢慢才知道。他比我强在细节和专�??? 这个出发点是对的，\r\n" + 
				"deta (t1-t0)*m(t?=deta1(t1-t0)*p(t)\r\n" + 
				"很明确，我得到了这个初级公式? 这个公式我深思， 时函数肯定和 斯塔函数? 傅里叶函数，观测者， 运动? ?4? 因子有关,而且 观测者和运动者成正比，我得到?个理论答案： 时间"
				+ "可以任意膨胀和坍�??显然，膨�?和坍塌的函数我无法从这个公式得到推理，我进行了很多年�????可是我得到了另外�?个答案： 时间任意膨胀? 必定无穷大， 时间坍塌，必定无穷小。我又得到一个答案： 时函数是?个矢量函�??\r\n" + 
				"1: deta (t1-t0)*m(t?/ deta1(t1-t0)*p(t) =1 \r\n" + 
				"2: t= |m(x)> / |p(x)> 关于2 �??么来的，我是这样??的，如果把经典物理学�? s=vt, 那么我把s当做观测者，把v当成发展事物，那么有\r\n" + 
				"|m(x)>= |p(x)> * t\r\n" + 
				"这是求解狄拉克的熵， 我很可惜。因为狄拉克在实验求解的�??，年?病�???? 可是我没有停下，我又得到2个关系式：\r\n" + 
				"t= dp/sq(2*pi) * pof(m)(p) e**ipt  / dp/sq(2*pi) * pof (p) e**ipt \r\n" + 
				"t= deta (t1-t0)*m(t?/ deta1(t1-t0)*p(t)\r\n" + 
				"当我得到这个�??，我发现了真正恐???如果在粒子在磁暴�?发的�??，能够用时间�??函数抑制，那么这个粒子就具有巨大的能�???�??"
				+ "能量我称之为时间函数膨胀势能。狄拉克的相对论说明有时间函数膨?势能 必有 时间函数坍塌势能，如果用tero(x) ? tcol(x)表示则有 |tero(x)>+|tcol(x)>=1\r\n" + 
				"这就是狄拉克晚年论述为什么有反粒子的存在。可是我现在疑惑了；；\r\n" + 
				"1? |tero(x)>+|tcol(x)>=1\r\n" + 
				"2? deta (t1-t0)*m(t?/ deta1(t1-t0)*p(t) =1 \r\n" + 
				"=? |tero(x)>+|tcol(x)> =  deta (t1-t0)*m(t?/ deta1(t1-t0)*p(t) \r\n" + 
				"时间膨胀和时间坍塌也是由 观测者和运动? 决定�??? 而且是一个有归一性的矢量函数控制。用我们三维世界的经�??维解�? 我得到这样一?"
				+ "答案宇宙没有过去，没有未来， 充满物质，却又虚无， 而一切都是一个deta�??这明显就�??个错误，却又存在，我又一次发现我的经"
				+ "�??维再�?次误导了�?????我的直觉告诉我我被�?�了，我的出发点??始是错误的，我不能用三维世界的经典定理来推导时函�??�??"
				+ "伤，我的出发点错误的，同时，很高兴，�??过错误的伪命题得�??个真确答案：|tero(x)>+|tcol(x)> =  deta (t1-t0)*m(t?/ deta1(t1-t0)*p(t) \r\n" + 
				"这公式有?么用？我�??了许久�?�\r\n" + 
				"我发现我又升华了�???如果粒子辐射角向�??发能量释放，我们能创造一个对称的共轭坍塌? 那么就能中和能量。什么意思？好比原子?"
				+ "爆炸了，却破坏力等于0.�?????这个汉密尔顿反粒子（量子数学叫轭米粒子，量子力学叫汉密尔顿共轭）?么实现？我又??了很�?"
				+ "我又得到了答�??在平行纠缠�?�的异域 通过量子纠缠控制反应区量子集合， 通过量子纠缠可以控制原子反应�??�??切离不开时函�???公式�??  \r\n" + 
				"|tero(x)>+|tcol(x)> =  deta (t1-t0)*m(t?/ deta1(t1-t0)*p(t) \r\n" + 
				"推导了这个公式后，最近有看了?下，又稍微变化了?下： 假设\r\n" + 
				"1 deta (t1-t0)/deta1(t1-t0) = 时间�??比重\r\n" + 
				"2 |tero(x)>+|tcol(x)> = 中和时间能\r\n" + 
				"3 m(t?= 观测\r\n" + 
				"4 p(t) = 发展\r\n" + 
				"我得到一个公?: \r\n" + 
				"5 中和时间? = 时间�??�?? * 观测 / 发展\r\n" + 
				"6 时间�??�?? = 中和时间? * 发展 / 观测\r\n" + 
				"今天又看了下这个公式 6，我得到?个论�??�??种固定的观测态中，发�??度越快时间流?比重大�?�以后星际穿? 飞船飞行速度越快，时?"
				+ "�??比重越大�?"
				+ "意味?飞行过程时间应该指数级别比例缩短。几百光年的距离，未必要那么久的时间穿梭。不知道假设是不是正确的。我�???这种固定的观�?"
				+ "�??么模拟出来�?�我得到了一个推论结果，当物体超�??运动的时?，物体具有巨大的动能，这种能量能够和时间能进行公式转化，也可以转�?"
				+ "成力学，强大的力可以扭曲时空，达到瞬间转�??若果推论成立，物体在时空中带强力强能??飞行，物体四周的时空会产生巨大引力扭曲环�??"
				+ "罗氏猜想这个环层时空扭曲力能牵引物体，我定义为局部时空扭曲引力，这是瞬间转移的关�???";


		String text3 = "?新的知识工程结构中，传统的专家系统占据着主导的地位，可是世界的需求体系处在一个多变的运行环境，所以数据持久化理论是一个为之奋斗的目标?"
				+ "人工智能软件也一样，逃避不了自然的更新所带来的种种弊�??人工智能何去何从，自然会规划它，正如达尔文的生物进化�??样，新的智能体系标准都是被需求自�??择出来，这就是我要表达的中心?想�?�\r\n" + 
				"过去50年里，一些经典的软件逃不过需求的抉择，最终枯黄暗淡，当然?些企业将产品拼命的重写升级，因为核心?�??的年龄�?�化，新的改�??无法掌握原始�?�??想和理论�??后产品的品质遭受巨大的冲击，"
				+ "损失惨重，一种新的软件开发理论需要被人所证实，这也就是我�??想�?�软件也?样，?要有自我的人�??择的进化体系?\r\n" + 
				"通过?近的 UNICORN AI\r\n" + 
				"软件的构造，设计和编码测试中，我发现了许多因空想而创造的计算机理论在实际的编程分析中有巨大的差异，我用的是JAVA为主的语?，我就发现JAVA的继承没有达到具有进�??想的�??标准?"
				+ "但是JAVA在这个初期的进化标准测试中其方法论远远胜出C/C++ ,我用C风格写JAVA程序并没有给我的实际编程带来种种麻烦，但是JAVA仍然?要改进，比如你抽象了?个父类，而你的子类的?"
				+ "量函数还是需要在“OBJECT 父类=（子类）父类? 这样的写法中的才能做出子类运�??如果孙类又继承子类，?么让OBJECT 得到孙类？（我的用的是OBJECT 子类继承父类，然后OBJECT "
				+ "子类=（孙类）子类 。这样孙类得到了运算），可是这就是一个动态内存结构分配的大问题！设计的相当繁�??JAVA还停留在初级语言进化级别，没有具备高级的进化思想。其次， 子类如果有多个孙类，"
				+ "也只有子类可以运算，父类就被无法作出相应的运�??这也�??个诟病，难道再加上OBJECT 子类=（孙类）子类 ，OBJECT 父类=（子类）父类 来实现？这就更加繁琐�??\r\n" + 
				"通过上面的描述，我有自己的看法，可是我还�??择了JAVA, 即使繁琐，但是没有任何错误，因为用底层语?来实现就会更加繁�??陷阱更多?\r\n" + 
				"人工智能选择了JAVA是一个自然的抉择。JAVA和C#都是高层语言，可是JAVA的个性就是天生对数据来处理的，因为JAVA早期是一个WEB语言，WEB处理数据信息有独特的优势，这是JAVA进化"
				+ "为数据分析语?的一个真实的例子。C#在这个问题里?直在改进自己，类似JAVA?样，甚至和JAVA?样，可是没有?个体系来评估�??早期应用JAVA的WEB数据工程师也不会转移到C#.?以C#的最大优势还是仅仅在WINDOWS上的控件应用。\r\n" + 
				"通过这段的描述，仅仅证明任何?种语?的最大优势也仅仅体现在它诞生之初的创造理论和思想。所以JAVA和C#根本就没有什么可�???因为他们�?原始的创造理论，体系�??想结构就�??�??如果�??"
				+ "JAVA和C#�??�??后，通过进化�??想预测，JAVA?后走图形，大数据分析，WEB,方向? 而C# 应该走界面，控件，WINDOWS设备集成方向。\r\n" + 
				"人工智能软件的进化主要分为父类的更新，子类的变异和继�??现在的许多人工智能软件因�??求关系的制约，导致创�??想的缺乏，父类被写死了，无法得到应有的�?�应扩展，比如ORACLE的数据库ETL"
				+ "，仅仅在处理数据仓库领域有巨大价值，无法扩展到数据可视化，并行运算等领域。德国的KNIME也是因为父类的写死，结果插件很多API都不支持，实例证明，我用SWT写插件界面，就无法实�??�?"
				+ "在节点里面导入自己的数据库API,它就要我在软件的配置选项里面去导入，这就是父类写死的诟病。\r\n" + 
				"当然有很多细节的问题，ORACLE ETL和KNIME DM 都不失为成功大作。上面提到的是父类写死没有得到进化论�??想�?�然后评论一下子类变�??\r\n" + 
				"JAVA处理子类函数是比较完美的，用过JAVA?发大型项目的人都相当有经验处理接口和继承。可? JAVA有没有变异的�??呢？可以说无，比如我举个例子，当父类PUBLIC �???1=0；，子类就无"
				+ "法在PUBLIC �???1=1了，这就是一个变异失效的问题。JAVA 很灵活，但是不够脚本语言灵活。其次我要说的是JAVA的变异是带引号的变异，其特点就是子类修改父类函数，JAVA的子类是可以"
				+ "修改父类的同名函数处理过程的。不过你要让子类和父类的函数名一样，这是?? JAVA默认的机制，先执行父类同名，再执行子类同�??然后返回到父类，然后返回的过程�?�所以同名函数可以在子类里得"
				+ "到修改，保证了参数变�??这样，软件在实际的编写过程中也非常的灵活和独到�?�\r\n" + 
				"?�??过上述的�??进化思想，程序进�??想的表述，我�??个很深的体会。每?种语?要根深蒂固，?要有它的?求，它的功能在需求中要有选择的得到进�??不然，这就是�??被淘汰的?大原因，我不喜欢?"
				+ "到当今世界上各种语言层出不穷，这就是许多语言没有得到进化，体现不了需求的?大诟�??? 其次，语??要扩展，高级语言的API类库和一些架构体系的出现是一个很好的扩展证明。最后是变异，类似脚"
				+ "本语?，灵活，方便。\r\n" + 
				"那么软件呢？软件也一样，选择?�??应自�??求的语言来设计尤为重�??? 其次，软件的架构要有�??度，类似于OSGI,FELIX那样,进行组件持久化，KNIME的OSGI思想和LIFERAY的OSGI思想?"
				+ "?致的，虽然API设计风格不一样，但是效果都很笃厚。\r\n" + 
				"生物?要有达尔�??想，人工智能同样也存在，这是�?求持久化的基?。这也是我研发UNICORN AI平台的基本条�???";
		
		//ICA kernel
		double[][] kernel = new double[3][];
		kernel[0] = new EducationRatio().getEducationKernel(text1);
		kernel[1] = new EducationRatio().getEducationKernel(text2);
		kernel[2] = new EducationRatio().getEducationKernel(text3);
		
		//ANN kernel
		double[][] kernelRatio = new double[3][];
		kernelRatio[0] = new EducationRatio().getEducationRatioKernel(kernel[0]);
		kernelRatio[1] = new EducationRatio().getEducationRatioKernel(kernel[1]);
		kernelRatio[2] = new EducationRatio().getEducationRatioKernel(kernel[2]);
		EducationLevelTest educationLevelTest = new EducationLevelTest();
		educationLevelTest.getEducationLevel(kernelRatio);
	}
}