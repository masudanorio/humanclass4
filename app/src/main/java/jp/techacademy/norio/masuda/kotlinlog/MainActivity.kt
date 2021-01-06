package jp.techacademy.norio.masuda.kotlinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log   // ここを追加

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human = Human("のりお", 34, hobby = "読書")      // 名前を〜〜、年齢〜〜歳で、Humanのインスタンスを作る

        human.say()

        human.think()


    }
}