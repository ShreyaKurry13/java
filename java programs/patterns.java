import java.util.Scanner;

public class patterns {
    public static void main(String[] args) {
        System.out.print("Enter the number of rows: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0;i<=n;i++){
            for(int j=1;j<i;j++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
