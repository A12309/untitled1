import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main7 {
    private static List<Character> alphabet = Arrays.asList('a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z');
    private static String supermarket;

    public static void main(String[] args) {
        class Segment {
            private int firstNumber;
            private int secondNumber;

            public Segment(int firstNumber, int secondNumber) {
                this.firstNumber = firstNumber;
                this.secondNumber = secondNumber;
            }

            public int getFirstNumber() {
                return firstNumber;
            }

            public int getSecondNumber() {
                return secondNumber;
            }
        }

        Scanner scanner = new Scanner(System.in);
        supermarket = scanner.nextLine();
        int segmentsCount = scanner.nextInt();
        scanner.nextLine();
        ArrayList<Segment> segments = new ArrayList<>();

        for (int i = 0; i < segmentsCount; i++) {
            Segment segment = new Segment(scanner.nextInt(), scanner.nextInt());
            scanner.nextLine();
            segments.add(segment);
        }

        extracted(alphabet);


    }

    private static void extracted(int l, int r) {
        int i=l-1;
        char[] charactersSupermarket = supermarket.toCharArray();
        for (Character character : alphabet) {
            int start =i;
            int count=0;
            int iter=0;
            for (int j= 0; j < ; j++) {

            }
            while (start) {
                if (character.equals(charactersSupermarket[i])) {
                    count+=iter;
                    start=i;
                }
                i++;
                if (i>(r-1))
                    i=l-1;
            }


        }
    }
}
