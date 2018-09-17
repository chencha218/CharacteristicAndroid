package com.chencha.characteristicandroid

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import com.chencha.characteristicandroid.utils.Utils

open class MainActivity : AppCompatActivity(), View.OnClickListener {

    /**
     * ？表示该对象是可以为空
     *  ！！ 表示当前对象不为空
     */

    var mBtn1: Button? = null
    var mBtn2: Button? = null
    var mBtn3: Button? = null
    var mBtn4: Button? = null
    var mBundle: Bundle? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mBtn1 = findViewById(R.id.btn_1) as Button
        mBtn2 = findViewById(R.id.btn_2) as Button
        mBtn3 = findViewById(R.id.btn_3) as Button
        mBtn4 = findViewById(R.id.btn_4) as Button

        mBtn1!!.setOnClickListener(this)
        mBtn2!!.setOnClickListener(this)
        mBtn3!!.setOnClickListener(this)
        mBtn4!!.setOnClickListener(this)


    }



    /**
     * onClick  方法
     * when 类似 switch 方法
     */
    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btn_1 -> Utils.startActivity(this, null, OneActivity::class.java, false)
            R.id.btn_2 -> Utils.startActivity(this, null, OneActivity::class.java, false)
            R.id.btn_3 -> Utils.startActivity(this, null, OneActivity::class.java, false)
            R.id.btn_4 -> Utils.startActivity(this, null, OneActivity::class.java, false)
        }

    }


}
