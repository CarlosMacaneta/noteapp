package com.learning.noteapp.feature_note.domain.models

import com.learning.noteapp.feature_note.domain.util.NoteOrder
import com.learning.noteapp.feature_note.domain.util.OrderType

data class NoteState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
)