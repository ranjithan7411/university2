package University;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class AdminBa {
	public void adminBa() throws IOException {
		System.out.println("\n");
		System.out.println("1. View Staff");
		System.out.println("2. View Students");
		System.out.println("3. Add Staff");
		System.out.println("4. Add Student");
		System.out.println("5. Delete Staff");
		System.out.println("6. Delete Student");
		System.out.println("7. Back");
		
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1:
			viewStaff();
			break;
		case 2:
			viewStudent();;
			break;	
		case 3:
			addStaff();
			break;
		case 4:
			addStudent();
			break;
		case 5:
			deleteStaff();
			break;
		case 6:
			deleteStudent();
			break;
		
		case 7:
			InDept indept = new InDept();
			indept.indeptBa();
			break;
		default:System.out.println("Invalid choice");
		break;
		}		
	}
	public void viewStaff() throws IOException {
		Scanner sc = new Scanner(System.in);
		Add.printStaffBa();
		adminBa();
			
}
	public void viewStudent() throws IOException {
		Scanner sc = new Scanner(System.in);
		Add.printStudentBa();
		adminBa();
			
}
	
	public void addStaff() throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String newName = "";
			int newId = 0;
			Add.printStaffBa();			
			System.out.println("Enter the Id for Staff: ");
			newId = Integer.parseInt(br.readLine());
			System.out.println("\nEnter the Name of Staff: ");
			newName = br.readLine();
			Add.staffBcom.put(newId, newName);
			System.out.println("\none staff member is added " );
			adminBa();
	}
	
	public void addStudent() throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String newName = "";
			String newId = "";
			Add.printStudentBa();
			System.out.println("Enter the student ID: ");
			newId = br.readLine();
			System.out.println("\nEnter the Student Name: ");
			newName = br.readLine();
			Add.student1.put(newId, newName);
			System.out.println("\n one Student added " );
			adminBa();
	}
	
	public void deleteStaff() throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int id = 0;		
			Add.printStaffBa();
			System.out.println("\nEnter the id to delete: ");
			id=Integer.parseInt(br.readLine());
			Add.staff1.remove(id);
			System.out.println("\n Deleted successfully");
			adminBa();
			
	}
	
	public void deleteStudent() throws IOException {
			Scanner sc = new Scanner(System.in);
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String id = "";
			Add.printStudentBa();
			System.out.println("\n Enter the id to delete: ");
			id=br.readLine();
			Add.student1.remove(id);
			System.out.println("\n Deleted successfully");
			adminBa();	
			}
}
	

