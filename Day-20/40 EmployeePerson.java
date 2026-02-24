class persons {
    String name;

    persons(String name){
        this.name=name;
    }
}
class aemployee extends persons {
    long empId;
    double salary;

    aemployee(long empId, double salary, String name){

        super(name);
        this.empId=empId;
        this.salary=salary;
    }

}
class EmployeePerson {
    public static void main(String[] args) {
        aemployee e = new aemployee(4335,45000,"Prajwal");
        System.out.println("empId: "+e.empId);
        System.out.println("Salary: "+e.salary);
        System.out.println("Name: "+e.name);
    }
}
