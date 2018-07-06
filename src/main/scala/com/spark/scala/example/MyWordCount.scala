package com.spark.scala.example

import org.apache.spark.sql.SparkSession

object MyWordCount
{
    def main(args: Array[String]): Unit =
    {
        if (args.length < 2)
        {
            System.err.println("Usage: MyWordCount <input><output>")
            System.exit(1)
        }

        val input=args(0)
        val output=args(1)

        val spark = SparkSession
            .builder
            .appName("WordCount")
            .getOrCreate()


        val sc = spark.sparkContext

        //path: /usr/local/kof/spark/input
        val lines=sc.textFile(input)
        val resultRdd=lines.flatMap(_.split(" ")).map((_,1)).reduceByKey(_+_)
        resultRdd.saveAsTextFile(output)
        sc.stop()


    }
}
