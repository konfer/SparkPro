package com.spark.scala.test

object Assignment1
{
    def main(args: Array[String]): Unit =
    {
        println("--------Assignment1-------------")
        var str = "dajiangtai"


        val firstLetter = str(0)
        val lastLetter = str(str.length - 1)

        println("the first letter is:" + firstLetter)
        println("the last letter is:" + lastLetter.toString)

        println("----------Assignment2--------")
        println(signalValue(8))
        println(signalValue(-4))
        println(signalValue(0))


        println("---------Assignment3---------")
        var n = 0
        for (n <- (0 to 10).reverse)
        {
            println(n)
        }
    }

    def signalValue(num: Int): Int =
    {
        if (num < 0)
        {
            return -1
        }
        else if (num == 0)
        {
            return 0
        }
        else
        {
            return -1
        }
    }
}
