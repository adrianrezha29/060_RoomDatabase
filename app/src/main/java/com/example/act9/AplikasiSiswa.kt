package com.example.act9

import android.app.Application
import com.example.act9.Repositori.ContainerApp
import com.example.act9.Repositori.ContainerDataApp

class AplikasiSiswa : Application(){
    /**
     * AppContainer instance digunakan oleh kelas-kelas lainnya untuk mendapatkan dependensi
     */
    lateinit var container : ContainerApp

    override fun onCreate(){
        super.onCreate()
        container = ContainerDataApp(this)
    }
}