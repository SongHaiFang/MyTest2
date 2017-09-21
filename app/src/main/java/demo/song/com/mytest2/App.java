package demo.song.com.mytest2;

import android.app.Application;

/**
 * data:2017/9/21 0021.
 * Created by ：宋海防  song on
 */

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        //全局异常捕获器
        CauchExceptionHandler.getInstance().setDefaultUnCachExceptionHandler();

    }
}
