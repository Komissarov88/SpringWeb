package org.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ProductController {

    @RequestMapping("/")
    public String hello(Model uiModel) {
        uiModel.addAttribute("name", "World!");
        return "index";
    }

    @RequestMapping(value = "/viewProducts", method = RequestMethod.GET)
    public String view(Model uiModel) {
        return "viewProducts";
    }

    @RequestMapping(value = "/addProduct", method = RequestMethod.GET)
    public String add(Model uiModel) {
        return "addProduct";
    }
}
