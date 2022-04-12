package com.quintrix.jfs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class Java8Demo {
	public static void main(String[] args) {
		
		List<String> marvelNames = new ArrayList<>();
		marvelNames.add("Ironman");
		marvelNames.add("Hulk");
		marvelNames.add("Thor");
		marvelNames.add("Captain America");
		marvelNames.add("Star Lord");
		marvelNames.add("Gamora");
		marvelNames.add("Drax");
		marvelNames.add("Rocket");
		marvelNames.add("Groot");
		marvelNames.add("Ant-Man");
		marvelNames.add("Doctor Strange");
		marvelNames.add("Spider-Man");
		marvelNames.add("Black Panther");
		marvelNames.add("Wasp");
		marvelNames.add("Captain Marvel");
		marvelNames.add("Scarlet Witch");
		marvelNames.add("Vision");
		marvelNames.add("Falcon");
		marvelNames.add("Winter Soldier");
		marvelNames.add("Loki");
		marvelNames.add("Black Widow");
		marvelNames.add("Shang-Chi");
		marvelNames.add("Eternals");
		marvelNames.add("Hawkeye");
		marvelNames.add("Moon Knight");
		
		marvelNames.stream().filter((s) -> s.startsWith("C"))
        .forEach(System.out::println);
		
		List<String> marvelNamesInUppercase = marvelNames.stream().sorted()
        .map(String::toUpperCase)
        .collect(Collectors.toList());
		
		System.out.println(marvelNamesInUppercase);
		
		boolean matchedResult = marvelNames.stream()
				.anyMatch((s) -> s.startsWith("C"));
		System.out.println(matchedResult);
		
		matchedResult = marvelNames.stream()
				.allMatch((s) -> s.startsWith("C"));
		System.out.println(matchedResult);
		
		matchedResult = marvelNames.stream()
				.noneMatch((s) -> s.startsWith("C"));
		System.out.println(matchedResult);
	}
}
