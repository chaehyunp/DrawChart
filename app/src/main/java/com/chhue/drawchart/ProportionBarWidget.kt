package com.chhue.drawchart

import android.content.Context
import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View
import android.widget.ImageView

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.RoundRect
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.platform.AbstractComposeView
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat

@Composable
fun ProportionBar(
    colors: List<Color>,
    width: List<Float>,
    modifier: Modifier
)  {



//    val bitmap = Bitmap.createBitmap(300, 200, Bitmap.Config.ARGB_8888)
//    val test = Canvas(bitmap)
//    val paint = Paint(Paint.ANTI_ALIAS_FLAG)
//    paint.setColor(android.graphics.Color.BLACK)
//    test.drawText("asdasd",90f,80f, Paint(paint))
    Canvas(modifier = modifier,
        onDraw = {
            var start = 30f
            for (i in 0..4) {
                //끝점을 시작점으로부터 data*50만큼 떨어뜨리기
                val end = start + width[i]
                drawRect(
                    color = colors[i],
                    topLeft = Offset(start, 80f),
                    size = Size(width[i], 150f)
                )
                //다음 시작점은 현재의 끝점
                start = end
            }

        })


}


@Preview(widthDp = 300, heightDp = 200, showBackground = true)
@Composable
fun PreviewTest() {
    val colors = listOf(
        Color(R.color.purple1),
        Color(R.color.purple2),
        Color(R.color.purple3),
        Color(R.color.purple4),
        Color(R.color.purple5)
    )

    val width = listOf(90f,82f,63f,31f,12f)




//    Canvas(modifier = Modifier.fillMaxSize(),
//        onDraw = {
//            var start = 30f
//            for (data in 0..4) {
//                //끝점을 시작점으로부터 data*50만큼 떨어뜨리기
//                val end = start + (data + 1) * 50
//                drawRect(
//                    color = colors[data],
//                    topLeft = Offset(start, 80f),
//                    size = Size(end - start, 150f)
//                )
//                //다음 시작점은 현재의 끝점
//                start = end
//            }
//        })

    width.forEachIndexed { index, fl ->
        Text(text = "asdasd",
            modifier = Modifier.size(fl.dp, fl.dp).background(colors[index]),
            color = Color.Blue,
            fontSize = 35.sp,
            overflow = TextOverflow.Visible
        )
    }



    Canvas(modifier = Modifier.fillMaxSize(),
        onDraw = {
            var start = 30f
            for (i in 0..4) {
                //끝점을 시작점으로부터 data*50만큼 떨어뜨리기
                val end = start + width[i]
                drawRect(
                    color = colors[i],
                    topLeft = Offset(start, 80f),
                    size = Size(width[i], 150f)
                )
                //다음 시작점은 현재의 끝점
                start = end


            }


        })

}




