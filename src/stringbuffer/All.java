package stringbuffer;

public class All {

public static void main(String[] args) {
	//1.append()
	StringBuffer sb=new StringBuffer("Hello");
	sb.append("java");
	System.out.println(sb);
	
	//2.inser()
	sb.insert(0,"mani");
	System.out.println(sb);
	//3.replace
	sb.replace(1, 3, "super");
}
}
