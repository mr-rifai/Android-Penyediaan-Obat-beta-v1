package com.frn.penyediaanobat.adapter;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.frn.penyediaanobat.MapsActivity;
import com.frn.penyediaanobat.R;
import com.frn.penyediaanobat.model.Toko;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TokoAdapter extends RecyclerView.Adapter<TokoAdapter.TokoViewHolder> {

    private Context context;
    private ArrayList<Toko> tokoList;
    private ArrayList<Toko> OtokoList;

    public TokoAdapter(Context context, ArrayList<Toko> tokoList) {
        this.context = context;
        this.tokoList = tokoList;
        this.OtokoList = new ArrayList<>();
        OtokoList.addAll(tokoList);
    }


    @NonNull
    @Override
    public TokoAdapter.TokoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.list_item_toko, parent, false);
        return new TokoAdapter.TokoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TokoAdapter.TokoViewHolder holder, int position) {
        holder.alamat1.setText(tokoList.get(position).getLokasi1());
        holder.alamat2.setText(tokoList.get(position).getLokasi2());
        holder.nama.setText(tokoList.get(position).getNama());
        holder.imagetoko.setImageResource(tokoList.get(position).getImageUrl());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, MapsActivity.class);
                intent.putExtra("lokasi1", tokoList.get(position).getLokasi1());
                intent.putExtra("lokasi2", tokoList.get(position).getLokasi2());
                intent.putExtra("nama", tokoList.get(position).getNama());
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return tokoList.size();
    }

    class TokoViewHolder extends RecyclerView.ViewHolder {
        TextView alamat1;
        TextView alamat2;
        TextView nama;
        ImageView imagetoko;
        LinearLayout cToko;

        public TokoViewHolder(@NonNull View itemView) {
            super(itemView);

            alamat1 = itemView.findViewById(R.id.alamat1);
            alamat2 = itemView.findViewById(R.id.alamat2);
            nama = itemView.findViewById(R.id.titletoko);
            imagetoko = itemView.findViewById(R.id.imagetoko);
            cToko = itemView.findViewById(R.id.cToko);
        }
    }


    public void filter(final String strSearch){
        if (strSearch.length() == 0){
            tokoList.clear();
            tokoList.addAll(OtokoList);
        }
        else {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                tokoList.clear();
                List<Toko> collect = OtokoList.stream()
                        .filter(i -> i.getNama().toLowerCase().contains(strSearch))
                        .collect(Collectors.toList());

                tokoList.addAll(collect);
            }
            else {
                tokoList.clear();
                for (Toko i : OtokoList){
                    if (i.getNama().toLowerCase().contains(strSearch)){
                        tokoList.add(i);
                    }
                }
            }
        }
        notifyDataSetChanged();
    }

}
