import java.util.Scanner;

public class LCm {

          public static int findLCM(int[] arr) {
                    int result = arr[0];
                    for (int i = 1; i < arr.length; i++) {
                              result = findLCM(result, arr[i]);
                    }
                    return result;
          }

          public static int findLCM(int num1, int num2) {
                    return (num1 * num2) / findGCD(num1, num2);
          }

          public static int findGCD(int num1, int num2) {
                    while (num2 != 0) {
                              int temp = num2;
                              num2 = num1 % num2;
                              num1 = temp;
                    }
                    return num1;
          }

          public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Enter the size of array");
                    int n = sc.nextInt();

                    int[] arr = new int[n];
                    System.out.println("Enter Element of Array: ");

                    for (int i = 0; i < n; i++) {
                              arr[i] = sc.nextInt();
                    }

                    sc.close();

                    int lcm = findLCM(arr);

                    System.out.println("Output:  " + lcm);
          }
}
