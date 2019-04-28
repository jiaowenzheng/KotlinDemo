package com.example.kotlindemo.ui.main


import android.content.Intent
import com.example.kotlindemo.R
import com.example.kotlindemo.ui.base.BaseActivity


/**
 * author:       JiaoWenZheng
 * created time: 2019/2/26 10:59
 * description:
 */
class SplashActivity : BaseActivity() {

    override fun inflaterId(): Int {
        return R.layout.activity_splash
    }

    override fun initView() {
        Thread(Runnable {
            Thread.sleep(1000)

            runOnUiThread {
                startActivity(Intent(this@SplashActivity, MainActivity::class.java))
                finish()
            }

        }).start()
    }
}


