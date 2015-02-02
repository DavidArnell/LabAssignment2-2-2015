package lab1;
//Testing changes
//Testing again

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * In this lab your challenge is to fix the code in both classes to use
 * proper encapsulation and the other best practices as explained by 
 * your instructor.
 *
 * @author      Jim Lombardo, WCTC Instructor
 * @version     1.01
 */
public class Employee {
    public String firstName;
    public String lastName;
    public String ssn;
    public Date birthDate;
    public boolean metWithHr;
    public boolean metDeptStaff;
    public boolean reviewedDeptPolicies;
    public boolean movedIn;
    public String cubeId;
    public Date currentDate;
    public String fmtDate;
    
    //Added Getters and Setters for the 

    public Employee() {
        currentDate = new Date();
    }
    
    //New Getters and Setters for the Employee Class
    //These were added so the Employee Class can interact with HRManager
    //Setting and getting the employee's first name
    public String getFirstName(){return firstName;}
    public void setFirstName(String firstName){this.firstName = firstName;}
    //Setting and getting the employee's last name
    public String getLastName(){return lastName;}
    public void setLastName(String lastName){this.lastName = lastName;}
    //Setting and getting the emloyee's SSN
    public String getSsn() {return ssn;}
    public void setSsn(String ssn) {this.ssn = ssn;}
    //Getting and setting the employee's new cube ID#
    public String getCubeId() {return cubeId;}
    public void setCubeId(String cubeId) {this.cubeId = cubeId;}
    
    
    public String setDate(){
        SimpleDateFormat sdf = new SimpleDateFormat("M/d/y");
        fmtDate = sdf.format(currentDate);
        return fmtDate;
    }    

    
    //The following methods were kept in the Employee class
    //They are actions the Employee has
    // Assume this must be performed first
    public void meetWithHrForBenefitAndSalryInfo() {
        setDate();
        System.out.println("Met with Hr on " + fmtDate);
        metWithHr = true;
    }

    // Assume this is must be performed second
    public void meetDepartmentStaff() {
        if(metWithHr) {
            setDate();
            System.out.println("Met with Dept. Staff on " + fmtDate);
            metDeptStaff = true;
        } else {
            System.out.println("Sorry, you cannot meet with "
                    + "department staff until you have met with HR.");
        }
    }

    // Assume this must be performed third
    public void reviewDeptPolicies() {
        if(metWithHr && metDeptStaff) {
            setDate();
            System.out.println("Reviewed Dept. Policies on " + fmtDate);
            reviewedDeptPolicies = true;
        } else {
            System.out.println("Sorry, you cannot review "
                    + " department policies until you have first met with HR "
                    + "and then with department staff.");
        }
    }

    // Assume this must be performed 4th
    public void moveIntoCubicle(String cubeId) {
        if(metWithHr && metDeptStaff && reviewedDeptPolicies) {
            setDate();
            System.out.println("Moved into cube on " + fmtDate);
            this.cubeId = cubeId;
            this.movedIn = true;
        } else {
            System.out.println("Sorry, you cannot move in to a "
                    + "cubicle until you have first met with HR "
                    + "and then with department staff, and then reviewed"
                    + "department policies.");
        }
    }

    public String getStatus() {
        setDate();
        if(metWithHr && metDeptStaff
           && reviewedDeptPolicies && movedIn) {
            return "Orientation is completed on: " + fmtDate;
        } else {
            return fmtDate + ": Orientation in progress...";
        }
    }
}
