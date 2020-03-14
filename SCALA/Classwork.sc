import scala.collection.mutable.ListBuffer

val myName = "Valdis"
println(myName)
// values cannot be reassigned ! myName = "Voldemars"
var myFood = "potatoes"
println(myFood)
myFood = "ice cream"
println(myFood)
println(res0)
println(res2)
def add(n: Int): Int  = n + 10
println(add(55))
def square(n: Int): Int = {
  println("Working")
  //do more stuff here
  n*n
}
println(square(10))

// 5 -5 , -10 10
def opposite(n: Int):Int = n*(-1)
def opposite2(n: Int):Int = -n
opposite(55)
opposite2(55)
opposite2(0)

def printName(name: String, cnt: Int) = {
  var i = 0
  while (i < cnt) {
    println(name)
    i += 1 // i = i + 1 same thing
  }
  true
}
printName("Valdis", 5)

def pName(name: String, cnt: Int) = {
  for (_ <- 1 to cnt) {
    println("Printing:"+name)
  }
  true
}
pName("Alus", 3)

val myList = List(1,2,3,5)
//var n = 0 we do not need for loop scope
for (n <- myList) {
  println(n)
}
for (it <- myList) println(it)
// it is no more! println(it)

def isOdd(n: Int): Boolean = {
  //we could do more stuff here
  n%2 == 1
}

isOdd(opposite(-1))
isOdd(0)
isOdd(5)
isOdd(6)

val arr = Array(1,2,3,4,5)
arr(3)
val a = (1 to 10).toArray
a(6)

def printEvens(arr: Array[Int]) = {
  //nothing so far
  for (n <- arr) {
    if (n%2 == 0) {
      println("Number is", n)
    }
  }
  "Printed"
}
printEvens(a)

// https://docs.scala-lang.org/tour/default-parameter-values.html
def fizzBuzz(beg: Int = 1, end: Int = 100, fizz: Int = 5, buzz: Int = 7) ={
  println("Fizzing")
  for (a<- beg to end) {
    if(a%fizz==0) print("Fizz")
    if(a%buzz==0) print("Buzz")
    if(a%fizz!=0 && a%buzz!=0) print (a)
    println()
  }
  "Success!"
}
fizzBuzz(end = 30)

//String Interpolation
println(s"Hello $myName and 2+2=${2+2}")
myName.length
myName.substring(2,5)
myName.substring(0,4)
myName.reverse
for (c <- myName) {
  println(c)
}
val text = "A quick brown fox jumped over a sleeping dog"
for (c <- text) println(c)
for (word <- text.split(" ")) println(word)
"Labdien Accenture grupa".split(" ")
//for (word <- res30) println(word)

var myMap = Map("food" -> "potatoes", "likes" -> "biking")
myMap("food")

for ((key, value) <- myMap) println(s"My key $key and value $value")

myMap.foreach {
  case(key, value) => println(s"My key $key and value $value")
}

def test(n:Int):String = n match {
  case 1 => "Sveiciens"
  case 2 => "Atā!"
  case _ => "Nesaprotu" // _ is catch all (default)
}

test(0)
test(1)
test(2)

arr.foreach {
  value => println(value*2)
}

def isDivisibleBy7(n: Int):Boolean = {
  //n in form 10x+y divides by 7 if and only if x-2y divides 7
  //371 -> 37 - (2x1) -> 35
  //1603 -> 160 -(2x3) -> 154 -> 15 - (2x4) -> 7
//  var mynum = n
//  while (mynum >= 100) {
//    val x = mynum / 10
//    val y = mynum % 10
//    mynum = x-2*y
//  }
  var mynum = n
  while (mynum > 99) mynum = mynum / 10 - (mynum%10)*2

  //do this only when mynum < 100
  mynum % 7 == 0

}

isDivisibleBy7(10)
isDivisibleBy7(1603)
isDivisibleBy7(371)
isDivisibleBy7(33335)

val planets =
  List(("Mercury", 57.9), ("Venus", 108.2), ("Earth", 149.6),
    ("Mars", 227.9), ("Jupiter", 778.3))
planets.length

for (planet <- planets) {
  println(planet._1, planet._2)
}

//pattern and we get the values inside tuple
planets.foreach{
  case( planet, distance ) => println(planet, distance)}

Math.pow(2,8).toInt
Math.random()

val closeToSun = planets.filter( planet => planet._2 < 150)
for(p <- closeToSun) println(p._1)

val numbers = (1 to 20).toList
val squares = numbers.apply(10)

var myListBuffer = new ListBuffer[Int]()
for (num <- numbers) {
    myListBuffer += Math.pow(num,2).toInt
}
for (el <- myListBuffer) println(s"My square is $el")
val myFixedList = myListBuffer.toList

val newList = 0 :: myFixedList

//prepending to list with :: is fixed operation
//concatenation with ::: will take longer (means O(n) in computer science language) the more list members

val newList2 = 0 :: myFixedList ::: List(441)

newList.head
newList.tail

def cubeIt(n:Int)= n*n*n

val cubes = numbers.map(cubeIt)

val tetras = numbers.map(n => Math.pow(n,4).toInt)

val dividesWith3 = tetras.filter(n => n%3 == 0)

val mySum = dividesWith3.reduce((a,b) => a+b)
dividesWith3.sum

// Find product of all even squares of numbers 10 to 30 inclusive
//challenge do it with filter, map and reduce
val mySquares = (10 to 21).toList.filter(n => n % 2 == 0).map(n => (n * n).toLong).reduce((a,b) => a*b)
//val myProduct = mySquares.product

val bigCubes = (10 to 30).toList.filter(n => n%2 == 0).map(n => BigInt(n*n*n)).reduce((a,b) => a*b*10)








