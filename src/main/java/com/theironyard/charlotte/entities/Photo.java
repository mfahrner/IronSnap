package com.theironyard.charlotte.entities;

import javax.persistence.*;

@Entity
@Table(name = "photos")
public class Photo {
    @Id
    @GeneratedValue
    int id;

    @ManyToOne
    User sender;

    @ManyToOne
    User recipient;

    @Column(nullable = false)
    String filename;

    @Column(nullable = false)
    Integer photoSeconds;

    @Column(nullable = true)
    boolean publicPhoto;

    public Photo() {
    }

    public Photo(User sender, User recipient, String filename) {
        this.sender = sender;
        this.recipient = recipient;
        this.filename = filename;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getSender() {
        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public User getRecipient() {
        return recipient;
    }

    public void setRecipient(User recipient) {
        this.recipient = recipient;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public Integer getPhotoSeconds() {
        return photoSeconds;
    }

    public void setPhotoSeconds(Integer photoSeconds) {
        this.photoSeconds = photoSeconds;
    }

    public boolean isPublicPhoto() {
        return publicPhoto;
    }

    public void setPublicPhoto(boolean publicPhoto) {
        this.publicPhoto = publicPhoto;
    }
}
