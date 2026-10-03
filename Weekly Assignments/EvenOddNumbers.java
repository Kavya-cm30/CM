package PlayWrightAutomation.PlayWrightAutomation;

public class EvenOddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Even numb :");
		for (int i = 1; i <= 20; i++) {
			if (i % 2 == 0) {
				System.out.print( i + ",");
			}
		}
		
		
		System.out.println("\n\n\nodd numb :");
		for (int i = 1; i <= 20; i++) {

			if (i % 2 != 0) {
				System.out.print(", " + i);
			}
			
		}

	}

}
