package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by filipows on 2/10/2015.
 */

@RestController
public class HelloController {


    @RequestMapping("/")
    public String index() {
        return "Greetings from home!";
    }
}
