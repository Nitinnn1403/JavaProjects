interface ATM1 {
    abstract void checkBalance();
}
class machine implements ATM1 {
    public void checkBalance() {
        System.out.println("Balance checked.");
    }
}

class ATM_Kotak{
    public static void main(String[] args) {
        machine m = new machine();
        m.checkBalance();
    }
}