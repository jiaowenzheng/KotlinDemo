package com.example.kotlindemo.ui.login

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
 * description:  登录页面
 */
class LoginActivity : BaseActivity() {

    private lateinit var mCover: ImageView
    private lateinit var mLoginBtn : TextView
    private lateinit var mPhoneLoginBtn: TextView
    private lateinit var mGettingAnythingBtn: TextView
    private lateinit var mCloseIv: ImageView

    override fun inflaterId(): Int {
        return R.layout.activity_splash
    }

    override fun initView() {
        mCover = findViewById(R.id.iv_cover)
        mLoginBtn = findViewById(R.id.tv_login_btn)
        mPhoneLoginBtn = findViewById(R.id.tv_login_phone)
        mGettingAnythingBtn = findViewById(R.id.tv_getting_anything)
        mCloseIv = findViewById(R.id.iv_close)

        mCloseIv.setOnClickListener(this)
        mLoginBtn.setOnClickListener(this)
        mPhoneLoginBtn.setOnClickListener(this)
        mGettingAnythingBtn.setOnClickListener(this)
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