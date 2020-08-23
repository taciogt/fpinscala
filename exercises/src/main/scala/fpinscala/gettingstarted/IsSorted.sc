import fpinscala.gettingstarted.PolymorphicFunctions.isSorted

isSorted(Array(1, 2, 3, 4), (x: Int, y: Int) => x > y)
isSorted(Array(1, 3, 2, 4), (x: Int, y: Int) => x > y)
isSorted(Array(1, 1, 3, 2, 4), (x: Int, y: Int) => x > y)
isSorted(Array(1, 1, 1, 2, 4), (x: Int, y: Int) => x > y)
isSorted(Array(0, 1, 1, 2, 4), (x: Int, y: Int) => x > y)
isSorted(Array(0, 1, 1, 2, 4), (x: Int, y: Int) => x > y)