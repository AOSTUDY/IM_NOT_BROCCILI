package com.yujeong.aostudy.broccoli.util

import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.CenterCrop
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import java.text.NumberFormat
import java.util.*

object BindingAdapters {

    @BindingAdapter("setSrc")
    @JvmStatic
    fun setSrc(imageView: ImageView, imgId: Int) {
        imageView.setImageResource(imgId)
    }

    @BindingAdapter("setPrice")
    @JvmStatic
    fun setPrice( textView : TextView, num : Int) {
        val price = NumberFormat.getNumberInstance(Locale.US)
            .format(num) + "원"
        textView.text = price
    }


    @BindingAdapter("setRound10SrcFromUrl")
    @JvmStatic
    fun setRound10SrcFromUrl(imageView: ImageView, id:Int) {
        Glide.with(imageView.context)
            .load(id)
            .transform(CenterCrop(), RoundedCorners(13))
            .into(imageView)
    }

}