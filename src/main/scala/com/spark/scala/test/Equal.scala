package com.spark.scala.test

trait Equal
{
    def isEqual(x:Any):Boolean
    def isNotEqual(x:Any):Boolean = !isEqual(x)

}
