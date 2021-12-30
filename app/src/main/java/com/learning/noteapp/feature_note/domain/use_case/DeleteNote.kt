package com.learning.noteapp.feature_note.domain.use_case

import com.learning.noteapp.feature_note.domain.models.Note
import com.learning.noteapp.feature_note.domain.repository.NoteRepository

class DeleteNote(
    private val repository: NoteRepository
) {
    suspend operator fun invoke(note: Note) {
        repository.destroy(note)
    }
}