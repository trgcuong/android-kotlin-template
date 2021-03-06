package com.template.kotlintemplate.database

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import com.givestech.data.Repository

@Database(entities = [Repository::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
  abstract fun repositoryDao(): RepositoryDAO
}