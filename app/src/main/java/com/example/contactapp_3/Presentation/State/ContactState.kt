package com.example.contactapp_3.Presentation.State

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import com.example.contactapp_3.Data.Tables.Contact
import androidx.compose.runtime.remember

data class ContactState (
    val contactList: List<Contact> = emptyList(),
    val id: MutableState<Int?> = mutableStateOf(null),
    val name: MutableState<String> = mutableStateOf(""),
    val phoneNumber: MutableState<String> = mutableStateOf(""),
    val email: MutableState<String> = mutableStateOf(""),
    val dob: MutableState<Long?> = mutableStateOf(null),
    val image: MutableState<ByteArray?> = mutableStateOf(null)
    )