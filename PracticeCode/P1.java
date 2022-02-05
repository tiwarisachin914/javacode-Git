package PracticeCode;

public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1 2 2 3 3 3 4 4 4 4 3 3 3 2 2 1
		int num =7;
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i + "*");
			}
		}
		for( int i=num-1;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(i + "*");
			}
		}

	}

}
