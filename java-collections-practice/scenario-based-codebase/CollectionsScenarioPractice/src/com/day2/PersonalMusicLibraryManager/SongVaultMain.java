package com.day2.PersonalMusicLibraryManager;
import java.util.*;

public class SongVaultMain {

    public static void main(String[] args) {

        try{
            SongVault<Song> vault = new SongVault<>();
            List<Song> songs = vault.loadSongs("src/com/day2/PersonalMusicLibraryManager/songs/songs.csv");

            System.out.println("All Songs:");
            songs.forEach(System.out::println);

            System.out.println("\nGrouped by Genre:");
            vault.groupByGenre(songs).forEach((g, s) -> System.out.println(g + " → " + s.size()));

            System.out.println("\nUnique Artists:");
            vault.getUniqueArtists(songs).forEach(System.out::println);

        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
