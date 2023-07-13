package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("bye") // url bye
    public String hello(Model model) {
        model.addAttribute("data", "hello!");
        return "hello"; // return hello.html
    }

    @GetMapping("hello") // url hello
    public String bye(Model model) {
        model.addAttribute("data", "bye!");
        return "bye"; // return bye.html
    }
}
