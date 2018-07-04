package com.spark.scala.test

class traitPoint(xc:Int,yc:Int) extends Equal
{
    var x:Int=xc
    var y:Int=yc

    override def isEqual(obj: Any): Boolean = {
        obj.isInstanceOf[Point] &&
            obj.asInstanceOf[Point].x == x
    }
}


object Test {
    def main(args: Array[String]) {
        val p1 = new traitPoint(2, 3)
        val p2 = new traitPoint(2, 4)
        val p3 = new traitPoint(3, 3)

        println(p1.isNotEqual(p2))
        println(p1.isNotEqual(p3))
        println(p1.isNotEqual(2))
    }
}