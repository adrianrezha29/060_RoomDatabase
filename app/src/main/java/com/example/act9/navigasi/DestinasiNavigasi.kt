package com.example.act9.navigasi

interface DestinasiNavigasi {
    /**
     * Nama unik untuk menentukan jalur composable
     */
    val route: String

    /**
     * String resource id yang berisi judul yang akan ditampilkan di layar halaman
     */
    val titleRes: Int
}