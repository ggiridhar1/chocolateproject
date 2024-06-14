package com.example.demo.web;

import com.example.demo.domain.Product;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/{userId}")
    public String displayUser(@PathVariable int userId){
        return "userfound "+userId;
    }
    @RequestMapping("/{userId}/invoices")
    public String displayInvoices(@PathVariable int userId, @RequestParam(value = "date",required = false) Date dateOrNull){
        return "Invoice found for user: "+userId+" on the date "+dateOrNull;
    }
    @RequestMapping("/{userId}/items")
    public List<String> objects(){
        return Arrays.asList("shoe","laptop","button");
    }

    @RequestMapping("/{userId}/products")
    public List<Product> displayProductsJSON(){
        return Arrays.asList(
                new Product(1,"Shoe",42.99),
                new Product(2,"Laptop",100.99),
                new Product(3,"Button",200.99)
        );
    }

}
