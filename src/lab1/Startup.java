package lab1;

/**
 * In this lab your challenge is to fix the code in both classes to use
 * proper encapsulation and the other best practices as explained by 
 * your instructor.
 *
 * @author      Jim Lombardo, WCTC Instructor
 * @version     1.01
 */
public class Startup {
    public static void main(String[] args) {
        /*
            Are we violating SRP (Single Responsibility Principle)?
        
            HINT: think about what we are trying to do ... hire an employee.
            Whose job is it to do this? The current class? Or, a new class?
            Should we do the work here or delegate to the new class? You
            may need to create a new class that talks to Employee. This does
            not have to be a GUI class.
        */
        Employee employee = new Employee();
        //The employee information will stay in the "startup" class
        //The information will be given to the HR Manager during the hiring
        
        HRManager hrManager = new HRManager();
               
        
        //new instance of the HR Manager class is initiated
        //I will have to review capitalization standards for acronyms in class
        
        //The employee information will be passed to the HRManager class
        //I'm making the assumption that a request for this input is not needed
        //The data here is constant
        hrManager.hireNewEmployee("John", "Doe","333-33-3333");
                
        /*
        The revised program will not be needing these lines of code
        This information will be passed into the HRManager class
        The employee registration has this information and it will
        pass it to the necessary class
        employee.firstName = "Peter";
        employee.lastName = "Piper";
        employee.ssn = "333-1234";
        
        employee.meetDepartmentStaff();
        employee.meetWithHrForBenefitAndSalryInfo();
        employee.reviewDeptPolicies();
        */
        

        System.out.println("The employee's status is: " + employee.getStatus());
    }
    
    
}
