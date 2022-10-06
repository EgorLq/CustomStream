package org.example;

import java.util.Arrays;

public class Main {
  public static void main(String... args) {
    Dataset.of(Arrays.asList("шЛа", "саша", "по", "Шоссе"))
        .union(Arrays.asList("и", "сосала", "сушку"))
        .filter(s -> s.length()%2 != 0)
        .map(s -> s.split(" "))
        .forEach(System.out::println);
    // char lower = 'с';
    // System.out.println(Character.isLowerCase(lower));
  }
}
// s.substring(0 ,s.length()/2)  +s.substring(s.length()/2, s.length()/2+1).toUpperCase() + s.substring(s.length()/2+1)