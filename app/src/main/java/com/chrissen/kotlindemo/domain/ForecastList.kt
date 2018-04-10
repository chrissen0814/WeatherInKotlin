package com.chrissen.kotlindemo.domain

/**
 *  Function:
 *  <br/>
 *  Describe:
 *  <br/>
 *  Author: chris on 2018/4/10.
 *  <br/>
 *  Email: sunqirui@jiuhuar.com
 */

data class ForecastList(val city : String , val country : String  , val dailyForecast : List<Forecast>){

    operator fun get(position: Int) = dailyForecast[position]

    fun size() = dailyForecast.size
}