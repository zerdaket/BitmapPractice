package com.zerdaket.bitmappractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recycler.layoutManager = GridLayoutManager(this, 3)
        val adapter = BitmapAdapter()
        recycler.adapter = adapter
        adapter.setPorterModeList(PorterModeEnum.values().toList())
    }
}