def fib(n: Int) : Int = {
  def go(n: Int, cur: Int, next: Int = 1) : Int =
    if (n == 0) cur
    else if (n == 1) next
    else go(n-1, next, (cur + next))
  go(n, 0, 1)
}
