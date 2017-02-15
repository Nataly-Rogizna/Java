package com.example.konstantin.lab9;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.widget.RemoteViews;

import java.util.Date;

public class Lab9 extends AppWidgetProvider {

    @Override
    public void onEnabled(Context context) {
        super.onEnabled(context);
        // здесь ваш текст
    }

    @Override
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {
        Date dt = new Date();
        super.onUpdate(context, appWidgetManager, appWidgetIds);
        RemoteViews views = new RemoteViews(context.getPackageName(), R.layout.activity_lab9);
        views.setTextViewText(R.id.tv, dt.toString());
        appWidgetManager.updateAppWidget(appWidgetIds, views);

    }

    @Override
    public void onDeleted(Context context, int[] appWidgetIds) {
        super.onDeleted(context, appWidgetIds);
        // здесь ваш текст
    }

    @Override
    public void onDisabled(Context context) {
        super.onDisabled(context);
        // здесь ваш текст
    }

}
