package com.example.databinding;

import android.content.Context;
import android.databinding.BindingAdapter;
import android.databinding.DataBindingUtil;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.databinding.databinding.MovieItemBinding;
import com.squareup.picasso.Picasso;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by omazhukin on 9/3/2015.
 */
public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MovieItemViewHolder> {

    @Override
    public MovieItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        MovieItemBinding binding = MovieItemBinding.inflate(inflater, parent, false);
        return new MovieItemViewHolder(binding.getRoot());
    }

    @Override
    public void onBindViewHolder(MovieItemViewHolder holder, int position) {
        Movie movie = Movie.ITEMS[position];
        holder.binding.setMovie(movie);
        holder.binding.setClick(new MovieClickHandler() {
            @Override
            public void onNewClick(View view) {
                Toast.makeText(view.getContext(), "onNewClick", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onWatchedClick(View view) {
                Toast.makeText(view.getContext(), "onWatchedClick", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return Movie.ITEMS.length;
    }

    public class MovieItemViewHolder extends RecyclerView.ViewHolder {

        MovieItemBinding binding;

        public MovieItemViewHolder(View itemView) {
            super(itemView);
            binding = DataBindingUtil.bind(itemView);
        }
    }

    @BindingAdapter("bind:imageUrl")
    public static void loadImage(ImageView imageView, String v) {
        Picasso.with(imageView.getContext()).load(v).into(imageView);
    }

    @BindingAdapter("bind:filter")
    public static void applyFilter(ImageView imageView, String v) {
        imageView.setColorFilter(null);
        if("grey".equals(v)){
            ColorMatrix matrix = new ColorMatrix();
            matrix.setSaturation(0);
            ColorMatrixColorFilter cf = new ColorMatrixColorFilter(matrix);
            imageView.setColorFilter(cf);
        }
    }
}

