package cola.study.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Cola0502-JinZhong
 * @version 1.0
 * @description: HelloController
 * @date 2023/6/5 9:21
 */
@RestController
@RequestMapping("/api/v1/hello")
public class HelloController {
    @GetMapping("sayHello/{name}")
    public String sayHello(@PathVariable String name){
        return "Hello " + name;
    }
}
