package com.zerdaket.bitmappractice.utils

import android.graphics.*
import kotlin.math.max

/**
 * @author zerdaket
 * @date 2020/9/13 11:59 PM
 */
object BitmapUtils {

    fun composeBitmap(src: Bitmap, dst: Bitmap, mode: PorterDuff.Mode): Bitmap {
        val width = max(src.width, dst.width)
        val height = max(src.height, dst.height)
        val srcBitmap = src.copy(Bitmap.Config.ARGB_8888, true)
        val dstBitmap = dst.copy(Bitmap.Config.ARGB_8888, true)
        val bitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888)
        val canvas = Canvas(bitmap)

        val paint = Paint()
        paint.isAntiAlias = true

        canvas.saveLayer(null, null)

        canvas.drawBitmap(srcBitmap, 0f, 0f, paint)
        paint.xfermode = PorterDuffXfermode(mode)
        canvas.drawBitmap(dstBitmap, 0f, 0f, paint)
        paint.xfermode = null

        canvas.restore()

        return dstBitmap
    }

}