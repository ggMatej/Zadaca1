package hr.ferit.matejmijic.inspired

import android.app.Application
import android.content.Context
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class InspiringPerson (val qoute: String, val description: String, val image: ImageView, val tv : TextView) {




    init {
        tv.text = description
    }



}