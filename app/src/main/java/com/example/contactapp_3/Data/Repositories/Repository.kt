package com.example.contactapp_3.Data.Repositories

import com.example.contactapp_3.Data.AppDatabase
import com.example.contactapp_3.Data.Tables.Contact
import kotlinx.coroutines.flow.Flow

class Repository(val database: AppDatabase) {

    suspend fun upsertContact(contact: Contact){
        database.contactDao().upsertContact(contact)

    }
    suspend fun deleteContact(contact: Contact){
        database.contactDao().deleteContact(contact)
    }
 fun getAllContacts(): Flow<List<Contact>> {
      return  database.contactDao().getAllContacts()
   }
}