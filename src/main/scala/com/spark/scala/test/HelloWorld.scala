package com.spark.scala.test

import scala.Array._
import scala.util.control._

object HelloWorld
{
    def main(args: Array[String]): Unit =
    {
        val a = 0
        val b = 0XFFFFFF
        println(a)
        println(b)

        var n = 0
        for (n <- -1 to 10)
        {
            println(n)
        }

        var m = 0
        var y = 0

        for (m <- 1 to 3; y <- -1 to 3)
        {
            println("x=" + m)
            println("y=" + y)
        }

        //        val (a:Int,b:String)=Pai
        val list = List(1, 2, 3, 4, 5, 6, 7, 8, 9)

        val resVal = for (n <- list
                          if n > 3
                          if n < 9) yield n

        println("-----------")
        var s = 0
        for (s <- resVal)
        {
            println(s)
        }

        println("------------")
        for (n <- list
             if n > 3
             if n < 9)
        {
            println(n)

        }

        println("------break-----------")

        var loop = new Breaks

        loop.breakable
        {
            for (n <- list)
            {
                println("n=" + n)
                if (n == 4)
                {
                    loop.break()
                }

            }
        }

        println("-------String-----------")

        val arr = new Array[String](3)

        arr(0) = "hadoop"
        arr(1) = "storm"
        arr(2) = "spark"

        println(arr(1))

        for (strN <- arr)
        {
            println(strN)
        }


        var arrNum = Array[Int](1, 2, 3, 6, 4, 7)
        var max: Int = arrNum(0)
        for (i <- 1 to (arrNum.length - 1))
        {
            if (arrNum(i) > max)
            {
                max = arrNum(i)
            }
        }
        println(max)

        println("--------multi array-------")

        var multiArr = Array.ofDim[Int](3, 3)

        for (i <- 0 to 2)
            for (j <- 0 to 2)
            {
                multiArr(i)(j) = 2 * i + j * j - i * j
            }

        for (i <- 0 to 2)
            for (j <- 0 to 2)
            {
                println(multiArr(i)(j))
            }

        println("---------concat----------")
        var arr1 = Array(1, 2, 3, 4)
        var arr2 = Array(6, 7, 8, 9)

        var arr3 = concat(arr1, arr2)

        for (str <- arr3)
        {
            println(str)
        }

        var arr4 = range(10, 20, 2)


        for (str <- arr4)
        {
            println(str)
        }

        println("----list----------")

        val num_list = List(1, 2, 3, 4)

        num_list.foreach(n => println(n))

        val numMap = Map("scala" -> 1, "java" -> 2, "php" -> 3)
        numMap.foreach(a => println(a._1 + ":" + a._2))

        println("-------iterator----------")
        val numIterator: Iterator[Int] = num_list.iterator
        while (numIterator.hasNext)
        {
            println(numIterator.next())
            println("size:"+numIterator.size.toString)
            println("length:"+numIterator.length.toString)
        }


        println("---------class----------")

    }


}