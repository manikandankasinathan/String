package Arrays;

public class Slpit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	String s="kasinathan manikandan sui suryanathan";
		String[] words=s.split("\\");
		
		for(String w:words)
		System.out.println(w);*/
		String s1="welcome to split world";  
		System.out.println("returning words:");  
		for(String w:s1.split("\\s",0)){  
		System.out.println(w);  
		}  
		System.out.println("returning words:");  
		for(String w:s1.split("\\s",1)){  
		System.out.println(w);  
		}  
		System.out.println("returning words:");  
		for(String w:s1.split("\\s",4)){  
		System.out.println(w);  
		}  

	}

}
