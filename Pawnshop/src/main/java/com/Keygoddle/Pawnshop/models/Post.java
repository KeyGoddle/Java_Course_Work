package com.Keygoddle.Pawnshop.models;

import javax.persistence.*;

@Entity
@Table(name="posts")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false)

    private String title, anons, full_text;
    @Column(nullable = false)

    private int views;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAnons() {
        return anons;
    }

    public void setAnons(String anons) {
        this.anons = anons;
    }

    public String getFull_text() {
        return full_text;
    }

    public void setFull_text(String full_text) {
        this.full_text = full_text;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }
}
