package com.example.stage2app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.Roll)

        rollButton.setOnClickListener {
            roll()

        }

    }

    private fun roll() {
        val diceOne = Dice(sides = 6)
        val diceTwo = Dice(sides = 6)
        val diceThree = Dice(sides = 6)

        val rollDiceResult = diceOne.rollDices()
        val rollDiceResult2 = diceTwo.rollDices()
        val rollDiceResult3 = diceThree.rollDices()
        val diceImage: ImageView = findViewById(R.id.imageView6)
        val diceImage2: ImageView = findViewById(R.id.imageView7)
        val diceImage3: ImageView = findViewById(R.id.imageView8)

        val diceImageResource = when (rollDiceResult) {
            1 -> R.drawable.d
            2 -> R.drawable.d2
            3 -> R.drawable.d3
            4 -> R.drawable.d4
            5 -> R.drawable.d5
            else -> R.drawable.d6
        }
        diceImage.setImageResource(diceImageResource)

        val diceImageResource2 = when (rollDiceResult2) {

            1 -> R.drawable.d
            2 -> R.drawable.d2
            3 -> R.drawable.d3
            4 -> R.drawable.d4
            5 -> R.drawable.d5
            else -> R.drawable.d6
        }

        diceImage2.setImageResource(diceImageResource2)

        val diceImageResource3 = when (rollDiceResult3) {
            1 -> R.drawable.d
            2 -> R.drawable.d2
            3 -> R.drawable.d3
            4 -> R.drawable.d4
            5 -> R.drawable.d5
            else -> R.drawable.d6
        }
        diceImage3.setImageResource(diceImageResource3)

        if (rollDiceResult == 6 && rollDiceResult2 == 6 || rollDiceResult == 6 && rollDiceResult3 == 6 || rollDiceResult2 == 6 && rollDiceResult3 == 6) {
            Toast.makeText(this, "YOU WIN", Toast.LENGTH_SHORT).show()
        }
        if (rollDiceResult + rollDiceResult2 == 9 || rollDiceResult + rollDiceResult3 == 9 || rollDiceResult2 + rollDiceResult3 == 9) {
            Toast.makeText(this, "YOU LOSE", Toast.LENGTH_SHORT).show()
        }

    }

}

class Dice(var sides: Int) {
    fun rollDices(): Int {

        return (1..sides).random()

    }

}
