package com.example.act9.Repositori

import com.example.act9.Data.Siswa
import com.example.act9.Data.SiswaDao
import kotlinx.coroutines.flow.Flow

class OflineRepositoriSiswa(private val siswaDao: SiswaDao) : RepositoriSiswa{
    override fun getAllSiswaStream(): Flow<List<Siswa>> = siswaDao.getAllSiswa()
    override fun getSiswaStream(id: Int): Flow<Siswa?> = siswaDao.getSiswa(id)
    override suspend fun insertSiswa(siswa: Siswa) = siswaDao.insert(siswa)
    override suspend fun deleteSiswa(siswa: Siswa) = siswaDao.delete(siswa)
    override suspend fun updateSiswa(siswa: Siswa) = siswaDao.update(siswa)
}