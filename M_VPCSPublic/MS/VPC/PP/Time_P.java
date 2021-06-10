package MS.VPC.PP;
public class Time_P{
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