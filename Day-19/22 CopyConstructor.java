class Student {
    int rollNo;
    String name;

    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;

    }

    Student(Student s){
        this.rollNo = s.rollNo;;
        this.name = s.name;
    }

    void display(){
        System.out.println("Roll no: "+rollNo+", Name: "+name);
    }
}
class CopyConstructor {
    public static void main(String[] args) {
        //Original Object
        Student s1 = new Student(42,"Prajwal");

        //Copy Object
        Student S2 = new Student(s1);
        s1.display();
        s1.display();
    }
}
