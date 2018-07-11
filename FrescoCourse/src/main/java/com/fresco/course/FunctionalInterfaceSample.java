package com.fresco.course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfaceSample {

	public static void main(String[] args) {
		// Consumer & Predicate sample
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		eval(list, n -> n % 2 == 0, n -> System.out.println(String.format("Even numbers are :%d", n)));
		eval(list, n -> n % 2 == 1, n -> System.out.println(String.format("Odd numbers are :%d", n)));
		eval(list, n -> n > 5, n -> System.out.println(String.format("Numbers greater than 5 are :%d", n)));

		// Supplier & Consumer Sample
		List<String> sandwich = new ArrayList<>();
		Supplier<String> cheese = () -> "Cheese Sandwich";
		Supplier<String> corn = () -> "Corn sandwich";
		Supplier<String> veg = () -> "Mix Veg sandwich";
		Consumer<List<String>> consumer = listSandwich -> listSandwich.addAll(Arrays.asList("Cheese Sandwich","Corn sandwich","Mix Veg sandwich"));
		
	}

	public static void eval(List<Integer> list, Predicate<Integer> predicate, Consumer<Integer> consumer) {
		for (Integer n : list) {
			if (predicate.test(n)) {
				consumer.accept(n);
			}
		}
	}
	
	
}
