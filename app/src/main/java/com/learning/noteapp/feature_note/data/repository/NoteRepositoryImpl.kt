package com.learning.noteapp.feature_note.data.repository

import com.learning.noteapp.feature_note.data.data_source.NoteDao
import com.learning.noteapp.feature_note.domain.models.Note
import com.learning.noteapp.feature_note.domain.repository.NoteRepository
import kotlinx.coroutines.flow.Flow

class NoteRepositoryImpl(
    private val noteDao: NoteDao
) : NoteRepository {
    override fun getNotes(): Flow<List<Note>> {
        return noteDao.getNotes()
    }

    override suspend fun getNoteById(id: Int): Note? {
        return noteDao.getNoteById(id)
    }

    override suspend fun create(note: Note) {
        noteDao.create(note)
    }

    override suspend fun destroy(note: Note) {
        noteDao.destroy(note)
    }
}