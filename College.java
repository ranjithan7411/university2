package University;

import java.io.IOException;
import java.util.Scanner;

public class College {
	public void collegeName() throws IOException {
		System.out.println("Choose The College which is under Kuvempu University");
		System.out.println("1. Govt First Grade College, shimoga");
		System.out.println("2. D.V.S College of Arts and Science,Shimoga");
		System.out.println("3. Kamala nehru College, shimoga");
		System.out.println("4. Sahyadri college, shimoga");
		System.out.println("5. Govt First Grade College, Sagara");
		
		Scanner sc = new Scanner(System.in);
		
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1:
			Department dept= new Department();
			dept.deptName();
			break;
		case 2:
			Department dept1= new Department();
			dept1.deptName();
			break;
		case 3:
			Department dept2= new Department();
			dept2.deptName();
			break;
		case 4:
			Department dept3= new Department();
			dept3.deptName();
			break;
		case 5:
			Department dept4= new Department();
			dept4.deptName();
			break;
			default:System.out.println("Invalid choice");
			break;
		}
		
	}
}