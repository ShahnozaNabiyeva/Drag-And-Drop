package com.shahnoza.dragenddrop

import android.os.Bundle
import android.view.MotionEvent

import androidx.appcompat.app.AppCompatActivity

import com.shahnoza.dragenddrop.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    var x:Float?=null
    var y:Float?=null
    var dx:Float?=null
    var dy:Float?=null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)




    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {

        if (event!!.action == MotionEvent.ACTION_DOWN){
            x = event.x
            y = event.y
        }
        if (event.action == MotionEvent.ACTION_MOVE){
            dx = event.x - x!!
            dy = event.y - y!!

            binding.imageView.x = binding.imageView.x + dx!!
            binding.imageView.y = binding.imageView.y + dy!!

            x = event.x
            y = event.y
        }

        return super.onTouchEvent(event)
    }
}