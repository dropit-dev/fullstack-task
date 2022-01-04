package com.dropit.fullstacktask.integrations

import com.dropit.fullstacktask.models.CheckoutData

interface PaymentsProvider {
    fun checkout(data: List<CheckoutData>)
}
