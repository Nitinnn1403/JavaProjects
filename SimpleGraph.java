import java.util.*;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class SimpleGraph {
    public static void main(String[] args) {
        Map <String, List<String>> graph = new HashMap<>();
        graph.put("A", Arrays.asList("B", "C"));
        graph.put("B", Arrays.asList("A", "D"));
        graph.put("C", Arrays.asList("A", "D"));
        graph.put("D", Arrays.asList("B", "C"));
        graph.put("E", Arrays.asList("F"));
        graph.put("F", Arrays.asList("E"));

        List<String> cities = new ArrayList<>(graph.keySet());

        for (int i = 0; i < cities.size(); i++) {
            String city = cities.get(i);
            System.out.println(city + " is connected to: " + graph.get(city));
        }
    }
}