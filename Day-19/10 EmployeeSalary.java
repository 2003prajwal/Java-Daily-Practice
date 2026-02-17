import java.util.Scanner;

class Employee{
    private long employeeId;
    private String employeeName;
    private double salary;

    public void setEmployeeId(long id){
        employeeId = id;
    }

    public void setEmployeeName(String name){
        employeeName = name;
    }

    public void setSalary(double s){
        if (s>0)
         salary = s;
        else
            salary = 0;
    }

    public long getEmployeeId(){
        return employeeId;
    }

    public String getEmployeeName(){
        return employeeName;
    }

    public double getSalary(){
        return salary;
    }

    public double increaseSalaryByPercentage(double per){
        double increaseAmount = (salary*per)/100;
        salary = salary + increaseAmount;
        return salary;
    }


}
class EmployeeSalary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Employee E = new Employee();

        System.out.print("Employee ID: ");
        E.setEmployeeId(input.nextLong());

        System.out.print("Employee Name: ");
        E.setEmployeeName(input.next());

        System.out.println("Enter Salary: ");
        E.setSalary(input.nextDouble());

        System.out.print("Percentage: ");
        double  per = input.nextDouble();

        double newSalary = E.increaseSalaryByPercentage(per);

        //System.out.print("Your Salary Increase By "+per+"% : "+newSalary);
        //System.out.print("Your Salary Increase By "+per+"% : "+E.getSalary());
        System.out.print("Your Salary Increase By "+per+"% : "+E.increaseSalaryByPercentage(per));


    }
}
