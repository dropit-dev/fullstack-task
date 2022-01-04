package com.dropit.fullstacktask.api

import com.dropit.fullstacktask.integrations.PaymentsProvider
import com.dropit.fullstacktask.models.CheckoutData
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestControllerAdvice

@RestControllerAdvice
@RequestMapping("/orders")
class OrdersController(val paymentsProvider: PaymentsProvider): OrdersApi {
    override fun checkout(data: List<CheckoutData>) {
            paymentsProvider.checkout(data)
    }
}
