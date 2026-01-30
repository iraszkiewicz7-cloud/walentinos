package com.example.backend;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class WykonawcaController {

    @GetMapping("/wykonawcy")
    public List<Map<String, Object>> getWykonawcy() {
        return List.of(
                Map.of("id", 1, "name", "Wika", "surname", "Godlewska"),
                Map.of("id", 2, "name", "Igor", "surname", "Raszkiewicz")
        );
    }

    @GetMapping("/health")
    public Map<String, String> health() {
        return Map.of("status", "OK");
    }
}