
# Kotlin Grammar

This project is a simple creation of Kotlin Grammar
only used resources that I find helpful are listed in the acknowledgements.

### Built With
* [Antlr4](https://www.antlr.org/)
* [Java](https://openjdk.java.net/)



<!-- GETTING STARTED -->
## Getting Started

This is a simple grammar for Kotlin language. We developed rules for: `assignment`, `reassignment`, `if.. else`, `repeat`,
`while`, `println`, `scan`

### Usage

1. Create a file inside `src/main/kotlin` with `.kt` extension and your code inside
2. Inside `KotlinCompiler.java` change the file name to the one you created
3. Then run `KotlinCompiler.java`



<!-- USAGE EXAMPLES -->
### Codes

All the code that you write, must be inside the `main` function

___


##### Main function
```kotlin
fun main() {
    // Your code here
}
```
___


##### Variable assignment
To declare a variable, you should use the following code: `val variable: Type = Value`. In the original kotlin grammar,
there are two types of variable, the mutables and immutables. In our grammar, we create only mutable variables.
Now, our grammar support only `Int`, `Double` and `String` types
```kotlin
val name: String = "Your name"
val age: Int = 50
val price: Double = 20.50
```
___


##### Print statement
The `print` statement will print the value inside the parenthesis
```kotlin
val kotlin: String = "Kotlin"

// println() -> after printing, will break line
println(kotlin) 

// print() -> after printing, it will not break the line
println(kotlin)
println(kotlin)

// To concatenate use `,` inside the print method
println(kotlin, " is a lovely language")
```
Result:
```
> Kotlin
> KotlinKotlin
> Kotlin is a lovely language
```

___
##### If statement
The conditions are enclosed in parentheses, then the body is enclosed by curly braces. The `else` is optional
```kotlin
val age: Int = 21

if (age >= 18) {
    println("Can drink")
} else {
    println("You don't")
}
```
Result:
`> Can drink`
___


##### Repeat statement
The `repeat` statement will repeat the body `n` times
```kotlin
repeat(10) {
    print("Hi ",)
}
```
`> Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi`
___


##### While statement
The `while` loop need to verify a boolean conditional
```kotlin
val num: Int = 0

while(num < 10) {
    print(num, " ")
    num++
}
```
`> 0 1 2 3 4 5 6 7 8 9`
___

##### Math
The math will respect the precedence
```kotlin
val calc: Int = 10 + 10 * 10
val calc1: Int = (10 + 10) * 10
val calc2: Int = 10 + 10 / 10

println(calc)
println(calc1)
println(calc2)
```

```
> 110
> 200
> 11
```

___


<!-- CONTRIBUTING -->
### Contributing

Contributions are what make the open source community such an amazing place to be learn, inspire, and create. Any contributions you make are **greatly appreciated**.

1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
3. Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the Branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request



<!-- LICENSE -->
### License

Distributed under the MIT License. See `LICENSE` for more information.