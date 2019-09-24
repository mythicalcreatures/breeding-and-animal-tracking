package com.mythcreatures.breedingtracker.home

import android.content.Context
import android.content.Intent
import androidx.core.app.ActivityCompat
import com.mythcreatures.breedingtracker.BasePresenter

class HomePresenter: BasePresenter {

    fun startActivity(context: Context, classToStart: Class<*>) {
        val intent = Intent(context, classToStart)
        ActivityCompat.startActivity(context, intent, null)
    }
}