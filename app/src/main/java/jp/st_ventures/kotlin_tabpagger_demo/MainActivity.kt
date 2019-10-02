package jp.st_ventures.kotlin_tabpagger_demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        var tabsFragments = arrayListOf(
            LoginFragment::class.java,
            AddAcountFragment::class.java
        )

        viewPager.adapter = TabsPagerAdapter(
            supportFragmentManager,
            tabsFragments,
            this)
        tabLayout.setupWithViewPager(viewPager)
    }
}
