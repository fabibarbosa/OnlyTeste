package fabibarbosa.minibank.model

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.google.android.material.snackbar.Snackbar
import fabibarbosa.minibank.R

open class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_base)
    }

    fun showErrorMsg(msg : String) {
        val snackBar = Snackbar.make(findViewById(android.R.id.content),msg,Snackbar.LENGTH_LONG).show()
    }


}