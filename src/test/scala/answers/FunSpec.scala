package fun

import org.scalatest.FunSuite
import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global

class FunSpec extends FunSuite {


  def xs: Seq[Future[Int]] = ???


  def sequence(xs: Seq[Future[Int]]): Future[Seq[Int]] = {
    xs.foldLeft(Future(Seq[Int]())){ case (acc, f1) =>
        acc.flatMap { xxs =>
          f1.map { i =>
            xxs :+ i
          }
        }
    }
  }
}
