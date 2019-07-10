package net.aucutt.creamedcorn

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class WarningActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_warning)
    }

    fun goAhead(v : View) {
        val intent = Intent(this,CreamCornActivity::class.java )
        startActivity(intent)
    }

}
