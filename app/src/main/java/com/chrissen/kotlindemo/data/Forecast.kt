package com.chrissen.kotlindemo.data

/**
 *  Function:
 *  <br/>
 *  Describe:
 *  <br/>
 *  Author: chris on 2018/4/10.
 *  <br/>
 *  Email: sunqirui@jiuhuar.com
 */

data class Forecast(val dt : Long , val temp : Temperature , val pressure : Float ,
                    val humidity : Int , val weather: List<Weather> , val speed : Float ,
                    val deg : Int , val clouds : Int , val rain : Float)