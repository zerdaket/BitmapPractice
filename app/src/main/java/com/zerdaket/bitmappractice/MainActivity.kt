package com.zerdaket.bitmappractice

import android.graphics.PorterDuff
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zerdaket.bitmappractice.utils.BitmapUtils
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        PorterModeEnum.values()
        imageView.setImageBitmap(BitmapUtils.getCompositingBitmap(PorterDuff.Mode.SRC_IN))
    }
}