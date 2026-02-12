class Var_Args {
    public static void main(String[] args) {
        showList("Prajwal", "Mayur", "Rahul","Sahil");
        System.out.println();
        showList(5,"Prajwal", "Mayur", "Rahul","Sahil");
    }
    static void showList(String...s){
        for (int i=0; i<s.length; i++){
            System.out.println((i+1)+". "+s[i]);
        }
    }
    static void showList(int start,String...s){
        for (int i=0; i<s.length; i++) {
            System.out.println(start+". "+s[i]);
            start++;
        }
    }
}
