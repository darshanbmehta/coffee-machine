package machine
import java.util.*
fun status(water: Int, milk: Int, beans: Int, cups: Int, money: Int){
    println("The coffee machine has:")
    println("$water of water")
    println("$milk of milk")
    println("$beans of coffee beans")
    println("$cups of disposable cups")
    println("$"+"$money of money")
// status(water, milk, beans, cups, money)
}

fun main() {
    var water = 400
    var milk = 540
    var beans = 120
    var cups = 9
    var money = 550
   
    val scanner = Scanner(System.`in`)
do{
    print("Write action (buy, fill, take, remaining, exit):")
    val input = scanner.next()
            
            if(input == "buy"){
            do{
                println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:")
                val buy = scanner.next()
                if(buy == "1" && water>= 250 && beans >= 15 && cups >= 1){
                    water -= 250
                    beans -= 16
                    cups -=1
                    money += 4
                    println("I have enough resources, making you a coffee!")
                    break
                } else if(buy == "2" && water>= 250 && milk >=1  && beans >= 15 && cups >= 1){
                    water -= 350
                    milk -=75
                    beans -= 20
                    cups -=1
                    money += 7
                    println("I have enough resources, making you a coffee!")
                    break
                } else if(buy == "3" && water>= 250 && milk >=1  && beans >= 15 && cups >= 1){
                    water -= 200
                    milk -= 100
                    beans -= 12
                    cups -= 1
                    money += 6
                    println("I have enough resources, making you a coffee!")
                    break
                } else if(buy == "back"){
                    break
                    }
                
                else{
                    println("Sorry, not enough water!")
                    break        
                }} while(buy != "back")
            }
            else if(input == "remaining"){
                status(water, milk, beans, cups, money)
                }
                
            else if(input == "fill"){
            println("Write how many ml of water do you want to add:")
            val w1 = scanner.nextInt()
            println("Write how many ml of milk do you want to add:")
            val m1 = scanner.nextInt()
            println("Write how many grams of coffee beans do you want to add:")
            val b1 = scanner.nextInt()
            println("Write how many disposable cups of coffee do you want to add:")
            val c1 = scanner.nextInt()
            
                water += w1
                    milk += m1
                    beans += b1
                    cups += c1
            
        }
            else if(input == "take"){
            println("I gave you " + "$"+" $money")
            money -= money 
            }
                    
            }while(input != "exit")
}
