package com.vite_vue.app

import android.os.Bundle
import android.view.WindowManager
import com.vite_vue.app.TauriActivity

// 确保布局延伸到状态栏下
class MainActivity : TauriActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        )
    }
}