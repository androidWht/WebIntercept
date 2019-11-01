package com.sltpaya.open

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sltpaya.open.web.intercept.WebIntercept
import com.sltpaya.open.web.intercept.WebInterceptImpl

class MainActivity : AppCompatActivity() {

    private var webIntercept = WebInterceptImpl()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }
}
