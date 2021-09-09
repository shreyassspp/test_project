package com.example.newsreporter;

public class News {
    private String mTitle;
    private String mSection;
    private String mDate;
    private String mAuthor;
    private String mURL;

    public News (String title, String section,String date, String author, String url)
    {
        mTitle = title;
        mSection = section;
        mDate = date;
        mAuthor = author;
        mURL = url;
    }
    public String getmAuthor()
    {
        return mAuthor;
    }

    public String getmDate() {
        return mDate;
    }

    public String getmSection() {
        return mSection;
    }

    public String getmTitle() {
        return mTitle;
    }

    public String getmURL() {
        return mURL;
    }
}
