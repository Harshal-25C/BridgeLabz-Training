package com.searching.LinearSearch;

public class SearchWordInSentences{

    public static String findSentence(String[] sentences, String word){

        for(String sentence : sentences){
            if(sentence.contains(word)){
                return sentence;  //return first matching sentence
            }
        }
        return "Not Found";
    }

    public static void main(String[] args){

        String[] sentences = {
                "Java is a powerful language",
                "Data structures are important",
                "Linear search is simple",
                "Algorithms improve efficiency"
        };

        String wordToSearch = "search";

        String result = findSentence(sentences, wordToSearch);

        System.out.println(result);
    }
}
