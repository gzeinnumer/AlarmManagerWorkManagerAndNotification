package com.gzeinnumer.alarmmanagerworkmanagerandnotification.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import com.gzeinnumer.alarmmanagerworkmanagerandnotification.NotificationHelper;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class AlarmReceiver1 extends BroadcastReceiver {

    private static final String TAG = "AlarmReceiver_";

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d(TAG, "onReceive: Alarm Terpanggil");

        NotificationHelper notificationHelper = new NotificationHelper(context);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault());
        String currentDateandTime = sdf.format(new Date());

        notificationHelper.createNotification("Notification Oreo 1", currentDateandTime);
    }
}
