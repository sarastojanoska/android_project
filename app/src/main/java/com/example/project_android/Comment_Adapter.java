package com.example.project_android;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Comment_Adapter extends RecyclerView.Adapter<Comment_Adapter.CommentViewHolder> {
    private ArrayList<Comment> mCommentList;

    public static class CommentViewHolder extends RecyclerView.ViewHolder {

        public TextView mTextView1;
        public TextView mTextView2;

        public CommentViewHolder(@NonNull View itemView) {
            super(itemView);
            mTextView1 = itemView.findViewById(R.id.textview);
            mTextView2 = itemView.findViewById(R.id.textview2);
        }
    }


    public Comment_Adapter(ArrayList<Comment> List){
        mCommentList=List;
    }


    @NonNull
    @Override
    public CommentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.comment_card, parent, false);


        CommentViewHolder evh = new CommentViewHolder(v);
        return evh;
    }

    @Override
    public void onBindViewHolder(@NonNull CommentViewHolder holder, int position) {
        Comment currentItem=mCommentList.get(position);


        holder.mTextView1.setText(currentItem.getmText1());
        holder.mTextView2.setText(currentItem.getmText2());
    }

    @Override
    public int getItemCount() {

        return mCommentList.size();
    }


}

