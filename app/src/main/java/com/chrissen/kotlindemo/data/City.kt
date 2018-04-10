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

data class City(val id : Long , val name : String , val coord : Coordinates,
                val country : String , val population : Int)