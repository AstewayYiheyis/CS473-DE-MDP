package com.asteway.curriculumvitaeapp.db

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Question(
    @PrimaryKey(autoGenerate = true)
    val id:Int,
    val question: String,
    val choices: String,
    val correctChoice: String
)
