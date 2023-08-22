package com.chhue.drawchart

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.core.content.ContextCompat
import com.chhue.drawchart.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

//        val colorList = listOf(
//            Color.Black,
//            Color.Gray,
//            Color.Cyan,
//            Color.DarkGray,
//            Color.Magenta
//        )

        val colorList = listOf(
            Color(0xFF9104FF),
            Color(0xCC9104FF),
            Color(0x889104FF),
            Color(0x669104FF),
            Color(0x339104FF)
        )

        val widthList = listOf(90f,82f,63f,31f,12f)

//        binding.chart.apply {
//            colors = colorList
//            width = widthList
//            modifier = Modifier.fillMaxSize()
//        }]
    }
}