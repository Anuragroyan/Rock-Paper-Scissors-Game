package com.example.rockpaperscissors

import androidx.core.text.isDigitsOnly
import androidx.core.util.rangeTo

fun main(){
   var computerChoice = ""
   var playerChoice = ""
    println("Rock, Paper or Scissors? Enter your choice!")
    playerChoice = readln()
    while(playerChoice == "Rock" || playerChoice == "Paper" || playerChoice == "Scissors"){
        val randomNumber = (1..3).random()
        when (randomNumber) {
            1 -> {
                computerChoice = "Rock"
            }
            2 -> {
                computerChoice = "Paper"
            }
            3 -> {
                computerChoice = "Scissors"
            }
        }
        println(computerChoice)
        val winner = when {
            playerChoice == computerChoice -> "Tie"
            playerChoice == "Rock" && computerChoice == "Scissors" -> "Player"
            playerChoice == "Paper" && computerChoice == "Rock" -> "Player"
            playerChoice ==  "Scissors" && computerChoice == "Paper" -> "Player"
            else -> "Computer"
        }
        if(winner == "Tie"){
            println("It's a Tie")
            break
        }
        else{
            println("$winner won!")
            break
        }
    }
    println("Please enter only rock paper scissors as input!")
}