package inheritence;
import java.util.Scanner;
public class ATM {

	public static void main(String[] args) {
		AtmInterface atm=new AtmInterface();
		atm.pin();

	}
	
}
class AtmInterface{
	int pin=1231;
	long bal=3134;
	Scanner sc=new Scanner(System.in);
	public void pin() {
		System.out.println("Enter Your Pin=");
		short user_pin=sc.nextShort();
		if(user_pin==pin) {
			for(;;) {
				System.out.println("Press 1 for Withdrawl");
				System.out.println("Press 2 for Balance Enquirey");
				System.out.println("Press 3 for Deposit Money");
				System.out.println("Press 4 for Exit from Menue");
				System.out.println("Enter your choice=");
				short choice=sc.nextShort();
				
				switch(choice) {
				 
				case 1: withdrawl();
				        break;
				case 2: balance();
				        break;
				case 3: deposit();
				        break;
				case 4: System.exit(0);
				        break;
				default: System.out.println("Wrong Choice");
				}
			}
		}

		else {
			System.out.println("Wrong Pin !");
		}
		
	}
	public void withdrawl() {
		System.out.println("Enter your amount=");
		long amt=sc.nextLong();
		if(amt<=bal) {
			bal=bal-amt;
			System.out.println("Transation Sucessfully");
		}
		else {
			System.out.println("Insufficient Fund");
		}
		
	}
	public void balance() {
		System.out.println("Aavilable Balance="+bal);
		
	}
   public void deposit() {
	   System.out.println("Enter amount for Deposit=");
	   long dptamt=sc.nextLong();
	   bal=bal+dptamt;
	   System.out.println("Amount Deposited");
	   System.out.println("Your New Balance is="+bal);
		
	}
	
}
