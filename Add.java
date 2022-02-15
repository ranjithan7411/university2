package University;


import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class Add {
	//for bsc
	public static LinkedHashMap<Integer, String> staff1 = new LinkedHashMap<Integer, String>() {{ 
        put(101, "Raghavi"); 
        put(102, "Bhuvana"); 
        put(103, "Venkatesh");
        put(104, "Suresh");
    }};
    
    public static LinkedHashMap<Integer, String> getStaff1() {
    	return staff1;
    }
    
    public static void printStaff1() {
    	
    	for( Entry<Integer, String> entry : getStaff1().entrySet() ){
		    System.out.println( "Id: "+ entry.getKey() + " Name: " + entry.getValue() );  
		}    	
    }
    public static LinkedHashMap<String, String> student1 = new LinkedHashMap<String, String>() {{ 
        put("S101", "Ranjitha"); 
        put("S102", "Divya"); 
        put("S103", "Druvashree");
        put("S104", "Anu");
    }};
    
    public static LinkedHashMap<String, String> getStudent1() {
    	return student1;
    }
    
    public static void printStudent() {
    	for( Entry<String, String> entry : getStudent1().entrySet() ){
		    System.out.println( "Id: "+entry.getKey() + " Name: " + entry.getValue() );
		}
    	
    }
    
    public static LinkedHashMap<String, String> subject = new LinkedHashMap<String, String>() {{ 
        put("Raghavi", "Maths"); 
        put("Bhuvana", "Physics"); 
        put("Venkatesh", "Biology");
        put("Suresh", "Chemistry");
    }};
    
    public static LinkedHashMap<String, String> getSubject() {
    	return subject;
    }
    
    public static void printSubjectBsc() {
    	
    	for( Entry<String, String> entry : getSubject().entrySet() ){
		    System.out.println( entry.getKey() + " is teaching " + entry.getValue() );  
		}    	
    }
    
    
    
    //for bcom
    public static LinkedHashMap<Integer, String> staffBcom = new LinkedHashMap<Integer, String>() {{ 
        put(101, "Ramesh"); 
        put(102, "Divya"); 
        put(103, "Prashanth");
        put(104, "Yogesh");
    }};
    
    public static LinkedHashMap<Integer, String> getStaffBcom() {
    	return staffBcom;
    }
    
    public static void printStaffBcom() {
    	
    	for( Entry<Integer, String> entry : getStaffBcom().entrySet() ){
		    System.out.println( "Id: "+ entry.getKey() + " Name: " + entry.getValue() );  
		}    	
    }
    public static LinkedHashMap<String, String> studentBcom = new LinkedHashMap<String, String>() {{ 
        put("S101", "Lakshmi"); 
        put("S102", "Rekha"); 
        put("S103", "Deepa");
        put("S104", "Ananya");
    }};
    
    public static LinkedHashMap<String, String> getStudentBcom() {
    	return studentBcom;
    }
    
    public static void printStudentBcom() {
    	for( Entry<String, String> entry : getStudentBcom().entrySet() ){
		    System.out.println( "Id: "+entry.getKey() + " Name: " + entry.getValue() );
		}
    	
    }
    
    public static LinkedHashMap<String, String> subjectBcom = new LinkedHashMap<String, String>() {{ 
        put("Ramesh", "Business Law"); 
        put("Bhuvana", "Marketing Management"); 
        put("Venkatesh", "Cost Accounting");
        put("Suresh", "Income Tax Law and Practice");
    }};
    
    public static LinkedHashMap<String, String> getSubjectBcom() {
    	return subjectBcom;
    }
    
    public static void printSubjectBcom() {
    	
    	for( Entry<String, String> entry : getSubjectBcom().entrySet() ){
		    System.out.println( entry.getKey() + " is teaching " + entry.getValue() );  
		}    	
    }
    
    
    
    
    //for BA
    
    public static LinkedHashMap<Integer, String> staffBa = new LinkedHashMap<Integer, String>() {{ 
        put(101, "Ravi"); 
        put(102, "Dinesh"); 
        put(103, "Manu");
        put(104, "Yashwanth");
    }};
    
    public static LinkedHashMap<Integer, String> getStaffBa() {
    	return staffBa;
    }
    
    public static void printStaffBa() {
    	
    	for( Entry<Integer, String> entry : getStaffBa().entrySet() ){
		    System.out.println( "Id: "+ entry.getKey() + " Name: " + entry.getValue() );  
		}    	
    }
    public static LinkedHashMap<String, String> studentBa = new LinkedHashMap<String, String>() {{ 
        put("S101", "Sushma"); 
        put("S102", "Keerthi"); 
        put("S103", "Shwetha");
        put("S104", "Ankitha");
    }};
    
    public static LinkedHashMap<String, String> getStudentBa() {
    	return studentBa;
    }
    
    public static void printStudentBa() {
    	for( Entry<String, String> entry : getStudentBa().entrySet() ){
		    System.out.println( "Id: "+entry.getKey() + " Name: " + entry.getValue() );
		}
    	
    }
    
    public static LinkedHashMap<String, String> subjectBa = new LinkedHashMap<String, String>() {{ 
        put("Ravi", "Political Theory"); 
        put("Dinesh", "Economic Theory"); 
        put("Manu", "History");
        put("Yashwanth", "Sociology");
    }};
    
    public static LinkedHashMap<String, String> getSubjectBa() {
    	return subjectBa;
    }
    
    public static void printSubjectBa() {
    	
    	for( Entry<String, String> entry : getSubjectBa().entrySet() ){
		    System.out.println( entry.getKey() + " is teaching " + entry.getValue() );  
		}    	
    }
    
    
    //for BBA
    public static LinkedHashMap<Integer, String> staffBba = new LinkedHashMap<Integer, String>() {{ 
        put(101, "Chethan"); 
        put(102, "Chintana"); 
        put(103, "Chitra");
        put(104, "Ravi");
    }};
    
    public static LinkedHashMap<Integer, String> getStaffBba() {
    	return staffBba;
    }
    
    public static void printStaffBba() {
    	
    	for( Entry<Integer, String> entry : getStaffBba().entrySet() ){
		    System.out.println( "Id: "+ entry.getKey() + " Name: " + entry.getValue() );  
		}    	
    }
    public static LinkedHashMap<String, String> studentBba = new LinkedHashMap<String, String>() {{ 
        put("S101", "Chaithanya"); 
        put("S102", "Raksha"); 
        put("S103", "Deeksha");
        put("S104", "Anasuya");
    }};
    
    public static LinkedHashMap<String, String> getStudentBba() {
    	return studentBba;
    }
    
    public static void printStudentBba() {
    	for( Entry<String, String> entry : getStudentBba().entrySet() ){
		    System.out.println( "Id: "+entry.getKey() + " Name: " + entry.getValue() );
		}
    	
    }
    
    public static LinkedHashMap<String, String> subjectBba = new LinkedHashMap<String, String>() {{ 
        put("Chethan", "Customer Relationship management"); 
        put("Chintan", "Retail Management"); 
        put("Chitra", "Investment Banking");
        put("Ravi", "Cyber Security and Laws");
    }};
    
    public static LinkedHashMap<String, String> getSubjectBba() {
    	return subjectBba;
    }
    
    public static void printSubjectBba() {
    	
    	for( Entry<String, String> entry : getSubjectBba().entrySet() ){
		    System.out.println( " " +entry.getKey() + " is teaching " + entry.getValue() );  
		}    	
    }
    
    
    
}
