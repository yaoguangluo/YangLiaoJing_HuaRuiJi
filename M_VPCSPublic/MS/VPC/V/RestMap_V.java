package MS.VPC.V;
import java.io.BufferedReader;

import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import ME.APM.VSQ.App;
import MS.OP.SM.AOP.MEC.SIQ.cache.DetaCacheManager;
import OP.SM.AOP.MEC.SIQ.stable.StableData;
import OSI.AOP.VPC.rest.VPC;
import PEU.P.zip.*;
//这里出现了VPC的标识,让走四方看清楚,我有很多方法来继承,我就不用走四方的那种. VPCS 的STABLE就可以解决
//是不是我写的.
public class RestMap_V {
	public static void main(String[] args){

	}

	public static void getResponse(Socket socket) {

	}

	public static void returnResponse(Socket socket) {

	}

	public static void getResponse(VPCSRequest vPCSRequest, VPCSResponse vPCSResponse) {

	}

	public static void returnResponse(VPCSRequest vPCSRequest, VPCSResponse vPCSResponse) {
		vPCSResponse.getSleeperHall().removeThreadById(vPCSResponse.getHashCode());
	}

	public static void P_Rest(VPCSRequest vPCSRequest, VPCSResponse vPCSResponse) throws Exception {
		String output = VPC.forward(null, vPCSRequest.getRequestLink(), vPCSRequest.getRequestValue());
		PrintWriter printWriter = new PrintWriter(new BufferedWriter(new OutputStreamWriter(vPCSResponse.getSocket()
				.getOutputStream(),"UTF-8")),true);
		printWriter.println("HTTP/1.1 200 OK\n\n"); 
		output=output.charAt(0)=='"'?output.substring(1,output.length()):output;
		output=output.charAt(output.length()-1)=='"'?output.substring(0
				, output.length()-1):output;
		output.replace("\\\"","\"");
		printWriter.println(output);
		printWriter.flush();
		printWriter.close();	
		vPCSResponse.getSleeperHall().removeThreadById(vPCSResponse.getSocket().hashCode());
	}
	
	public static void P_Rest(App app, VPCSRequest vPCSRequest, VPCSResponse vPCSResponse) throws Exception {
		//VPC属于子继承, 如果不用 overrider 来分配, 也有很多方法, 如osgi, 当然,我现在用最快map标识,更爽.
		//indexVPCMapPillows.get(vPCSRequest.gettag())...;
		//现在仅仅deta的网站处理服务器有web页, 养疗经app还没有涉及, 因此 pillow tag 区分VPC 函数的rest map 设计优先级稍后 
		String output= VPC.forward(app, vPCSRequest.getRequestLink()
				, vPCSRequest.getRequestValue());
		PrintWriter printWriter= new PrintWriter(new BufferedWriter(new OutputStreamWriter(vPCSResponse.getSocket()
				.getOutputStream(),StableData.CHARSET_UTF_8)),true);
		printWriter.println("HTTP/1.1 200 OK\n\n"); 
		output=output.charAt(StableData.INT_ZERO)=='"'?output.substring(StableData.INT_ONE, output.length())
				:output;
		output=output.charAt(output.length()-StableData.INT_ONE)=='"'?output.substring(StableData.INT_ZERO
				, output.length()-StableData.INT_ONE):output;
		printWriter.println(output.replace("\\\"","\""));
		System.out.println("db:"+4);
		printWriter.flush();
		printWriter.close();	
		vPCSResponse.getSleeperHall().removeThreadById(vPCSResponse.getSocket().hashCode());	
	}

	public static void P_View(VPCSRequest vPCSRequest, VPCSResponse vPCSResponse) {

	}

