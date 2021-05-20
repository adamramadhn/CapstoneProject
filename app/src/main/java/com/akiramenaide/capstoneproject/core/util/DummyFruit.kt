package com.akiramenaide.capstoneproject.core.util

import com.akiramenaide.capstoneproject.core.data.entity.FruitEntity

object DummyFruit {
    private val banana = FruitEntity(
        1,
        "Banana",
        124,
        88,
    )

    private val corn = FruitEntity(
        2,
        "Corn",
        190,
        141,
    )

    fun getAllFruits(): List<FruitEntity> {
        val fruits = ArrayList<FruitEntity>()
        fruits.add(banana)
        fruits.add(corn)
        return fruits
    }

}