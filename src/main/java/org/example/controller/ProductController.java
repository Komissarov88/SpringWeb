package org.example.controller;

import org.example.entity.Product;
import org.example.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ProductController {

    private ProductRepository productRepository;

    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @RequestMapping("/")
    public String index(Model uiModel) {
        return "index";
    }

    @RequestMapping(value = "/viewProducts", method = RequestMethod.GET)
    public String viewProducts(Model uiModel) {
        uiModel.addAttribute("products", productRepository.getProducts());
        return "view-products";
    }

    @RequestMapping(value = "/addProduct")
    public String addProduct(Model uiModel) {
        uiModel.addAttribute("product", new Product());
        return "add-product";
    }

    @RequestMapping("/processForm")
    public String processForm(@ModelAttribute("product")Product product) {
        productRepository.addProduct(product);
        return "view-products";
    }
}
