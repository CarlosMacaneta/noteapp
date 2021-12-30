package com.learning.noteapp.feature_note.domain.repository

import com.learning.noteapp.feature_note.domain.models.Note
import kotlinx.coroutines.flow.Flow

interface NoteRepository {

    fun getNotes(): Flow<List<Note>>

    suspend fun getNoteById(id: Int): Note?

    suspend fun create(note: Note)

    suspend fun destroy(note: Note)
}