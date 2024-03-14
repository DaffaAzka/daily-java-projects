import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws IOException {
        int myPoint = 0;
        while (true) {
            clearScreen();
            boolean quiz = getQuiz();
            if (quiz) {
                myPoint += 1;
                System.out.println("Correct!");
            } else {
                break;
            }
            input();
        }
        System.out.println("===============================");
        System.out.println("Your point is " + myPoint);
    }

    public static boolean getQuiz() throws IOException {
        Random random = new Random();
        int s1 = random.nextInt(100);
        int s2 = random.nextInt(100);
        System.out.println(s1 + " * " + s2);
        return answerQuiz(s1 * s2);
    }

    public static boolean answerQuiz(int answer) throws IOException {
        System.out.print("Your answer: ");
        var getAnswer = input();
        return (answer == getAnswer);
    }

    public static int input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String temp = br.readLine();

        try {
            return Integer.parseInt(temp);
        } catch(Exception exception) {
            return 0;
        }
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}