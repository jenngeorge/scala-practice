
def isSorted[A](as: Array[A], ordered: (A, A) => Boolean) : Boolean = {
  def loop(n: Int) : Boolean =
    if (n >= as.length - 1) true
    else if (!(ordered(as(n), as(n+1)))) false
    else loop(n+1)

  loop(0)
}

def orderedInts(a: Int, b: Int) : Boolean = a <= b
