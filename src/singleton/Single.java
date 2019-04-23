package singleton;

public class Single {
	private static Single singleton_instance=null;
	public String str;
	private Single()
	{
		str= "Hey,This is man from bangslore";
	}
	
	public static Single get_instance()
	{
	if(singleton_instance==null)
		singleton_instance=new Single();
	return singleton_instance;
	
		
	}
	

}
