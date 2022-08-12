import java.util.*;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stringLine;
        int i=0;
        ArrayList<Map<String, Integer>> levels = new ArrayList<>();
        levels.add(new HashMap<>());
        while (true) {
            stringLine = scanner.nextLine();
            if ((stringLine.equals("{"))) {
                i++;
                levels.add(copyMap(levels.get(i - 1)));

            }
            if ((stringLine.equals("}")) && (i >= 0)) {
                levels.remove(i);
                if (i==0) {
                    levels.add(new HashMap<>());
                } else
                    i--;
            }
            if (stringLine.contains("=")) {
                saveValue(stringLine, levels, i);

            }
        }

    }

    private static Map<String, Integer> copyMap(Map<String, Integer> stringIntegerMap) {
        HashMap<String, Integer> objectObjectHashMap = new HashMap<>();

        for (String key : stringIntegerMap.keySet()) {
            objectObjectHashMap.put(key, stringIntegerMap.get(key));
        }
        return objectObjectHashMap;
    }

    private static void saveValue(String stringLine, ArrayList<Map<String, Integer>> variablsLevel, Integer i) {
        String[] splitStrings = stringLine.split("=");
        Map<String, Integer> level = variablsLevel.get(i);
        Integer value=0;
        try {
            value = Integer.parseInt(splitStrings[1]);
            level.put(splitStrings[0], value);
        } catch (NumberFormatException e) {
            value = level.get(splitStrings[1]);
            if (value==null) {
                value=0;
                level.put(splitStrings[1], value);
            }
            System.out.println(value);
        }
        level.put(splitStrings[0], value);
    }


}
