public class Problem2 {

    public static void main(String[] args) {

    	// Swapping two numbers, No1
        System.out.println("Swapping two numbers, No1 (without new variable):");
    	int valueA = 1;
        int valueB = 3;
        System.out.println("Initial values of A and B are " + valueA + " and " + valueB + ";");
/* A' = A - B
 * B' = A' + B = A - B + B = A
 * A" = B' - A' = A - A + B = B     
 */
        valueA = valueA - valueB;
        valueB = valueA + valueB;
        valueA = valueB - valueA;
        System.out.println("Values of A and B after swapping are " + valueA + " and " + valueB + ", respectively.");

// Swapping two numbers, No2
        System.out.println();
        System.out.println("Swapping two numbers, No2 (with new variable):");
        int valueC = 2;
        int valueD = 4;
        System.out.println("Initial values of C and D are " + valueC + " and " + valueD + ";");
                
        int tmp = valueC;
        valueC = valueD;
        valueD = tmp;		
        System.out.println("Values of C and D after swapping are " + valueC + " and " + valueD + ", respectively.");
                
    }
}
