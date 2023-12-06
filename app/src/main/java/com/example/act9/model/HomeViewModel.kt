package com.example.act9.model

import androidx.lifecycle.ViewModel
import com.example.act9.Data.Siswa
import com.example.act9.Repositori.RepositoriSiswa

class HomeViewModel (private val repositoriSiswa: RepositoriSiswa): ViewModel() {
    companion object {
        private const val TIMEOUT_MILLIS = 5_000L
    }
    data class HomeUiState(
        val listSiswa: List<Siswa> = listOf()
    )
}