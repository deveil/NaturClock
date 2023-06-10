package com.deveil.naturclock.util;

import android.view.View;

import com.deveil.naturclock.model.Alarm;

public interface OnToggleAlarmListener {
    void onToggle(Alarm alarm);
    void onDelete(Alarm alarm);
    void onItemClick(Alarm alarm,View view);
}
