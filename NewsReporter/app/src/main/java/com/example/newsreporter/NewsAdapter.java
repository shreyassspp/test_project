package com.example.newsreporter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class NewsAdapter extends ArrayAdapter<News> {

    private static class ViewHolder {
        TextView Title;
        TextView section;
        TextView date;
        TextView author;
    }

    public NewsAdapter(Context context, ArrayList<News> newsArrayList) {
        super(context, R.layout.list_item, newsArrayList);
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        //Get news for this position
        News news_item = getItem(position);

        // Check if an existing view is being reused, otherwise inflate the view
        ViewHolder viewHolder; // view lookup cache stored in tag

        //Check if View already exists or not.
        if (convertView == null) {

            viewHolder = new ViewHolder();
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
            viewHolder.Title = convertView.findViewById(R.id.article_title);
            viewHolder.section = convertView.findViewById(R.id.article_section);
            viewHolder.date =  convertView.findViewById(R.id.article_date);
            viewHolder.author = convertView.findViewById(R.id.article_author);
        }
        else
        {
            // View is being recycled, retrieve the viewHolder object from tag
            viewHolder = (ViewHolder) convertView.getTag();
        }
        // Populate the data from the data object via the viewHolder object
        // into the template view.
        viewHolder.Title.setText(news_item.getmTitle());
        viewHolder.section.setText(news_item.getmSection());
        viewHolder.date.setText(news_item.getmDate());
        viewHolder.author.setText(news_item.getmAuthor());

        // Return the completed view to render on screen
        return  convertView;
    }
}
