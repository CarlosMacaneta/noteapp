package com.learning.noteapp.feature_note.presentation.notes

import com.learning.noteapp.feature_note.domain.models.Note
import com.learning.noteapp.feature_note.domain.util.NoteOrder

sealed class NoteEvent {
    data class Order(val noteOrder : NoteOrder) : NoteEvent()
    data class DeleteNote(val note: Note): NoteEvent()
    object RestoreEvent: NoteEvent()
    object ToggleOrderSection: NoteEvent()
}
