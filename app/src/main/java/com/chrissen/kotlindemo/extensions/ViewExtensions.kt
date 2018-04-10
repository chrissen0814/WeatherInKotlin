package com.chrissen.kotlindemo.extensions

import android.content.Context
import android.view.View
import android.widget.TextView

/**
 *  Function:
 *  <br/>
 *  Describe:
 *  <br/>
 *  Author: chris on 2018/4/10.
 *  <br/>
 *  Email: sunqirui@jiuhuar.com
 */

val View.ctx :Context
get() = context

var TextView.textColor :Int
get() = currentTextColor
set(value) = setTextColor(value)

fun View.slideExit(){
    if(translationY == 0f)animate().translationY(-height.toFloat())
}

fun View.slideIn(){
    if(translationY < 0f)animate().translationY(0f)
}