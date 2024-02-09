import java.util.Scanner;

public class LCM {
          public static int findGCD(int n1, int n2) {
                    while (n2 != 0) {
                              int temp = n2;
                              n2 = n1 % n2;
                              n1 = temp;
                    }
                    return n1;
          }

          public static int findLCM(int n1, int n2) {
                    return (n1 * n2) / findGCD(n1, n2);
          }

          public static int calLCM(int[] arr) {
                    int lcm = arr[0];
                    for (int i = 1; i < arr.length; i++) {
                              lcm = findLCM(lcm, arr[i]);
                    }

                    return lcm;
          }

          public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Enter size of array");
                    int size = sc.nextInt();
                    int arr[] = new int[size];

                    System.out.println("Enter element of array");
                    for (int i = 0; i < size; i++) {
                              arr[i] = sc.nextInt();
                    }

                    int calculatedLCM = calLCM(arr);
                    System.out.println("The LCM is  : " + calculatedLCM);

                    sc.close();
          }
}