package com.akiramenaide.capstoneproject.core.data.entity

data class FruitEntity(
    val id: Int,
    var name: String,
    var total: Int,
    var freshTotal: Int
) {
    var freshPercentage = freshTotal.toFloat() * 100/total.toFloat()
    var isMajorityFresh = freshPercentage > 50
}
