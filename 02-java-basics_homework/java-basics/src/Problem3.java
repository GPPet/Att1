import java.util.Scanner;

public class Problem3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in, "UTF-8");
        
        //Name
        System.out.println("Име");
        String perName = input.nextLine();  
        
        System.out.println("Презиме");
        String midName = input.nextLine();       
        
        System.out.println("Фамилия");
        String famName = input.nextLine();               
        
        System.out.println("Възраст");
        byte age = input.nextByte();
        input.nextLine();
        
        System.out.println("Пол");
        Scanner reader = new Scanner(System.in);
        char gen = reader.next().charAt(0); //Only 1st character.
        
        System.out.println("ЕГН");
        long egn = input.nextLong();

        System.out.println("Телефон");
        long phone = input.nextLong();
//
        System.out.println("Име"+"\t"+"Презиме"+"\t"+"Фамилия"+"\t"+"Възраст"+"\t"+"Пол"+"\t"+"ЕГН"+"\t"+"Телефон");
        System.out.printf(perName+"\t"+midName+"\t"+famName+"\t"+age+"\t"+gen+"\t"+egn+"\t"+phone);

    }
}