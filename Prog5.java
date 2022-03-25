import java.util.*;

class Account{
	Scanner sc = new Scanner(System.in);
	String name,acc_type;
	long acc_no;
	Account(String acctype){
		System.out.print("Enter name:");
		name=sc.nextLine();
		acc_type=acctype;
		System.out.print("Enter Account Number:");
		acc_no=sc.nextLong();
	}
}

class curr_act extends Account{
	Scanner sc = new Scanner(System.in);
	int balance=5000;
	int min_bal=1000;

	curr_act(String acctype){
		super(acctype);
	}

	void disp_details(){
		System.out.println("Name:"+name+"\nAccount type:"+acc_type+"\nAccount No:"+acc_no);
	}


	void deposite(){
		int amount;
		System.out.print("Enter amount to deposite:");
		amount = sc.nextInt();
		balance=balance+amount;
	}

	void balance(){
		System.out.println("Balance: "+balance);
	}
	
	void withdraw(){
		int amount;
		System.out.print("Enter amount to withdraw:");
		amount = sc.nextInt();
		balance=balance-amount;
		if(balance<min_bal){
			System.out.println("Penalty imposed,since minimum balance is less than "+min_bal);
		}
			
	}
	void chkbook(){
		System.out.println("Checkbook facility for current account is available");
	}
}

class sav_act extends Account{
	Scanner sc = new Scanner(System.in);
	int balance=5000;
	int intsrt_rate=3;

	sav_act(String acctype){
		super(acctype);
	}

	void disp_details(){
		System.out.println("Name:"+name+"\nAccount type:"+acc_type+"\nAccount No:"+acc_no);
	}

	void deposite(){
		int amount;
		System.out.print("Enter amount to deposite:");
		amount = sc.nextInt();
		balance=balance+amount;
	}

	void balance(){
		System.out.println("Balance: "+balance);
	}

	void withdraw(){
		int amount;
		System.out.print("Enter amount to withdraw:");
		amount = sc.nextInt();
		balance=balance-amount;
	}
	void chkbook(){
		System.out.println("No checkbook facility for savings account!");
	}

	void calc_interest(){
		int years;
		System.out.println("Enter time period in years:");
		years=sc.nextInt();
		System.out.println("Interest you will get is "+(balance*years*intsrt_rate/100));
		balance=balance+(balance*years*intsrt_rate/100);
		System.out.println("Updated balance is:"+balance);
	}
}

class Bank{
	public static void main(String args[]){
		int choice;
		Scanner sc = new Scanner(System.in);
		System.out.println("Create savings account");
		sav_act sa = new sav_act("Savings");
		System.out.println("Create current account");
		curr_act ca = new curr_act("Current");

		for(;;){
			System.out.println("--Current account --\t--Savings account--");
			System.out.println("1.Check Balance\t\t\t2.Check Balance");
			System.out.println("3.Withdraw money\t\t4.Withdraw money");
			System.out.println("5.Deposite money\t\t6.Deposite money");
			System.out.println("7.Use check facility\t\t8.Use check facility");
			System.out.println("9.Display details\t\t10.Display details");
			System.out.println("11.Exit bank\t\t\t12.Deposite interest");
			System.out.print("Select choice:");
			choice=sc.nextInt();
			switch(choice){
				case 1:ca.balance();break;
				case 2:sa.balance();break;
				case 3:ca.withdraw();break;
				case 4:sa.withdraw();break;
				case 5:ca.deposite();break;
				case 6:sa.deposite();break;
				case 7:ca.chkbook();break;
				case 8:sa.chkbook();break;
				case 9:ca.disp_details();break;
				case 10:sa.disp_details();break;
				case 11:System.exit(0);break;
				case 12:sa.calc_interest();break;
					
				default:System.out.println("Invalid choice!");
			}
			System.out.println();
			
		}
	}
}
