package com.know.profile;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.Nullable;

public class RequestFragment extends Fragment {
    RecyclerView recyclerview;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        super.onCreateView(inflater,container,savedInstanceState);
        View rootView = inflater.inflate(R.layout.request_data_screen,container,false);
        recyclerview=rootView.findViewById(R.id.recyclerview);
        recyclerview.setHasFixedSize(true);// does not change layout size of recycler view
        layoutManager= new LinearLayoutManager(rootView.getContext());
        recyclerview.setLayoutManager(layoutManager);
        mAdapter=new RequestAdapter();
        recyclerview.setAdapter(mAdapter);


        return rootView;
    }
}
