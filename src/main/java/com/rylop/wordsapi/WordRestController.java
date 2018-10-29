package com.rylop.wordsapi;

import org.springframework.web.bind.annotation.*;

@RestController
public class WordRestController {

    private Words words;

    public WordRestController(Words words) {
        this.words = words;
    }

    @PostMapping("/words")
    public int insertWord(@RequestParam(value="value") String word) {
        return words.insertWord(word);
    }

    @DeleteMapping("/words")
    public void deleteWord(@RequestParam(value="id") int id) {
        words.deleteWord(id);
    }

    @PutMapping("/words")
    public void updateWord(@RequestParam(value="id") int id, @RequestParam(value="value") String word) {
        words.updateWord(id, word);
    }

    @PostMapping("/words/find")
    public int findWord(@RequestParam(value="value") String word) {
        return words.findWord(word);
    }

    @GetMapping("words")
    public String printWords() {
        return words.printWords();
    }

    @GetMapping("words/palindromes")
    public String printPalindromes() {
        return words.printPalindromes();
    }
}
