package com.akiramenaide.capstoneproject

import com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel
import com.github.aachartmodel.aainfographics.aachartcreator.AAChartStackingType
import com.github.aachartmodel.aainfographics.aachartcreator.AAChartType
import com.github.aachartmodel.aainfographics.aachartcreator.AASeriesElement


val aaChartModel: AAChartModel = AAChartModel()
    .chartType(AAChartType.Bar)
    .title("Data Quality")
    .subtitle("Tingkat Kesegaran Buah")
    .backgroundColor("#FFFF")
    .categories(
        arrayOf(
            "2020",
            "2021",
            "2022",
            "2023",
            "2024"
        )
    )
    .stacking(AAChartStackingType.False)
    .yAxisTitle("Percent")
    .series(
        arrayOf(
            AASeriesElement()
                .name("Apel")
                .data(arrayOf(0.37, 0.56, 0.78, 0.77, 0.83))
                .color("#FF0000"),
            AASeriesElement()
                .name("Pisang")
                .data(arrayOf(0.57, 0.66, 0.88, 0.70, 0.93))
                .color("#FFFF00"),
            AASeriesElement()
                .name("Anggur")
                .data(arrayOf(0.77, 0.76, 0.98, 0.80, 0.89))
                .color("#800080")
        )
    )