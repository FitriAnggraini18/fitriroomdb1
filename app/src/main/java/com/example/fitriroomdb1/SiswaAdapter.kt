package com.example.fitriroomdb1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.fitriroomdb1.room.Tbsiswa
import kotlinx.android.synthetic.main.activity_edit.view.*

class Adapter (private val :ArrayList<Tbsiswa>) :RecyclerView.Adapter<ViewHolder>() {
    class SiswaViewHolder(val view: View) : RecyclerView.ViewHolder(view){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SiswaViewHolder {
        return SiswaViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.activity__adapter,parent,false)
        )
    }

    override fun onBindViewHolder(holder: SiswaViewHolder, position: Int) {
        val tbsis =[position]
        holder.view.et_nama.text =
    }

    override fun getItemCount() =
    }


}
