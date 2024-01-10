import java.util.Scanner;

public class Count {

          public static void main(String[] args) {
                    Scanner scanner = new Scanner(System.in);

                    System.out.print("Enter a string: ");
                    String inputString = scanner.nextLine().toLowerCase();

                    int[] counts = countVowelsConsonants(inputString, 0, new int[] { 0, 0 });

                    System.out.println("Number of vowels: " + counts[0]);
                    System.out.println("Number of consonants: " + counts[1]);

                    scanner.close();
          }

          private static int[] countVowelsConsonants(String str, int index, int[] counts) {
                    if (index == str.length()) {
                              return counts;
                    }

                    char currentChar = str.charAt(index);

                    if (Character.isLetter(currentChar)) {
                              if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' ||
                                                  currentChar == 'o' || currentChar == 'u') {
                                        counts[0]++;
                              } else {
                                        counts[1]++;
                              }
                    }

                    return countVowelsConsonants(str, index + 1, counts);
          }
}
