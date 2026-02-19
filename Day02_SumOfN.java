import java.util.Scanner;

public class Day02_SumOfN {
    public static void main(String []a){
        Scanner sc = new Scanner(System.in);
        int n,i;
        System.out.println("Enter no. of elements: ");
        n = sc.nextInt();
        int sum = 0;
        for(i=1;i<=n;i++){
            sum = sum+i;
        }
        System.out.println("The sum of "+n+" number of elements are is " + sum);

    }
}
