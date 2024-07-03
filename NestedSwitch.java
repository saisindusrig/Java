package sindu;
import java.util.Scanner;
public class NestedSwitch {
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int empid= in.nextInt();
		String department = in.next();
		switch(empid) {
		case 1:
			System.out.println("Sindu");
			break;
		case 2:
			System.out.println("Sai");
			break;
		case 3:
			System.out.println("Emp 3");
			switch(department) {
			case "IT":
				System.out.println("IT department");
				break;
			case "Management":
				System.out.println("management dept");
				break;
			default:
				System.out.println("no dept entered");
				break;
			}
			break;
		default:
			System.out.println("enter a accurate empid");
		}


	}
}
