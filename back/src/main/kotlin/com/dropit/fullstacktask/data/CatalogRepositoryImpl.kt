package com.dropit.fullstacktask.data

import com.dropit.fullstacktask.models.Product
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.KotlinModule
import com.fasterxml.jackson.module.kotlin.readValue
import org.springframework.stereotype.Component
import org.springframework.web.client.ResourceAccessException

const val PRODUCTS_FILE = "static/products.json"

@Component
class CatalogRepositoryImpl: CatalogRepository {

    val objectMapper = ObjectMapper().apply {
        registerModule(
            KotlinModule.Builder()
                .build()
        )
    }
    override fun getProducts(): List<Product> {
        javaClass.classLoader.getResourceAsStream(PRODUCTS_FILE)?.let {
            return objectMapper.readValue(it)

        }
        throw ResourceAccessException("Could not read products")
    }
}
