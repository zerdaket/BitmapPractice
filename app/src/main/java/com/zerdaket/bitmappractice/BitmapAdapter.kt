package com.zerdaket.bitmappractice

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.zerdaket.bitmappractice.utils.BitmapUtils

/**
 * @author zerdaket
 * @date 2020/12/21 11:55 PM
 */
class BitmapAdapter: RecyclerView.Adapter<BitmapViewHolder>() {

    private var porterModeList: List<PorterModeEnum>? = null

    fun setPorterModeList(list: List<PorterModeEnum>) {
        porterModeList = list
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BitmapViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_bitmap, parent, false)
        return BitmapViewHolder(view)
    }

    override fun onBindViewHolder(holder: BitmapViewHolder, position: Int) {
        val porterMode = porterModeList?.get(holder.bindingAdapterPosition) ?: return
        holder.image.setImageBitmap(BitmapUtils.getCompositingBitmap(porterMode.mode))
        holder.text.text = porterMode.text
    }

    override fun getItemCount(): Int = porterModeList?.size ?: 0

}

class BitmapViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    val image = itemView.findViewById<ImageView>(R.id.image)
    val text = itemView.findViewById<TextView>(R.id.text)
}