class studentte{

    // In that code call default constructor
    int age;
    private String name;

    public String getName(){
        return name;
    }
}

 class Basic2 {
    public static void main(String[] args) {
        studentte s =new  studentte();
        System.out.println(s.age);
        System.out.println(s.getName());
    }
}
