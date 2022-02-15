package University;

import java.io.IOException;
import java.util.Scanner;

abstract class DepartmentAbstract{
	abstract void deptName();
}


public class Department extends DepartmentAbstract {
	public void deptName() {
		System.out.println("Choose The Department");
		System.out.println("1. B.Sc");
		System.out.println("2. B.Com");
		System.out.println("3. BA");
		System.out.println("4. BBA");
		System.out.println("5. Back");
		
		Scanner sc = new Scanner(System.in);
		
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1:
			InDept d = new InDept();
			d.indeptBsc();
			break;
		case 2:
			InDept d1 = new InDept();
			d1.indeptBcom();
			break;
		case 3:
			InDept d2 = new InDept();
			d2.indeptBa();
			break;
		case 4:
			InDept d3 = new InDept();
			d3.indeptBba();
			break;
		case 5:
			College c= new College();
			try {
				c.collegeName();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		default:System.out.println("Invalid choice");
		break;
		
		}		
	}
}