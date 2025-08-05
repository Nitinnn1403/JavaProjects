public class demo1{
    public static void main(String[] args) {
        try{
            int x = 2/0;
            System.out.println(x);
        }catch(ArithmeticException e){
            System.out.println("Arithmetic Exception: " + e.getMessage());
        }
    }
}