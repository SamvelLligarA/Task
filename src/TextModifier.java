import java.util.Scanner;

public class TextModifier {

     public static void main(String[] args) {
            textModifier();
        }

     private static void textModifier() {
            Scanner scanner = new Scanner(System.in);
            System.out.println(" генрих1  играет+2   л-июбит0школу: ");
            String text = scanner.nextLine();

            StringBuilder modifiedText = new StringBuilder();
            boolean spaceDetected = false;
            for (int i = 0; i < text.length(); i++) {
                if (text.charAt(i) == ' ') {
                    if (!spaceDetected) {
                        modifiedText.append(text.charAt(i));
                    }
                    spaceDetected = true;
                }else {
                    modifiedText.append(text.charAt(i));
                    spaceDetected = false;
                }
            }

            StringBuilder swappedText = new StringBuilder();
            for (int i = 0; i < modifiedText.length(); i++) {
                if (modifiedText.charAt(i) == '-') {
                    swappedText.append(modifiedText.charAt(i + 1));
                    swappedText.append(modifiedText.charAt(i - 1));
                    i++;
                }else {
                    swappedText.append(modifiedText.charAt(i));

                }
            }

            String replacedText = swappedText.toString().replace('+', '!');

            int sum = 0;
            StringBuilder finalText = new StringBuilder();
            for (int i = 0; i < replacedText.length(); i++) {
                char c = replacedText.charAt(i);
                if (Character.isDigit(c)) {
                    sum += Character.getNumericValue(c);
                } else {
                    finalText.append(c);
                }
            }
            finalText.append(" ").append(sum);

            System.out.println(" генрих играет! илюбитшколу 3: " + finalText);

            scanner.close();
        }
    }
