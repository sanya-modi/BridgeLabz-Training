package com.collectors.library_book_statistics;

import java.util.*;
import java.util.stream.Collectors;

public class BookAnalysis {

    public static void main(String[] args) {

        List<Book> books = Arrays.asList(
                new Book("Book A", "Fiction", 320),
                new Book("Book B", "Fiction", 280),
                new Book("Book C", "Science", 450),
                new Book("Book D", "Science", 390),
                new Book("Book E", "History", 500),
                new Book("Book F", "History", 620),
                new Book("Book G", "Fiction", 410),
                new Book("Book H", "Science", 300)
        );

        Map<String, IntSummaryStatistics> statsByGenre =
                books.stream()
                        .collect(Collectors.groupingBy(
                                Book::getGenre,
                                Collectors.summarizingInt(Book::getPages)
                        ));

        // Print results
        statsByGenre.forEach((genre, stats) -> {
            System.out.println("Genre: " + genre);
            System.out.println("  Total Pages   : " + stats.getSum());
            System.out.println("  Average Pages : " + stats.getAverage());
            System.out.println("  Max Pages     : " + stats.getMax());
        });
    }
}

