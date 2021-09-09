package com.example.newsreporter;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;

public class NewsViewModel extends ViewModel {
    private MutableLiveData<List<News>> news;
    public LiveData<List<News>> getNews() {
        if (news == null) {
            news = new MutableLiveData<List<News>>();
            loadNews();
        }
        return news;
    }

    private void loadNews() {
        // Do an asynchronous operation to fetch users.
        //Use retrofit.
    }
}

