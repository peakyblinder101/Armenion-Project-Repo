
import java.util.Scanner;
public class StudentNameDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Student student = new Student();
		
			System.out.println("your first name: ");
			student.setFirstName(scan.nextLine());
			System.out.println("your middle name: ");
			student.setMiddleName(scan.nextLine());
			System.out.println("your last name: ");
			student.setLastName(scan.nextLine());
			System.out.println("your suffix: ");
			student.setSuffix(scan.nextLine());
			
			System.out.println("Full name: "+student.getFullName());

	}

}

