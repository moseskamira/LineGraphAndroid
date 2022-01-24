package com.example.linegraphandroid

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.jjoe64.graphview.GraphView
import com.jjoe64.graphview.GridLabelRenderer
import com.jjoe64.graphview.series.DataPoint
import com.jjoe64.graphview.series.LineGraphSeries


class MainActivity : AppCompatActivity() {

    lateinit var graphView: GraphView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        graphView = findViewById(R.id.idGraphView)
        loadLineGraph()
    }

    private fun loadLineGraph() {
        val series = LineGraphSeries(
            arrayOf(
                DataPoint(0.0, 0.7),
                DataPoint(1.0, 14.4),
                DataPoint(2.0, 16.2),
                DataPoint(3.0, 39.2),
                DataPoint(4.0, 32.0),
                DataPoint(5.0, 29.0),
                DataPoint(6.0, 21.0),
                DataPoint(7.0, 27.0),
                DataPoint(8.0, 18.0),
                DataPoint(10.0, 35.0),

            )
        )
        series.isDrawDataPoints = true
        series.dataPointsRadius = 8F

        graphView.title = "My First Line Graph"
        graphView.viewport.setMinX(0.0)
        graphView.viewport.setMaxX(10.0)
        graphView.viewport.setMinY(0.0)
        graphView.viewport.setMaxY(40.0)
        graphView.viewport.isYAxisBoundsManual = true
        graphView.viewport.isXAxisBoundsManual = true
        graphView.gridLabelRenderer.gridStyle = GridLabelRenderer.GridStyle.BOTH
        graphView.viewport.setDrawBorder(true)

        graphView.addSeries(series)
    }
}