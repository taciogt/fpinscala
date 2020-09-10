import fpinscala.datastructures.Branch
import fpinscala.datastructures.Leaf
import fpinscala.datastructures.Tree._

// exercise 3.25
size(Leaf(1))
size(Branch(Leaf(1), Leaf(2)))

// exercise 3.26
maximum(Leaf(1))
maximum(Branch(Leaf(1), Leaf(2)))
maximum(Branch(Branch(Leaf(1), Leaf(2)), Leaf(3)))