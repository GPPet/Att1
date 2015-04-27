public class StringType {
	
    public static void main(String[] args) {
        String firstName = "Lazar";
        String separator = " ";
        String lastName = "Sestrimski";
        System.out.println("Hello," + separator + firstName + separator + ":-)" );

        String fullName = firstName + " " + lastName;
        System.out.println("My Name is : " + fullName);
        System.out.println("Total number of my name is : " + firstName.length());

        int number = 45;
        String test = "5";
        int testie = Integer.parseInt(test);
        System.out.println(testie);
        System.out.println("My number is " + number);
        
        String escaping = "C:\\Test.txt ";
        System.out.println(escaping);
    }
}