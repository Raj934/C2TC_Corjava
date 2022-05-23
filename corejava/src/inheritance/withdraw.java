package inheritance;

 class withdraw
 {
int atm_withdraw =300;
int atm_left =6000;
 }
 
 class withdrawpg extends withdraw
 {  
	public static void main(String[] args)
	{
	 	// TODO Auto-generated method stub
     
		withdraw ob= new withdraw();
		System.out.println("amount withdraw"+ob.atm_withdraw);

		System.out.println("amount left"+ob.atm_left);
	}

}
 
