package University;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class AdminBba {
	public void adminBba() throws IOException {
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
			indept.indeptBba();
			break;
		default:System.out.println("Invalid choice");
		break;
		}		
	}
	public void viewStaff() throws IOException {
		Scanner sc = new Scanner(System.in);
		Add.printStaffBba();
		adminBba();
			
}
	public void viewStudent() throws IOException {
		Scanner sc = new Scanner(System.in);
		Add.printStudentBba();
		adminBba();
			
}
	
	public void addStaff() throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String newName = "";
			int newId = 0;
			Add.printStaffBba();			
			System.out.println("Enter the Id for Staff: ");
			newId = Integer.parseInt(br.readLine());
			System.out.println("\nEnter the Name of Staff: ");
			newName = br.readLine();
			Add.staffBba.put(newId, newName);
			System.out.println("\n one staff member is added " );
			adminBba();
	}
	
	public void addStudent() throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String newName = "";
			String newId = "";
			Add.printStudentBba();
			System.out.println("Enter the student ID: ");
			newId = br.readLine();
			System.out.println("\nEnter the Student Name: ");
			newName = br.readLine();
			Add.student1.put(newId, newName);
			System.out.println("\n one Student added " );
			adminBba();
	}
	
	public void deleteStaff() throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int id = 0;		
			Add.printStaffBba();
			System.out.println("\nEnter the id to delete: ");
			id=Integer.parseInt(br.readLine());
			Add.staff1.remove(id);
			System.out.println("\n Deleted successfully");
			adminBba();
			
	}
	
	public void deleteStudent() throws IOException {
			Scanner sc = new Scanner(System.in);
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String id = "";
			Add.printStudentBba();
			System.out.println("\n Enter the id to delete : ");
			id=br.readLine();
			Add.student1.remove(id);
			System.out.println("\n Deleted successfully");
			adminBba();	
			}
}
	

