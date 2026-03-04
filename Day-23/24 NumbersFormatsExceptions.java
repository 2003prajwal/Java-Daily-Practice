class NumbersFormatsExceptions {
    public static void main(String[] args) {
        String age = "4";
        String age2 ="34f";
        try {
            int num = Integer.parseInt(age);
            int num2 = Integer.parseInt(age2);
            System.out.println();
            System.out.println(6+num);
            System.out.println(4+num2);
        }
        catch (NumberFormatException e){
            System.out.println(e);
        }
    }
}
