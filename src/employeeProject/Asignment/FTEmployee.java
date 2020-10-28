package employeeProject.Asignment;

public class FTEmployee extends Employee {

    public FTEmployee() {
        super();
    }

    @Override
    public double getPay() {
        boolean noovertime = hours <= 40;
        if (noovertime) {
            totalPay = rate * hours;

        } else {
            totalPay = rate * 40 + (hours - 40) * rate * 2;
            noovertime = false;

        }
        return totalPay;
    }

}
