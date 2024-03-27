// Write a function to compute the the sum of n even numbers

import java.util.Scanner;

public class SumOfEvenNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int n=sc.nextInt();

        int isSum=calEvenSum(n);
        System.out.println("Sum of even number :-   "+isSum);

        sc.close();
    }
    public static int calEvenSum(int n){
        return n*(n+1);
    }
}
