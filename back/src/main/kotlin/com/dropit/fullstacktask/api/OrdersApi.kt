package com.dropit.fullstacktask.api

import com.dropit.fullstacktask.models.CheckoutData
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody

interface OrdersApi {
    @PostMapping("/checkout", name = "Checkout")
    fun checkout(@RequestBody data: List<CheckoutData>)
}
