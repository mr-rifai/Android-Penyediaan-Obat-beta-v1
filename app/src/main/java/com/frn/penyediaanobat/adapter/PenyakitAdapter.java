package com.frn.penyediaanobat.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.frn.penyediaanobat.R;
import com.frn.penyediaanobat.detail.DetailPenyakit;
import com.frn.penyediaanobat.model.Penyakit;

import java.util.ArrayList;

public class PenyakitAdapter extends RecyclerView.Adapter<PenyakitAdapter.PenyakitViewHolder> {
    private Context context;
    private ArrayList<Penyakit> penyakitList;
    private ArrayList<Penyakit> OpenyakitList;

    public PenyakitAdapter(Context context, ArrayList<Penyakit> penyakitList) {
        this.context = context;
        this.penyakitList = penyakitList;
        this.OpenyakitList = new ArrayList<>();
        OpenyakitList.addAll(penyakitList);
    }

    @NonNull
    @Override
    public PenyakitAdapter.PenyakitViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view  = LayoutInflater.from(context).inflate(R.layout.list_item_penyakit,parent, false);
        return new PenyakitAdapter.PenyakitViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PenyakitAdapter.PenyakitViewHolder holder, int position) {
        holder.nama.setText(penyakitList.get(position).getNama());
        holder.desc.setText(penyakitList.get(position).getDescp());
        holder.g1.setText(penyakitList.get(position).getGejalap1());
        holder.g2.setText(penyakitList.get(position).getGejalap2());
        holder.g3.setText(penyakitList.get(position).getGejalap3());
        holder.g4.setText(penyakitList.get(position).getGejalap4());
        holder.g5.setText(penyakitList.get(position).getGejalap5());
        holder.g6.setText(penyakitList.get(position).getGejalap6());
        holder.g7.setText(penyakitList.get(position).getGejalap7());
        holder.g8.setText(penyakitList.get(position).getGejalap8());
        holder.g9.setText(penyakitList.get(position).getGejalap9());
        holder.g10.setText(penyakitList.get(position).getGejalap10());
        holder.cmo.setText(penyakitList.get(position).getCaraMO());
        holder.cmc.setText(penyakitList.get(position).getCaraMC());
        holder.imagepenyakit.setImageResource(penyakitList.get(position).getImageUrl());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, DetailPenyakit.class);
                intent.putExtra("nama", penyakitList.get(position).getNama());
                intent.putExtra("desc", penyakitList.get(position).getDescp());
                intent.putExtra("gejala1", penyakitList.get(position).getGejalap1());
                intent.putExtra("gejala2", penyakitList.get(position).getGejalap2());
                intent.putExtra("gejala3", penyakitList.get(position).getGejalap3());
                intent.putExtra("gejala4", penyakitList.get(position).getGejalap4());
                intent.putExtra("gejala5", penyakitList.get(position).getGejalap5());
                intent.putExtra("gejala6", penyakitList.get(position).getGejalap6());
                intent.putExtra("gejala7", penyakitList.get(position).getGejalap7());
                intent.putExtra("gejala8", penyakitList.get(position).getGejalap8());
                intent.putExtra("gejala9", penyakitList.get(position).getGejalap9());
                intent.putExtra("gejala10", penyakitList.get(position).getGejalap10());
                intent.putExtra("caramo", penyakitList.get(position).getCaraMO());
                intent.putExtra("caramc", penyakitList.get(position).getCaraMC());
                intent.putExtra("imagep", penyakitList.get(position).getImageUrl());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return penyakitList.size();
    }

    class PenyakitViewHolder extends RecyclerView.ViewHolder {
        TextView nama, desc , g1, g2, g3, g4, g5, g6, g7, g8, g9, g10, cmo, cmc;
        ImageView imagepenyakit;

        public PenyakitViewHolder(@NonNull View itemView) {
            super(itemView);

            nama = itemView.findViewById(R.id.titlepenyakit);
            desc =itemView.findViewById(R.id.descPenyakit);
            g1 =itemView.findViewById(R.id.GejalaPe1);
            g2 =itemView.findViewById(R.id.GejalaPe2);
            g3 =itemView.findViewById(R.id.GejalaPe3);
            g4 =itemView.findViewById(R.id.GejalaPe4);
            g5 =itemView.findViewById(R.id.GejalaPe5);
            g6 =itemView.findViewById(R.id.GejalaPe6);
            g7 =itemView.findViewById(R.id.GejalaPe7);
            g8 =itemView.findViewById(R.id.GejalaPe8);
            g9 =itemView.findViewById(R.id.GejalaPe9);
            g10 =itemView.findViewById(R.id.GejalaPe10);
            cmo =itemView.findViewById(R.id.CaraMO);
            cmc =itemView.findViewById(R.id.CaraMC);
            imagepenyakit = itemView.findViewById(R.id.imagepenyakit);
        }
    }

    public void filter(final String strSearch){
        if (strSearch.length() == 0){
            penyakitList.clear();
            penyakitList.addAll(OpenyakitList);
        }
        else {
                penyakitList.clear();
                for (Penyakit i : OpenyakitList) {
                    if (i.getNama().toLowerCase().contains(strSearch)||
                            (i.getGejalap1().toLowerCase().contains(strSearch)||
                                    (i.getGejalap2().toLowerCase().contains(strSearch)||
                                            (i.getGejalap3().toLowerCase().contains(strSearch)||
                                                    (i.getGejalap4().toLowerCase().contains(strSearch)||
                                                            (i.getGejalap5().toLowerCase().contains(strSearch)||
                                                                    (i.getGejalap6().toLowerCase().contains(strSearch)||
                                                                            (i.getGejalap7().toLowerCase().contains(strSearch)||
                                                                                    (i.getGejalap8().toLowerCase().contains(strSearch)||
                                                                                            (i.getGejalap9().toLowerCase().contains(strSearch)||
                                                                                                    (i.getGejalap10().toLowerCase().contains(strSearch)))))))))))){
                        penyakitList.add(i);
                    }
                }
            }
        notifyDataSetChanged();
    }
}
