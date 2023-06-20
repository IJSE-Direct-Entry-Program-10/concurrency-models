package lk.ijse.dep10.app.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HttpController {

    @GetMapping("/endpoint1")
    public String endpoint1(){
        var x = 0;
        for (var i = 0; i < 1000000; i++) {
            x += i * 5;
            System.out.println(x);
        }
        return String.format("<h1>%d</h1>", x);
    }

    @GetMapping("/endpoint2")
    public String endpoint2(){
        return "<h1>I am so damn cool!</h1>";
    }
}
