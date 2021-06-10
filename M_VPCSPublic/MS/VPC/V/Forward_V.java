package MS.VPC.V;
import java.io.IOException;
import java.net.Socket;

import ME.APM.VSQ.App;
import OP.SM.AOP.MEC.SIQ.stable.StableData;
import OSI.AOP.MS.VPC.rest.VPC;
//合并 数据库和 前端的 vison文件
public class Forward_V {
	public static void main(String[] args){
	}

	public static void getForwardType(Socket socket) {
	}

	public static void forwardToRestMap(Socket socket) {
	}

	public static void getForwardType(VPCSRequest vPCSRequest
			, VPCSResponse vPCSResponse) throws IOException {
		if(vPCSRequest.getRequestIsRest()){
			String filePath = VPC.getFilePath(vPCSRequest.getRequestLink());
			if(filePath.contains(StableData.FILE_TTF)
					||filePath.contains(StableData.FILE_EOT)
					||filePath.contains(StableData.FILE_SVG)
					||filePath.contains(StableData.FILE_WOFF)
					||filePath.contains(StableData.FILE_WOFF2)
					||filePath.contains(StableData.FILE_OTF)){
				String code = VPC.getCode(filePath);
				vPCSRequest.setRequestFilePath(filePath);
				vPCSRequest.setRequestFileCode(code);
				vPCSRequest.setRequestForwardType(StableData.STREAM_BUFFER);
				vPCSResponse.setResponseContentType(StableData.HEADER_CONTENT_TYPE_FONT_WOFF);
				return;
			}	
			vPCSRequest.setRequestForwardType(StableData.STREAM_REST);
		}else{
			String filePath = VPC.getFilePath(vPCSRequest.getRequestLink());
			String code = VPC.getCode(filePath);
			vPCSRequest.setRequestFilePath(filePath);
			vPCSRequest.setRequestFileCode(code);
			if(filePath.contains(StableData.FILE_PNG)){ 
				vPCSRequest.setRequestForwardType(StableData.STREAM_BYTES);
				vPCSResponse.setResponseContentType(StableData.HEADER_CONTENT_TYPE_PNG);
			}
			if(filePath.contains(StableData.FILE_JPEG)){ 
				vPCSRequest.setRequestForwardType(StableData.STREAM_BYTES);
				vPCSResponse.setResponseContentType(StableData.HEADER_CONTENT_TYPE_JPEG);
			}
			if(filePath.contains(StableData.FILE_JPG)){ 
				vPCSRequest.setRequestForwardType(StableData.STREAM_BYTES);
				vPCSResponse.setResponseContentType(StableData.HEADER_CONTENT_TYPE_JPG);
			}
			if(filePath.contains(StableData.FILE_GIF)){ 
				vPCSRequest.setRequestForwardType(StableData.STREAM_BYTES);
				vPCSResponse.setResponseContentType(StableData.HEADER_CONTENT_TYPE_GIF);
			}
			if(filePath.contains(StableData.FILE_JS) && code.equalsIgnoreCase(StableData.CHARSET_UTF_8)){	
				vPCSRequest.setRequestForwardType(StableData.STREAM_BYTES_BUFFER);
				vPCSResponse.setResponseContentType(StableData.HEADER_CONTENT_TYPE_JS);
			}
			if(filePath.contains(StableData.FILE_CSS)){
				vPCSRequest.setRequestForwardType(StableData.STREAM_BUFFER);
				vPCSResponse.setResponseContentType(StableData.HEADER_CONTENT_TYPE_CSS);
			}
			if(filePath.contains(StableData.FILE_HTML)){
				vPCSRequest.setRequestForwardType(StableData.STREAM_BUFFER);
				vPCSResponse.setResponseContentType(StableData.HEADER_CONTENT_TYPE_HTML);
			}	
			if(filePath.contains(StableData.FILE_PDF)){
				vPCSRequest.setRequestForwardType(StableData.STREAM_BYTES_WITHOUT_ZIP);
				vPCSResponse.setResponseContentType(StableData.HEADER_CONTENT_TYPE_PDF);
			}
			if(filePath.contains(StableData.FILE_ZIP)){
				vPCSRequest.setRequestForwardType(StableData.STREAM_BYTES_WITHOUT_ZIP);
				vPCSResponse.setResponseContentType(StableData.HEADER_CONTENT_TYPE_ZIP);
			}
			if(filePath.contains(StableData.FILE_WAV)){
				vPCSRequest.setRequestForwardType(StableData.STREAM_BUFFER);
				vPCSResponse.setResponseContentType(StableData.HEADER_CONTENT_TYPE_WAV);
			}
				if(filePath.contains(StableData.FILE_RAR)){
				vPCSRequest.setRequestForwardType(StableData.STREAM_BYTES_WITHOUT_ZIP);
				vPCSResponse.setResponseContentType(StableData.HEADER_CONTENT_TYPE_RAR);
			}
			if(filePath.contains(StableData.FILE_XML)){
				vPCSRequest.setRequestForwardType(StableData.STREAM_BYTES_WITHOUT_ZIP);
				vPCSResponse.setResponseContentType(StableData.HEADER_CONTENT_TYPE_XML);
			}
			if(filePath.contains(StableData.FILE_TXT)){
				vPCSRequest.setRequestForwardType(StableData.STREAM_BYTES_WITHOUT_ZIP);
				vPCSResponse.setResponseContentType(StableData.HEADER_CONTENT_TYPE_TXT);
			}
		}	
	}

