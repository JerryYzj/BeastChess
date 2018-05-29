package com.example.mytest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //欢迎进入游戏文本
        TextView hello = (TextView)findViewById(R.id.Slogan);

        //得到人机对战按钮实例
        Button VsComButton = (Button)findViewById(R.id.VsComputerButton);
        //设置监听按钮点击事件
        VsComButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){

                //弹出toast提示按钮被点
                Toast.makeText(MainActivity.this, "Entering Game...", Toast.LENGTH_SHORT).show();
                //初始化一个intent对象
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, VsComActivity.class);
                //启动人机对战的activity
                startActivity(intent);
            }
        });
        //得到人人对战按钮
        Button VsHuman = (Button)findViewById(R.id.VsHuman);
        VsHuman.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                //弹出toast提示按钮被点
                Toast.makeText(MainActivity.this, "Entering Game...", Toast.LENGTH_SHORT).show();

            }
        });

    }
}
