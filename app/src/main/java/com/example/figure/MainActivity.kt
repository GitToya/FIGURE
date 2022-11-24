package com.example.figure

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View
import androidx.annotation.ContentView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myView = MyView(this)
        setContentView(myView)


    }
    internal inner class MyView(context: Context): View(context)
    {
        private var paint =Paint()
        private val lineStrokeWidth =20f;
        init{
        }
      override fun onDraw(canvas: Canvas)
      {
          paint.color=Color.argb(255,255,0,255)
          paint.strokeWidth= lineStrokeWidth
          paint.style = Paint.Style.STROKE
          canvas.drawRect(300f,300f,600f,600f,paint)
      }
    }

}