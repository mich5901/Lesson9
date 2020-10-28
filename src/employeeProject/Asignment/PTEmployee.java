
package employeeProject.Asignment;

public class PTEmployee extends Employee {


    PTEmployee() {
        super();
    }
    
    @Override
    public double getPay() {
        totalPay += rate * hours;
        return hours * rate;
    }
    
    
    
}