	public static void P_Bytes(VPCSRequest vPCSRequest
			, VPCSResponse vPCSResponse) throws IOException {
		List<byte[]> list;
		DataOutputStream dataOutputStream = new DataOutputStream(vPCSResponse.getSocket().getOutputStream());
		if(null != DetaCacheManager.getCacheOfBytesList(vPCSRequest.getRequestFilePath())){
			list = DetaCacheManager.getCacheOfBytesList(vPCSRequest.getRequestFilePath());
		}else{
			FileInputStream fileInputStream = new FileInputStream(new File(vPCSRequest.getRequestFilePath()));
			ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
			byte[] byteArray = new byte[StableData.BUFFER_RANGE_MAX];
			int lengthOfFile = StableData.INT_ZERO;
			list = new ArrayList<>();
			//这段while函数思想来自 这篇文章：https://blog.csdn.net/top_code/article/details/41042413
			//非常轻松处理len的长度溢出。谢谢。
			while((lengthOfFile = fileInputStream.read(byteArray, StableData.INT_ZERO
					, StableData.BUFFER_RANGE_MAX)) != StableData.INT_MINES_ONE){
				byteArrayOutputStream.write(byteArray, StableData.INT_ZERO, lengthOfFile);
			}
			fileInputStream.close();
			byte[] sniper = GzipUtil.compress(byteArrayOutputStream.toByteArray());
			list.add(0, vPCSResponse.getResponseContentType().getBytes(StableData.CHARSET_UTF8));
			list.add(0, (StableData.HEADER_CONTENT_LENGTH + sniper.length + StableData.STRING_SPACE_ENTER)
					.getBytes(StableData.CHARSET_UTF8));
			list.add(0, StableData.HEADER_CACHE_CONTROL.getBytes(StableData.CHARSET_UTF8));
			list.add(0, StableData.HEADER_CONTENT_ENCODING_GZIP.getBytes(StableData.CHARSET_UTF8));
			list.add(0, StableData.HEADER_ACCEPT_RANGES_BYTES.getBytes(StableData.CHARSET_UTF8));
			list.add(0, StableData.HEADER_HOST.getBytes(StableData.CHARSET_UTF8));
			list.add(0, StableData.HEADER_HTTP_200_OK.getBytes(StableData.CHARSET_UTF8));
			if(null != sniper && sniper.length>StableData.INT_ZERO) {
				list.add(sniper);
			}
			DetaCacheManager.putCacheOfBytesList(vPCSRequest.getRequestFilePath(), list);
		}	
		Iterator<byte[]> iterator = list.iterator();
		while(iterator.hasNext()){
			dataOutputStream.write(iterator.next());	
		}	
		dataOutputStream.flush();
		dataOutputStream.close();
	}

