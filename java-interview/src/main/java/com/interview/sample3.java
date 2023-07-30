package com.ksk.java8.interview;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class sample3 {

    public static void main(String[] args) {
        List<Character> chars = List.of('a','a','b','c','c','c','d','d','d','d'  );

        Map<Character, Long> charCount = chars.stream()
                                        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(charCount);
        List<Map.Entry<Character, Long>> collect = charCount.entrySet().stream().sorted(Comparator.comparingLong(val -> val.getValue())).collect(Collectors.toList());
        System.out.println(collect);

        //duplicate employee
        //Select * from Employee where name in (Select name from Employee group by name having count(*) > 1);
    }
}
