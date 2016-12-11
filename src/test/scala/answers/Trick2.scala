package answers

import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global

object Trick2 {

  def inputList: Seq[Int] = ???

  def find(i: Int): Future[String] = ???

  def wanted: Future[Seq[Int]] = ???

  def traverse(xs: Seq[Int])(fn: Int => Future[String]): Future[Seq[String]] = {
    xs.foldLeft(Future(Seq[String]())) { (acc, item) =>
      acc.flatMap { accValue =>
        fn(item).map { itemValue =>
          accValue :+ itemValue
        }
      }
    }
  }
}
