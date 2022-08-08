import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string;
        Integer i=0;
        ArrayList<Map<String, Integer>> variablsLevel = new ArrayList<>();
        variablsLevel.add(new HashMap<>());
        while (true) {
            string = scanner.nextLine();
            if ((string.equals("{"))) {
                i++;
                variablsLevel.add(copyMap(variablsLevel.get(i - 1)));
            }
            if ((string.equals("}")) && (i > 0)) {
                i--;
            }
            if (string.contains("=")) {
                String[] splitStrings = string.split("=");
                Map map = variablsLevel.get(i);
                map.put(splitStrings[0], findZnach(splitStrings[1], variablsLevel, i));
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

    private static Integer findZnach(String splitString, ArrayList<Map<String, Integer>> variablsLevel, Integer i) {
        try {
            int s = Integer.parseInt(splitString);
            return s;
        } catch (NumberFormatException e) {
            Integer result = variablsLevel.get(i).get(splitString);
            System.out.println(result);
            return result;
        }
    }


}
