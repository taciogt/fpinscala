import fpinscala.datastructures._
import fpinscala.datastructures.List._

// exercise 3.1
List.x

// exercise 3.2
tail(List())
tail(List(1))
tail(List(1, 2))
tail(List(1, 2, 3))

// exercise 3.3
setHead(List(), 0)
setHead(List(1), 0)
setHead(List(1, 2), 0)
setHead(List(1, 2, 3), 0)

// exercise 3.4
drop(List(), 0)
drop(List(1), 0)
drop(List(1), 1)
drop(List(1, 2), 0)
drop(List(1, 2), 1)
drop(List(1, 2, 3), 0)
drop(List(1, 2, 3), 1)
drop(List(1, 2, 3), 2)
drop(List(1, 2, 3), 3)

// exercise 3.5
dropWhile(List(1, 2, 3), (x: Int) => x <= 1)
dropWhile(List(1, 2, 3), (x: Int) => x > 1)
dropWhile(List(1, 2, 3, 4, 5, 6), (x: Int) => x > 1)
dropWhile(List(1, 2, 3, 4, 5, 6), (x: Int) => x % 2 == 0)
dropWhile(List(1, 2, 3, 4, 5, 6), (x: Int) => x <= 3)

// exercise 3.6
init(List(1))
init(List(1, 2))
init(List(1, 2, 3))

// exercise 3.8
foldRight(List(1, 2, 3), Nil: List[Int])(Cons(_, _))

// exercise 3.9
length(List())
length(List(1, 2, 3))
length(List(1, 2, 3, 4))

// exercise 3.11
sum(List(1, 3, 5, 7))
sum2(List(1, 3, 5, 7))
sum3(List(1, 3, 5, 7))
sum3(List(2, 4, 6, 8))

product(List(1, 3, 5, 7))
product2(List(1, 3, 5, 7))
product3(List(1, 3, 5, 7))
product3(List(2, 4, 6, 8))

length2(List(1))
length2(List(1, 2))
length2(List(1, 2, 3))

// exercise 3.12
reverse(List())
reverse(List(1))
reverse(List(1, 2))
reverse(List(1, 2, 3))

// exercise 3.13
// TODO

// exercise 3.14
//appendViaFoldLeft(List(1, 2, 3), 4)
appendViaFoldRight(List(1, 2, 3), 4)

// exercise 3.15
concat(List(List(1, 2, 3), List(4, 5, 6)))

// exercise 3.16
addOne(List(1, 3, 5))

// exercise 3.17
doubleToString(List(1, 2, 3))

// exercise 3.19
filter(List(1, 2, 3, 4, 5, 6, 7, 8, 9))(_ % 3 != 0)

// exercise 3.20
flatMap(List(1, 2, 3))(a => List(a, a * 2, a))

// exercise 3.21
filterViaFlatMap(List(1, 2, 3, 4))(_ % 2 == 0)

// exercise 3.22
addPairwise(List(1, 2, 3), List(4, 5, 6))

// exercise 3.23
zipWith(List("a", "b", "c"), List(1, 2, 3))((c, i) => c*i)