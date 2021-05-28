package ME.APM.VSQ;

import java.util.StringTokenizer;
import ME.S.stables.PathLinkFile;
public class SetLib{
	public SetLib() {
		PathLinkFile.DNA_PDN.put(this.getClass().getCanonicalName(), true);
		//String libname=".dll";
		String libpath= System.getProperty("java.library.path");
		if(libpath==null||libpath.length()==0){
			throw new RuntimeException("lib path is null");
		}
		System.out.println(System.getProperty("java.library.path"));
		//	String path= null;
		StringTokenizer st=new StringTokenizer(libpath, System.getProperty("path.separator"));
		if(st.hasMoreElements()) {
			//	path=st.nextToken();
		}else {
			throw new RuntimeException("cant split libpath:"+ libpath);
		}
		//InputStream is= ConvertWord2HM
	}

	public static void main(String []args) {
		new SetLib();
	}
}