package com.chrissen.kotlindemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import com.chrissen.kotlindemo.domain.RequestForecastCommand
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        forecast_list.layoutManager = LinearLayoutManager(this) as RecyclerView.LayoutManager?
        doAsync {
            val result = RequestForecastCommand("94043").execute()
            Log.i("Weather", result.toString())
            uiThread {
                forecast_list.adapter = ForecastListAdapter(result)
            }
        }

    }


}
