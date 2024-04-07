import java.util.Scanner;
import java.util.Random;

// public class basic {
//     public static void main(String args[]){
     
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the principal: ");
//         int prin=sc.nextInt();

//         System.out.print("Enter the rate: ");
//         int rate=sc.nextInt();

//         System.out.print("Enter the time: ");
//         int time=sc.nextInt();

//         double simpleInterest = prin *rate*time/100;
//         System.out.println("The Simple Interest is : "+simpleInterest);
//     }
// }

// celcuis to farenheit

// class convert{
//     public static void main(String[] args) {
//         double celcuis = 45;
//         double farenheit ;
//         farenheit = (celcuis *9/5 ) + 32;
//         System.out.println(+celcuis+ "°C is equal to " +farenheit+"°F");
//     }
// }

// Average of an Array

// class  avgArray{
//     public static void main(String args[]){
//         int[] arr = {100,20,300,40,500};
//         double  sum = 0;
//         for(int i = 0;i <arr.length;i++){
//             sum += arr[i];
//         }
//         double average = sum / arr.length;
//         System.out.println("Avergae of array elements are :" +average );
//     }
// }

// random number between range

// class  RandomNumber{
//     public static void main(String[] args) {
        
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter start range : ");
//         int start = sc.nextInt();

//         System.out.print("Enter end range : ");
//         int end = sc.nextInt();

//         Random rc = new Random();
//         int rand = rc.nextInt((end -start) +1) +start; 

//         System.out.println("Random Number between " + start + " and " +end+ " is: "+rand);
//     }
// }

// Swapping numbers

class swap{
    public static void main(String[] args) {
        
        // int a=5;
        // int b=10;
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter first number :");
        int a = sc.nextInt();

        System.out.print("Enter second number :");
        int b = sc.nextInt();

        System.out.println("Before swapping: a = "+a+ " and b = " +b);

        int temp = a;
        a=b;
        b=temp;

        System.out.println("After swapping: a = "+a+ " and b = " +b);
    }
}