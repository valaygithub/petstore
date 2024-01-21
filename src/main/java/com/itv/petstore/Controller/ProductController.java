package com.itv.petstore.Controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.itv.petstore.Services.ProductService;
import com.itv.petstore.entities.Product;

import jakarta.validation.Valid;

@RestController
public class ProductController {
    
   /* @RequestMapping("/")
    public String getname()
    {
        return "my name is valay";
    }
    @RequestMapping("/marks")
    public int getmarks()
    {
        return 90;
    }*/

@Autowired
private ProductService productService;
//@RequestMapping("/products")
@GetMapping("/products")
public Collection<Product>getProduct()
{
    return this.productService.getAllProducts();
}
//@RequestMapping("/products/{id}")
@GetMapping("/products/{id}")
public Product getProductById(@PathVariable Integer id)
{
   return this.productService.getProductById(id);
}
//@RequestMapping(path="/products",method=RequestMethod.POST)
@PostMapping("/products")
public Product addProduct(@RequestBody @Valid Product product)
{
   return this.productService.addProduct(product);
}

//@RequestMapping(path="/products/{id}",method=RequestMethod.DELETE)
@DeleteMapping("/products/{id}")
public String deleteProduct(@PathVariable  Integer id)
{
   return this.productService.deleteProduct(id);
}
//@RequestMapping(path="/products/{id}",method=RequestMethod.PUT)
@PutMapping("/products/{id}")
public String updateproduct(@PathVariable  Integer id,@RequestBody Product product)
{
   return this.productService.updateProduct(id, product);
}
}

