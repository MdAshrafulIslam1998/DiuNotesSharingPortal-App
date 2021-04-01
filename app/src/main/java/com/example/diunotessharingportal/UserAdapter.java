package com.example.diunotessharingportal;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserViewHolder> {

    private Context context;
    private List<User> userList;

    public UserAdapter(Context context, List<User> userList) {
        this.context = context;
        this.userList = userList;
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.user_item,parent,false);
        return new UserViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {


    }

    @Override
    public int getItemCount() {
        return userList.size();
    }


    public class UserViewHolder extends RecyclerView.ViewHolder{
        TextView vtopic,vcourse,vfile,vdate,vuploader;



        public UserViewHolder(@NonNull View itemView) {
            super(itemView);
            vtopic = itemView.findViewById(R.id.ttopic);
            vcourse = itemView.findViewById(R.id.textView4);
            vfile = itemView.findViewById(R.id.textView2);
            vdate = itemView.findViewById(R.id.textView5);
            vuploader = itemView.findViewById(R.id.textView);

        }
    }
}

