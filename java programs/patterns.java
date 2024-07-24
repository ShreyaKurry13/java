import java.util.*;

// public class patterns {
//     public static void main(String[] args) {
       
//         int rows = 5;

//         for (int i = 1; i <=rows; i++) {
//             for (int j = 0; j < i; j++) {
//                 System.out.print(" * ");
//             }
//             System.out.println();
//         }
       
//         }
//     }

// o/p
// * 
// *  *
// *  *  *
// *  *  *  *
// *  *  *  *  *

// inverted triangle

// public class patterns{
//     public static void main(String[] args) {
        
//         int rows = 5;

//         for(int i=rows ; i>=1; i--){
//             for(int j=1; j<=i; j++){
//                 System.out.print(" * ");
//             }
//             System.out.println();
//         }
//     }
// }
// o/p

// *  *  *  *  * 
// *  *  *  *
// *  *  * 
// *  *
// *

public class patterns{
    public static void main(String [] args){
        int num = 5;

        for(int i=1; i<=num; i++){
           for(int j=1;j<=i;j++){
            if (i%2 == 0) {
                System.out.print("*");
            }else{
            System.out.print(j);
           }
        }
        System.out.println();
    }
}
}