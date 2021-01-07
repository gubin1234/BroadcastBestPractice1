package com.example.broadcastbestpractice;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * @ 作者: GB
 * @ 类名: ActivityCollector
 * @ 包名: com.example.broadcastbestpractice
 * @ 描述:管理所有的活动
 * @ 日期: 2021/1/6 0006 下午 05:36
 **/
public class ActivityCollector {
    public static List<Activity> activities = new ArrayList<>();

    public static void addActivity(Activity activity){
        activities.add(activity);
    }
    public static void removeActivity(Activity activity){
        activities.remove(activity);
    }
    public static void finishAll(){
        for (Activity activity : activities){
            if (!activity.isFinishing()){
                activity.finish();
            }
        }
        activities.clear();
    }

}
