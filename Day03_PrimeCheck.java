import java.util.Scanner;
class Day03_PrimeCheck {
    public static void main(String []a){
        Scanner sc =   new Scanner(System.in);
        int n;

        System.out.println("Enter a number to check weather it is prime or not:");
        n = sc.nextInt();
        if(n<=1){
            System.out.println("It is Not Prime.");
        }
        else{
            boolean isPrime = true;
            for(int i = 2; i<n; i++){
                if(n % i == 0){
                   isPrime = false;
                    break;
                }
            }
            if (isPrime){
                System.out.println(n+" is Prime.");
            }
            else{
                System.out.println(n+" is not a Prime.");
            }
        }
    }
}
