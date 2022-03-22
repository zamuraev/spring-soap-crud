package com.zamuraev.service;

import com.zamuraev.entities.Product;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

@WebService
public interface ProductWs {

    @WebMethod
    List<Product> getProducts();
    @WebMethod
    Product getProduct(int id);
    @WebMethod
    Product createProduct(Product product);
    @WebMethod
    Product updateProduct(Product product);

}
