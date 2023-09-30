import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

                stringPrintMessage("Please enter first number");
                int firstNumber = getUserInput();

                stringPrintMessage("Please enter second number");
                int secondNumber = getUserInput();

                stringPrintMessage("Please enter third number");
                int thirdNumber = getUserInput();

                System.out.println(getMax(firstNumber, secondNumber, thirdNumber));

            }

            private static int getMax(int a, int b) {
                int max = a;
                if (max < b) {
                    max = b;
                }
                return max;
            }

            private static int getMax(int a, int b, int c) {
                int max = getMax(a, b);
                if (max < c) {
                    max = c;
                }
                return max;
            }

            private static int getMax(int a, int b, int c, int d) {
                int max = getMax(a, b);
                int secondMax = getMax(c, d);
                if (max < secondMax) {
                    max = secondMax;
                }
                return max;
            }

            private static int getUserInput() {
                Scanner scanner = new Scanner(System.in);
                return scanner.nextInt();
            }

            private static void stringPrintMessage(String message) {
                System.out.println(message);
    }
}
