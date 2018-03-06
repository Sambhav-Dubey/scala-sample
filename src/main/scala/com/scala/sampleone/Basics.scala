package com.scala.sampleone

class Basics {
  var listSample = List(1,2,3)
  println(listSample)
  val fruits = 1 :: 2 :: 3 ::Nil


 }

 object sample {

   def main(args:Array[String]): Unit =
   {
     val a  = new Basics();
     a.listSample.foreach(println)
//     val List(c,d,e) = a.fruits
     println(a.fruits)
     println(a.fruits.head)
     println(a.fruits.tail)
     println(a.fruits.isEmpty)
     println(a.fruits.last)

   }
 }
