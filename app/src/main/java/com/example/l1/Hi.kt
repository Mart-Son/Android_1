/*
package com.example.l1
import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.view.MotionEvent
import android.view.View.OnTouchListener
import android.view.View
import java.util.Timer
import kotlin.concurrent.schedule

class Hi: Activity() {
    private var counter: Int=0
    private var counter2: Int=0
    private var time_count: Int=0

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
            setContentView(R.layout.act_hi_layout)

        val textView2: TextView = findViewById(R.id.textView2)
        val button1 = findViewById<Button>(R.id.button1)


        button1.setOnClickListener{
            button1.text = "Yuppie!"
            textView2.setText("Правая кнопка нажата  " + counter + " раз, а левая - " + ++counter2 + " раз")
        }

        val button2 = findViewById<Button>(R.id.button2)


        button2.setOnTouchListener (View.OnTouchListener {
                view, motionEvent ->

            when(motionEvent.action){
                MotionEvent.ACTION_DOWN-> {

                    Timer().schedule(0,1000)
                    {
                        ++time_count
                    }

                }

                MotionEvent.ACTION_UP->
                {
                    textView2.setText("Button was held for " + time_count + " s")
                    time_count=0
                }
            }
            return@OnTouchListener true
        })
        

        button2.setOnClickListener {

            textView2.setText("Правая кнопка нажата  " + ++counter + " раз, а левая - " + counter2 + " раз")
            }
        }
    }
*/
