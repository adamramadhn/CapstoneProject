package com.akiramenaide.capstoneproject.ui.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.akiramenaide.capstoneproject.core.data.entity.FruitEntity
import com.akiramenaide.capstoneproject.core.util.DummyFruit
import com.akiramenaide.capstoneproject.databinding.FragmentHomeBinding
import com.akiramenaide.capstoneproject.ui.util.MyColors
import com.github.mikephil.charting.charts.BarChart
import com.github.mikephil.charting.data.*
import com.github.mikephil.charting.formatter.IndexAxisValueFormatter
import java.util.ArrayList


class HomeFragment : Fragment() {
    private val brightColors = MyColors.brightColorArray
    private lateinit var fragmentHomeBinding: FragmentHomeBinding
    private lateinit var barChart: BarChart

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        fragmentHomeBinding = FragmentHomeBinding.inflate(layoutInflater)
        return fragmentHomeBinding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        barChart = fragmentHomeBinding.barChart
        val fruits = DummyFruit.getAllFruits()
        // fragmentHomeBinding.aaChartView.aa_drawChartWithChartModel(aaChartModel)
        drawBarChart(fruits)
    }

    private fun drawBarChart(fruits: List<FruitEntity>){
        val barValues = ArrayList<BarEntry>()
        val fruitNames = ArrayList<String>()
        var x = 0f
        for (element in fruits) {
            barValues.add(BarEntry(
                x,
                element.total.toFloat())
            )
            x++
            fruitNames.add(element.name)
        }
        val dataSet = BarDataSet(barValues, "Fruits")

        barChart.apply {
            data = BarData(dataSet).apply {
                setValueTextSize(12f)
            }
            description = null
            setFitBars(true)
            setScaleEnabled(false)
            setPinchZoom(false)
            xAxis.valueFormatter = IndexAxisValueFormatter(fruitNames)
            xAxis.labelCount = fruitNames.size
            animateY(1000)
            invalidate()
        }
        dataSet.colors = brightColors
    }

}