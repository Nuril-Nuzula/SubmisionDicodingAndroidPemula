package com.nna.submisiondicodingandroidpemula.Adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.nna.submisiondicodingandroidpemula.ActivityDetaill
import com.nna.submisiondicodingandroidpemula.Model.tumbuhan
import com.nna.submisiondicodingandroidpemula.R

class AdapterTumbuhan (private val listdatatumbuhan : ArrayList<tumbuhan>):
    RecyclerView.Adapter<AdapterTumbuhan.ViewHolder>(){
    class ViewHolder (itemWidget: View) : RecyclerView.ViewHolder(itemWidget){
        var txtnama: TextView = itemWidget.findViewById(R.id.txt_namatumbuhan)
        var txtharga: TextView = itemWidget.findViewById(R.id.txt_harga)
        var txtdesk: TextView = itemWidget.findViewById(R.id.txt_deskripsi)
        var txtmanfaat: TextView = itemWidget.findViewById(R.id.txt_manfaat)
        var fototumbuhan: ImageView = itemWidget.findViewById(R.id.foto)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layout :View = LayoutInflater.from(parent.context)
            .inflate(R.layout.data_tumbuhan,parent,false)
        return ViewHolder(layout)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val datatumbuhan = listdatatumbuhan[position]
        Glide.with(holder.itemView.context)
            .load(listdatatumbuhan[position].gambar)
            .into(holder.fototumbuhan)

        holder.txtnama.text = datatumbuhan.namatumbuhan
        holder.txtharga.text = datatumbuhan.harga
        holder.txtdesk.text = datatumbuhan.deskripsi
        holder.txtmanfaat.text = datatumbuhan.manfaat

        holder.itemView.setOnClickListener {
            //model nganterin data dari objek
            //data yg blkng(ungu)
            //objek yg dpn (ungu)
            val pergikedetail = Intent(it.context,ActivityDetaill::class.java)
            pergikedetail.putExtra(ActivityDetaill.namatanaman,datatumbuhan.namatumbuhan)
            pergikedetail.putExtra(ActivityDetaill.hargatanaman,datatumbuhan.harga)
            pergikedetail.putExtra(ActivityDetaill.sisastock,datatumbuhan.stock)
            pergikedetail.putExtra(ActivityDetaill.deskripsidetail,datatumbuhan.deskripsi)
            pergikedetail.putExtra(ActivityDetaill.manfaatdetail,datatumbuhan.manfaat)
            pergikedetail.putExtra(ActivityDetaill.photodetail,datatumbuhan.gambar.toString())
            it.context.startActivity(pergikedetail)
        }
    }

    override fun getItemCount(): Int {
        return listdatatumbuhan.size
    }


}



