package com.chrissen.kotlindemo

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.chrissen.kotlindemo.domain.Forecast
import com.chrissen.kotlindemo.domain.ForecastList
import com.chrissen.kotlindemo.extensions.ctx
import com.squareup.picasso.Picasso
import org.jetbrains.anko.find

/**
 *  Function:
 *  <br/>
 *  Describe:
 *  <br/>
 *  Author: chris on 2018/4/10.
 *  <br/>
 *  Email: sunqirui@jiuhuar.com
 */

class ForecastListAdapter(val weekForecast : ForecastList , val itemClick : OnItemClickListener) : RecyclerView.Adapter<ForecastListAdapter.ViewHolder>() {

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindForecast(weekForecast[position])
    }

    override fun getItemCount(): Int {
        return weekForecast.size()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.ctx).inflate(R.layout.item_forecast,parent,false)
        return ViewHolder(view,itemClick)
    }


    class ViewHolder(view : View , val itemClickListener: OnItemClickListener) : RecyclerView.ViewHolder(view){
        private val iconView : ImageView
        private val dateView : TextView
        private val descriptionView : TextView
        private val maxTempView : TextView
        private val minTempView : TextView

        init {
            iconView = view.find(R.id.icon)
            dateView = view.find(R.id.dateText)
            descriptionView = view.find(R.id.descriptionText)
            maxTempView = view.find(R.id.maxTemperature)
            minTempView = view.find(R.id.minTemperature)

        }

        fun bindForecast(forecast: Forecast){
            with(forecast){
                Picasso.with(itemView.ctx).load(iconUrl).into(iconView)
                dateView.text = date
                descriptionView.text = description
                maxTempView.text = "${high.toString()}"
                minTempView.text = "${low.toString()}"
                itemView.setOnClickListener{itemClickListener(forecast)}
            }
        }

    }

    public interface OnItemClickListener{
        operator fun invoke(forecast: Forecast)
    }

}