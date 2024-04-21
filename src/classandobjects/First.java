package classandobjects;

 class First {
    String acc_name;
    String account_no;
	long ac_balance;
	String account_type;
	
	public void show_acount() {
		System.out.println("Account Holder=:"+acc_name);
		System.out.println("Account No=:"+account_no);
		System.out.println("Account Balance=:"+ac_balance);
		System.out.println("Account Type=:"+account_type);
	}
	public void show_Balance() {
		System.out.println("Accoutn Balance is:"+ac_balance);
	}

}
