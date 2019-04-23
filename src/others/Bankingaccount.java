package others;

public class Bankingaccount {
	int Acc_no;
	String name;
	int amount;
	void insert(int a,String n,int amt)
	{
		Acc_no=a;
		name=n;
		amount=amt;
	}
	
	void deposit(int amt)
	{
		amount=amount+amt;
		System.out.println(amt);
		
	}
	void withdrawal(int amt)
	{
		if(amount<amt)
		{
			System.out.println("in suufiect bal");
		}
		else{
			amount=amount-amt;
		}
	}
	void checkBalance(){
		System.out.println("Balance is: "+amount);
	}  
 
	void display(){
		System.out.println(Acc_no+" "+name+" "+amount);}  
	  

	public static void main(String[] args)
	{
		Bankingaccount b1=new Bankingaccount();
	b1.insert(101,"manikandan",1000);
	b1.display();
	b1.deposit(100000);
	b1.checkBalance();
	b1.withdrawal(9000);
	b1.checkBalance();
	}
}
