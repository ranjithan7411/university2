package University;

import java.io.IOException;

public class Student {
	public void studentBsc() throws IOException {
		String time[] = {"09-10", "10-11", "11-12", "12-01", "02-05"};
		String sub[] = {"Java","HTML","Python","Php","Practical Lab"};
		System.out.println("Class Time Table");
		for(int i=0; i<time.length;i++) {
			System.out.println(time[i]+ " " +sub[i]);
		}
		System.out.println();
		Department dept= new Department();
		dept.deptName();
	}
	
	
	public void studentBcom() throws IOException {
		String time[] = {"09-10", "10-11", "11-12", "12-01"};
		String sub[] = {"Business Law","Marketing Management","Cost Accounting","Income Tax Law and Practice"};
		System.out.println("Class Time Table");
		for(int i=0; i<time.length;i++) {
			System.out.println(time[i]+ " " +sub[i]);
		}
		System.out.println();
		Department dept= new Department();
		dept.deptName();
	}
	
	public void studentBa() throws IOException {
		String time[] = {"09-10", "10-11", "11-12", "12-01"};
		String sub[] = {"Political Theory","Economic Theory","History","Sociology"};
		System.out.println("Class Time Table");
		for(int i=0; i<time.length;i++) {
			System.out.println(time[i]+ " " +sub[i]);
		}
		System.out.println();
		Department dept= new Department();
		dept.deptName();
	}
	
	public void studentBba() throws IOException {
		String time[] = {"09-10", "10-11", "11-12", "12-01"};
		String sub[] = {"Customer Relationship management","Retail ManagementL","Investment Banking","Cyber Security and Laws"};
		System.out.println("Class Time Table");
		for(int i=0; i<time.length;i++) {
			System.out.println(time[i]+ " " +sub[i]);
		}
		System.out.println();
		Department dept= new Department();
		dept.deptName();
	}
}
