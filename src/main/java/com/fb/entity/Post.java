package com.fb.entity;
public class Post {
    private Integer id;
    private String title;
    private String content;
    private String img;
    private String date;
    private String personalitytraits;
    private String userName;
    private String newsStatus;
    private String newsLook;
    private String isShow;
    public Post() {
        super();
    }

    public Post(Integer id, String title, String content, String img, String date, String personalitytraits, String userName, String newsStatus, String newsLook, String isShow) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.img = img;
        this.date = date;
        this.personalitytraits = personalitytraits;
        this.userName = userName;
        this.newsStatus = newsStatus;
        this.newsLook = newsLook;
        this.isShow = isShow;
    }

    public Post(Integer id, String title, String content, String img, String date, String personalitytraits, String userName) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.img = img;
        this.date = date;
        this.personalitytraits = personalitytraits;
        this.userName = userName;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImg() {
        return this.img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPersonalitytraits() {
        return this.personalitytraits;
    }

    public void setPersonalitytraits(String personalitytraits) {
        this.personalitytraits = personalitytraits;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getNewsStatus() {
        return newsStatus;
    }

    public void setNewsStatus(String newsStatus) {
        this.newsStatus = newsStatus;
    }

    public String getNewsLook() {
        return newsLook;
    }

    public void setNewsLook(String newsLook) {
        this.newsLook = newsLook;
    }

    public String getIsShow() {
        return isShow;
    }

    public void setIsShow(String isShow) {
        this.isShow = isShow;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", img='" + img + '\'' +
                ", date='" + date + '\'' +
                ", personalitytraits='" + personalitytraits + '\'' +
                ", userName='" + userName + '\'' +
                ", newsStatus='" + newsStatus + '\'' +
                ", newsLook='" + newsLook + '\'' +
                ", isShow='" + isShow + '\'' +
                '}';
    }
}
