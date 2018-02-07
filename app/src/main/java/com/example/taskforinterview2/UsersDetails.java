package com.example.taskforinterview2;


import android.graphics.Bitmap;
import android.widget.ImageView;

/**
 * Created by zayed on 07-Feb-18.
 */

public class UsersDetails {
    private int id;
    private String firstName;
    private String lastName;
    private String mobile;
    private String gender;
    private int photo;
    private String url;


    public UsersDetails(int id, String firstName, String lastName, String mobile, String gender, int photo) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobile = mobile;
        this.gender = gender;
        this.photo = photo;
    }

    public UsersDetails(int id, String firstName, String lastName, String mobile, String gender, int photo, String url) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobile = mobile;
        this.gender = gender;
        this.photo = photo;
        this.url=url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }
}
