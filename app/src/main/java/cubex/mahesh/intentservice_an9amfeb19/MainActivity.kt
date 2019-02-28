package cubex.mahesh.intentservice_an9amfeb19

import android.content.Intent
import android.content.IntentFilter
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var iFilter = IntentFilter()
        iFilter.addAction("image_loading_completed")
        registerReceiver(MyReceiver(iview),iFilter)


        getImage.setOnClickListener {
            var i = Intent(this@MainActivity,
                                                        MyService::class.java)
            startService(i)
        }
    }
}
