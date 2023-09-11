package com.example.recyclerviewexample

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class StudentAdapter(private val studentList:ArrayList<student_model>):RecyclerView.Adapter<StudentAdapter.StudentViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StudentViewHolder {
        val itemView=LayoutInflater.from(parent.context).inflate(R.layout.main_rv,parent,false)
        return  StudentViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return  studentList.size
    }

    override fun onBindViewHolder(holder: StudentViewHolder, position: Int) {
      holder.firstName.text=studentList[position].firstName
      holder.courseName.text=studentList[position].courseName
    }


    class StudentViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
        val firstName=itemView.findViewById<TextView>(R.id.tvFirstName)
        val courseName=itemView.findViewById<TextView>(R.id.tvCourseName)
    }
}