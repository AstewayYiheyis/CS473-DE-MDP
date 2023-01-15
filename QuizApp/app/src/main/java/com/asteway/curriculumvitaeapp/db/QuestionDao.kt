package com.asteway.curriculumvitaeapp.db

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface QuestionDao {
    @Insert
    fun addQuestion(question: Question)
    @Query("SELECT * FROM QUESTION ORDER BY id")
    fun getAllQuestions():List<Question>
    @Update
    fun updateQuestion(question:Question)
    @Delete
    fun deleteQuestion(question: Question)
}