class Account{
	String customerName;
	int accountNo;
	Account(String a , int b){
		customerName = a;
		accountNo = b;
	}
	void display(){
		System.out.println("the name of customer is "+customerName);
		System.out.println("the account no is "+accountNo);
	}
}
class CurrentAccount extends Account{
	int currentBalance;
	CurrentAccount(String a ,int b ,int c){
		super(a,b);
		currentBalance = c;
	}
	void display() {
		super.display();
		System.out.println("the current balance is "+currentBalance);
	}
}
class AccountDetails extends CurrentAccount{
	int depositAmount;
	int withdrawlAmount;
	AccountDetails(String a , int b,int c,int d,int e){
		super(a,b,c);
		depositAmount = d;
		withdrawlAmount = e;
	}
	void display() {
		super.display();
		System.out.println("Total deposited amount is "+depositAmount +" the total withDrawl amount is "+withdrawlAmount);
	}
}
public class accountsDemo {
	public static void main(String[]args) {
		AccountDetails A = new AccountDetails("Akshay",11111,10000,5000,500);
		A.display();
		
	}

}
