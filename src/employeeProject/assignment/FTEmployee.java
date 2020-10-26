package employeeProject.assignment;

public class FTEmployee extends Employee{

    public FTEmployee(){
        super();
    }
    
    //complete getPay
    @Override
    public double getPay() {
        if (hours > 40){
            totalPay += ((hours - 40) * (rate * 2)) + (40 * rate);
            return ((hours - 40) * (rate * 2)) + (40 * rate);
        }
        else{
            totalPay += (hours * rate); //adding to totalPay
            return (hours * rate);
        }
        //remember ot - over 40 hours is double the rate
    }
    
}
