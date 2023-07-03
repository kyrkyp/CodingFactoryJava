package gr.aueb.cf.ch19.maps;

import gr.aueb.cf.ch19.sorting.Product;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class MapDemo {

    public static void main(String[] args) {

        Map<String, String> countries = new HashMap<>() {{
            put("GR", "Greece");
            put("FR", "France");
            put("USA", "United States of America");
        }};

        Map<String, String> countries2 = Map.of("GR", "Greece", "FR", "France", "USA", "United States of America"); // >JDK9

        Map<Integer, Product> productMap = new HashMap<>() {{
            put(1, new Product("Apples", 10.5, 10));
            put(2, new Product("Honey", 20.0, 30));
            put(3, new Product("Oranges", 2.5, 5));
            put(4, new Product("Milk", 3.5, 40));
        }};

        Map<String, Object> criteria = new HashMap<>() {{
            put("description", "Oranges");
            put("price", 2.5);
        }};

        String choice = productMap.values().stream()
                .filter(product -> product.getDescription().equals(criteria.get("description"))
                        && (Double.compare(product.getPrice(), (double)criteria.get("price"))) > 0)
                .map(Product::toString)
                .collect(Collectors.joining(", "));

        String strProducts = productMap.entrySet()
                .stream()
                .filter(entry -> entry.getValue().getDescription().equals("Apples"))
                .map(Objects::toString)
                .collect(Collectors.joining(", "));


        /*countries.put("GR", "Greece");
        countries.put("FR", "France");
        countries.put("USA", "United States of America");*/

        Iterator<Map.Entry<String, String>> iterator = countries.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();

            if (entry.getValue().equals("Greece")) {
                iterator.remove();
            }

            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        for (Map.Entry<String, String> entry : countries.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        countries.forEach((k, v) -> System.out.println(k + ": " + v));
    }
}
