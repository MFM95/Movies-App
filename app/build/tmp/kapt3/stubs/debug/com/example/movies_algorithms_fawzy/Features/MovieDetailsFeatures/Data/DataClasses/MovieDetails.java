package com.example.movies_algorithms_fawzy.Features.MovieDetailsFeatures.Data.DataClasses;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b@\u0018\u00002\u00020\u0001B\u00c1\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0005\u0012\u0006\u0010\u0012\u001a\u00020\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0007\u0012\u0006\u0010\u0016\u001a\u00020\u0007\u0012\u0006\u0010\u0017\u001a\u00020\u0007\u0012\u0006\u0010\u0018\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0019R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001e\u0010\u0016\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010&\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R \u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010\u001f\"\u0004\b(\u0010!R\u001e\u0010\b\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R \u0010\t\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u001f\"\u0004\b.\u0010!R\u001e\u0010\u0014\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u001f\"\u0004\b0\u0010!R\u001e\u0010\u0015\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u001f\"\u0004\b2\u0010!R\u001e\u0010\u0017\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u001f\"\u0004\b4\u0010!R\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001e\u0010\u0013\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\u001f\"\u0004\b:\u0010!R\u001e\u0010\u0018\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\u001f\"\u0004\b<\u0010!R\"\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010&\u001a\u0004\b=\u0010#\"\u0004\b>\u0010%R\"\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010&\u001a\u0004\b?\u0010#\"\u0004\b@\u0010%R \u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bA\u0010\u001f\"\u0004\bB\u0010!R\u001e\u0010\u0012\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\u001f\"\u0004\bD\u0010!R\u001e\u0010\u000f\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bE\u0010\u001b\"\u0004\bF\u0010\u001dR\u001e\u0010\u0010\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bG\u00106\"\u0004\bH\u00108R\u001e\u0010\u0011\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bI\u0010*\"\u0004\bJ\u0010,\u00a8\u0006K"}, d2 = {"Lcom/example/movies_algorithms_fawzy/Features/MovieDetailsFeatures/Data/DataClasses/MovieDetails;", "", "adult", "", "budget", "", "homepage", "", "id", "imdbId", "popularity", "", "revenue", "runtime", "tagline", "video", "voteAverage", "voteCount", "title", "posterPath", "originalLanguage", "originalTitle", "backdropPath", "overview", "releaseDate", "(ZLjava/lang/Integer;Ljava/lang/String;ILjava/lang/String;DLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;ZDILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAdult", "()Z", "setAdult", "(Z)V", "getBackdropPath", "()Ljava/lang/String;", "setBackdropPath", "(Ljava/lang/String;)V", "getBudget", "()Ljava/lang/Integer;", "setBudget", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getHomepage", "setHomepage", "getId", "()I", "setId", "(I)V", "getImdbId", "setImdbId", "getOriginalLanguage", "setOriginalLanguage", "getOriginalTitle", "setOriginalTitle", "getOverview", "setOverview", "getPopularity", "()D", "setPopularity", "(D)V", "getPosterPath", "setPosterPath", "getReleaseDate", "setReleaseDate", "getRevenue", "setRevenue", "getRuntime", "setRuntime", "getTagline", "setTagline", "getTitle", "setTitle", "getVideo", "setVideo", "getVoteAverage", "setVoteAverage", "getVoteCount", "setVoteCount", "app_debug"})
public final class MovieDetails {
    @com.google.gson.annotations.SerializedName(value = "adult")
    private boolean adult;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "budget")
    private java.lang.Integer budget;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "homepage")
    private java.lang.String homepage;
    @com.google.gson.annotations.SerializedName(value = "id")
    private int id;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "imdb_id")
    private java.lang.String imdbId;
    @com.google.gson.annotations.SerializedName(value = "popularity")
    private double popularity;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "revenue")
    private java.lang.Integer revenue;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "runtime")
    private java.lang.Integer runtime;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "tagline")
    private java.lang.String tagline;
    @com.google.gson.annotations.SerializedName(value = "video")
    private boolean video;
    @com.google.gson.annotations.SerializedName(value = "vote_average")
    private double voteAverage;
    @com.google.gson.annotations.SerializedName(value = "vote_count")
    private int voteCount;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "title")
    private java.lang.String title;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "poster_path")
    private java.lang.String posterPath;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "original_language")
    private java.lang.String originalLanguage;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "original_title")
    private java.lang.String originalTitle;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "backdrop_path")
    private java.lang.String backdropPath;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "overview")
    private java.lang.String overview;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "release_date")
    private java.lang.String releaseDate;
    
    public final boolean getAdult() {
        return false;
    }
    
    public final void setAdult(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getBudget() {
        return null;
    }
    
    public final void setBudget(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getHomepage() {
        return null;
    }
    
    public final void setHomepage(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getImdbId() {
        return null;
    }
    
    public final void setImdbId(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final double getPopularity() {
        return 0.0;
    }
    
    public final void setPopularity(double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getRevenue() {
        return null;
    }
    
    public final void setRevenue(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getRuntime() {
        return null;
    }
    
    public final void setRuntime(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTagline() {
        return null;
    }
    
    public final void setTagline(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final boolean getVideo() {
        return false;
    }
    
    public final void setVideo(boolean p0) {
    }
    
    public final double getVoteAverage() {
        return 0.0;
    }
    
    public final void setVoteAverage(double p0) {
    }
    
    public final int getVoteCount() {
        return 0;
    }
    
    public final void setVoteCount(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitle() {
        return null;
    }
    
    public final void setTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPosterPath() {
        return null;
    }
    
    public final void setPosterPath(@org.jetbrains.annotations.NotNull()
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
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBackdropPath() {
        return null;
    }
    
    public final void setBackdropPath(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOverview() {
        return null;
    }
    
    public final void setOverview(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getReleaseDate() {
        return null;
    }
    
    public final void setReleaseDate(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public MovieDetails(boolean adult, @org.jetbrains.annotations.Nullable()
    java.lang.Integer budget, @org.jetbrains.annotations.Nullable()
    java.lang.String homepage, int id, @org.jetbrains.annotations.Nullable()
    java.lang.String imdbId, double popularity, @org.jetbrains.annotations.Nullable()
    java.lang.Integer revenue, @org.jetbrains.annotations.Nullable()
    java.lang.Integer runtime, @org.jetbrains.annotations.Nullable()
    java.lang.String tagline, boolean video, double voteAverage, int voteCount, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String posterPath, @org.jetbrains.annotations.NotNull()
    java.lang.String originalLanguage, @org.jetbrains.annotations.NotNull()
    java.lang.String originalTitle, @org.jetbrains.annotations.NotNull()
    java.lang.String backdropPath, @org.jetbrains.annotations.NotNull()
    java.lang.String overview, @org.jetbrains.annotations.NotNull()
    java.lang.String releaseDate) {
        super();
    }
}