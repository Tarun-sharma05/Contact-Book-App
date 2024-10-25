package com.example.contactapp_3.Data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.contactapp_3.Data.Dao.ContactDao
import com.example.contactapp_3.Data.Tables.Contact

@Database(entities = arrayOf(Contact::class), version = 2, exportSchema = true)
abstract class AppDatabase : RoomDatabase(){
     abstract fun contactDao(): ContactDao


}