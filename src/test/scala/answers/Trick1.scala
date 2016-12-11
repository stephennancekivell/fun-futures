package answers

import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global

object Trick1 {

  def lotsOfFutures: Seq[Future[Int]] = ???

  def wanted : Future[Seq[Int]] = ???

  def sequence(xs: Seq[Future[Int]]): Future[Seq[Int]] = {
    xs.foldLeft(Future(Seq[Int]())){ case (acc, item) =>
        acc.flatMap { accValue =>
          item.map { itemValue =>
            accValue :+ itemValue
          }
        }
    }
  }
}
