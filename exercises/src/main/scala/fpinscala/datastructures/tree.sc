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

// exercise 3.27
depth(Leaf(1))
depth(Branch(Leaf(1), Leaf(2)))
depth(Branch(Branch(Leaf(1), Leaf(2)), Leaf(3)))
depth(Branch(Branch(Leaf(1), Leaf(2)), Branch(Leaf(1), Leaf(2))))

// exercise 3.28
map(Branch(Branch(Leaf(1), Leaf(2)), Leaf(3)))(_ * 3)

// exercise 3.29
sizeViaFold(Leaf(1))
sizeViaFold(Branch(Leaf(1), Leaf(2)))
sizeViaFold(Branch(Branch(Leaf(1), Leaf(2)), Branch(Leaf(1), Leaf(2))))

maximumViaFold(Branch(Branch(Leaf(3), Leaf(4)), Branch(Leaf(5), Leaf(2))))

depthViaFold(Leaf(1))
depthViaFold(Branch(Leaf(1), Branch(Leaf(1), Leaf(2))))

mapViaFold(Branch(Leaf(1), Branch(Leaf(2), Leaf(3))))(_ * 2)