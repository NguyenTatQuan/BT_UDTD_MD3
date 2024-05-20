package org.example.bt_udtd_md3.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
public class DictionaryController {

    private static final Map<String, String> dictionary = new HashMap<>();

    static {
        dictionary.put("hello", "xin chào");
        dictionary.put("goodbye", "tạm biệt");
        dictionary.put("book", "sách");
        dictionary.put("computer", "máy tính");
    }

    @GetMapping("/")
    public String showForm() {
        return "index";
    }

    @PostMapping("/translate")
    public String translate(@RequestParam("word") String word, Model model) {
        String meaning = dictionary.get(word.toLowerCase());
        if (meaning != null) {
            model.addAttribute("word", word);
            model.addAttribute("meaning", meaning);
        } else {
            model.addAttribute("word", word);
            model.addAttribute("message", "Không tìm thấy từ này trong từ điển.");
        }
        return "result";
    }
}
