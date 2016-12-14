package nyc.c4q.jonathancolon.catchemall.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Created by Danny on 12/12/2016.
 */

public class MyAlarmReceiver extends BroadcastReceiver {
    public static final int REQUEST_CODE = 12345;
    public static final String ACTION = "some.action.lol";

    // Triggered by the Alarm periodically (starts the service to run task)
    @Override
    public void onReceive(Context context, Intent intent) {
        System.out.println("ALARM RECEIVER CALLED");
        Intent i = new Intent(context, MyService.class);
        context.startService(i);
    }
}