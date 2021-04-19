package OSI.OSU.VPC.process;
public class TimeProcess{
	public long before;
	public long now;
	public void begin(){
		before = System.currentTimeMillis();
	}

	public void end(){
		now = System.currentTimeMillis();
	}

	public long duration(){
		return now - before;
	}
}