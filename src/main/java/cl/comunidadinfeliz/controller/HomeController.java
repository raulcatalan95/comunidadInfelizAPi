package cl.comunidadinfeliz.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "🚀 Comunidad Infeliz API está corriendo correctamente.";
    }
}
