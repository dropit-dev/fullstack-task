package com.dropit.fullstacktask.api

import com.dropit.fullstacktask.data.CatalogRepository
import com.dropit.fullstacktask.models.Product
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestControllerAdvice

@RestControllerAdvice
@RequestMapping("/catalog")
@CrossOrigin
class CatalogController(val catalogRepository: CatalogRepository): CatalogApi {

    override fun getProducts(): List<Product> {
        return catalogRepository.getProducts()
    }

}
