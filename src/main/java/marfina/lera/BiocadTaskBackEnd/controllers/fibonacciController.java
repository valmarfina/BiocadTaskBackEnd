package marfina.lera.BiocadTaskBackEnd.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import static marfina.lera.BiocadTaskBackEnd.Fibonacci.fibonacci;

@Controller
public class fibonacciController {
    @GetMapping("/fibonacci")
    public String helloPage(Model model) {
        model.addAttribute("fibonacci", fibonacci(11));
        return "first/fibonacci";
    }
}
