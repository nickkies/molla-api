package com.la.mollaapi.web;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequiredArgsConstructor
@Controller
public class UserController {
    @GetMapping("")
    public ResponseEntity<List<Map<String, Integer>>> test() {
        List<Map<String, Integer>> list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            Map<String, Integer> map = new HashMap<>();
            map.put("test", i);
            list.add(map);
        }

        return ResponseEntity.ok().body(list);
    }
}