	public static void P_Buffer(VPCSRequest vPCSRequest, VPCSResponse vPCSResponse) throws IOException {
		String builderToString;
		if(null != DetaCacheManager.getCacheOfString(vPCSRequest.getRequestFilePath())){
			builderToString = DetaCacheManager.getCacheOfString(vPCSRequest.getRequestFilePath());
		}else{
			StringBuilder stringBuilder = new StringBuilder();
			stringBuilder.append(StableData.HEADER_HTTP_200_OK);
			stringBuilder.append(StableData.HEADER_HOST);
			stringBuilder.append(StableData.HEADER_CACHE_CONTROL);
			stringBuilder.append(vPCSResponse.getResponseContentType());
			FileInputStream fileInputStream = new FileInputStream(new File(vPCSRequest.getRequestFilePath())); 
			InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream
					, vPCSRequest.getRequestFileCode()); 
			BufferedReader bufferedReader = new BufferedReader(inputStreamReader); 
			String line = null; 
			while ((line = bufferedReader.readLine()) != null) { 
				stringBuilder.append(line); 
			}
			bufferedReader.close();
			builderToString = stringBuilder.toString();
			DetaCacheManager.putCacheOfString(vPCSRequest.getRequestFilePath(), builderToString);
		}
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(vPCSResponse.getSocket()
				.getOutputStream(), vPCSRequest.getRequestFileCode()));
		bufferedWriter.write(builderToString);
		bufferedWriter.flush();
		bufferedWriter.close();	
	}

	public static void P_BufferBytes(VPCSRequest vPCSRequest
			, VPCSResponse vPCSResponse) throws UnsupportedEncodingException, IOException {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(StableData.HEADER_HTTP_200_OK);
		stringBuilder.append(StableData.HEADER_HOST);
		stringBuilder.append(StableData.HEADER_CACHE_CONTROL);
		stringBuilder.append(StableData.HEADER_CONTENT_ENCODING_GZIP);
		stringBuilder.append(vPCSResponse.getResponseContentType());
		String builderToString= stringBuilder.toString();
		String contentBuilderToString;
		if(null != DetaCacheManager.getCacheOfString(vPCSRequest.getRequestFilePath())){
			contentBuilderToString = DetaCacheManager
					.getCacheOfString(vPCSRequest.getRequestFilePath());
		}else{
			StringBuilder contentBuilder = new StringBuilder();
			FileInputStream fileInputStream = new FileInputStream(new File(vPCSRequest
					.getRequestFilePath()));
			int lengthOfFile = StableData.INT_ZERO;
			byte[] byteArray = new byte[StableData.BUFFER_RANGE_MAX];
			while ((lengthOfFile = fileInputStream.read(byteArray)) != StableData.INT_MINES_ONE){
				contentBuilder.append(new String(byteArray, StableData.INT_ZERO, lengthOfFile
						, StableData.CHARSET_UTF_8));
			}
			fileInputStream.close();
			contentBuilderToString = contentBuilder.toString();
			DetaCacheManager.putCacheOfString(vPCSRequest.getRequestFilePath(), contentBuilderToString);
		}	
		DataOutputStream dataOutputStream = new DataOutputStream(vPCSResponse.getSocket().getOutputStream());
		dataOutputStream.write(builderToString.getBytes(StableData.CHARSET_UTF8));
		dataOutputStream.write(GzipUtil.compress(contentBuilderToString.getBytes(StableData.CHARSET_UTF8)));
		dataOutputStream.flush();
		dataOutputStream.close();
	}

	public static void P_BytesWithoutZip(VPCSRequest vPCSRequest, VPCSResponse vPCSResponse) throws IOException {
		List<byte[]> list;
		DataOutputStream dataOutputStream = new DataOutputStream(vPCSResponse.getSocket().getOutputStream());
		if(DetaCacheManager.getCacheOfBytesList(vPCSRequest.getRequestFilePath()) != null){
			list = DetaCacheManager.getCacheOfBytesList(vPCSRequest.getRequestFilePath());
		}else{
			FileInputStream fileInputStream = new FileInputStream(new File(vPCSRequest.getRequestFilePath()));
			ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
			byte[] byteArray = new byte[1024];
			int len = 0;
			list= new ArrayList<>();
			//下面三行while函数思想来自 这篇文章：https://blog.csdn.net/top_code/article/details/41042413
			//非常轻松处理len的长度溢出。谢谢。
			while((len = fileInputStream.read(byteArray, 0, 1024))!=-1){
				byteArrayOutputStream.write(byteArray, 0, len);
			}
			fileInputStream.close();
			byte[] sniper =byteArrayOutputStream.toByteArray();
			list.add(0, vPCSResponse.getResponseContentType().getBytes("UTF8"));
			list.add(0, ("Content-Length: " + sniper.length + " \n").getBytes("UTF8"));
			list.add(0, ("Cache-control: max-age=315360000 \n").getBytes("UTF8"));
			list.add(0, "Accept-Ranges: bytes \n".getBytes("UTF8"));
			list.add(0, "Host:deta software  \n".getBytes("UTF8"));
			list.add(0, "HTTP/1.1 200 OK \n".getBytes("UTF8"));
			list.add(sniper);
			DetaCacheManager.putCacheOfBytesList(vPCSRequest.getRequestFilePath(), list);
		}	
		Iterator<byte[]> iterator = list.iterator();
		while(iterator.hasNext()){
			byte[] bytes = null;
			int i= 0;
			try {
				bytes=iterator.next();
				if(bytes.length>10000) {
					int last= bytes.length%10000;
					for(i= 0; i< bytes.length- 10000; i+= 10000) {
						byte[] serparBytes = new byte[10000];
						for(int j= 0; j< 10000; j++) {
							serparBytes[j]= bytes[i+ j];
						}
						Thread.sleep(250);
						dataOutputStream.write(serparBytes);
						dataOutputStream.flush();
					}
					byte[] serparBytes = new byte[last];
//					i-=10000;
					for(int j=0; j<last;j++) {
						serparBytes[j]= bytes[i+ j];
					}
					dataOutputStream.write(serparBytes);
				}else {
					dataOutputStream.write(bytes);
				}
			}catch(Exception e) {
				System.out.print(i);
				System.out.print(bytes.length);
				System.out.print(vPCSRequest.getRequestLink());
				System.out.print(vPCSRequest.getRequestFilePath());
				e.printStackTrace();
			}
		}	
		dataOutputStream.flush();
		dataOutputStream.close();
	}
}