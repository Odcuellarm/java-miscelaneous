package fibonacci;

public class JavaFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 6;
		int initDigit= 1;

		for(int i = 0; i < count; i++) {
			for(int j = 1; j < count - i; ++j){
			}
			for(int j = 0; j <= i; j++) {
			    if (j == 0 || i == 0){initDigit = 1;}
			    else{initDigit = initDigit * (i - j + 1) / j;}
			    System.out.print(initDigit + " ");
			}
			System.out.println();
	    }//end of outer Loop
	}
}

