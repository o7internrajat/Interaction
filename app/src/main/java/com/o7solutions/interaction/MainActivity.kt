package com.o7solutions.interaction

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {
    val TAG = this.javaClass.simpleName

    lateinit var rgChoice:RadioGroup
    lateinit var rBtnRed:RadioButton
    lateinit var rBtnGreen:RadioButton
    lateinit var rBtnBlue:RadioButton
    lateinit var cbFirst:CheckBox
    lateinit var cbSecond:CheckBox
    lateinit var cbThird:CheckBox
    lateinit var activityInterface: ActivityInterface
    lateinit var activityTwoInterface: ActivityTwoInterface
    lateinit var activityThreeInterface: ActivityThreeInterface
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rBtnRed=findViewById(R.id.rBtnRed)
        rBtnGreen=findViewById(R.id.rBtnGreen)
        rBtnBlue=findViewById(R.id.rBtnBlue)
        rgChoice=findViewById(R.id.rgChoice)
        cbFirst=findViewById(R.id.cbFirst)
        cbSecond=findViewById(R.id.cbSecond)
        cbThird=findViewById(R.id.cbThird)
        red()
        green()
        blue()
    }
    fun calledActivityMethod(){
        Toast.makeText(this@MainActivity, "In activity Method", Toast.LENGTH_SHORT).show()
    }
    fun red() {
        cbFirst.setOnClickListener {
            if (cbFirst.isChecked) {
                if (rBtnRed.isChecked) {
                    activityInterface.ActivityInterface(1)
                }
                if (rBtnGreen.isChecked) {
                    activityInterface.ActivityInterface(2)
                }
                if (rBtnBlue.isChecked) {
                    activityInterface.ActivityInterface(3)
                }
            } else{
                activityInterface.ActivityInterface(0)
            }
        }
    }
    fun green(){
        cbSecond.setOnClickListener {
            if (cbSecond.isChecked){
                if (rBtnRed.isChecked) {
                    activityTwoInterface.ActivityTwoInterface(1)
                }
                if (rBtnGreen.isChecked) {
                    activityTwoInterface.ActivityTwoInterface(2)
                }
                if (rBtnBlue.isChecked) {
                    activityTwoInterface.ActivityTwoInterface(3)
                }
            } else {
                activityTwoInterface.ActivityTwoInterface(0)
            }
        }
    }
    fun blue(){
        cbThird.setOnClickListener {
            if (cbThird.isChecked) {
                if (rBtnRed.isChecked) {
                    activityThreeInterface.ActivityThreeInterface(1)
                }
                if (rBtnGreen.isChecked) {
                    activityThreeInterface.ActivityThreeInterface(2)
                }
                if (rBtnBlue.isChecked) {
                    activityThreeInterface.ActivityThreeInterface(3)
                }
            } else {
                activityThreeInterface.ActivityThreeInterface(0)
            }
        }
    }
}
