package sec_04_02.step_09;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line;
        List<String[]> listQuery = new ArrayList<>();
        List<String[]> listUrl = new ArrayList<>();
        while ((line = reader.readLine()) != null) {
            String[] parseLine = line.split("[\t:]");
            if (parseLine[1].equals("query"))
                listQuery.add(new String[] {parseLine[0], parseLine[2]});
            else
                listUrl.add(new String[] {parseLine[0], parseLine[2]});
        }
        for (String[] query : listQuery)
            for (String[] url : listUrl)
                if (query[0].equals(url[0]))
                    System.out.println(query[0] + "\t" + query[1] + "\t" + url[1]);
    }
}