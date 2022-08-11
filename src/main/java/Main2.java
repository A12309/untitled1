import java.util.*;
import java.util.stream.Stream;

public class Main2 {

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int yearCount = scanner.nextInt();
      scanner.nextLine();

      Set<String>[] teams = new Set[yearCount];
        for (int i = 0; i < yearCount; i++) {
            String teamString = scanner.nextLine();
            String[] membersOfTeamArray = teamString.split(" ");
            Stream<String> streamMembersOfTeam = Arrays.stream(membersOfTeamArray);
            List<String> membersOfTeamList = streamMembersOfTeam.toList();
            Set<String> teamSet = new HashSet<>();
            teamSet.addAll(membersOfTeamList);
            teams[i]=teamSet;

        }
        int maxEquals = findMaxEquals(teams);
        System.out.println(maxEquals);
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
