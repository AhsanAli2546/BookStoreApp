package com.example.midfrag_recyc;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


public class MidFragment extends Fragment {



    public MidFragment() {
        // Required empty public constructor
    }
    //public static List <Model> list;
    RecyclerView recyclerView;

    public List<Model> getList() {
        MainActivity.list = new ArrayList<>();
        MainActivity.list.add(new Model("book one","This is Description",R.drawable.book));
        MainActivity.list.add(new Model("book two","This is Description",R.drawable.book));
        MainActivity.list.add(new Model("book three","This is Description",R.drawable.book));
        MainActivity.list.add(new Model("Android","This is Description",R.drawable.book));
        MainActivity.list.add(new Model("Android","This is Description",R.drawable.book));
        MainActivity.list.add(new Model("Android","This is Description",R.drawable.book));
        MainActivity.list.add(new Model("Android","This is Description",R.drawable.book));
        MainActivity.list.add(new Model("Android","This is Description",R.drawable.book));
        MainActivity.list.add(new Model("Android","This is Description",R.drawable.book));
        MainActivity.list.add(new Model("Android","This is Description",R.drawable.book));
        MainActivity.list.add(new Model("Android","This is Description",R.drawable.book));
        MainActivity.list.add(new Model("Android","This is Description",R.drawable.book));
        return MainActivity.list;
    }

    public  void setBook(Model book){
        MainActivity.list.add(book);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View  view = inflater.inflate(R.layout.fragment_mid, container, false);
        recyclerView = view.findViewById(R.id.mid);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(),2));
        recyclerView.setAdapter(new FragmentAdapter(getContext(),getList()));
        return view;
    }


}