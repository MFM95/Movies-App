package com.example.movies_algorithms_fawzy.Features.MoviesFeature.Data.DataClasses;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b9\b\u0086\b\u0018\u00002\u00020\u0001B{\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0002\u0010\u0012J\t\u00103\u001a\u00020\u0003H\u00c6\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\t\u00105\u001a\u00020\u000bH\u00c6\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\t\u00107\u001a\u00020\u0003H\u00c6\u0003J\t\u00108\u001a\u00020\u0006H\u00c6\u0003J\t\u00109\u001a\u00020\bH\u00c6\u0003J\t\u0010:\u001a\u00020\u0006H\u00c6\u0003J\t\u0010;\u001a\u00020\u000bH\u00c6\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\t\u0010=\u001a\u00020\u000bH\u00c6\u0003J\t\u0010>\u001a\u00020\u000bH\u00c6\u0003J\u0087\u0001\u0010?\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000bH\u00c6\u0001J\u0013\u0010@\u001a\u00020\b2\b\u0010A\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010B\u001a\u00020\u0003H\u00d6\u0001J\t\u0010C\u001a\u00020\u000bH\u00d6\u0001R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R \u0010\u000f\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001e\u0010\r\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0018\"\u0004\b \u0010\u001aR\u001e\u0010\u000e\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0018\"\u0004\b\"\u0010\u001aR \u0010\u0011\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0018\"\u0004\b$\u0010\u001aR\u001e\u0010\t\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(R \u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0018\"\u0004\b*\u0010\u001aR\u001e\u0010\u0010\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0018\"\u0004\b,\u0010\u001aR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0018\"\u0004\b.\u0010\u001aR\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u0010&\"\u0004\b0\u0010(R\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u001c\"\u0004\b2\u0010\u001e\u00a8\u0006D"}, d2 = {"Lcom/example/movies_algorithms_fawzy/Features/MoviesFeature/Data/DataClasses/MovieData;", "", "id", "", "voteCount", "voteAverage", "", "adult", "", "popularity", "title", "", "posterPath", "originalLanguage", "originalTitle", "backdropPath", "releaseDate", "overview", "(IIDZDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAdult", "()Z", "setAdult", "(Z)V", "getBackdropPath", "()Ljava/lang/String;", "setBackdropPath", "(Ljava/lang/String;)V", "getId", "()I", "setId", "(I)V", "getOriginalLanguage", "setOriginalLanguage", "getOriginalTitle", "setOriginalTitle", "getOverview", "setOverview", "getPopularity", "()D", "setPopularity", "(D)V", "getPosterPath", "setPosterPath", "getReleaseDate", "setReleaseDate", "getTitle", "setTitle", "getVoteAverage", "setVoteAverage", "getVoteCount", "setVoteCount", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "app_debug"})
public final class MovieData {
    @com.google.gson.annotations.SerializedName(value = "id")
    private int id;
    @com.google.gson.annotations.SerializedName(value = "vote_count")
    private int voteCount;
    @com.google.gson.annotations.SerializedName(value = "vote_average")
    private double voteAverage;
    @com.google.gson.annotations.SerializedName(value = "adult")
    private boolean adult;
    @com.google.gson.annotations.SerializedName(value = "popularity")
    private double popularity;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "title")
    private java.lang.String title;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "poster_path")
    private java.lang.String posterPath;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "original_language")
    private java.lang.String originalLanguage;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "original_title")
    private java.lang.String originalTitle;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "backdrop_path")
    private java.lang.String backdropPath;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "release_date")
    private java.lang.String releaseDate;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "overview")
    private java.lang.String overview;
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
    
    public final int getVoteCount() {
        return 0;
    }
    
    public final void setVoteCount(int p0) {
    }
    
    public final double getVoteAverage() {
        return 0.0;
    }
    
    public final void setVoteAverage(double p0) {
    }
    
    public final boolean getAdult() {
        return false;
    }
    
    public final void setAdult(boolean p0) {
    }
    
    public final double getPopularity() {
        return 0.0;
    }
    
    public final void setPopularity(double p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitle() {
        return null;
    }
    
    public final void setTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPosterPath() {
        return null;
    }
    
    public final void setPosterPath(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOriginalLanguage() {
        return null;
    }
    
    public final void setOriginalLanguage(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOriginalTitle() {
        return null;
    }
    
    public final void setOriginalTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getBackdropPath() {
        return null;
    }
    
    public final void setBackdropPath(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getReleaseDate() {
        return null;
    }
    
    public final void setReleaseDate(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getOverview() {
        return null;
    }
    
    public final void setOverview(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public MovieData(int id, int voteCount, double voteAverage, boolean adult, double popularity, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.Nullable()
    java.lang.String posterPath, @org.jetbrains.annotations.NotNull()
    java.lang.String originalLanguage, @org.jetbrains.annotations.NotNull()
    java.lang.String originalTitle, @org.jetbrains.annotations.Nullable()
    java.lang.String backdropPath, @org.jetbrains.annotations.NotNull()
    java.lang.String releaseDate, @org.jetbrains.annotations.Nullable()
    java.lang.String overview) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int component2() {
        return 0;
    }
    
    public final double component3() {
        return 0.0;
    }
    
    public final boolean component4() {
        return false;
    }
    
    public final double component5() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.movies_algorithms_fawzy.Features.MoviesFeature.Data.DataClasses.MovieData copy(int id, int voteCount, double voteAverage, boolean adult, double popularity, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.Nullable()
    java.lang.String posterPath, @org.jetbrains.annotations.NotNull()
    java.lang.String originalLanguage, @org.jetbrains.annotations.NotNull()
    java.lang.String originalTitle, @org.jetbrains.annotations.Nullable()
    java.lang.String backdropPath, @org.jetbrains.annotations.NotNull()
    java.lang.String releaseDate, @org.jetbrains.annotations.Nullable()
    java.lang.String overview) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}