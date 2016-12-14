package com.myapplication.networking.formats;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Phil on 14/12/2016.
 */

public class Photo {
    @SerializedName("id")
    String id;
    @SerializedName("created_at")
    String created_at;
    @SerializedName("width")
    int width;
    @SerializedName("height")
    int height;
    @SerializedName("color")
    String color;
    @SerializedName("likes")
    int likes;
    @SerializedName("liked_by_user")
    boolean liked_by_user;
    @SerializedName("user")
    User user;
    @SerializedName("urls")
    Urls urls;
    @SerializedName("links")
    Links links;

    public void setId(String id) {
        this.id = id;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public void setLiked_by_user(boolean liked_by_user) {
        this.liked_by_user = liked_by_user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setUrls(Urls urls) {
        this.urls = urls;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

    public String getId() {
        return id;
    }

    public String getCreated_at() {
        return created_at;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public String getColor() {
        return color;
    }

    public int getLikes() {
        return likes;
    }

    public boolean isLiked_by_user() {
        return liked_by_user;
    }

    public User getUser() {
        return user;
    }


    public Urls getUrls() {
        return urls;
    }

    public Links getLinks() {
        return links;
    }

    /**
     * Inner Classes
     */

    public class Urls {
        @SerializedName("raw")
        String raw;
        @SerializedName("full")
        String full;
        @SerializedName("regular")
        String regular;
        @SerializedName("small")
        String small;
        @SerializedName("thumb")
        String thumb;

        public void setRaw(String raw) {
            this.raw = raw;
        }

        public void setFull(String full) {
            this.full = full;
        }

        public void setRegular(String regular) {
            this.regular = regular;
        }

        public void setSmall(String small) {
            this.small = small;
        }

        public void setThumb(String thumb) {
            this.thumb = thumb;
        }

        public String getRaw() {
            return raw;
        }

        public String getFull() {
            return full;
        }

        public String getRegular() {
            return regular;
        }

        public String getSmall() {
            return small;
        }


        public String getThumb() {
            return thumb;
        }
    }

    public class Links {
        @SerializedName("self")
        String self;
        @SerializedName("html")
        String html;
        @SerializedName("download")
        String download;
        @SerializedName("download_location")
        String download_location;

        public void setSelf(String self) {
            this.self = self;
        }

        public void setHtml(String html) {
            this.html = html;
        }

        public void setDownload(String download) {
            this.download = download;
        }

        public void setDownload_location(String download_location) {
            this.download_location = download_location;
        }

        public String getSelf() {
            return self;
        }

        public String getHtml() {
            return html;
        }

        public String getDownload() {
            return download;
        }

        public String getDownload_location() {
            return download_location;
        }
    }
}
