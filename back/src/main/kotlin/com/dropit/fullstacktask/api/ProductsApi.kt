package com.dropit.fullstacktask.api

import com.dropit.fullstacktask.models.Product
import org.springframework.web.bind.annotation.GetMapping

interface ProductsApi {
    @GetMapping("/products", name = "Get products")
    fun getProducts(): List<Product>
}
