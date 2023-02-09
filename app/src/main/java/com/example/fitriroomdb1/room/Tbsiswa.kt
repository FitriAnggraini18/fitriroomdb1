package com.example.fitriroomdb1.room

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
    data class Tbsiswa (
    @PrimaryKey
    val nis :Int,
    val nama :String,
    val kelas :String,
    val alamat:String,
    )