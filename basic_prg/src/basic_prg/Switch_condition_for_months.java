package basic_prg;

import java.util.Scanner;

public class Switch_condition_for_months {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		switch(n) {
		case 1: System.out.println("jan");
		break;
		case 2: System.out.println("feb");
		break;
	    case 3: System.out.println("march");
	    break;
	    case 4: System.out.println("april");
		break;
	    case 5: System.out.println("may");
		break;
	    case 6: System.out.println("june");
		break;
	    case 7: System.out.println("july");
		break;
		default: System.out.println("invalid");
		}
	

	}

}
