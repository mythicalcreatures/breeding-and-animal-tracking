package com.mythcreatures.breedingtracker.litters

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.mythcreatures.breedingtracker.R

class LitterListActivity: AppCompatActivity(), LitterListView {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_litter)
    }
}