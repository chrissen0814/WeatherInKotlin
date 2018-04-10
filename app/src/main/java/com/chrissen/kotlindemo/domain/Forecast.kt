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

data class Forecast(val date : String , val description : String , val high : Int , val low : Int , val iconUrl : String)