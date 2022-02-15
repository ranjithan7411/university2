package University;

import java.io.IOException;
import java.util.Scanner;

interface IndeptInterface{
	void indeptBsc();
	void indeptBcom();
	void indeptBa();
	void indeptBba();
}
public class InDept implements IndeptInterface {
	public void indeptBsc() {
		System.out.println("Bsc: Choose The access");
		System.out.println("1. Admin");
		System.out.println("2. Student");
		System.out.println("3. Staff");
		System.out.println("4. Back");
		
		
		Scanner sc = new Scanner(System.in);
		
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1:
			Admin admin = new Admin();
			try {
				admin.adminBsc();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			break;
		case 2:
			Student student = new Student();
			try {
				student.studentBsc();
			} catch (IOException e) {
				e.printStackTrace();
			}
			break;
		case 3:
			Staff staff = new Staff();
			try {
				staff.staffBsc();
			} catch (IOException e) {
				e.printStackTrace();
			}
			break;
		case 4:
			Department dept1=new Department();
			dept1.deptName();
		default:System.out.println("Invalid choice");
		break;	
		
		
		}
	}
		//for Bcom
		public void indeptBcom() {
			System.out.println("Bcom: Choose The access");
			System.out.println("1. Admin");
			System.out.println("2. Student");
			System.out.println("3. Staff");
			System.out.println("4. Back");
			
			
			Scanner sc = new Scanner(System.in);
			
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				AdminBcom admin1 = new AdminBcom();
				try {
					admin1.adminBcom();
				} catch (IOException e) {
					e.printStackTrace();
				}
				
				break;
			case 2:
				Student student = new Student();
				try {
					student.studentBcom();
				} catch (IOException e) {
					e.printStackTrace();
				}
				break;
			case 3:
				Staff staff = new Staff();
				try {
					staff.staffBcom();
				} catch (IOException e) {
					e.printStackTrace();
				}
				break;
			case 4:
				Department dept1=new Department();
				dept1.deptName();
			}	
	}
		
		//for ba 
		public void indeptBa() {
			System.out.println("BA: Choose The access");
			System.out.println("1. Admin");
			System.out.println("2. Student");
			System.out.println("3. Staff");
			System.out.println("4. Back");
			
			
			Scanner sc = new Scanner(System.in);
			
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				AdminBa admin2 = new AdminBa();
				try {
					admin2.adminBa();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				break;
			case 2:
				Student student = new Student();
				try {
					student.studentBa();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 3:
				Staff staff = new Staff();
				try {
					staff.staffBa();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 4:
				Department dept1=new Department();
				dept1.deptName();
			
			
			}
		}
		
		
		
		//For BBA
		public void indeptBba() {
			System.out.println("BBA: Choose The access");
			System.out.println("1. Admin");
			System.out.println("2. Student");
			System.out.println("3. Staff");
			System.out.println("4. Back");
			
			
			Scanner sc = new Scanner(System.in);
			
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				AdminBba admin = new AdminBba();
				try {
					admin.adminBba();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				break;
			case 2:
				Student student = new Student();
				try {
					student.studentBba();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 3:
				Staff staff = new Staff();
				try {
					staff.staffBba();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 4:
				Department dept1=new Department();
				dept1.deptName();
			
			
			}
		}
}