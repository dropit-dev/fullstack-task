package com.dropit.fullstacktask.models

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

@JsonIgnoreProperties(ignoreUnknown = true)
data class Product(val id: Number, val title: String, val price: Number, val category: String, val image: String)
