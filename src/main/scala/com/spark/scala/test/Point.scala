package com.spark.scala.test

class Point(px: Int, py: Int)
{
    var x: Int = px
    var y: Int = py

    def move(mx: Int, my: Int): Unit =
    {
        x = x + mx
        y = y + mx
    }


}

object Point
{
//    def main(args: Array[String]): Unit =
////    {
////        var point = new Point(3, 8)
////
////        def printPoint: Unit =
////        {
////            println("x=" + point.x)
////            println("y=" + point.y)
////        }
////
////    }

    def apply(px: Int, py: Int): Point = new Point(px, py)


}
