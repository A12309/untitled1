import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.nextLine();

        ArrayList<String> adresses = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adresses.add(scanner.nextLine());
        }

        ArrayList<String> needAdreesPatterns = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            needAdreesPatterns.add(scanner.nextLine());
        }

        for (int i = 0; i < m; i++) {
            String[] splitNeedAdress = needAdreesPatterns.get(i).split(" ");
            String regex = "^" + splitNeedAdress[0] + "+\\w*" +splitNeedAdress[1] + "$";
            Pattern pattern = Pattern.compile(regex);
            int count=0;
            for (int j = 0; j < n; j++) {
                Matcher matcher = pattern.matcher(adresses.get(j));
                if (matcher.matches())
                    count++;
            }
            System.out.println(count);
        }

    }
}
