package org.example;

import java.util.Arrays;

public class Main {
  public static void main(String... args) {
    Dataset.of(Arrays.asList("шЛа", "саша", "по", "Шоссе"))
        .union(Arrays.asList("и", "сосала", "сушку"))
        .filter(s -> s.length()%2 != 0)
        .map(s -> s.split(" "))
        .forEach(System.out::println);
  }
}
