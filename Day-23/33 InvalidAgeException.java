class InvalidAgeException extends Exception {
    public InvalidAgeException(String message){
        super(message);
    }

    static void checkAge(int age) throws InvalidAgeException{
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above");
        }
        else
            System.out.println("valid age");
    }
    public static void main(String[] args) {
        try {
            checkAge(23);
        } catch (InvalidAgeException e) {
            System.out.println(e);
        }
    }
}
