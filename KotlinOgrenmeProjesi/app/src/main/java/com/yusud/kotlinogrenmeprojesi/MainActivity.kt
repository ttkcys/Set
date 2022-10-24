package com.yusud.kotlinogrenmeprojesi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Set
        println("---------------Set---------------")

        //Aynı veriden bir tane barındırıyor.

        val ornekDizi = arrayOf(7,8,9,9,9,8,10)
        println("index 2: " + ornekDizi[2])
        println("index 3: ${ornekDizi.get(3)}")
        println(ornekDizi.size)

        val benimSet = setOf<Int>(7,8,9,9,9,8,10)
        println(benimSet.size)

        //For Each
        benimSet.forEach {
            println(it)
        }

        val benimSet2 = HashSet<String>()
        benimSet2.add("Yusufhan")
        benimSet2.add("Yusufhan")
        benimSet2.add("Yusufhan")
        benimSet2.add("Keleş")

        benimSet2.forEach {
            println(it)
        }


    }
}