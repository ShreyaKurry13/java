import java.util.Scanner;

public class CWS_06_exercise1 {

    public static void main(String[] args) {
        // video 6 exercise 1 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter subject1 marks: ");
        float sub1 = sc.nextFloat();

        System.out.println("Enter subject2 marks: ");
        float sub2 = sc.nextFloat();

        System.out.println("Enter subject3 marks: ");
        float sub3 = sc.nextFloat();

        System.out.println("Enter subject4 marks: ");
        float sub4 = sc.nextFloat();

        System.out.println("Enter subject5 marks: ");
        float sub5 = sc.nextFloat();

        
        Float percentage =  (sub1+sub2+sub3+sub4+sub5)/500 *100;
        System.out.println("Your percentage is: "+percentage+"%"); 
    }
} 