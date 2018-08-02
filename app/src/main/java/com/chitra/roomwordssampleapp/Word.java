package com.chitra.roomwordssampleapp;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity(tableName = "word_table")
public class Word {
    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "word")
    private String mWord;

    public Word(String word) {
        mWord = word;
    }

    public String getWord() {
        return mWord;
    }

    public void setWord(@NonNull String mWord) {
        this.mWord = mWord;
    }
}
