package jp.st_ventures.kotlin_tabpagger_demo

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

// out 戻り値だけ / in 引数だけに制限する
class TabsPagerAdapter(fm: FragmentManager,
                       val tabsFragments: ArrayList<Class<out Fragment>>,
                       context: Context
) : FragmentPagerAdapter(fm, FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    private val tabTitles = listOf(
        context.getString(R.string.title_login),
        context.getString(R.string.title_add_account)
    )

    // タブのタイトル
    override fun getPageTitle(position: Int): CharSequence? {
        return tabTitles[position]
    }

    /// タブのインスタンス
    override fun getItem(position: Int): Fragment {
        return tabsFragments.get(position).newInstance()
    }

    /// タブの数
    override fun getCount(): Int {
        return tabsFragments.size
    }
}