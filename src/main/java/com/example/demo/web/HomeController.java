package com.example.demo.web;
import com.example.demo.domain.user;
import org.apache.catalina.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String home(Model model){
        model.addAttribute("formData",new user());
        return "index";
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String processForm(user user, RedirectAttributes attr) {
        //Insert Data submitted in the form to database.
        attr.addFlashAttribute("user", user);
        return "redirect:/display";
    }
    @RequestMapping(value = "/display", method = RequestMethod.GET)
    public String displayFormData(user user ){
        return "Result";
    }

}
