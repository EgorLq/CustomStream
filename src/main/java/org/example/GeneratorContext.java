package org.example;

@FunctionalInterface
public interface GeneratorContext<T> {
  void emit(T value);
}