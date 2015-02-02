
package lab1;

/**
 *
 * @author David
 */

//the HRManager class was created to handle new employee creation
//The HR Manager "has a" the responsibility to hire someone
public class HRManager {    
    
    Employee employee = new Employee();
        
    public void hireNewEmployee(String firstName, String lastName, String snn){
        employee.setFirstName(firstName);
        employee.setLastName(lastName);
        employee.setSsn(snn);
        
        //Call the methods in the Employee class
        employee.meetWithHrForBenefitAndSalryInfo();
        employee.meetDepartmentStaff();
        employee.reviewDeptPolicies();
        employee.moveIntoCubicle("Cube ID");        
    }
    
    
}
