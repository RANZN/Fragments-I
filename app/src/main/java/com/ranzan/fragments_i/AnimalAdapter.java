package com.ranzan.fragments_i;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AnimalAdapter extends RecyclerView.Adapter<AnimalViewHolder> {
    private ArrayList<AnimalModel> animalList = new ArrayList<>();

    protected AnimalAdapter(ArrayList<AnimalModel> animalList) {
        this.animalList = animalList;
    }

    @NonNull
    @Override

    public AnimalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
        return new AnimalViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AnimalViewHolder holder, int position) {
        AnimalModel animalModel = animalList.get(position);
        holder.setData(animalModel);
    }

    @Override
    public int getItemCount() {
        return animalList.size();
    }
}
