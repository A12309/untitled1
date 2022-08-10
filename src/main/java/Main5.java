import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main5 {
    public static void main(String[] args) {
        class Query {
            private int k;
            private String prefix;

            public Query(int k, String prefix) {
                this.k = k;
                this.prefix = prefix;
            }

            public int getK() {
                return k;
            }

            public String getPrefix() {
                return prefix;
            }
        }
        class Surname implements Comparable<Surname> {
            private int number;
            private String surname;

            public int getNumber() {
                return number;
            }

            public String getSurname() {
                return surname;
            }

            public Surname(int number, String surname) {
                this.number = number;
                this.surname = surname;
            }

            @Override
            public int compareTo(Surname o) {
               return this.surname.compareTo(o.getSurname());
            }
        }

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int q = scanner.nextInt();
        scanner.nextLine();

        ArrayList<Surname> surnames = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            surnames.add(new Surname(i, scanner.nextLine().trim()));
        }


        ArrayList<Query> queryes = new ArrayList<>();
        for (int i = 0; i < q; i++) {

            queryes.add(new Query(scanner.nextInt(), scanner.nextLine().trim()));
        }


        for (int i = 0; i < q; i++) {
            Query query = queryes.get(i);
            String regex = "^" + query.getPrefix() + "+\\w*";
            Pattern pattern = Pattern.compile(regex);
            ArrayList<Surname> matchSurnames = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                Surname surname = surnames.get(j);
                Matcher matcher = pattern.matcher(surname.getSurname());
                if (matcher.matches())
                    matchSurnames.add(surname);
            }
            Collections.sort(matchSurnames);
            try {
                System.out.println(matchSurnames.get(query.getK()-1).getNumber()+1);
            } catch (IndexOutOfBoundsException e) {
                System.out.println(-1);
            }
        }

    }
}
