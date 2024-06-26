import java.util.Scanner;

// Reading a number

// class  Main {
//     public static void main(String[] args) {
//         int num;
//         Scanner s = new Scanner(System.in);
//         System.out.println("Enter a number:");
//         num = s.nextInt();
//         System.out.println("The entered number is " + num);
//     }
// }

// Fibonacci series

// class FibonacciExample1{  
//     public static void main(String args[])  
//     {    
//      int n1=0,n2=1,n3,i,count=20;    
//      System.out.print(n1+" "+n2);

//      for(i=2;i<count;++i) 
//      {    
//       n3=n1+n2;    
//       System.out.print(" "+n3);    
//       n1=n2;    
//       n2=n3;    
//      }    
//     }
// }  

// // additon of two numbers
 
// class Add{
//     public static void main (String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the first number : ");
//         int x = sc.nextInt();
//         System.out.println("Enter the second number : ");
//         int y = sc.nextInt();
//         int sum = x + y;    
//         System.out.println("The sum is: "+sum);
//     }
// }

// Factorial  of a number

// class  Fact{
//     public static void main(String args[]){
//         Scanner  sc = new Scanner(System.in);
//         System.out.println("Enter the number: "  );
//         int num = sc.nextInt();
        
//         int fact = 1;
//         for(int i=1;i<=num;i++){
//             fact *= i;
//         }
//         System.out.println("The factorial of "+num +" is :"+fact);
//     }
// }

// largest number

// class Large{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the First number: ");
//         int num1 = sc.nextInt();

//         System.out.println("Enter the Second number: ");
//         int num2 = sc.nextInt();

//         System.out.println("Enter the Third number: ");
//         int num3 = sc.nextInt();

//         if(num1>=num2 && num1>=num3){
//            System.out.println(num1+" is the largest number.");
//         }else if (num2>=num1 && num2>=num3) {
//             System.out.println(num2+" is the largest number");
//         } else {    
//             System.out.println(num3+" is the largest number");
//         }  
//         }/
//     }

// Even or odd number

// class EvenOdd{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter any number: ");
//         int num = sc.nextInt();
        
//         if(num %2==0){
//             System.out.println(num+ " is an even number");
//         }
//         else{
//             System.out.println(num+ " is an odd number");
//         }
//     }
// }

// prime number or not

// class Prime{
//     public static void num(){
//         int count=0;
//         Scanner sc = new Scanner(System.in);
//         System.out.println( "Input a Number : ");
//         int n = sc.nextInt();

//         for(int i=1;i<=n;i++){
//            if(n %i ==0){
//              count++;
//            }
//         }
//         if(count==2){
//             System.out.println(n +" is a prime number"); 
//         }
//         else{
//             System.out.println(n +" is not a prime number"); 
//         }
//     }
// }

// Reverse a number

// class Reverse{
//     public static void main(String args[]){
 
//         int r;
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number: ");
//         int n = sc.nextInt();

//         while(n>0){
//             r = (n%10);
//             System.out.print(r);
//             n /= 10;
//         }
//     }
// }
                                                
// Reverse a String

// class  Reverse_string {
//     public static void main(String[] args) {
        
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a string: ");
//         String str = sc.next();

//         String rev = "";
//         for(int i=str.length()-1; i>=0; i--){
//             rev = rev + str.charAt(i);
//         }
//         System.out.println("The reversed string is: "+rev);

//         if(str.equals(rev)){
//             System.out.println("The given string is palindrome.");
//         }else{
//             System.out.println("The given string  is not palindrome.");
//         }
//     }
// }

