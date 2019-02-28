package cubex.mahesh.intentservice_an9amfeb19

import android.app.IntentService
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import java.net.URL
var bmp:Bitmap? = null
class MyService : IntentService("and9amfeb19") {
    override fun onHandleIntent(p0: Intent?) {

                var u = URL("https://www.gannett-cdn.com/-mm-/e31faa5486eeeaf95383fc316351faba48c4c74a/c=484-0-3357-2160/local/-/media/2018/08/06/USATODAY/USATODAY/636691467508174989-Android-P-ClearBackground.png?width=534&height=401&fit=crop")
                var isr = u.openStream()
                bmp = BitmapFactory.decodeStream(isr)

                var i = Intent( )
                i.setAction("image_loading_completed")
                sendBroadcast(i)
    }
}