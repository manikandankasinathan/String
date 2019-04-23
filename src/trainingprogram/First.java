package trainingprogram;

public class First {

	
	    public static void main(String [] args) 
	    {
	    	First s = new First();
	        s.start();
	    }

	    int start() 
	    {
	        int a = 3;
	        int b = 4;
	        System.out.print(" " + 7 + 2 + " ");
	        System.out.print(a + b);
	        System.out.print(" " + a + b + " ");
	        System.out.print(foo() + a + b + " ");
	        System.out.println(a + b + foo());
			return b;
	    }

	    String foo() 
	    {
	        return "foo";
	    }
	
}


