fun main() {
    var num = 0

    do {
        num++

        if (num % 3 == 0 && num % 5 == 0) {
            println("FizzBuzz")
        } else if (num % 3 == 0) {
            println("Fizz")
        } else if (num % 5 == 0) {
            println("Buzz")
        } else {
            println("$num")
        }
    } while (num in 0..99)
}