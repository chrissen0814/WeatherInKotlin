package com.chrissen.kotlindemo.domain

import com.chrissen.kotlindemo.data.Forecast
import com.chrissen.kotlindemo.data.ForecastResult
import java.text.DateFormat
import java.util.*
import	com.chrissen.kotlindemo.domain.Forecast as ModelForecast

/**
 *  Function:
 *  <br/>
 *  Describe:
 *  <br/>
 *  Author: chris on 2018/4/10.
 *  <br/>
 *  Email: sunqirui@jiuhuar.com
 */

public class ForecastDataMapper {
    fun convertFromDataModel(forecast : ForecastResult) : ForecastList{
        return ForecastList(forecast.city.name,forecast.city.country,convertForecastListToDomain(forecast.list))
    }

    private fun convertForecastListToDomain(list: List<Forecast>) : List<ModelForecast>{
        return list.map { convertForecastItemToDomain(it) }
    }

    private fun convertForecastItemToDomain(forecast: Forecast) : ModelForecast {
        return ModelForecast(convertDate(forecast.dt), forecast.weather[0].description, forecast.temp.max.toInt(), forecast.temp.min.toInt())
    }

    private fun convertDate(date : Long) : String{
        val df = DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.getDefault())
        return df.format(date*1000)
    }

}