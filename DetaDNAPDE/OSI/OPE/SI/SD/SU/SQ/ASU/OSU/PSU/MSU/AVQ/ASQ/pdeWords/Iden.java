package OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.pdeWords;

public class Iden{
	public String timetoPDW(String time) {
		String outime= "";
		System.out.println(time);
		for(int i= 0; i< time.length(); i++) {
			if(time.charAt(i)=='0') {
				outime += "A";
			}
			if(time.charAt(i)=='1') {
				outime += "O";
			}
			if(time.charAt(i)=='2') {
				outime += "P";
			}
			if(time.charAt(i)=='3') {
				outime += "M";
			}
			if(time.charAt(i)=='4') {
				outime += "V";
			}
			if(time.charAt(i)=='5') {
				outime += "E";
			}
			if(time.charAt(i)=='6') {
				outime += "C";
			}
			if(time.charAt(i)=='7') {
				outime += "S";
			}
			if(time.charAt(i)=='8') {
				outime += "I";
			}
			if(time.charAt(i)=='9') {
				outime += "D";
			}
		}
		System.out.println(outime);
		return outime;
	}
	
	public String PDWtoTime(String PDW) {
		String outime= "";
		System.out.println(PDW);
		for(int i= 0;i< PDW.length(); i++) {
			if(PDW.charAt(i)=='A') {
				outime += "0";
			}
			if(PDW.charAt(i)=='O') {
				outime += "1";
			}
			if(PDW.charAt(i)=='P') {
				outime += "2";
			}
			if(PDW.charAt(i)=='M') {
				outime += "3";
			}
			if(PDW.charAt(i)=='V') {
				outime += "4";
			}
			if(PDW.charAt(i)=='E') {
				outime += "5";
			}
			if(PDW.charAt(i)=='C') {
				outime += "6";
			}
			if(PDW.charAt(i)=='S') {
				outime += "7";
			}
			if(PDW.charAt(i)=='I') {
				outime += "8";
			}
			if(PDW.charAt(i)=='D') {
				outime += "9";
			}
		}
		System.out.println(outime);
		return outime;
	}
	
	public static void main(String[] argv) {
		String time= "" + System.currentTimeMillis();
		String PDW= new Iden().timetoPDW(time);
		new Iden().PDWtoTime(PDW);
	}
}