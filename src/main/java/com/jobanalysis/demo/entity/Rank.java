package com.jobanalysis.demo.entity;

public class Rank {
    private Integer id;

    private Integer userID;

    private Integer movieID;

    private Integer score;

    private String comment;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public Integer getMovieID() {
        return movieID;
    }

    public void setMovieID(Integer movieID) {
        this.movieID = movieID;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

    @Override
    public String toString() {
        return "Rank{" +
                "id=" + id +
                ", userID=" + userID +
                ", movieID=" + movieID +
                ", score=" + score +
                ", comment='" + comment + '\'' +
                '}';
    }
}