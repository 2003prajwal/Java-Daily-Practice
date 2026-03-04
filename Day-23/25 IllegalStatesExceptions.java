class IllegalStatesExceptions {
   static void withdraw(double amount, boolean accountClose){
        if (accountClose){
            throw new IllegalStateException("Cannot Withdraw. Account is Closed!");
        }
        else
            System.out.println("WithDraw Successful: "+amount);
    }
    public static void main(String[] args) {
        try {
            withdraw(100,true); // accountClosed = true → wrong state
        }
        catch (RuntimeException e){

            System.out.println(e);
        }
    }
}
