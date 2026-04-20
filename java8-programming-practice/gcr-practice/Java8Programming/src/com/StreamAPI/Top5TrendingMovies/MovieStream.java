package com.StreamAPI.Top5TrendingMovies;

import java.util.*;
import java.util.stream.Collectors;

public class MovieStream {

    public static void main(String[] args) {

        List<Movie> movies = Arrays.asList(
                new Movie("Inception", 8.8, 2010),
                new Movie("Interstellar", 8.6, 2014),
                new Movie("Avatar", 7.8, 2009),
                new Movie("Tenet", 7.3, 2020),
                new Movie("Oppenheimer", 8.9, 2023),
                new Movie("Dhurandar", 10.0, 2025),
                new Movie("Dunkirk", 7.9, 2017),
                new Movie("Joker", 8.4, 2019)
        );

        List<Movie> top5Movies = movies.stream()
                .filter(m -> m.getRating() >= 7.0)
                .sorted(Comparator.comparingDouble(Movie::getRating).reversed()
                                  .thenComparing(Movie::getReleaseYear).reversed())
                .limit(5)
                .collect(Collectors.toList());

        top5Movies.forEach(System.out::println);
    }
}


/* Without Stream API(Traditional Way) : 


List<Movie> filtered = new ArrayList<>();

for (Movie m : movies) {
    if (m.getRating() >= 7.0) {
        filtered.add(m);
    }
}

filtered.sort((m1, m2) -> {
    int ratingCompare = Double.compare(m2.getRating(), m1.getRating());
    if (ratingCompare != 0) return ratingCompare;
    return Integer.compare(m2.getReleaseYear(), m1.getReleaseYear());
});

List<Movie> top5 = filtered.subList(0, Math.min(5, filtered.size()));


*/
