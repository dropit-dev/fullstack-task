package com.dropit.fullstacktask.integrations

import com.dropit.fullstacktask.models.CheckoutData
import org.springframework.stereotype.Component

@Component
class SababaPaymentsProvider: PaymentsProvider {
    override fun checkout(data: List<CheckoutData>) {
        if (data.isEmpty()) throw LoSababaException("No products found")

        if (data.any { it.productAmount < 1}) throw LoSababaException("Product amount cannot be lower than 1")

        println("All is Sababa")
    }
}

class LoSababaException(message: String): Exception(message)
