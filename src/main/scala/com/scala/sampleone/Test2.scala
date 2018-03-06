package com.scala.sampleone

package test3 {

  object Singleton {
    def main(args: Array[String]) {
      println(new Singleton str);
      var abc = new Singleton();
      abc = new Singleton();
      println(abc.age)

    }
  }


  class Singleton {
    private val str = "stringInClass";

    private def secret = "secret";
    private val age: Int = 36;

    def hello(): Int = {
      println("Hello, This is Singleton Object")
      2
    }
  }

  class A extends Singleton {
    var x = 0;

    override def hello(): Int = {
      println("hello")
      1
    }
  }

}
