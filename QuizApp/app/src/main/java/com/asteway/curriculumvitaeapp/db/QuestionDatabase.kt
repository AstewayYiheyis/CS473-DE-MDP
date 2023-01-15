package com.asteway.curriculumvitaeapp.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(
    entities = [Question::class],
    version = 1,
    exportSchema = true
)
abstract class QuestionDatabase() : RoomDatabase(){
    abstract fun questionDao(): QuestionDao

    companion object {

        @Volatile
        private var INSTANCE: QuestionDatabase? = null

        fun getDatabase(context: Context): QuestionDatabase {
            if (INSTANCE == null) {
                synchronized(this) {
                    INSTANCE = buildDatabase(context)
                }
            }
            // Return database.
            return INSTANCE!!
        }

        private fun buildDatabase(context: Context): QuestionDatabase {
            return Room.databaseBuilder(
                context.applicationContext,
                QuestionDatabase::class.java,
                "questions_database"
            )
                .build()
        }
    }
}
