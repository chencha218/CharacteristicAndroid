package com.chencha.characteristicandroid

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.ImageView
import android.widget.TextView

/**
 * Created by xiyuan on 2018/9/13.
 */
open class OneActivity : AppCompatActivity(), View.OnClickListener {


    var mBackBtn: ImageView? = null
    var mContentTitleTv: TextView? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.act_one_layout)
        initView()
    }

    private fun initView() {
        mBackBtn = findViewById(R.id.back_icon_iv) as ImageView
        mBackBtn!!.setOnClickListener(this)
        mContentTitleTv = findViewById(R.id.center_title_txt) as TextView
        mContentTitleTv!!.text = "Android 5.0"

    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.back_icon_iv -> finish()
        }

    }


}