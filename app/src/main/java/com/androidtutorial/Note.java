package com.androidtutorial;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "note_table")
public class Note {

    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "title_column")
    private String title;

    @ColumnInfo(name = "des_column")
    private String description;

    @ColumnInfo(name = "piority_column")
    private int piority;

    public Note(String title, String description, int piority) {
        this.title = title;
        this.description = description;
        this.piority = piority;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getPiority() {
        return piority;
    }
}
