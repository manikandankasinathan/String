package stringprevie;

public class Chararry {
	public static void main(String args[])
	{
		String str="manikandan kasinathan";
		System.out.println(str.trim());
		char[] ch=str.toCharArray();
		int len = ch.length;
		
		System.out.println(len);
		
		for(int i=0; i<len; i++)
		{
			System.out.print(ch[i]);
		}
	}

}
