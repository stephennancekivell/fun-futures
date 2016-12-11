package tricks

import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global

object Trick1 {

  def lotsOfFutures: Seq[Future[Int]] = ???

  def wanted: Future[Seq[Int]] = ???

}
