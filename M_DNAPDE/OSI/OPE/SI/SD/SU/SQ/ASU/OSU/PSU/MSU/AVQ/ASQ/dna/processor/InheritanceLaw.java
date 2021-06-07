package OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.dna.P;

public class InheritanceLaw{
	public RST inheritance(RST father, RST mother) {
		RST son= new RST();
		//random
		if(Math.random()> 0.997) {
			son=new MutationLaw().mutation(father, mother);
		}else {
			son=new DatingLaw().dating(father, mother);
		}
		return son;
	}
}