package com.tjlab.listviewpractice_genie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tjlab.listviewpractice_genie.adapters.StudentAdapter
import com.tjlab.listviewpractice_genie.databinding.ActivityMainBinding
import com.tjlab.listviewpractice_genie.datas.Student

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding

    val mStudentList = ArrayList<Student>()
    lateinit var mAdapter : StudentAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        mStudentList.add( Student("코딩티쳐 지니", 1988) )
        mStudentList.add( Student("김민상", 1995) )
        mStudentList.add( Student("조상민", 1975) )
        mStudentList.add( Student("이영희", 1996) )
        mStudentList.add( Student("박철수", 2000) )
        mStudentList.add( Student("정민규", 1984) )
        mStudentList.add( Student("정소영", 1962) )

        mAdapter = StudentAdapter(this, R.layout.student_list_item, mStudentList)

        binding.studentListView.adapter = mAdapter
    }
}