package my.business

import scala.collection.mutable

/**
  * Created by t_ishikawa on 2016/10/20.
  */
object MyTryCodes {

  def main(args: Array[String]): Unit = {
    val set = Set(
      ("2015", "1"),
      ("2015", "2"),
      ("2016", "1"),
        ("2016", "2")
    )

    val list = set.toList

    println(set)
    println(list.last)

    val latest = list.last

    val buf = scala.collection.mutable.ListBuffer.empty[(String, String)]

    for (idx <- 0 to 3) {
      if (idx == 0 && latest._2 == "1") {
        buf += Tuple2(latest._1, "2")

      } else if (idx > 0) {
        //List(((latest._1.toInt + idx).toString, "1"),((latest._1.toInt + idx).toString, "2"))
        buf += Tuple2((latest._1.toInt + idx).toString, "1")
        buf += Tuple2((latest._1.toInt + idx).toString, "2")
      }
    }

    println(buf.toList)


    val idxs = for (idx <- 0 to 3) yield {
      if (idx == 0 && latest._2 == "1") {
        Tuple2(latest._1, "2") :: Nil

      } else if (idx > 0) {
        //List(((latest._1.toInt + idx).toString, "1"),((latest._1.toInt + idx).toString, "2"))
        Tuple2((latest._1.toInt + idx).toString, "1") :: Tuple2((latest._1.toInt + idx).toString, "2") :: Nil
      }
    }



    val li = flatten(idxs.toList)

    for (l <- li) {
      println(l)
    }

//    println(idxs(1) ::: idxs(2))
//
//    idxs.foreach(list => {
//      println(list.toString)
//    })
  }

  def flatten(ls: List[Any]): List[Any] = ls flatMap {
    case i: List[_] => flatten(i)
    case e => List(e)
  }

}
