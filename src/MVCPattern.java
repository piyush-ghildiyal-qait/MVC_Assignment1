import java.util.Scanner;

public class MVCPattern  
{ 
    public static void main(String[] args)  
    { 
        Student model  = retriveStudentFromDatabase(); 
  
        StudentView view = new StudentView(); 
        StudentController controller = new StudentController(model, view); 
        controller.updateView(); 
        
        
        

       System.out.println("Enter the details of student\n");
       System.out.println("Enter the name of student\n");
          Scanner sc=new Scanner(System.in);
     String name = sc.next();
     System.out.println("Enter the roll no of student\n");
     String roll = sc.next();
        controller.setStudentName(name); 
        controller.setStudentRollNo(roll);
        controller.updateView(); 
    } 
    
    
    
  
    private static Student retriveStudentFromDatabase() 
    { 
        Student student = new Student(); 
     
        System.out.println("Enter the details of student\n");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name of student\n");
        String name = sc.next();
        System.out.println("Enter the roll no of student\n");
        String roll = sc.next();
     
       student.setName(name); 
       student.setRollNo(roll);
    
        
        
        return student; 
    } 
      
} 