package com.gzeinnumer.alarmmanagerworkmanagerandnotification.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import com.gzeinnumer.alarmmanagerworkmanagerandnotification.NotificationHelper;

public class AlarmReceiver extends BroadcastReceiver {

    private static final String TAG = "AlarmReceiver_";

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d(TAG, "onReceive: Alarm Terpanggil");

        NotificationHelper notificationHelper = new NotificationHelper(context);

        notificationHelper.createNotification("Notification Oreo","GZeinNumer. https://github.com/gzeinnumer");
    }
}
