package employeeProject.assignment;

public class PTEmployee extends Employee{

    @Override
    public double getPay() {
        totalPay += rate *hours; //adding to totalPay
        return hours * rate;
    }
    
}
