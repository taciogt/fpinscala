import fpinscala.datastructures.List

// exercise 3.1
List.x

// exercise 3.2
List.tail(List())
List.tail(List(1))
List.tail(List(1, 2))
List.tail(List(1, 2, 3))

// exercise 3.3
List.setHead(List(), 0)
List.setHead(List(1), 0)
List.setHead(List(1, 2), 0)
List.setHead(List(1, 2, 3), 0)

// exercise 3.4
List.drop(List(), 0)
List.drop(List(1), 0)
List.drop(List(1), 1)
List.drop(List(1, 2), 0)
List.drop(List(1, 2), 1)
List.drop(List(1, 2, 3), 0)
List.drop(List(1, 2, 3), 1)
List.drop(List(1, 2, 3), 2)
List.drop(List(1, 2, 3), 3)

// exercise 3.5
List.dropWhile(List(1, 2, 3), (x: Int) => x <= 1)
List.dropWhile(List(1, 2, 3), (x: Int) => x > 1)
List.dropWhile(List(1, 2, 3, 4, 5, 6), (x: Int) => x > 1)
List.dropWhile(List(1, 2, 3, 4, 5, 6), (x: Int) => x % 2 == 0)
List.dropWhile(List(1, 2, 3, 4, 5, 6), (x: Int) => x <= 3)