package com.eni.mod9magasinroom

import androidx.room.*

@Dao
interface ArticleDao {
    @Insert
    fun insert(a: Article)

    @Query("SELECT * FROM Article WHERE id = :id")
    fun getById(id: Long) : Article

    @Query("SELECT * FROM Article")
    fun getAll(): List<Article>

    @Update
    fun update(a:Article)

    @Delete
    fun delete(a:Article)
}