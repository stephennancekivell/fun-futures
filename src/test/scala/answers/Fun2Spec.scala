package answers

import org.scalatest.FunSuite

import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global

class Fun2Spec extends FunSuite {

  def find(i: Int): Future[String] = ???

  def xs: Seq[Int] = ???

  def want: Future[Seq[Int]] = ???

  def traverse(xs: Seq[Int])(fn: Int => Future[String]): Future[Seq[String]] = {
    xs.foldLeft(Future(Seq[String]())) { (acc, i) =>
      acc.flatMap { xxs =>
        fn(i).map { s =>
          xxs :+ s
        }
      }
    }
  }
}
