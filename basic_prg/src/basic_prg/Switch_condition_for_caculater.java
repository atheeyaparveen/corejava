package basic_prg;
import java.util.Scanner;

public class Switch_condition_for_caculater {

	public static void main(String[] args) {
		//calculater
		
				Scanner sc = new Scanner(System.in);
				 System.out.print("enter A value:");
				int a = sc.nextInt();
				 System.out.print("enter B value:");
				int b = sc.nextInt();
				 System.out.print("enter the operation to perform:");
			    String sym = sc.next();
			    int res;
			    switch(sym) {
			    case "+": res = a+b;
			    System.out.println("addition:" +res);
			    break;
			    case "-" : res = a-b;
			    System.out.println( res);
			    break;
			    case "/" : res = a/b;
			    System.out.println(res);
			   break;
			  case "%" : res = a%b;
			   System.out.println(res);
			  break;
			   default :
			   	System.out.println("invaled");
			    }
	}

}
