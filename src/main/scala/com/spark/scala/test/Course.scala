package com.spark.scala.test

case class Course(name: String, cid: Int)

object matchTest
{
    def main(args: Array[String]): Unit =
    {
        val hadoop = new Course("hadoop", 23)
        val storm = new Course("storm", 24)
        val spark = new Course("spark", 25)

        matchFunc(hadoop)
    }

    def matchFunc(course: Course) =
    {
        course match
        {
            case Course("hadoop", 23) => println("Hadoop")
        }

    }

}    