package cubex.mahesh.intentservice_an9amfeb19

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.ImageView

class MyReceiver(var iview:ImageView) : BroadcastReceiver() {
    override fun onReceive(p0: Context?, p1: Intent?) {
        iview.setImageBitmap(bmp)

    }
}