package com.spark.scala.test

object Assignment2
{
    def main(args: Array[String]): Unit =
    {
        println("--------Assignment1-------------")

        val arr: Array[Int] = Array(2,8,3,7,4,6,5)
        val n=0
        for (n <- 0 to (arr.length-2))
        {
            if (n % 2 == 0)
            {
                var temp = arr(n+1)
                arr(n+1) = arr(n)
                arr(n) = temp
            }
        }

        for (m <- arr)
        {
            println(m)
        }

        println("--------Assignment2-------------")

    }

}
