package com.day2.PersonalMusicLibraryManager;
import java.io.*;
import java.util.*;
import java.util.regex.*;
import java.util.stream.*;

public class SongVault<T extends Media> {

    private static final Pattern TITLE = Pattern.compile("Title: (.*)");
    private static final Pattern ARTIST = Pattern.compile("Artist: (.*)");
    private static final Pattern DURATION = Pattern.compile("Duration: (.*)");
    private static final Pattern GENRE = Pattern.compile("Genre: (.*)");

    public List<Song> loadSongs(String folderPath) throws Exception {

        List<Song> songs = new ArrayList<>();
        File folder = new File(folderPath);

        for(File file : folder.listFiles((f) -> f.getName().endsWith(".csv"))) {

            BufferedReader br = new BufferedReader(new FileReader(file));
            String content = br.lines().collect(Collectors.joining("\n"));
            br.close();

            songs.add(new Song(
                    extract(TITLE, content),
                    extract(ARTIST, content),
                    extract(DURATION, content),
                    extract(GENRE, content)
            ));
        }
        return songs;
    }

    public Map<String, List<Song>> groupByGenre(List<Song> songs) {
        return songs.stream()
                .collect(Collectors.groupingBy(Song::getGenre));
    }

    public Set<String> getUniqueArtists(List<Song> songs) {
        return songs.stream().map(Song::getArtist).collect(Collectors.toSet());
    }

    private String extract(Pattern p, String text) throws Exception {
        Matcher m = p.matcher(text);
        if(m.find()) return m.group(1);
        throw new Exception("Invalid song format");
    }
}
