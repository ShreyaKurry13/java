public class CWS_09_pre {

    public static void main(String[] args) {
        // precedence and associativity of operators
        /* 
        int a = 5 + 3 * 2;     // importance of * is more than +
        System.out.println(a); 

        int b = 6*5-34/2; // importance of * is more than / and - is more than +
        System.out.println(b); // 6*5 = 30, 34/2 = 17, 30- 17 = 13

        */

//priority series --->    * / + - 
        // quick quiz
        // int x=3;
        // int y=4;
        // int k = x+y/2;
        // System.out.println(k); // 4/2 = 2, 3+2 = 5 


        int a=2 , b=2,c= 1;
        int d = b * b - 4* a *c / 2* a; //Multiplication (*) and division (/) have the same precedence.
                                        // Operators of the same precedence are evaluated left to right.
                                        //Java incorrectly interprets the denominator due to missing parentheses. ---->()


              // 2*2-4*2*1/2*2   --> 4-4*2*1/2*2 -->  4-8*1/2*2  --> 4-8/2*2  -->  4-4*2  ---> 4-8 ---> -4             
              
              
        System.out.println(d); 
    }
}