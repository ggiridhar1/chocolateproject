package com.example.demo.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/greeting")
public class controller {
    @RequestMapping(value="/deepthi", method = RequestMethod.GET)
    public String helloServer(){
        return "Hello Deepthi";
    }

    @RequestMapping(value = "/formPage", method = RequestMethod.GET)
    public String userForm(){
       return "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "    <title>User Registration Form</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "    <h2>User Registration Form</h2>\n" +
                "    <form action=\"/greeting/user_greetings\" method=\"post\">\n" +
                "        <label for=\"username\">Username:</label><br>\n" +
                "        <input type=\"text\" id=\"username\" name=\"username\" required><br><br>\n" +
                "\n" +
                "        <label for=\"password\">Password:</label><br>\n" +
                "        <input type=\"password\" id=\"password\" name=\"password\" required><br><br>\n" +
                "\n" +
                "        <label for=\"email\">Email:</label><br>\n" +
                "        <input type=\"email\" id=\"email\" name=\"email\" required><br><br>\n" +
                "\n" +
                "        <label for=\"aadhar\">Aadhar Number:</label><br>\n" +
                "        <input type=\"text\" id=\"aadhar\" name=\"aadhar\" pattern=\"[0-9]{12}\" title=\"Aadhar number should be 12 digits\" required><br><br>\n" +
                "\n" +
                "        <label for=\"city\">City:</label><br>\n" +
                "        <input type=\"text\" id=\"city\" name=\"city\" required><br><br>\n" +
                "\n" +
                "        <label for=\"state\">State:</label><br>\n" +
                "        <input type=\"text\" id=\"state\" name=\"state\" required><br><br>\n" +
                "\n" +
                "        <label for=\"country\">Country:</label><br>\n" +
                "        <input type=\"text\" id=\"country\" name=\"country\" required><br><br>\n" +
                "\n" +
                "        <input type=\"submit\" value=\"Submit\">\n" +
                "    </form>\n" +
                "</body>\n" +
                "</html>\n" ;
    }
    @RequestMapping(value = "/user_greetings", method = RequestMethod.POST)
    public String printUserGreating(@RequestParam String username){
        return "form submitted "+username;
    }
}
