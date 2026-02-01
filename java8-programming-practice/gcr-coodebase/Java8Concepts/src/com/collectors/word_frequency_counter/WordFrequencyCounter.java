package com.collectors.word_frequency_counter;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordFrequencyCounter {

    public static void main(String[] args) {

        String paragraph =
                "Java streams make data processing easy and powerful. " +
                "Java streams help write clean code. " +
                "Using streams in Java improves readability and efficiency.";

        Map<String, Integer> wordCount =
                Arrays.stream(paragraph.toLowerCase()        // normalize case
                        .replace(".", "")                     // remove punctuation
                        .split("\\s+"))                       // split into words
                .collect(Collectors.toMap(
                        Function.identity(),                         // key -> key
                        word -> 1,                            // initial value
                        Integer::sum                          // merge duplicates
                ));

        wordCount.forEach((word, count) ->
                System.out.println(word + " -> " + count)
        );
    }
}

