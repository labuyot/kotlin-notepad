package com.udacity.notepad.data

fun demoDataClasses() {

    val note = Note(text = "This is a note")
    note == note.copy() // this is true

    val aCopy = note.copy(text = "something else...", isPinned = true)
}