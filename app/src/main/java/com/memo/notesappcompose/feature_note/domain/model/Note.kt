package com.memo.notesappcompose.feature_note.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.memo.notesappcompose.ui.theme.BabyBlue
import com.memo.notesappcompose.ui.theme.LightGreen
import com.memo.notesappcompose.ui.theme.RedOrange
import com.memo.notesappcompose.ui.theme.RedPink
import com.memo.notesappcompose.ui.theme.Violet

@Entity
data class Note(
    val title: String,
    val content: String,
    val timestamp: Long,
    val color: Int,
    @PrimaryKey val id: Int? = null
){
    companion object{
        val noteColors = listOf(RedOrange, LightGreen, Violet, BabyBlue, RedPink)
    }
    class InvalidNoteException(message: String): Exception(message)
}
