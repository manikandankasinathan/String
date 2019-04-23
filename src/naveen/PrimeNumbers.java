package naveen;

public class PrimeNumbers {

	
	 public static boolean primenumber(int num)
	 {
		 if(num<=1){
			 return false;
	 }
		 for(int i=2;i<num;i++)
		 {
			 if(num % i==0)
			 {
				 return false;
			 }
		 }
			 return true;
		 }
	 //2nd methos
	 public static void getprimenumbers(int num){
		 for(int i=2;i<=num;i++){
			 if(primenumber(i))
				 System.out.print(i +"");
		 }
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(primenumber(111));
		System.out.println(primenumber(10));
		System.out.println(primenumber(7));
		getprimenumbers(020);
		

	}

}
