package com.frn.penyediaanobat.adapter;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.frn.penyediaanobat.R;
import com.frn.penyediaanobat.detail.DetailObat;
import com.frn.penyediaanobat.model.Obat;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ObatAdapter extends RecyclerView.Adapter<ObatAdapter.ObatViewHolder> {
    private Context context;
    private ArrayList<Obat> obatList;
    private ArrayList<Obat> OobatList;

    public ObatAdapter(Context context, ArrayList<Obat> obatList) {
        this.context = context;
        this.obatList = obatList;
        this.OobatList = new ArrayList<>();
        OobatList.addAll(obatList);
    }

    @NonNull
    @Override
    public ObatAdapter.ObatViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view  = LayoutInflater.from(context).inflate(R.layout.list_item_obat,parent, false);
        return new ObatAdapter.ObatViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ObatAdapter.ObatViewHolder holder, int position) {
        holder.nama.setText(obatList.get(position).getNama());
        holder.jenis.setText(obatList.get(position).getJenis());
        holder.gejala1.setText(obatList.get(position).getGejala1());
        holder.gejala2.setText(obatList.get(position).getGejala2());
        holder.gejala3.setText(obatList.get(position).getGejala3());
        holder.komposisi.setText(obatList.get(position).getKomposisi());
        holder.desc.setText(obatList.get(position).getDesc());
        holder.imageobat.setImageResource(obatList.get(position).getImageUrl());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, DetailObat.class);
                intent.putExtra("nama", obatList.get(position).getNama());
                intent.putExtra("jenis", obatList.get(position).getJenis());
                intent.putExtra("gejala1", obatList.get(position).getGejala1());
                intent.putExtra("gejala2", obatList.get(position).getGejala2());
                intent.putExtra("gejala3", obatList.get(position).getGejala3());
                intent.putExtra("komposisi", obatList.get(position).getKomposisi());
                intent.putExtra("desc", obatList.get(position).getDesc());
                intent.putExtra("imageo", obatList.get(position).getImageUrl());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return obatList.size();
    }

    class ObatViewHolder extends RecyclerView.ViewHolder {
        TextView nama, jenis, gejala1, gejala2, gejala3, komposisi, desc ;
        ImageView imageobat;

        public ObatViewHolder(@NonNull View itemView) {
            super(itemView);

            nama = itemView.findViewById(R.id.titleobat);
            jenis = itemView.findViewById(R.id.JenisObat);
            gejala1 = itemView.findViewById(R.id.GejalaObat1);
            gejala2 = itemView.findViewById(R.id.GejalaObat2);
            gejala3 = itemView.findViewById(R.id.GejalaObat3);
            komposisi = itemView.findViewById(R.id.KomposiObat);
            desc = itemView.findViewById(R.id.descobat);
            imageobat = itemView.findViewById(R.id.imageobat);
        }
    }

    public void filter(final String strSearch){
        if (strSearch.length() == 0){
            obatList.clear();
            obatList.addAll(OobatList);
        }
        else {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                obatList.clear();
                List<Obat> collect = OobatList.stream()
                        .filter(i -> i.getNama().toLowerCase().contains(strSearch))
                        .collect(Collectors.toList());

                obatList.addAll(collect);
            }
            else {
                obatList.clear();
                for (Obat i : OobatList){
                    if (i.getNama().toLowerCase().contains(strSearch)){
                        obatList.add(i);
                    }
                }
            }
        }
        notifyDataSetChanged();
    }

}
