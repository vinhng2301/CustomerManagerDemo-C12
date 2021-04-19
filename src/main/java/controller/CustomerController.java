package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomerController {

    @GetMapping("/customers")
    public String showList() {
        return "customers/index.jsp";
    }
}
