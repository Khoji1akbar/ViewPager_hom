package com.example.viewpager_hom.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.PagerAdapter
import com.example.viewpager_hom.databinding.ItemRvBinding
import com.example.viewpager_hom.models.User

class MyViewPagerAdapter (var list: ArrayList<User>): PagerAdapter() {
    override fun getCount(): Int {
       return list.size
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view == `object`
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val layoutInflater = ItemRvBinding.inflate(LayoutInflater.from(container.context),container,false)

        layoutInflater.imageBgView.setBackgroundResource(list[position].imagetg)
        layoutInflater.mainTextView.text =list[position].mainTextt
        layoutInflater.secondaryTextView.text = list[position].secondText


        container.addView(layoutInflater.root)

        return layoutInflater.root
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as View)
    }


}