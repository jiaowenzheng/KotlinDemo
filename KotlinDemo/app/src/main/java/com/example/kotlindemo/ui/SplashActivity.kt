package com.example.kotlindemo.ui

import android.service.autofill.Validators.or
import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.example.kotlindemo.R
import com.example.kotlindemo.ui.base.BaseActivity


/**
 * author:       JiaoWenZheng
 * created time: 2019/2/26 10:59
 * description:
 */
class SplashActivity : BaseActivity() {

    private lateinit var mCover: ImageView
    private lateinit var mLoginBtn : TextView

    private val commentList = ArrayList<String>()

    override fun inflaterId(): Int {
        return R.layout.activity_splash
    }

    override fun initView() {
        mCover = findViewById(R.id.iv_cover)
        mLoginBtn = findViewById(R.id.tv_login_btn)

        mLoginBtn.setOnClickListener(this)

        for (i in 1..10) {
            commentList.add(i.toString())
        }

        for (element in commentList){
            Log.i("jiao"," element "+element)
        }

    }

    override fun onClick(v: View?) {
        super.onClick(v)

        when(v?.id){
            R.id.tv_login_btn -> login()
        }
    }

    fun login(){

    }

}