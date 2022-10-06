package org.example;

@FunctionalInterface
public interface Generator<T> {
  void generate(GeneratorContext<T> context);
}