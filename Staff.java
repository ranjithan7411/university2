package University;

import java.io.IOException;

public class Staff {
	public void staffBsc() throws IOException {
		Add.printSubjectBsc();
		System.out.println();
		Department dept= new Department();
		dept.deptName();
	}
	
	public void staffBcom() throws IOException {
		Add.printSubjectBcom();
		System.out.println();
		Department dept= new Department();
		dept.deptName();
	}
	
	public void staffBa() throws IOException {
		Add.printSubjectBa();
		System.out.println();
		Department dept= new Department();
		dept.deptName();
	}
	
	public void staffBba() throws IOException {
		Add.printSubjectBba();
		System.out.println();
		Department dept= new Department();
		dept.deptName();
	}
}
