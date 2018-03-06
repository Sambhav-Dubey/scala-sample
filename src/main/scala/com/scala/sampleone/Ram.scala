package com.scala.sampleone

object Ram {


  case class Student(var marks : Int = 90, var name : String = "Sambhav") {

    def show = {
      println("Hello")
    }

  }

  var s1 = Student();
  s1.show

}
