package com.ids.ProgettoIDS.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("message", "Benvenuto nella pagina Home!");
        return "home"; // Deve corrispondere al file home.html
    }
}
