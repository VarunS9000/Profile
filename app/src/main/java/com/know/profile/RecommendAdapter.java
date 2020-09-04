package com.know.profile;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecommendAdapter extends RecyclerView.Adapter<RecommendAdapter.MyViewHolder> {

        int[] friends ={R.drawable.brucewayne,R.drawable.superman,R.drawable.daina,R.drawable.flash,R.drawable.thanos,R.drawable.gamora};
        String[] names ={"Wayne","Kal-El","Daina","Barry","Thanos","Gamora"};



public  class MyViewHolder extends RecyclerView.ViewHolder{

    public TextView myText;
    public ImageView myImage;

    public MyViewHolder(View v){
        super(v);
        myText=v.findViewById(R.id.textViewRE);
        myImage=v.findViewById(R.id.imageViewRE);

    }

}

    @NonNull
    @Override
    public RecommendAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= (View) LayoutInflater.from(parent.getContext()).inflate(R.layout.recommend,parent,false);

        RecommendAdapter.MyViewHolder vh = new RecommendAdapter.MyViewHolder(v);
        return vh;

    }

    @Override
    public void onBindViewHolder(@NonNull RecommendAdapter.MyViewHolder holder, int position) {
        holder.myText.setText(names[position]);
        holder.myImage.setImageResource(friends[position]);

    }

    @Override
    public int getItemCount() {
        return names.length;
    }


}


