package com.example.recyclerviewexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var studentRv: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val student_list =ArrayList<student_model>()
        student_list.add(student_model("Ahmad","Flutter"))
        student_list.add(student_model("Yousaf","Android"))
        student_list.add(student_model("Hunain","Flutter"))
        student_list.add(student_model("Faisal","Android"))
        student_list.add(student_model("Ahmad","Flutter"))
        student_list.add(student_model("Yousaf","Android"))
        student_list.add(student_model("Hunain","Flutter"))
        student_list.add(student_model("Faisal","Android"))
        student_list.add(student_model("Ahmad","Flutter"))
        student_list.add(student_model("Yousaf","Android"))
        student_list.add(student_model("Hunain","Flutter"))
        student_list.add(student_model("Faisal","Android"))
        studentRv = findViewById(R.id.mainActivityRV)
        studentRv.adapter=StudentAdapter(student_list)
        studentRv.layoutManager = LinearLayoutManager(this)
        studentRv.setHasFixedSize(true)

    }
}