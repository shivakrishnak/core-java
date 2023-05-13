package com.ksk.java8.programs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) {
        run();
    }

    private static void run() {

        //Remove duplicates from string and return in same order
        String str1 = "dabfcadef";
        str1.chars().distinct().mapToObj(c -> (char) c).forEach(System.out::println);

        //Given a sentence find the word that has the highest length. The solution is:
        String str2 = "I am interested123455 to grow in my organization";
        String maxLength = Arrays.stream(str2.split(" ")).max(Comparator.comparing(String::length)).get();
        System.out.println("highest length : " + maxLength);

        // Given a sentence find the word that has the 2nd (Nth) highest length.
        Optional<String> secondHighest = Arrays.stream(str2.split(" ")).sorted(Comparator.comparing(String::length).reversed()).peek(System.out::println).skip(1).findFirst();
        System.out.println("2nd highest length : " + secondHighest.get());

        //Find the length of the longest word
        Integer lengthLongestWord = Arrays.stream(str2.split(" ")).max(Comparator.comparing(String::length)).map(String::length).get();
        System.out.println("length of the longest word : " + lengthLongestWord);

        //Given a sentence, find the number of occurrence of each word.
        String input = "the quick brown fox jumps right over the little lazy dog little";
        Map<String, Long> stringCounts = Arrays.stream(input.split(" ")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("number of occurrence of each word : "+ stringCounts);

        //Given a word, find the occurrence of Each Character
        String word = "interested123455";
        Map<Character, Long> charCounts = word.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("number of occurrence of Each Character : "+ charCounts);
    }
}
