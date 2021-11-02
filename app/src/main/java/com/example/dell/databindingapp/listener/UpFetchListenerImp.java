package com.example.dell.databindingapp.listener;

import androidx.annotation.Nullable;

/**
 * Author: WuShengjun
 * Date: 2021/2/25
 * Time: 16:40
 * Description: UpFetch需要设置的接口。使用java定义，以兼容java写法
 */
public interface UpFetchListenerImp {
    void setOnUpFetchListener(@Nullable OnUpFetchListener listener);
}
