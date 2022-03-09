package id.ac.uin.indah.latihan;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")

public class IndexController {
    @GetMapping("/hello")
    public String hello(){
        return "Selamat Belajar Spring-boot";

    }
}
