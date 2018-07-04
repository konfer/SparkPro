package com.spark.scala.test

object MatchTest
{
    def matchTest(x:Int):String=x match {
        case 1 =>"scala"
        case 2 =>"java"
        case 3 =>"js"
        case _ =>"other"
    }

    def main(args: Array[String]): Unit =
    {
        println(matchTest(3))
    }
}
