import java.util.Scanner;
class Day01_EvenOdd {
    public static void main(String []a){
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter a number to check if it is Even or Odd: ");
        num = sc.nextInt();
        if(num % 2 == 0){
            System.out.println(num+" is an even number.");
        }
        else{
            System.out.println(num+" is an Odd number.");
        }
    }
}
