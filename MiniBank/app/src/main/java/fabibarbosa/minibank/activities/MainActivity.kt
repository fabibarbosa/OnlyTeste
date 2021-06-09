package fabibarbosa.minibank.activities


import android.os.Bundle
import android.widget.Button
import fabibarbosa.minibank.model.BaseActivity
import fabibarbosa.minibank.R

open class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_base)
    }

}