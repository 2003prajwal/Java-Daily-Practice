class AgeValidator {
    void checkAge(int age){
        if (age < 18){
            throw new ArithmeticException("Not Eligible To Vote");
        }
        else {
            System.out.println("Eligible To Vote");
        }
    }

    public static void main(String[] args) {
        AgeValidator A = new AgeValidator();
        try {
            A.checkAge(3);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
//Uncheck Exception