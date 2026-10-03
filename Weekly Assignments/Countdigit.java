package PlayWrightAutomation.PlayWrightAutomation;

public class Countdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=123456;
		int count =0;
		for (; num!=0; num=num/10)
		{
			count++;
			
		}
 System.out.println(count);
	}

}
