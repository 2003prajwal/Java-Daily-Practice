class Person{
    String name="Prajwal";
    int age=21;

    void displayPerson(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}

class Teacher extends Person{
    String Subject="Math";
    double Salary=30000;

    void displayTeacher(){
        displayPerson();
        System.out.println("Subject: "+Subject);
        System.out.println("Salary: "+Salary);

    }
}
class PersonTeacher {
    public static void main(String[] args) {
        Teacher T = new Teacher();
        T.displayTeacher();
    }
}
