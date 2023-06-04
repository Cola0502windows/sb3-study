package cola.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/api/v1/hello")
public class Demo01QuickstartApplication {

    public static void main(String[] args) {
        SpringApplication.run(Demo01QuickstartApplication.class, args);
    }

    @GetMapping("/sayHello")
    public String sayHello(){
        return "Hello";
    }

}
