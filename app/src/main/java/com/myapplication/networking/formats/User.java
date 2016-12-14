package com.myapplication.networking.formats;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Phil on 14/12/2016.
 */

public class User {

    @SerializedName("id")
    String id;
    @SerializedName("username")
    String username;
    @SerializedName("name")
    String name;
    @SerializedName("first_name")
    String first_name;
    @SerializedName("last_name")
    String last_name;
    @SerializedName("portfolio_url")
    String portfolio_url;
    @SerializedName("bio")
    String bio;
    @SerializedName("location")
    String location;
    @SerializedName("total_likes")
    int total_likes;
    @SerializedName("total_photos")
    int total_photos;
    @SerializedName("total_collections")
    int total_collections;
    @SerializedName("profile_image")
    ProfileImage profile_image;
    @SerializedName("links")
    Links links;

    public void setId(String id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setPortfolio_url(String portfolio_url) {
        this.portfolio_url = portfolio_url;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setTotal_likes(int total_likes) {
        this.total_likes = total_likes;
    }

    public void setTotal_photos(int total_photos) {
        this.total_photos = total_photos;
    }

    public void setTotal_collections(int total_collections) {
        this.total_collections = total_collections;
    }

    public void setProfile_image(ProfileImage profile_image) {
        this.profile_image = profile_image;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

    public String getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getName() {
        return name;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getPortfolio_url() {
        return portfolio_url;
    }

    public String getBio() {
        return bio;
    }

    public String getLocation() {
        return location;
    }

    public int getTotal_likes() {
        return total_likes;
    }

    public int getTotal_photos() {
        return total_photos;
    }

    public int getTotal_collections() {
        return total_collections;
    }

    public ProfileImage getProfile_image() {
        return profile_image;
    }

    public Links getLinks() {
        return links;
    }

    /**
     * Inner Classes
     */

    public class ProfileImage {
        @SerializedName("small")
        String small;
        @SerializedName("medium")
        String medium;
        @SerializedName("large")
        String large;

        public void setSmall(String small) {
            this.small = small;
        }

        public void setMedium(String medium) {
            this.medium = medium;
        }

        public void setLarge(String large) {
            this.large = large;
        }

        public String getSmall() {
            return small;
        }

        public String getMedium() {
            return medium;
        }

        public String getLarge() {
            return large;
        }
    }

    public class Links {
        @SerializedName("self")
        String self;
        @SerializedName("html")
        String html;
        @SerializedName("photos")
        String photos;
        @SerializedName("likes")
        String likes;
        @SerializedName("portfolio")
        String portfolio;
        @SerializedName("following")
        String following;
        @SerializedName("followers")
        String followers;

        public void setSelf(String self) {
            this.self = self;
        }

        public void setHtml(String html) {
            this.html = html;
        }

        public void setPhotos(String photos) {
            this.photos = photos;
        }

        public void setLikes(String likes) {
            this.likes = likes;
        }

        public void setPortfolio(String portfolio) {
            this.portfolio = portfolio;
        }

        public void setFollowing(String following) {
            this.following = following;
        }

        public void setFollowers(String followers) {
            this.followers = followers;
        }

        public String getSelf() {
            return self;
        }

        public String getHtml() {
            return html;
        }

        public String getPhotos() {
            return photos;
        }

        public String getLikes() {
            return likes;
        }

        public String getPortfolio() {
            return portfolio;
        }

        public String getFollowing() {
            return following;
        }

        public String getFollowers() {
            return followers;
        }
    }
}
