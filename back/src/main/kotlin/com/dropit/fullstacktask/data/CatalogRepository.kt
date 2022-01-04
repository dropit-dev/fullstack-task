package com.dropit.fullstacktask.data

import com.dropit.fullstacktask.models.Product

interface CatalogRepository {
    fun getProducts(): List<Product>
}
