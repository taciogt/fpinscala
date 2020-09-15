package fpinscala.datastructures

sealed trait Tree[+A]

case class Leaf[A](value: A) extends Tree[A]

case class Branch[A](left: Tree[A], right: Tree[A]) extends Tree[A]


object Tree {

  def size[A](tree: Tree[A]): Int =
    tree match {
      case Leaf(_) => 1
      case Branch(left, right) => size(left) + size(right)
    }

  def maximum(tree: Tree[Int]): Int =
    tree match {
      case Leaf(v) => v
      case Branch(l, r) => maximum(l) max maximum(r)
    }

  def depth[A](tree: Tree[A]): Int =
    tree match {
      case Leaf(_) => 1
      case Branch(l, r) => 1 + (depth(l) max depth(r))
    }

  def map[A, B](tree: Tree[A])(f: A => B): Tree[B] =
    tree match {
      case Leaf(a) => Leaf(f(a))
      case Branch(l, r) => Branch(map(l)(f), map(r)(f))
    }

  def fold[A, B](t: Tree[A])(f: A => B)(g: (B, B) => B): B = t match {
    case Leaf(a) => f(a)
    case Branch(l, r) => g(fold(l)(f)(g), fold(r)(f)(g))
  }

  def sizeViaFold[A](t: Tree[A]): Int = {
    fold(t)(_ => 1)(_ + _)
  }

  def maximumViaFold(t: Tree[Int]): Int = {
    fold(t)(a => a)((x, y) => x max y)
  }

  def depthViaFold[A](t: Tree[A]): Int = {
    fold(t)(_ => 1)((x, y) => 1 + (x max y))
  }

  def mapViaFold[A, B](t: Tree[A])(f: A => B): Tree[B] = {
    fold(t)(a => Leaf(f(a)): Tree[B])((x, y) => Branch(x, y))
  }
}