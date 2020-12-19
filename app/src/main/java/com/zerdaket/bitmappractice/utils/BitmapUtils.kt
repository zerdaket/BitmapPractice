package com.zerdaket.bitmappractice.utils

import android.graphics.*
import kotlin.math.max

/**
 * @author zerdaket
 * @date 2020/9/13 11:59 PM
 */
object BitmapUtils {

    private val srcPaint by lazy {
        Paint(Paint.ANTI_ALIAS_FLAG).run {
            color = Color.parseColor("#1E80EF")
            this
        }
    }

    private val dstPaint by lazy {
        Paint(Paint.ANTI_ALIAS_FLAG).run {
            color = Color.parseColor("#E10050")
            this
        }
    }

    private val paint = Paint(Paint.ANTI_ALIAS_FLAG)

    private fun createSrcBitmap() = Bitmap.createBitmap(256, 256, Bitmap.Config.ARGB_8888).run {
        val canvas = Canvas(this)
        canvas.drawRect(RectF(14f, 96f, 158f, 240f), srcPaint)
        this
    }

    private fun createDstBitmap() = Bitmap.createBitmap(256, 256, Bitmap.Config.ARGB_8888).run {
        val canvas = Canvas(this)
        canvas.drawCircle(162f,96f, 82f, dstPaint)
        this
    }

    fun getCompositingBitmap(mode: PorterDuff.Mode): Bitmap {
        val src = createSrcBitmap()
        val dst = createDstBitmap()
        val canvas = Canvas(dst)
        paint.xfermode = PorterDuffXfermode(mode)
        canvas.drawBitmap(src, 0f, 0f, paint)
        return dst
    }

}