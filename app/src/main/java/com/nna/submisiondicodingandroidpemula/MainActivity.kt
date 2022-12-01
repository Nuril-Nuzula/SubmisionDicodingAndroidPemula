package com.nna.submisiondicodingandroidpemula

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.nna.submisiondicodingandroidpemula.Adapter.AdapterTumbuhan
import com.nna.submisiondicodingandroidpemula.Data.DataTumbuhan
import com.nna.submisiondicodingandroidpemula.Model.tumbuhan
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.data_tumbuhan.*

class MainActivity : AppCompatActivity() {
    private val list : ArrayList<tumbuhan> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        recyler_tumbuhan.setHasFixedSize(true)
        list.addAll(DataTumbuhan.listtanaman)

        recyler_tumbuhan.layoutManager = LinearLayoutManager(this)
        val listDiri = AdapterTumbuhan(list)
        recyler_tumbuhan.adapter = listDiri


    }
        override fun onCreateOptionsMenu(menu: Menu?): Boolean {
            menuInflater.inflate(R.menu.menu, menu)
            return super.onCreateOptionsMenu(menu)
        }

        override fun onOptionsItemSelected(item: MenuItem): Boolean {
            setMode(item.itemId)
            return super.onOptionsItemSelected(item)
        }

        private fun setMode(milihitem: Int) {
            when (milihitem) {
                R.id.ke_profile->{
                    startActivity(Intent(this,ActivityUserr::class.java))
                }


            }
        }
}