	public static void forwardToRestMap(App app, VPCSRequest vPCSRequest
			, VPCSResponse vPCSResponse) throws Exception {
		if(null== vPCSRequest || null== vPCSRequest.getRequestForwardType()){
			vPCSResponse.return404();
			return;
		}
		if(vPCSRequest.getRequestForwardType().equalsIgnoreCase(StableData.STREAM_REST)){
			RestMap_V.P_Rest(app, vPCSRequest, vPCSResponse);
		}
		if(vPCSRequest.getRequestForwardType().equalsIgnoreCase(StableData.STREAM_BYTES)){
			RestMap_V.P_Bytes(vPCSRequest, vPCSResponse);
		}
		if(vPCSRequest.getRequestForwardType().equalsIgnoreCase(StableData.STREAM_BUFFER)){
			RestMap_V.P_Buffer(vPCSRequest, vPCSResponse);
		}
		if(vPCSRequest.getRequestForwardType().equalsIgnoreCase(StableData.STREAM_BYTES_BUFFER)){
			RestMap_V.P_BufferBytes(vPCSRequest, vPCSResponse);
		}
		if(vPCSRequest.getRequestForwardType().equalsIgnoreCase("bytesWithoutZip")){
			RestMap_V.P_BytesWithoutZip(vPCSRequest, vPCSResponse);
		}
	}
	
	public static void forwardToRestMap(VPCSRequest vPCSRequest, VPCSResponse vPCSResponse) throws Exception {
		if(vPCSRequest.getRequestForwardType() == null){
			vPCSResponse.return404();
			return;
		}
		if(vPCSRequest.getRequestForwardType().equalsIgnoreCase("rest")){
			RestMap_V.P_Rest(vPCSRequest, vPCSResponse);
		}
		if(vPCSRequest.getRequestForwardType().equalsIgnoreCase("bytes")){
			RestMap_V.P_Bytes(vPCSRequest, vPCSResponse);
		}
		if(vPCSRequest.getRequestForwardType().equalsIgnoreCase("buffer")){
			RestMap_V.P_Buffer(vPCSRequest, vPCSResponse);
		}
		if(vPCSRequest.getRequestForwardType().equalsIgnoreCase("bytesBuffer")){
			RestMap_V.P_BufferBytes(vPCSRequest, vPCSResponse);
		}
		if(vPCSRequest.getRequestForwardType().equalsIgnoreCase("bytesWithoutZip")){
			RestMap_V.P_BytesWithoutZip(vPCSRequest, vPCSResponse);
		}
	}
}