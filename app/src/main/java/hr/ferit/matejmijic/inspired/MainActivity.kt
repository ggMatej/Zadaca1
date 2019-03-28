package hr.ferit.matejmijic.inspired

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val programmerBios = resources.getStringArray(R.array.programmerBios)
        val qoutes = resources.getStringArray(R.array.qoutes)

        val ada = InspiringPerson(description = programmerBios[1],image = findViewById(R.id.iv_ada_lovelace), tv = findViewById(R.id.tv_ada_lovelace),qoute = qoutes[0] )
        val dennis = InspiringPerson(description = programmerBios[0], image = findViewById(R.id.iv_denis_ritchie), tv = findViewById(R.id.tv_denis_ritchie),qoute = qoutes[1])
        val linus = InspiringPerson(description = programmerBios[2], image = findViewById(R.id.iv_linus_torvalds), tv = findViewById(R.id.tv_linus_torvalds), qoute = qoutes[2])



        ada.image.setOnClickListener { Toast.makeText(this,ada.qoute,Toast.LENGTH_LONG).show() }
        dennis.image.setOnClickListener{ Toast.makeText(this,dennis.qoute,Toast.LENGTH_LONG).show() }
        linus.image.setOnClickListener{ Toast.makeText(this,linus.qoute,Toast.LENGTH_LONG).show() }
    }


}


