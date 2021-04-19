package OSI.OSU.SI.MCI.OEI.GUI.extOSGI;
import java.io.IOException;
import java.util.Map;
import javax.swing.JTextPane;
import org.ASQ.PSU.OCI.tinos.engine.analysis.Analyzer;
import org.LYG.node.movie.aviToLyg.AVItoLYGNodeInterface;
import org.LYG.node.movie.lygPlayer.LYGPlayerNodeInterface;
import org.LYG.node.movie.lygRead.LYGReadNodeInterface;
import org.LYG.node.movie.lygWrite.LYGWriteNodeInterface;
import org.LYG.node.movie.movieTransfer.MovieTransferNodeInterface;
import org.OVI.node.image.imageRead.ImageReadNodeInterface;
import org.OVQ.node.image.findColorB.FindColorBInterface;
import org.OVQ.node.image.findColorG.FindColorGInterface;
import org.OVQ.node.image.findColorR.FindColorRInterface;
import org.OVQ.node.image.show3D.Show3DInterface;
import org.OVU.node.image.embossFilter.EmbossFilterInterface;
import org.OVU.node.image.grayFilter.GrayFilterNodeInterface;
import org.OVU.node.image.guassianFilter.GuassianFilterInterface;
import org.OVU.node.image.houghTransform.HoughTransformInterface;
import org.OVU.node.image.imageStrech.ImageStrechNodeInterface;
import org.OVU.node.image.laplacianFilter.LaplacianFilterInterface;
import org.OVU.node.image.medianImageFilter.MedianImageNodeInterface;
import org.OVU.node.image.morphologyFilter.MorphologyFilterInterface;
import org.OVU.node.image.sobelFilter.SobelFilterNodeInterface;

import ME.sample.App;
import OSI.OSU.OEQ.MCQ.GUI.OSGI.*;
import OSI.OSU.OEU.node.sound.FFT.FFTFilterNodeInterface;
import OSI.OSU.OEU.node.sound.GuassianWav2DFilter.GuassianWav2DFilterNodeInterface;
import OSI.OSU.OEU.node.sound.HoughWavFilter.HoughWavFilterNodeInterface;
import OSI.OSU.OEU.node.sound.LaplacianFilter.LaplacianFilterNodeInterface;
import OSI.OSU.OEU.node.sound.MaxMiniFilter.MaxMiniFilterNodeInterface;
import OSI.OSU.OEU.node.sound.MedianFilter.MedianFilterNodeInterface;
import OSI.OSU.OEU.node.sound.WavRead.WavReadNodeInterface;
import OSI.OSU.OEU.node.sound.fft2DFilter.Ft2DFilterInterface;
import OSI.OSU.OEU.node.sound.freqCount.FreqCountNodeInterface;
import OSI.OSU.OEU.node.sound.logFFT.LogFFTInterface;
import OSI.OSU.OEU.node.sound.logFFTcount.LogFFTcountInterface;
import OSI.OSU.OEU.node.sound.lygFilter.LygFilterNodeInterface;
import OSI.OSU.OEU.node.sound.lygSlaveFilter.LygSlaveFilterInterface;
import OSI.OSU.OVU.node.sound.ButterworthFilter.ButterworthFilterNodeInterface;
import OSI.OSU.PEQ.node.sound.wavePlay.WavePlayNodeInterface;
//import OSI.OSU.SI.OVI.OSI.AVI.AEI.ACI.ASI.OVI.OEI.OCI.OSI.PVI.PEI.PCI.PSI.addPGSearchPage.addPGSearchPageNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI;
//import OSI.OSU.SI.OVI.OSQ.AVQ.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.dNA3DShow.dNA3DShowNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI;
import OSI.OSU.deta.node.ai.xlsReaderNode.XlsReaderNodeInterface;

public class OSI_OSU_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI_register{
	JTextPane text;
	Object[][] tableData_old;
	public App u;
	public Analyzer analyzer;
	public Map<String, String> pos;
	
