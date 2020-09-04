package com.know.profile;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

class RequestAdapter extends RecyclerView.Adapter<RequestAdapter.MyViewHolder>{

    int[] friends ={R.drawable.widow,R.drawable.bruce,R.drawable.clint,R.drawable.steve,R.drawable.thor,R.drawable.peter,R.drawable.rhodey,R.drawable.vision,R.drawable.witch};
    String[] names ={"Natasha","Bruce","Clint","Steve","Thor","Peter","Rhodey","Vision","Wanda"};



    public  class MyViewHolder extends RecyclerView.ViewHolder{

        public TextView myText;
        public ImageView myImage;

        public MyViewHolder(View v){
            super(v);
            myText=v.findViewById(R.id.textView);
            myImage=v.findViewById(R.id.imageView);

        }

    }

    @NonNull
    @Override
    public RequestAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= (View) LayoutInflater.from(parent.getContext()).inflate(R.layout.request_data,parent,false);

        MyViewHolder vh = new MyViewHolder(v);
        return vh;

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.myText.setText(names[position]);
        holder.myImage.setImageResource(friends[position]);

    }

    @Override
    public int getItemCount() {
        return names.length;
    }


}
