package com.akiramenaide.capstoneproject.core.util

import com.akiramenaide.capstoneproject.core.data.entity.FruitEntity

object DummyFruit {
    private val banana = FruitEntity(
        1,
        "Banana",
        124,
        88
    )

    private val corn = FruitEntity(
        2,
        "Corn",
        190,
        141
    )

    private val pineapple = FruitEntity(
        3,
        "Pineapple",
        914,
        398
    )

    fun getAllFruits(): List<FruitEntity> {
        val fruits = ArrayList<FruitEntity>()
        fruits.add(banana)
        fruits.add(corn)
        fruits.add(pineapple)
        return fruits
    }

}