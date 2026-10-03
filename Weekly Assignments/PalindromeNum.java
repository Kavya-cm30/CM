package PlayWrightAutomation.PlayWrightAutomation;

public class PalindromeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=123321;
		int admin=num;
		int rev=0;
		
		for(; num!=0; num=num/10)
		{
			int digit = num%10;
			rev=(rev*10)+digit;
			
		}
		
    if(admin==rev) 
	System.out.println(admin +"it is an palindrome number");
	else 
	System.out.println(admin +"it's not a  palindrome number");
		
}
	
	}


