package basic_prg;
import java.util.Scanner;
public class Switch_condition_for_pos_neg {
	public static void main(String[] args) {
	//switch statements
	
		Scanner sc = new Scanner(System.in);
		int button = sc.nextInt();
		switch (button) {
		case 1: System.out.println("positive nob");
		break;
		case 2: System.out.println("negative nob");
		break;
		default :System.out.println("zero");
		}
		

	}
		
	//	int button = 5;
	
	//switch ( button ) {
	//case 1 : System.out.println("positive nob");
	//break;
	//case 2 : System.out.println("negative nob");
//	break;
	// default :System.out.println("zero");
	//}
}
