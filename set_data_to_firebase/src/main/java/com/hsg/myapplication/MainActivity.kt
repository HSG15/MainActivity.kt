package com.hsg.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.ktx.Firebase
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var database = FirebaseDatabase.getInstance().reference
        button.setOnClickListener {
            var empName = name.text.toString()
            var empId = id.text.toString().toInt()
            var empSalary = salary.text.toString().toInt()

            database.child(empId.toString()).setValue(Employee(empName, empId, empSalary))
        }
    }

}