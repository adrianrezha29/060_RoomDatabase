package com.example.act9.Repositori

import android.content.Context
import com.example.act9.Data.DatabaseSiswa

interface ContainerApp {
    val repositoriSiswa : RepositoriSiswa
}
class ContainerDataApp(private val context: Context): ContainerApp{
    override val repositoriSiswa: RepositoriSiswa by lazy {
        OflineRepositoriSiswa(DatabaseSiswa.getDatabase(context).siswaDao())
    }
}