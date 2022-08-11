import javafx.util.Pair;

import java.util.*;

public class Main6 {
    private static Set<Lift> dontMoveLifts = new HashSet<>();
    private static ArrayList<Integer> tracks = new ArrayList<>();

    public static class Lift {
        private int s;
        private int f;
        private int i;
        private ArrayList<Lift> liftsInFloor = new ArrayList<>();
       // private Pair<Integer, Lift> liftsInFloor = new Pair<>();


        public void setI(int i) {
            this.i = i;
        }

        public Lift(int s, int f) {
            this.s = s;
            this.f = f;
        }

        public void findLifts(int i, ArrayList<Lift> lifts) {
            i++;
            boolean isHighestFloor = true;
            for (Lift lift : lifts) {
                if (!lift.equals(this) && !liftsInFloor.contains(lift) && !dontMoveLifts.contains(lift)) {
                    if (lift.getS() == f) {
                        isHighestFloor = false;
                        lift.setI(i);
                        liftsInFloor.add(lift);
                     //   liftsInFloor.put(i, lift);
                        if (lift.getF() == lift.getS()) {
                            dontMoveLifts.add(lift);
                        }
                        lift.findLifts(i, lifts);

                    }
                }

            }
            if (isHighestFloor)
                tracks.add(i - 1);
        }

        public int getS() {
            return s;
        }

        public int getF() {
            return f;
        }
    }

    public static void main(String[] args) {
        ArrayList<Lift> lifts = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            lifts.add(new Lift(scanner.nextInt(), scanner.nextInt()));
            scanner.nextLine();
        }
        Lift rootLift = new Lift(-1, 0);
        rootLift.findLifts(0, lifts);
        Collections.sort(tracks);
        System.out.println(tracks.get(tracks.size() - 1));
    }
}
