package com.spark.scala.test

object Add
{
    def addInt(x:Int,y:Int):Int={
        var sum:Int=0
        sum=x+y
        return sum
    }



    def main(args: Array[String]): Unit =
    {
        var sum:Int=addInt(1,2)
        println(sum)
    }
}
