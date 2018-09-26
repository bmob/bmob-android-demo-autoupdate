package cn.bmob.versionupdate;

import android.app.Application;

import cn.bmob.v3.Bmob;

/**
 * Created on 18/9/25 10:42
 *
 * @author zhangchaozhou
 */
public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Bmob.initialize(this,"12784168944a56ae41c4575686b7b332");
    }
}
