// leap year

// public class main {
//     public static void main(String[] args) {
//         int year = 2020;

//         if (year%4==0 && year%100 !=0) {
//                 System.out.println(year + " is a leap year");
//         } else {
//                 System.out.println(year + " is not a leap year");
//             }
//         }
// }

// Maximum no from array

// public class newbasics {
//   public static void main(String[] args) {
//     int [] arr = {20,45,30,89,100,121,11};
//     int max = arr[0];

//     for(int i=0;i< arr.length;i++){
//         if(arr[i]>max){
//             max = arr[i];
//         }
//     }
//     System.out.println("The maximum number is: "+max);
//             }      
//   }

// minimum no from the array

// public class newbasics {
//  public static void main(String[] args) {
//     int [] arr = {10,50,30,2,56,0,1};
//     int min =arr[0];

//     for(int i=0;i<arr.length;i++){
//         if (min > arr[i]) {
//             min = arr[i];
//         }
//     }
//     System.out.println("The minimum number is: "+min);
//  }
    
// }

// print alternate num from array

// public class main{
//     public static void main(String [] args){
//         int [] arr = {10,20,30,40,50,60,70,80,90,100};

//         for(int i=0;i<arr.length;i+=2){
//             System.out.print(" " + arr[i]);
//         }
//     }
// }

// sum of all ages in a array
 
// public class newbasics {
//  public static void main(String[] args) {
//     int [] arr = {49,43,22,15,9};
//     int sum=0;

//     for(int i=0;i<arr.length;i++){
//         sum = sum + arr[i];
//     }
//     int avg= sum/arr.length;
//     System.out.println("The sum of all ages is: "+sum);
//     System.out.println("The average age is: "+avg);
//         }
// }

// removing white spaces from sentence

// public class newbasics {
//     public static void main(String[] args) {

//        String str = "Hello , I am Shreya Kurry";
//        String newstr = str.replaceAll("\\s", "");
//        System.out.println(newstr);
//         }
// }


// removing vowels from a string

// public class newbasics{
//     public static void main(String [] args){
//         // String str = "Yesterday";
//         String str = "Hello, I am Shreya Kurry";
//         String newstr = str.replaceAll("[aeiouAEIOU]", "");
//         System.out.println(newstr);
//     }
// }

// remove vowels using for loop

public class newbasics{
    public static void main(String []args){

        String str ="I am Shreya" , newStr = "";

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!='a' && str.charAt(i)!='e' && str.charAt(i)!='o' && str.charAt(i)!='u' ){
                newStr = newStr + str.charAt(i);
                }
            }
        }
    }
