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

// public class main {
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
 
public class newbasics {
 public static void main(String[] args) {
    int [] arr = {49,43,22,15,9};
    int sum=0;

    for(int i:arr){
        sum+=arr[i];
    }
    int avg= sum/arr.length;
    System.out.println("The sum of all ages is: "+sum);
    System.out.println("The average age is: "+avg);
        }
}
