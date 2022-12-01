package com.nna.submisiondicodingandroidpemula

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detaill.*

class ActivityDetaill : AppCompatActivity() {

    companion object {
        const val namatanaman = "namatanaman"
        const val hargatanaman = "hargatumbuhan"
        const val sisastock = "stock"
        const val deskripsidetail = "deskripsi"
        const val manfaatdetail = "manfaat"
        const val photodetail = "gambar"


    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detaill)

        txt_namatanaman.text = intent.getStringExtra(namatanaman)
        txt_isideskripsi.text = intent.getStringExtra(deskripsidetail)
        txt_isimanfaat.text = intent.getStringExtra(manfaatdetail)
        img_tanaman.setImageResource(intent.getStringExtra(photodetail)!!.toInt())
        txt_harga.text =intent.getStringExtra(hargatanaman)
        txt_jumlahstock.text=intent.getStringExtra(sisastock)


    }
}