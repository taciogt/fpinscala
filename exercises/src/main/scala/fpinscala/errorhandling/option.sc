import fpinscala.errorhandling.Option._
import scala.collection.immutable.Seq

// exercise 4.1
val one = Some(1)
val pi = Some(3.14)
val none: Option[Int] = None
val noneDouble: Option[Double] = None


one.map(_ + 1)
none.map((x) => x + 1)

pi.getOrElse(3)
noneDouble.getOrElse(3)

variance(Seq(1,2,3,4,3))
//one.flatMap(_ + 1)
//none.flatMap((x) => x + 1)