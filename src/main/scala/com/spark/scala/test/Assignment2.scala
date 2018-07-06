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

        var strArr = Array("hadoop", "storm", "spark")
        var matchArr = Map("hadoop" -> 1, "scala" -> 2, "spark" -> 3)
        var resultArr = MatchString(strArr, matchArr)

        for (m <- resultArr)
        {
            println(m)
        }


        println("------Assignment3---------------")

        Point(3, 8)

        println("------Assignment4---------------")

        try
        {
            val pattern = """<img[^>]+(src\s*=\s*"[^>^"]+")[^>]*>""".r
            for (pattern(str) <- pattern.findAllIn("$fileName"))
            {
                println(str)
            }
        }
        catch
        {
            case ex:NumberFormatException => println("para banned")
        }


    }

    def MatchString(strArr: Array[String], matchMap: Map[String, Int]): Array[Int] =
    {
        strArr.flatMap(matchMap.get(_))
    }

}
