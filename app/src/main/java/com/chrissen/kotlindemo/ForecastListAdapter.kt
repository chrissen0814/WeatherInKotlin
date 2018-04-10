package com.chrissen.kotlindemo

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import android.widget.TextView
import com.chrissen.kotlindemo.domain.ForecastList

/**
 *  Function:
 *  <br/>
 *  Describe:
 *  <br/>
 *  Author: chris on 2018/4/10.
 *  <br/>
 *  Email: sunqirui@jiuhuar.com
 */

class ForecastListAdapter(val weekForecast : ForecastList) : RecyclerView.Adapter<ForecastListAdapter.ViewHolder>() {

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        with(weekForecast.dailyForecast[position]){
            holder.textView.text = "$date - $description - $high/$low"
        }
    }

    override fun getItemCount(): Int {
        return weekForecast.dailyForecast.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(TextView(parent.context))
    }


    class ViewHolder(val textView : TextView) : RecyclerView.ViewHolder(textView)

}