	public OSI_OSU_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI_register(Object[][] tableData_old, JTextPane text, App u
			, Analyzer analyzer, Map<String, String> pos){
		this.text= text;
		this.tableData_old= tableData_old;
		this.u= u;
		this.analyzer= analyzer;
		this.pos= pos;
	}
	
	
	public NodeOSGI Rigester(NodeOSGI first, LinkOSGI link) throws IOException{
		//注册
		OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI XlsReadernode = new XlsReaderNodeInterface();
		first = link.addNode(first, XlsReadernode);

		OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI imageReadNode = new ImageReadNodeInterface();
		first = link.addNode(first, imageReadNode);
		
		OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI imageStrechNode = new ImageStrechNodeInterface();
		first = link.addNode(first, imageStrechNode);
		
        //		OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI arffTransferNode = new arffTransferNodeInterface();
		//		first = link.addNode(first, arffTransferNode);	
		
		//		OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI WekaPilot2DNode = new WekaPilot2DNodeInterface();
		//		first = link.addNode(first, WekaPilot2DNode);
		
		
		OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI MedianImageNode = new MedianImageNodeInterface();
		first = link.addNode(first, MedianImageNode);
		
		OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI GrayFilterNode = new GrayFilterNodeInterface();
		first = link.addNode(first, GrayFilterNode);
				
		OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI GuassianFilterNode = new GuassianFilterInterface();
		first = link.addNode(first,	GuassianFilterNode);
			
		OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI FindColorRNode = new FindColorRInterface();
		first = link.addNode(first,	FindColorRNode);
		OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI FindColorGNode = new FindColorGInterface();
		first = link.addNode(first,	FindColorGNode);
		OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI FindColorBNode = new FindColorBInterface();
		first = link.addNode(first,	FindColorBNode);
		
		OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI SobelFilterNode = new SobelFilterNodeInterface();
		first = link.addNode(first,	SobelFilterNode);
		
		OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI EmbossFilterNode = new EmbossFilterInterface();
		first = link.addNode(first,	EmbossFilterNode);
		
		OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI LaplacianFilterNode = new LaplacianFilterInterface();
		first = link.addNode(first,	LaplacianFilterNode);
		
		OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI HoughTransformNode = new HoughTransformInterface();
		first = link.addNode(first, HoughTransformNode);
		
		OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI WavReadNode = new WavReadNodeInterface();
		first = link.addNode(first, WavReadNode);
		
		OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI MedianFilterNode = new MedianFilterNodeInterface();
		first = link.addNode(first, MedianFilterNode);
		
		OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI ButterworthFilterNode = new ButterworthFilterNodeInterface();
		first = link.addNode(first, ButterworthFilterNode);

		OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI LaplacianWaveFilterNode = new LaplacianFilterNodeInterface();
		first = link.addNode(first, LaplacianWaveFilterNode);
		
		OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI HoughWavFilterNode = new HoughWavFilterNodeInterface();
		first = link.addNode(first, HoughWavFilterNode);
		
		OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI GuassianWav2DFilterNode = new GuassianWav2DFilterNodeInterface();
		first = link.addNode(first, GuassianWav2DFilterNode);
		
		OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI MaxMiniFilterNode = new MaxMiniFilterNodeInterface();
		first = link.addNode(first, MaxMiniFilterNode);
		
		OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI wavePlayNode = new WavePlayNodeInterface();
		first = link.addNode(first, wavePlayNode);
		
		OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI Show3DNode = new Show3DInterface();
		first = link.addNode(first, Show3DNode);
		
		OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI MorphologyFilter = new MorphologyFilterInterface();
		first = link.addNode(first, MorphologyFilter);
		
		OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI LYGReadNode = new LYGReadNodeInterface();
		first = link.addNode(first, LYGReadNode);
		
		OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI LYGWriteNode = new LYGWriteNodeInterface();
		first = link.addNode(first, LYGWriteNode);
		
		OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI MovieTransferNode = new MovieTransferNodeInterface();
		first = link.addNode(first, MovieTransferNode);
		
		OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI AVItoImagesNode = new AVItoLYGNodeInterface();
		first = link.addNode(first, AVItoImagesNode);
		
		OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI LYGPlayerNode = new LYGPlayerNodeInterface();
		first = link.addNode(first, LYGPlayerNode);
		
		OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI FFTFilterNode = new FFTFilterNodeInterface();
		first = link.addNode(first, FFTFilterNode);
		
		OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI freqCountNode = new FreqCountNodeInterface();
		first = link.addNode(first, freqCountNode);
			
		OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI lygFilterNode = new LygFilterNodeInterface();
		first = link.addNode(first, lygFilterNode);
		
		OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI lygFilterComp = new Ft2DFilterInterface();
		first = link.addNode(first, lygFilterComp);

		OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI lygSlave = new LygSlaveFilterInterface();
		first = link.addNode(first, lygSlave);
		
		OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI logFFT = new LogFFTInterface();
		first = link.addNode(first, logFFT);

		OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI logFFTcount = new LogFFTcountInterface();
		first = link.addNode(first, logFFTcount);

//		OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI dNA3DShow = new dNA3DShowNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI();
//		first = link.addNode(first, dNA3DShow);
//		
//		OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI searchPG = new addPGSearchPageNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI();
//		first = link.addNode(first, searchPG);

		
//		OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI editPanelReader = new EditPanelReaderNodeInterface(this.text);
//		first = link.addNode(first, editPanelReader);
//		
//		OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI editPanelReaderH= new EditPanelReaderHNodeInterface(this.text);
//		first = link.addNode(first, editPanelReaderH); 	
//		
//		OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI addChuFangAttributeH= new AddChuFangAttributeHNodeInterface(this.tableData_old
//				, this.text);
//		first = link.addNode(first,addChuFangAttributeH); 
//		
//		OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI filterChuFangJinJiAttributeH= 
//				new filterChuFangJinJiAttributeHNodeInterface(this.tableData_old, this.text);
//		first = link.addNode(first, filterChuFangJinJiAttributeH); 
//		
//		OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI chuFangWuXingShowHInterface= 
//				new ChuFangWuXingShowHNodeInterface(this.tableData_old, this.text);
//		first = link.addNode(first,chuFangWuXingShowHInterface); 
//		//扫描jar、、添加jar
//		OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI filterChuFangXingWeiKeyWordsAttributeH= 
//				new filterChuFangXingWeiKeyWordsAttributeHNodeInterface(this.tableData_old, this.text);
//		first = link.addNode(first, filterChuFangXingWeiKeyWordsAttributeH); 
//		
//		OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI filterChuFangJinJiKeyWordsAttributeH= 
//				new filterChuFangJinJiKeyWordsAttributeHNodeInterface(this.tableData_old, this.text);
//		first = link.addNode(first, filterChuFangJinJiKeyWordsAttributeH); 
//		
//		OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI updateToEditPane= 
//				new updateToEditPaneNodeInterface(this.tableData_old, this.text);
//		first = link.addNode(first, updateToEditPane); 
//
//		OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI readNodeInterface= 
//				new ReadNodeInterface(this.tableData_old, this.text);
//		first = link.addNode(first, readNodeInterface); 
		
//		OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI DNN3DInterface= 
//				new ChuFangDNN3DShowNodeInterface(this.tableData_old, this.text, this.u, this.analyzer, this.pos);
//		first = link.addNode(first, DNN3DInterface); 
	
//		try {
//			//1扫描
//			//1.1设计一个文件夹
//			//扫描文件夹下面资源包录入
//			String jarCategoryLink= "";	
//			FileDialog filedialog= new FileDialog(new Frame(), StableData.ATTENSION_LOAD_HISTORY
//					, FileDialog.LOAD);
//			filedialog.setFilenameFilter(new TXTFilter(StableData.FILE_FORMAT_ETL));
//			filedialog.setVisible(true);
//			jarCategoryLink= filedialog.getDirectory();
//			//System.out.println(jarCategoryLink);
//			if(null== jarCategoryLink|| jarCategoryLink.isEmpty()|| jarCategoryLink.contains
//					(StableData.FILE_FORMAT_JAR)) {
//				System.out.println(StableData.ATTENSION_RECHOICE);
//				return first;
//			}
//			File file= new File(jarCategoryLink);
//			if(file.isFile()) {
//				System.out.println(StableData.ATTENSION_FILE_CHOICE);
//				return first;
//			}
//			File[] files= file.listFiles();
//			for(int i= 0; i< files.length; i++) {
//				@SuppressWarnings({ "deprecation", "resource" })
//				URLClassLoader loader= new URLClassLoader(new URL[]{ files[i].toURL() });  
//				String filename= files[i].getName().replace(StableData.FILE_FORMAT_JAR, StableData.STRING_EMPTY);
//				String[] columns= filename.split("\\.");
//				//如下注释2行代码 refer https://www.cnblogs.com/chinaxin/p/3678442.html 这小伙子以后有前途。哈哈
//				//Class<?> myclass = loader.loadClass("hand.java.loadjar.TestClass");
//				//Gene new object
//				//Object myobject = myclass.newInstance();   
//				Class<?> myclass = null;
//				try {
//					myclass = loader.loadClass(filename+ "."+ columns[columns.length- 1]
//							+ StableData.NODE_NODE_INTERFACE);
//				} catch (ClassNotFoundException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//				Object myobject = null;
//				try {
//					myobject = myclass.newInstance();
//				} catch (InstantiationException | IllegalAccessException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}   
//				//我准备之后设计成病毒式热插拔，因为绕过虚拟机的思想涉及情报学特工和计算机病毒领域
//				//，害怕国家相关安全体系管控，暂时不研发。
//				OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI= (OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI) myobject; 
//				first= link.addNode(first, OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI);
//			}	
//		}catch(Exception e) {
//
//		}
		
		return first;	
	}

}