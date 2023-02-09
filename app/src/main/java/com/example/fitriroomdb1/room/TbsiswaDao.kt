package com.example.fitriroomdb1.room

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

interface TbsiswaDao {

    @Insert
    fun addTbsiswa(tbsiswa: Tbsiswa)
    @Update
    fun updateTbsiswa(tbsiswa: Tbsiswa)
    @Delete
    fun deleteTbsiswa(tbsiswa: Tbsiswa)
    @Query("SELECT*FROM tbsiswa")
    fun getTbsiswa():List<Tbsiswa>

}