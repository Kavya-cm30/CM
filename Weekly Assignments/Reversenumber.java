package PlayWrightAutomation.PlayWrightAutomation;

public class Reversenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int num=1234567;
 int reverse=0;
 
 for(; num!=0;num=num/10)
 {
	 int digit=num%10;
	 reverse=(reverse*10)+digit;
	 
	 
 }
 System.out.println(reverse);
	}

}
