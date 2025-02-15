import java.util.Scanner;

public class CWS_05_userInput {
    public static void main(String[] args) {
        System.out.println("Taking inputs from the user");

        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter number 1");
        // int a = sc.nextInt();
        // float f = sc.nextFloat();

        // System.out.println("Enter number 2");
        // // int b = sc.nextInt();
        // float e = sc.nextFloat();

        // // int sum = a+b;
        // float sum = f+e;
        // System.out.println("The sum of these numbers is: ");
        // System.out.println(sum);

        // boolean b = sc.hasNextInt(); //to check if the input is an integer or not and return true or false accordingly
        // System.out.println(b);

        // String str = sc.next(); //to only read single words and not the whole sentences
        String str = sc.nextLine();
        System.out.println(str);


    }
}
