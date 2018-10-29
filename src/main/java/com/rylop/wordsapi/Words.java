package com.rylop.wordsapi;

public interface Words {

    int insertWord(String word);
    void deleteWord(int id);
    void updateWord(int id, String word);
    int findWord(String word);
    String printWords();
    String printPalindromes();
}
