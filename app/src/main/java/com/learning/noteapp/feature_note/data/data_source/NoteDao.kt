package com.learning.noteapp.feature_note.data.data_source

import androidx.room.*
import com.learning.noteapp.feature_note.domain.models.Note
import kotlinx.coroutines.flow.Flow

@Dao
interface NoteDao {

    @Query("SELECT * FROM  note")
    fun getNotes(): Flow<List<Note>>

    @Query("SELECT * FROM note WHERE id = :id")
    suspend fun getNoteById(id: Int): Note?

    @Insert(onConflict = OnConflictStrategy.REPLACE) // if a id exists, will update the existing entry...
    suspend fun create(note: Note)

    @Delete
    suspend fun destroy(note: Note)
}