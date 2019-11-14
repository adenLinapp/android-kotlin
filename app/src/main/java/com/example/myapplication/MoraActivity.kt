package com.example.myapplication

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_mora_layout.*; //import kotlinx.android.synthetic.main.<layout>.view.*

class MoraActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.setTitle("猜拳");
        setContentView(R.layout.activity_mora_layout)


        stone.setOnClickListener(IMB_stone_onclick);
        scissors.setOnClickListener(IMB_scissors_onclick);
        cloth.setOnClickListener(IMB_cloth_onclick);
        stone.setOnLongClickListener(IMB_stone_longclick);
        scissors.setOnLongClickListener(IMB_scissors_longclick);
        cloth.setOnLongClickListener(IMB_cloth_longclick);
    }


    fun random(n: Int) = (Math.random() * n).toInt()



    private val IMB_stone_onclick = View.OnClickListener{
        imageView.setImageResource(R.drawable.cloth);

    }
    private val IMB_scissors_onclick = View.OnClickListener{
        imageView.setImageResource(R.drawable.stone);
    }
    private val IMB_cloth_onclick = View.OnClickListener{
        imageView.setImageResource(R.drawable.scissors);
    }

    private val IMB_stone_longclick = View.OnLongClickListener{
        Toast.makeText(this,"你按再久都不會贏的！！",Toast.LENGTH_LONG).show();
        true
    }
    private val IMB_scissors_longclick = View.OnLongClickListener{
        Toast.makeText(this,"你按再久都不會贏的哈哈哈！！",Toast.LENGTH_LONG).show();
        true
    }
    private val IMB_cloth_longclick = View.OnLongClickListener{
        Toast.makeText(this,"你按太久了吧大哥！！",Toast.LENGTH_LONG).show();
        true
    }
}