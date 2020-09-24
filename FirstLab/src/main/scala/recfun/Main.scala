package recfun

import scala.annotation.tailrec

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }
  /**
   * Exercise 0
   */
  def exponent(b : Int, n : Int) : Int = {
    if (b == 0) 1
    else {
      if (n == 0) 1 else b * exponent(b, n - 1)
    }
  }
  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = {
    if (c == 0 || c == r)
      1
    else
      pascal(c - 1, r - 1) + pascal(c, r - 1)
  }
  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
    def calc(chars: List[Char], open: Int, close: Int) : Boolean = {
      if (chars.size == 0)
      {
        if(open == close) true else false
      } else {
        if (chars.head == '(' || chars.head == ')')
        {
          if (chars.head == '(') {
            calc(chars.tail, open + 1, close)
          } else {
            if (close + 1 > open) false else calc(chars.tail, open, close + 1)
          }
        } else
          calc(chars.tail, open, close)
      }
    }
    calc(chars, 0, 0)
  }
  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = {
    if (money == 0) 1
    else if (money < 0) 0
    else coins.map { x => countChange(money - x, coins.filter((y: Int) => y >= x)) }.sum
  }

  }
