package br.ufpe.cin.if1001.rss.receivers;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;

import br.ufpe.cin.if1001.rss.ui.MainActivity;

public class ReportReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        NotificationCompat.Builder builder = new NotificationCompat.Builder(context.getApplicationContext());
        builder.setSmallIcon(android.R.drawable.ic_notification_overlay)
                .setContentTitle("RSS").setContentText("Novas notícias aqui pra você!");
        Intent app = new Intent(context.getApplicationContext(), MainActivity.class);
        PendingIntent pi = PendingIntent.getActivity(context.getApplicationContext(),0, app,0);
        builder.setContentIntent(pi);
        Notification notif = builder.build();
        NotificationManagerCompat.from(context.getApplicationContext()).notify(0,notif);
    }
}
