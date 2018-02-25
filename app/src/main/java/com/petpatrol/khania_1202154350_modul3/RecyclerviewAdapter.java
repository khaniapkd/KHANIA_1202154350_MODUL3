package com.petpatrol.khania_1202154350_modul3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class RecyclerviewAdapter extends RecyclerView.Adapter<RecyclerviewAdapter.ViewHolder> {

    //digunakan untuk menerima dan menyimpan list item
    private ArrayList<String> arrayListJudul, arrayListDeskripsi;
    private ArrayList<Integer> arrayListGambar;

    //Membuat Konstruktor pada Class RecyclerViewAdapter
    RecyclerviewAdapter(ArrayList<String> arrayListJudul, ArrayList<String> arrayListDeskripsi, ArrayList<Integer> arrayListGambar){
        this.arrayListJudul = arrayListJudul;
        this.arrayListDeskripsi = arrayListDeskripsi;
        this.arrayListGambar = arrayListGambar;
    }

    //ViewHolder Digunakan Untuk Menyimpan Referensi Dari View-View
    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView Judul, Deskripsi;
        private ImageView Gambar;
        private LinearLayout itemList;

        public ViewHolder(View itemView) {
            super(itemView);
            //Menginisialisasi View-View untuk kita gunakan pada RecyclerView
            Judul = itemView.findViewById(R.id.judul);
            Deskripsi = itemView.findViewById(R.id.deskripsi);
            Gambar = itemView.findViewById(R.id.gambar);
            itemList = itemView.findViewById(R.id.listItem);
        }
    }

    @Override
    public RecyclerviewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //Membuat View untuk Menyiapkan dan Memasang Layout yang Akan digunakan pada RecyclerView
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent,false);
        ViewHolder viewholder = new ViewHolder(view);
        return viewholder;
    }

    @Override
    public void onBindViewHolder(RecyclerviewAdapter.ViewHolder holder, final int position) {
        //Memanggil Nilai/Value Pada View-View Yang Telah Dibuat pada Posisi Tertentu
        final String judul = arrayListJudul.get(position);//Mengambil data sesuai dengan posisi yang telah ditentukan
        final String deskripsi = arrayListDeskripsi.get(position);//Mengambil data sesuai dengan posisi yang telah ditentukan
        final Integer gambar = arrayListGambar.get(position);//Mengambil data sesuai dengan posisi yang telah ditentukan
        holder.Judul.setText(judul);// Mengambil text sesuai posisi yang telah ditentukan
        holder.Deskripsi.setText(deskripsi); // Mengambil text sesuai posisi yang telah ditentukan
        holder.Gambar.setImageResource(gambar); // Mengambil gambar sesuai posisi yang telah ditentukan
        //Membuat Aksi Saat List Ditekan
        holder.itemList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), DetailActivity.class);
                String desc = "    In a vault deep inside Abbey Road Studios in London — protected by an unmarked, triple-locked, police-alarmed door — are something like 400 hours of unreleased Beatles recordings, starting from June 2, 1962 and ending with the very last tracks recorded for the <i>Let It Be album. The best of the best were released by Apple Records in the form of the 3-volume Anthology series.\n" +
                        "        For more information, see the Beatles Time Capsule at www.rockument.com.\n" +
                        "Love Me Do — An early version of the song, played a bit slower and with more of a blues feeling, and a cool bossa-nova beat in middle. Paul had to sing while John played harmonica — a first for the group. Pete Best played drums on this version.\n" +
                        "\n" +
                        "   She Loves You – Till There Was You – Twist and Shout — Live at the Princess Wales Theatre by Leicester Square in London, attended by the Queen. “Till There Was You” (by Meredith Wilson) is from the musical The Music Man and a hit for Peggy Lee in 1961. Before playing it, Paul said it was recorded by his favorite American group, “Sophie Tucker” (which got some laughs). At the end, John tells the people in the cheaper seats to clap their hands, and the rest to “rattle your jewelry” and then announces “Twist and Shout” (a song by Bert Russell and Phil Medley that was first recorded in 1962 by the Isley Brothers). A film of the performance shows the Queen smiling at John’s remark.\n";
                switch (position){
                    case 0:
                        intent.putExtra("judul", arrayListJudul.get(position));
                        intent.putExtra("deskripsi", arrayListDeskripsi.get(position));
                        intent.putExtra("gambar", arrayListGambar.get(position));
                        intent.putExtra("desc", desc);
                        v.getContext().startActivity(intent);
                        break;
                    case 1:
                        intent.putExtra("judul", arrayListJudul.get(position));
                        intent.putExtra("deskripsi", arrayListDeskripsi.get(position));
                        intent.putExtra("gambar", arrayListGambar.get(position));
                        intent.putExtra("desc", desc);
                        v.getContext().startActivity(intent);
                        break;
                    case 2:
                        intent.putExtra("judul", arrayListJudul.get(position));
                        intent.putExtra("deskripsi", arrayListDeskripsi.get(position));
                        intent.putExtra("gambar", arrayListGambar.get(position));
                        intent.putExtra("desc", desc);
                        v.getContext().startActivity(intent);
                        break;
                    case 3:
                        intent.putExtra("judul", arrayListJudul.get(position));
                        intent.putExtra("deskripsi", arrayListDeskripsi.get(position));
                        intent.putExtra("gambar", arrayListGambar.get(position));
                        intent.putExtra("desc", desc);
                        v.getContext().startActivity(intent);
                        break;
                    case 4:
                        intent.putExtra("judul", arrayListJudul.get(position));
                        intent.putExtra("deskripsi", arrayListDeskripsi.get(position));
                        intent.putExtra("gambar", arrayListGambar.get(position));
                        intent.putExtra("desc", desc);
                        v.getContext().startActivity(intent);
                        break;
                    case 5:
                        intent.putExtra("judul", arrayListJudul.get(position));
                        intent.putExtra("deskripsi", arrayListDeskripsi.get(position));
                        intent.putExtra("gambar", arrayListGambar.get(position));
                        intent.putExtra("desc", desc);
                        v.getContext().startActivity(intent);
                        break;
                    case 6:
                        intent.putExtra("judul", arrayListJudul.get(position));
                        intent.putExtra("deskripsi", arrayListDeskripsi.get(position));
                        intent.putExtra("gambar", arrayListGambar.get(position));
                        intent.putExtra("desc", desc);
                        v.getContext().startActivity(intent);
                        break;
                    case 7:
                        intent.putExtra("judul", arrayListJudul.get(position));
                        intent.putExtra("deskripsi", arrayListDeskripsi.get(position));
                        intent.putExtra("gambar", arrayListGambar.get(position));
                        intent.putExtra("desc", desc);
                        v.getContext().startActivity(intent);
                        break;
                    case 8:
                        intent.putExtra("judul", arrayListJudul.get(position));
                        intent.putExtra("deskripsi", arrayListDeskripsi.get(position));
                        intent.putExtra("gambar", arrayListGambar.get(position));
                        intent.putExtra("desc", desc);
                        v.getContext().startActivity(intent);
                        break;
                    case 9:
                        intent.putExtra("judul", arrayListJudul.get(position));
                        intent.putExtra("deskripsi", arrayListDeskripsi.get(position));
                        intent.putExtra("gambar", arrayListGambar.get(position));
                        intent.putExtra("desc", desc);
                        v.getContext().startActivity(intent);
                        break;
                    case 10:
                        intent.putExtra("judul", arrayListJudul.get(position));
                        intent.putExtra("deskripsi", arrayListDeskripsi.get(position));
                        intent.putExtra("gambar", arrayListGambar.get(position));
                        intent.putExtra("desc", desc);
                        v.getContext().startActivity(intent);
                        break;
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return arrayListJudul.size();
    }
}
