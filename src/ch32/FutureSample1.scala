package ch32

import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global

/**
  * Created by t_ishikawa on 2016/11/26.
  */
object FutureSample1 {

  def main(args: Array[String]): Unit = {
    println("start!")

    val fut = Future {
      Thread.sleep(1000); 21 + 21
      //throw new Exception
    }

    println(fut.isCompleted)
    println(fut.value)

    val result = fut.map(x => x + 1)

    while (!fut.isCompleted) {
    }
    println(fut.isCompleted)
    println(fut.value)
    println("end")

    println("result : " + result.value)

//    Thread.sleep(2000)
//    println(fut.isCompleted)
//    println(fut.value)
  }

}
