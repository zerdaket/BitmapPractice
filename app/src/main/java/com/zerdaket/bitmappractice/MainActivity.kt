package com.zerdaket.bitmappractice

import android.graphics.*
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zerdaket.bitmappractice.utils.BitmapUtils
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val paint = Paint()
        paint.isAntiAlias = true
        val src = Bitmap.createBitmap(500, 500, Bitmap.Config.ARGB_8888)
        val srcCanvas = Canvas(src)
        paint.color = Color.YELLOW
        srcCanvas.drawRect(Rect(100, 100, 300, 200), paint)
        val dst = Bitmap.createBitmap(400, 400, Bitmap.Config.ARGB_8888)
        val dstCanvas = Canvas(dst)
        paint.color = Color.BLUE
        dstCanvas.drawCircle(200f, 150f, 100f, paint)

        val bitmap = BitmapUtils.composeBitmap(src, dst, PorterDuff.Mode.SRC_IN)
        imageView.setImageBitmap(bitmap)
    }
}