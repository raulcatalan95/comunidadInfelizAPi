package cl.comunidadinfeliz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ComunidadinfelizApplication {

    public static void main(String[] args) {
        SpringApplication.run(ComunidadinfelizApplication.class, args);
    }

    @GetMapping("/")
    public String home() {
        return "Comunidad Infeliz API está corriendo correctamente.";
    }
}
