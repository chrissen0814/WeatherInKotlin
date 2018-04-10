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

public interface Command<T> {
    fun execute() : T
}