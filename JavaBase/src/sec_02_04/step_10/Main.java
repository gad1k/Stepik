package sec_02_04.step_10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    private String printTextPerRole(String[] roles, String[] textLines) {
        String[] parsedLine;
        List<String> resultList = new ArrayList<>();
        Map<String, List<String>> persons = new HashMap<>();

        for (int i = 0; i < textLines.length; i++) {
            parsedLine = textLines[i].split(":", 2);
            if (!persons.containsKey(parsedLine[0]))
                persons.put(parsedLine[0], new ArrayList<>());
            persons.get(parsedLine[0]).add(i + 1 + ")" + parsedLine[1]);
        }

        for (String role : roles) {
            resultList.add(role + ":\n");
            if (persons.containsKey(role))
                for (String replica : persons.get(role))
                    resultList.add(replica + "\n");
            resultList.add("\n");
        }

        StringBuilder resultString = new StringBuilder();
        for (String line : resultList)
            resultString.append(line);

        return resultString.toString();
    }
}