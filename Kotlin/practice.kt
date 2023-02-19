import kotlin.random.Random

fun main(){
    val secretNumber = Random.nextInt(1, 101)
    var guess: Int
    var count = 0

    println("Welcome to my game!")
    do{
        print("Please guess a number: ")
        guess = readLine()!!.toInt()
        count++

        when{
            guess == secretNumber -> println ("Congrats!")
            guess < secretNumber -> println("Too Low!")
            guess > secretNumber -> println("Too High!")
        }
    } while (guess != secretNumber)
}