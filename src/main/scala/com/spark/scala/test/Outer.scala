package com.spark.scala.test

class Outer
{
    class Inner
    {
        private def p(): Unit =
        {
            println("Hello World")
        }

        class InnerMost
        {
            p()
        }

        p()

    }



}
