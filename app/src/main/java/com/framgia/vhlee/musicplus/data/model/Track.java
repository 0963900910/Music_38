package com.framgia.vhlee.musicplus.data.model;

public class Track {
    private int mId;
    private String mTitle;
    private int mDuration;
    private String mGenre;
    private String mDescription;
    private String mStremUrl;
    private String mDownloadUrl;
    private boolean mIsDownloadable;
    private String mArtist;
    private String mAlbumTitle;
    private String mArtworkUrl;

    public Track(int id, String title, String artist) {
        mId = id;
        mTitle = title;
        mArtist = artist;
    }

    public int getId() {
        return mId;
    }

    public Track setId(int id) {
        mId = id;
        return this;
    }

    public String getTitle() {
        return mTitle;
    }

    public Track setTitle(String title) {
        mTitle = title;
        return this;
    }

    public int getDuration() {
        return mDuration;
    }

    public Track setDuration(int duration) {
        mDuration = duration;
        return this;
    }

    public String getGenre() {
        return mGenre;
    }

    public Track setGenre(String genre) {
        mGenre = genre;
        return this;
    }

    public String getDescription() {
        return mDescription;
    }

    public Track setDescription(String description) {
        mDescription = description;
        return this;
    }

    public String getStremUrl() {
        return mStremUrl;
    }

    public Track setStremUrl(String stremUrl) {
        mStremUrl = stremUrl;
        return this;
    }

    public String getDownloadUrl() {
        return mDownloadUrl;
    }

    public Track setDownloadUrl(String downloadUrl) {
        mDownloadUrl = downloadUrl;
        return this;
    }

    public boolean isDownloadable() {
        return mIsDownloadable;
    }

    public Track setDownloadable(boolean downloadable) {
        mIsDownloadable = downloadable;
        return this;
    }

    public String getArtist() {
        return mArtist;
    }

    public Track setArtist(String artist) {
        mArtist = artist;
        return this;
    }

    public String getAlbumTitle() {
        return mAlbumTitle;
    }

    public Track setAlbumTitle(String albumTitle) {
        mAlbumTitle = albumTitle;
        return this;
    }

    public String getArtworkUrl() {
        return mArtworkUrl;
    }

    public Track setArtworkUrl(String artworkUrl) {
        mArtworkUrl = artworkUrl;
        return this;
    }
}