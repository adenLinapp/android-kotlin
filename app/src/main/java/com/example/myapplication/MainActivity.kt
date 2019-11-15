package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import kotlinx.android.synthetic.main.activity_main.*; //import kotlinx.android.synthetic.main.<layout>.view.*

import android.view.Menu
import android.view.MenuItem
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.setDisplayShowTitleEnabled(false);

        text_view.setText("hello 你好嗎");

        /** 語法差異 **/
//        https://github.com/MindorksOpenSource/from-java-to-kotlin/blob/master/README-ZH.md


        /**  變數定義 前兩為原java **/
//        String name = "hello su";
//        final String name = "hello Ian";

//        val c: Int // 沒有起始值時初始化請給予變數類型
//        var name = "hello jason"
//        val name2 = "hello will"

        /**  字串串接  **/
//        val message = "My name is: $firstName $lastName"

        /**  字串換行 不使用\n  **/
//        val text = """
//        |First Line
//        |Second Line
//        |Third Line
//        """.trimMargin()

        /** if 可以帶有返回值 **/
//        val max = if (a > b) a else b

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu to use in the action bar
        val inflater = menuInflater
        inflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle presses on the action bar menu items
        when (item?.itemId) {
            R.id.action_su -> {
                text_view.text = "hello su"

                return true
            }
            R.id.action_Ian -> {
                text_view.text = "hello Ian"
                return true
            }
            R.id.action_Jason -> {
                text_view.text = "hello jason"
                return true
            }
            R.id.action_will -> {
                text_view.text = "hello will"
                return true
            }
            R.id.action_mora -> {
//                var Intent = Intent(this,MoraActivity::class.java);
                var Intent = Intent(this@MainActivity,MoraActivity::class.java); // ::  <<<<類別
                startActivity(Intent);
                return true
            }
            else -> return true
        }
        return super.onOptionsItemSelected(item)
    }
}
