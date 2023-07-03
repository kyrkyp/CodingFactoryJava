package gr.aueb.cf.ch19.sorting;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>(List.of(
                new Product("Oranges", 8.5, 10),
                new Product("Milk", 2.5, 5),
                new Product("Honey", 12.5, 115),
                new Product("Apples", 7.5, 85),
                new Product("Cinnamon", 3.5, 90)));

        List<Product> newProducts = Arrays.asList(
                new Product("Oranges", 8.5, 10),
                new Product("Milk", 2.5, 5),
                new Product("Honey", 12.5, 115),
                new Product("Apples", 7.5, 85),
                new Product("Cinnamon", 3.5, 90));

        List<String> productDescriptions = products.stream()
                .filter(p -> p.getQuantity() >= 1)
                .map(Product::getDescription)
                .sorted()
                .collect(Collectors.toList());

        Set<String> cities = new HashSet<>(List.of("Athens", "Berlin", "Paris"));

        Set<String> nonGreekCities = cities.stream()
                .filter(city -> !city.equals("Athens"))
                .sorted()
                .collect(Collectors.toCollection(TreeSet::new));

        List<Product> updatedProductPrices = products.stream()
                .map(p -> new Product(p.getDescription(), p.getPrice() + p.getPrice() * 0.1, p.getQuantity()))
                .collect(Collectors.toList());

        int sumOfQuantities = products.stream()
                .filter(p -> p.getDescription().equals("Apples"))
                .reduce(0, (total, e) -> total + e.getQuantity(), Integer::sum);

        int sumOfQuantities2 = products.stream()
                .filter(p -> p.getDescription().equals("Apples"))
                .mapToInt(Product::getQuantity)
                .sum();

//        Collections.sort(products);
//        products.forEach(System.out::println);
//
//        Collections.reverse(products);
//        products.forEach(System.out::println);
//
//        Collections.sort(products, Comparator.naturalOrder());
//        products.sort(Comparator.naturalOrder()); // Ascending
//
//        products.sort(Comparator.reverseOrder());  // Descending
//
//        products.sort(Comparator.comparing(Product::getDescription));
//        products.forEach(System.out::println);
//
//        products.sort(Comparator.comparing(Product::getPrice).thenComparing(Product::getQuantity).reversed());

        products.sort(Comparator.comparing(Product::getDescription)
                .thenComparing(Product::getPrice, (a1, a2) -> Double.compare(a2, a1))
                .thenComparing(Product::getQuantity));

        List<Product> lengthFiltered = products.stream()
                .filter(product -> product.getDescription().length() <= 5)
                .collect(Collectors.toList());

        lengthFiltered.forEach(System.out::println);

        List<Product> applesList = products.stream()
                .filter(product -> product.getDescription().equals("Apples"))
                .sorted(Comparator.comparing(Product::getQuantity))
                .collect(Collectors.toList());

        applesList.forEach(System.out::println);
    }
}
