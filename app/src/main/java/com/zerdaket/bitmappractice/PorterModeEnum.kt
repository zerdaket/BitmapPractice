package com.zerdaket.bitmappractice

import android.graphics.PorterDuff

/**
 * @author zerdaket
 * @date 2020/12/20 12:38 AM
 */
enum class PorterModeEnum(val text: String, val mode: PorterDuff.Mode) {
    SOURCE("Source", PorterDuff.Mode.SRC),
    SOURCE_OVER("Source Over", PorterDuff.Mode.SRC_OVER),
    SOURCE_IN("Source In", PorterDuff.Mode.SRC_IN),
    SOURCE_ATOP("Source Atop", PorterDuff.Mode.SRC_ATOP),
    SOURCE_OUT("Source Out", PorterDuff.Mode.SRC_OUT),
    DESTINATION("Destination", PorterDuff.Mode.DST),
    DESTINATION_OVER("Destination Over", PorterDuff.Mode.DST_OVER),
    DESTINATION_IN("Destination In", PorterDuff.Mode.DST_IN),
    DESTINATION_ATOP("Destination Atop", PorterDuff.Mode.DST_ATOP),
    DESTINATION_OUT("Destination Out", PorterDuff.Mode.DST_OUT),
    EXCLUSIVE_OR("Exclusive Or", PorterDuff.Mode.XOR),
    DARKEN("Darken", PorterDuff.Mode.DARKEN),
    LIGHTEN("Lighten", PorterDuff.Mode.LIGHTEN),
    MULTIPLY("Multiply", PorterDuff.Mode.MULTIPLY),
    SCREEN("Screen", PorterDuff.Mode.SCREEN),
    OVERLAY("Overlay", PorterDuff.Mode.OVERLAY)
}
