package com.frn.penyediaanobat.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.frn.penyediaanobat.model.News;
import com.frn.penyediaanobat.R;

import java.util.ArrayList;

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.NewsViewHolder> {
    private ArrayList<News> mData = new ArrayList<>();
    private onItemClick onItemClick;

    public NewsAdapter(onItemClick onItemClick) {
        this.onItemClick = onItemClick;
    }

    public interface onItemClick{
        void ItemClick(News news);
    }

    public void setData(ArrayList<News> items) {
        mData.clear();
        mData.addAll(items);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public NewsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_berita, parent, false);
        return new NewsViewHolder(mView);
    }

    @Override
    public void onBindViewHolder(@NonNull final NewsViewHolder holder, int position) {
        final  News berita = mData.get(position);
        holder.bind(mData.get(position));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onItemClick.ItemClick(berita);
            }
        });

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    class NewsViewHolder extends RecyclerView.ViewHolder {
        TextView textjudul;
        TextView textdesc;
        ImageView image;
        LinearLayout cNews;

        public NewsViewHolder(@NonNull View itemView) {
            super(itemView);
            textjudul = itemView.findViewById(R.id.title);
            textdesc = itemView.findViewById(R.id.desc);
            image = itemView.findViewById(R.id.image);
            cNews = itemView.findViewById(R.id.cNews);
        }

        void bind(News news) {
            Glide.with(itemView.getContext())
                    .load(news.getImage())
                    .apply(new RequestOptions().override(55, 55))
                    .into(image);

            textjudul.setText(news.getTitle());
            textdesc.setText(news.getDescription());
        }
    }

}