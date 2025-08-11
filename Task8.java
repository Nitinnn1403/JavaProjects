import java.util.Scanner;
public class Task8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter Two Numbers");
	    int num1=sc.nextInt();
	    int num2=sc.nextInt();
	    try {
	    	int res=num1/num2;
			System.out.println("Result of Division: " + res);
	    } catch (Exception e) {
	    	System.out.println("Cannot Divide Any Number By Zero");
	    }finally {
	    	System.out.println("Thank You For Using our Calculator");
	    }
		sc.close();
	}

}
