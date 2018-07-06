package com.spark.scala.test

object HighLevelFunc
{
    def sum(f:Int => Int,a:Int,b:Int):Int=
        if(a>b) 0 else f(a)+sum(f,a+1,b)
}


