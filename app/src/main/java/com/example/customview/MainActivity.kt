package com.example.customview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.customview.activity.FallingSurfaceViewActivity
import com.example.customview.activity.RoudelelMenuActivity
import com.example.customview.activity.ScratchViewActivity
import com.example.customview.activity.TestActivity
import com.example.customview.adapter.EntranceItemAdapter
import com.example.customview.bean.ViewItemBean
import com.example.customview.widget.ScratchView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var mAdapter: EntranceItemAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewItemBeans = arrayListOf<ViewItemBean>()
        viewItemBeans.add(
            ViewItemBean(
                "ScratchView",
                "常见的刮刮乐效果",
                R.raw.scratch_view,
                ScratchViewActivity::class.java
            )
        )

        viewItemBeans.add(
            ViewItemBean(
                "RoudelMenuView",
                "一个小巧精致的弹出式圆盘菜单",
                R.raw.roundel_menu,
                RoudelelMenuActivity::class.java
            )
        )

        viewItemBeans.add(
            ViewItemBean(
                "FallingSurfaceView",
                "常见的红包雨效果，自定义红包数量，样式，速度",
                R.raw.falling_surface,
                FallingSurfaceViewActivity::class.java
            )
        )

        viewItemBeans.add(
            ViewItemBean(
                "Test",
                "测试专用",
                R.raw.scratch_view,
                TestActivity::class.java
            )
        )
        mAdapter = EntranceItemAdapter(this, viewItemBeans)
        view_rv.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        view_rv.adapter = mAdapter


    }
}
