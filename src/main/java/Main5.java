import java.util.*;

public class Main5 {
    public static void main(String[] args) {
        List<Character> alfathit = Arrays.asList('a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z');
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int q = scanner.nextInt();
        scanner.nextLine();

        String[] surnames = new String[n];
        for (int i = 0; i < n; i++) {
            surnames[i] = scanner.nextLine();
        }


        ArrayList<Map<Integer, String>> queryes = new ArrayList<>();
        for (int i = 0; i < q; i++) {
            HashMap<Integer, String> integerStringHashMap = new HashMap<>();
            integerStringHashMap.put(scanner.nextInt(), scanner.nextLine());
            queryes.add(integerStringHashMap);
        }

        for (int i = 0; i < q; i++) {
            for (int j = 0; j < n; j++) {
                Map<Integer, String> integerStringMap = queryes.get(i);

            }
        }

    }
}
