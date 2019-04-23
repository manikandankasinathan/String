package cons;

public class Icici {
	
	int accno;
	String name;
	String bankname;
	
	public Icici(int i,String s,String n)
	{
		accno=i;
		name=s;
		bankname=n;
		
	}
/* void dsiplay(Icici ic)
 {
	System.out.println( accno+""+name+""+bankname);
 }*/
 public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
		
	}
	
	public static void main(String[] args)  {
		Icici ic=new Icici(1, "mani", "hdfc");
		try {
			Icici ic2 = (Icici)ic.clone();
			System.out.print(ic.accno+""+ic.name+""+ic.bankname);
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*ic.dsiplay(ic2);
		ic2.dsiplay(ic);*/

	}

}
