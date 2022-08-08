import java.util.*;

public class Main2 {

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int countOfYears = scanner.nextInt();
      scanner.nextLine();

      Set<String>[] teams = new Set[countOfYears];
        for (int i = 0; i < countOfYears; i++) {
            String teamString = scanner.nextLine();
            String[] membersOfTeamArray = teamString.split(" ");
            List<String> membersOfTeamList = Arrays.stream(membersOfTeamArray).toList();
            Set<String> teamSet = new HashSet<>();
            teamSet.addAll(membersOfTeamList);
            teams[i]=teamSet;

        }
        System.out.println(findMaxEquals(teams));
    }
    private static int findMaxEquals(Set<String>[] teams) {

        int countOfTeams = teams.length;
        int[] counts = new int[countOfTeams];
        for (int i = 0; i < countOfTeams; i++) {
            for (int j = 0; j < countOfTeams; j++) {
                if(compare(teams[i],teams[j]))
                    counts[i]++;
            }
        }
        Arrays.sort(counts);
        return counts[countOfTeams-1];
    }

    private static boolean compare(Set<String> team1, Set<String> team2) {
        for (String s : team1) {
            if (!team2.contains(s)) {
                return false;
            }
        }
        return true;
    }
}
