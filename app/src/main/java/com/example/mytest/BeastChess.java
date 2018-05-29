package com.example.mytest;

import android.graphics.Color;
import android.view.View;
import android.graphics.Paint;
import android.graphics.Canvas;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.MotionEvent;
import android.util.AttributeSet;

//棋子类型的枚举类
enum Type{
    Elephant, Lion, Tiger, Leopard, Wolf, Dog, Cat, Mouse, None
}
//ChessGrid类描述每个格点的情况
class ChessGrid{

    //格点的横纵坐标
    private int x;
    private int y;
    //是否被占据
    private boolean isOccupied;
    //属于哪一方 0未被占据 1红 2蓝
    private int WhichSide;
    //棋子类型
    private Type type;
    //是否为河流
    private boolean isRiver;
    //是否为巢穴
    private boolean isCave;
    //是否为陷阱
    private boolean isTrap;
    //是否为普通位置
    private boolean isNorm;

    //构造格点
    public ChessGrid(int _x, int _y, int side, Type _type, boolean if_norm,
              boolean if_river, boolean if_cave, boolean if_trap){
        x = _x;
        y = _y;
        isOccupied = true;
        WhichSide = side;
        type = _type;
        isNorm = if_norm;
        isRiver = if_river;
        isCave = if_cave;
        isTrap = if_trap;
    }
    //判断目标移动位置是否合理
    public boolean isValidMove(int des_x, int des_y){
        boolean flag = true;
        return flag;
    }
    //移动棋子
    public void Move(int des_x, int des_y){

    }
    //移动后清空格点
    public void Erase(){
        isOccupied = false;
        WhichSide = 0;
        type = Type.None;
    }
    //重置格点
    public void SetGrid(int side, Type _type){

    }
    public int get_x(){
        return x;
    }
    public int get_y(){
        return y;
    }
    public Type get_type(){
        return type;
    }
    public boolean if_occupied(){
        return isOccupied;
    }
    public int get_side(){
        return WhichSide;
    }
    public boolean if_river(){
        return isRiver;
    }
    public boolean if_cave(){
        return isCave;
    }
    public boolean if_norm(){
        return isNorm;
    }
    public boolean if_trap(){
        return isTrap;
    }
}

//BeastChess类实现游戏逻辑和棋盘绘制
public class BeastChess extends View implements View.OnTouchListener{

    //画笔
    private Paint paint;
    //棋盘数组
    private ChessGrid[][] ChessBoard;
    //下棋顺序(默认红方先下)
    private boolean isRed = true;
    //游戏是否结束
    private boolean isGameOver = false;

    //棋盘宽的格数
    private float Grid_Width = 9;
    //棋盘高的格数
    private float Grid_Height = 7;



    public BeastChess(Context context){
        this(context,null);
    }
    public BeastChess(Context context, AttributeSet attrs){
        this(context, attrs, 0);
    }
    public BeastChess(Context context, AttributeSet attrs, int defStyleAttr){
        super(context, attrs, defStyleAttr);

        //初始化Paint
        paint = new Paint();
        //设置抗锯齿
        paint.setAntiAlias(true);
        paint.setColor(Color.BLACK);
    }
    public boolean onTouch(View v, MotionEvent event){
        boolean return_value = true;
        return return_value;
    }

}
