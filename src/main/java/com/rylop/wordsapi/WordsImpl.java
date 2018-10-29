package com.rylop.wordsapi;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class WordsImpl implements Words {

    private List<String> words;

    public WordsImpl() {
        words = new ArrayList<>();
    }

    public int insertWord(String word) {
        words.add(word);
        return words.size();
    }

    public void deleteWord(int id) {
        if (id < words.size()) {
            words.remove(id);
        }
    }

    public void updateWord(int id, String word) {
        if (id < words.size()) {
            words.set(id, word);
        }
    }

    public int findWord(String word) {
        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).equals(word)) {
                return i;
            }
        }
        return -1;
    }

    public String printWords() {
        return words.toString();
    }

    public String printPalindromes() {
        List<String> palindromes = new ArrayList<>();
        for (String s : words) {
            if (isPalindrome(s)) {
                palindromes.add(s);
            }
        }
        return palindromes.toString();
    }

    private boolean isPalindrome(String s) {
        return s.equals(new StringBuilder(s).reverse().toString());
    }
}
