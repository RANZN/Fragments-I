package com.ranzan.fragments_i;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AnimalFragment extends Fragment {
    private RecyclerView recyclerView;
    private ArrayList<AnimalModel> animalList = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_animal, container, false);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    private void buildList() {
        for (int i = 0; i < 130; i++) {
            AnimalModel animalModel = new AnimalModel("Dog", R.drawable.dog);
            animalList.add(animalModel);
        }
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.recyclerView);
        buildList();
        setRecyclerView();
    }

    private void setRecyclerView() {
        AnimalAdapter animalAdapter = new AnimalAdapter(animalList);
        GridLayoutManager linearLayoutManager = new GridLayoutManager(getContext(),2);
        recyclerView.setAdapter(animalAdapter);
        recyclerView.setLayoutManager(linearLayoutManager);
    }
}