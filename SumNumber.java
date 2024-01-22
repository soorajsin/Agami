import java.util.Scanner;

public class SumNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter number");
        int num1 = sc.nextInt();

        int calSum=calEvenSum(num1);
        System.out.println("The sum of even numbers is   "+calSum);

        sc.close();
    }


    public static int calEvenSum(int n){
        // int sum=0;

        // for(int i=1;i<=n;i++){
        //     int evenNumber=2*i;

        //     sum+=evenNumber;
        // }

        // return sum;

        return n*(n+1);
    }
}
