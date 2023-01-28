package com.books.books.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Author {
    @Id
    private int authorId;
    private String authorName;
    private String authorDescription;

    public Author() {
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorDescription() {
        return authorDescription;
    }

    public void setAuthorDescription(String authorDescription) {
        this.authorDescription = authorDescription;
    }

    public Author(int authorId, String authorName, String authorDescription) {
        this.authorId = authorId;
        this.authorName = authorName;
        this.authorDescription = authorDescription;
    }

    @Override
    public String toString() {
        return "Author{" +
                "authorId=" + authorId +
                ", authorName='" + authorName + '\'' +
                ", authorDescription='" + authorDescription + '\'' +
                '}';
    }
}
