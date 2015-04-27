import java.util.Scanner;

public class Problem7 {
	
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in, "UTF-8");

        System.out.println("Please enter an integer: ");
        int num = input.nextInt();

        boolean result = (num % 5 == 0) && (num % 7 == 0);
        System.out.println(num + " is devisible by 5 & 7: " + result);
        
        
    }
}
