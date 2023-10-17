package com.tjlab.listviewpractice_genie.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.tjlab.listviewpractice_genie.R
import com.tjlab.listviewpractice_genie.datas.Student

class StudentAdapter(
    val mContext : Context,
    val resId : Int,
    val mList : ArrayList<Student>) : ArrayAdapter<Student>(mContext, resId, mList) {

    val inf = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        //return super.getView(position, convertView, parent)
        var tempRow = convertView
        if (tempRow == null) {
            tempRow = inf.inflate(R.layout.student_list_item, null)
        }
        val row = tempRow!!
        val studentData = mList[position]
        val nameTxt = row.findViewById<TextView>(R.id.nameTxt)
        val birthYearTxt = row.findViewById<TextView>(R.id.birthYearTxt)

        nameTxt.text = studentData.name
        //birthYearTxt.text = "(${studentData.birthYear}년생)"

        val koreaAge = 2023 - studentData.birthYear
        birthYearTxt.text = "${koreaAge}세"

        return row
    }
}