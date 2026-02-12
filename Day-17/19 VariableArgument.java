class VariableArgument {
    public static void main(String[] args) {
          shows(2,4,2,5,3,6,4,7,4,7);

          System.out.println();

          show(new int[]{12,3,2,55,32,5,3});
    }
    static void shows(int...B){
        for (int x:B){
            System.out.print(x+" ");
        }
    }
    static void show(int []A){
        for (int x:A){
            System.out.print(x+" ");
        }
    }
}
