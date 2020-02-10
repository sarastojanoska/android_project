package com.example.project_android;

public class Mountain_peak {
    private String Name;
    private String Mountain_region;
    private String Description;
    private int Thumbnail;
    private int Thumbnail2;

    public Mountain_peak() {
    }

    public Mountain_peak(String name, String mountain_region, String description, int thumbnail,int thumbnail2) {
        Name = name;
        Mountain_region = mountain_region;
        Description = description;
        Thumbnail = thumbnail;
        Thumbnail2 = thumbnail2;
    }

    public String getName() {
        return Name;
    }

    public String getMountain_region() {
        return Mountain_region;
    }

    public String getDescription() {
        return Description;
    }

    public int getThumbnail() {
        return Thumbnail;
    }
    public int getThumbnail2() {
        return Thumbnail2;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setMountain_region(String mountain_region) {
        Mountain_region = mountain_region;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void setThumbnail(int thumbnail) {
        Thumbnail = thumbnail;
    }
    public void setThumbnail2(int thumbnail2) {
        Thumbnail = thumbnail2;
    }
}
