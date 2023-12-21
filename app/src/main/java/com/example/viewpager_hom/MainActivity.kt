package com.example.viewpager_hom

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.viewpager_hom.Adapter.MyViewPagerAdapter
import com.example.viewpager_hom.databinding.ActivityMainBinding
import com.example.viewpager_hom.models.User

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    private lateinit var  list:ArrayList<User>
    private lateinit var viewPagerAdapter:MyViewPagerAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        loadDate()
        viewPagerAdapter = MyViewPagerAdapter(list)
        binding.idViewPager.adapter = viewPagerAdapter
        binding.tabLayoutt.setupWithViewPager(binding.idViewPager)


        binding.tvNext.setOnClickListener {
         val indexx = viewPagerAdapter.count-1
         binding.idViewPager.currentItem = indexx
        }

    }

    private fun loadDate() {
        list = ArrayList()


        list.add(
            User(
                R.drawable.music_1,
                "Xush kelibsiz",
                "Kim ko‘rubdur, ey ko‘ngul, ahli jahondin yaxshilig‘, \n" +
                        "Kimki, ondin yaxshi yo‘q, ko‘z tutma ondin yaxshilig‘"
            )
        )

        list.add(
            User(
                R.drawable.music_2,
                "Hikoyalar dunyosi",
                "Gar zamonni nayf qilsam ayb qilma, ey rafiq, \n" +
                        "Ko‘rmadim hargiz, netoyin, bu zamondin yaxshilig‘ ! "
            )
        )

        list.add(
            User(
                R.drawable.music_3,
                "Kitob ortidan..",
                "Dilrabolardin yomonliq keldi mahzun ko‘ngluma,\n" +
                        " Kelmadi jonimg'a hech oromi jondin yaxshilig'."
            )
        )

        list.add(
            User(
                R.drawable.music_4,
                "Bizga qo`shiling",
                "Ey ko‘ngul, chun yaxshidin ko‘rdung yamonliq asru ko‘p,\n" +
                        " Emdi ko‘z tutmoq ne ma’ni har yamondin yaxshilig'?"
            )
        )
    }
}