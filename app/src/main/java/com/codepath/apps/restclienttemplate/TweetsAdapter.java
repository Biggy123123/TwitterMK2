package com.codepath.apps.restclienttemplate;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.codepath.apps.restclienttemplate.models.Tweet;

import java.util.List;

public class TweetsAdapter extends RecyclerView.Adapter<TweetsAdapter.viewHolder> {
    @NonNull
    Context context;
    List<Tweet> tweets;
    // Pass in the context and the list of tweets

    public TweetsAdapter(Context context,List<Tweet> tweets){
        this.context=context;
        this.tweets=tweets;
    }
    //for each a row, inflate the layout
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View View = LayoutInflater.from(context).inflate(R.layout.item_tweet, parent, false);
        return new viewHolder(View);
    }
    //Bind  values based on the position of the element
    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
//Get data at position
        Tweet tweet = tweets.get(position);
        // Bind the tweet with view holder
        holder.bind(tweet);
    }

    @Override
    public int getItemCount() {
        return tweets.size();
    }
    //Clean all element of recycler view
    public void clear(){
        tweets.clear();
        notifyDataSetChanged();
    }
    //Add a list of item
    public void addAll(List<Tweet> tweetsList){
        tweets.addAll(tweetsList);
        notifyDataSetChanged();

    }
    // Define  a viewHolder
    public class viewHolder extends RecyclerView.ViewHolder{
        ImageView ivProfileImage;
        TextView tvBody;
        TextView tvScreenName;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            ivProfileImage =itemView.findViewById(R.id.ivProfileImage);
            tvBody =itemView.findViewById(R.id.tvBody);
            tvScreenName =itemView.findViewById(R.id.tvScreenName);
        }

        public void bind(Tweet tweet) {
            tvBody.setText(tweet.body);
            tvScreenName.setText(tweet.user.screenName);
            Glide.with(context).load(tweet.user.profileImageUrl).into(ivProfileImage);
        }
    }
}

