package com.learning.noteapp.feature_note.domain.use_case

import com.learning.noteapp.feature_note.domain.models.InvalidNoteException
import com.learning.noteapp.feature_note.domain.models.Note
import com.learning.noteapp.feature_note.domain.repository.NoteRepository
import kotlin.jvm.Throws

class AddNote(
    private val repository: NoteRepository
) {
    @Throws(InvalidNoteException::class)
    suspend operator fun invoke(note: Note) {
        if (note.title.isBlank()) throw InvalidNoteException("O título não pode ser um campo vazio.")
        if (note.content.isBlank()) throw InvalidNoteException("A descrição não pode ser um campo vazio.")
        repository.create(note)
    }
}