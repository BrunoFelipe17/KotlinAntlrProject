fun main() {
    val age: Int = 21
    val name: String = "Bruno"
    val price: Double = 10.50
    val num: Int = 0
    val calc: Int = (10 + 10) * 10
    println(calc)

    if (age > 21) {
        println(name, " can drink!")
    } else {
        println(name, " can't drink :-(")
    }

    repeat (10) {
        print(num, " ")
        num++
    }

    num = 0
    println("")
    println("Valor de num: ", num)
    while (num < 10) {
        if (num % 2 == 0) {
            println(num, " é par")
        } else {
            println(num, " é impar")
        }
        num++
    }


    println("Alguns calculos")

    print(price)
    price *= 10
    println(" *= 10: ", price)

    price = 10.50
    print(price)
    price /= 10
    println(" /= 10: ", price)

    price = 10.50
    print(price)
    price += 10
    println(" += 10: ", price)

    price = 10.50
    print(price)
    price -= 10
    println(" -= 10: ", price)
}