fun main() {
    val num: Int = 0
    val n: Int = 0

    val math: Int = 10 + 10 * 10
    println(math)

    repeat (10) {
        if (num == 5) {
            print("Hahaha! ")
        } else {
            print(num, " ")
        }
        num++
    }

    println("")
    while (num < 20) {
        print(num, " ")
        num++
    }

    println("")


    while (n < 30) {
        if (n % 2 == 0) {
            println(n, " is pair")
        }
        n++
    }

}