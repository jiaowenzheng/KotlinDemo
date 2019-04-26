package com.example.kotlindemo.ui.base

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View

/**
 * author:       JiaoWenZheng
 * created time: 2019/2/26 11:41
 * description:
 */
open abstract class BaseActivity : AppCompatActivity(),View.OnClickListener{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(inflaterId())
        initView()
    }

    override fun onClick(v: View?) {

        clickView(v)

    }

    abstract fun initView()

    abstract fun inflaterId():Int

    fun clickView(v: View?){

    }
}
