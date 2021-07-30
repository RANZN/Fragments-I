package com.ranzan.fragments_i;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AnimalViewHolder extends RecyclerView.ViewHolder {
    private TextView animalName;
    private ImageView animalImage;

    public AnimalViewHolder(@NonNull View itemView) {
        super(itemView);
        initViews(itemView);
    }

    private void initViews(View itemView) {
        animalName = itemView.findViewById(R.id.tvName);
        animalImage = itemView.findViewById(R.id.ivAnimal);

    }

    public void setData(AnimalModel animalModel) {
        animalName.setText(animalModel.getName());
        animalImage.setImageResource(animalModel.getImageId());
    }
}
