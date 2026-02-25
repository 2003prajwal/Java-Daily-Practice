interface f{
    void show();
}
class Anonymous {
    public static void main(String[] args) {
        f t = new f() {
            @Override
            public void show(){
                System.out.println("Anonymous Inner class with interface");

            }
        };
        t.show();
    }
}
