package com.userlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnClick(View v){
        //获取控件对象
        EditText edUserName = (EditText)findViewById(R.id.edUsername);
        EditText edPassword = (EditText)findViewById(R.id.edpassword);
        RadioButton raBtnName = (RadioButton)findViewById(R.id.raBtnName);
        RadioButton raBtnEmail = (RadioButton)findViewById(R.id.raBtnEmail);
        CheckBox chbRemember = (CheckBox)findViewById(R.id.chbRemember);
        TextView Result = (TextView)findViewById(R.id.Result);

        //创建属性
        String DbUser="",Dbpassword = "";
        //逻辑判断
        if(raBtnName.isChecked()){
            DbUser = "wenjin";
            Dbpassword = "12345679";
        }else if (raBtnEmail.isChecked()){
            DbUser = "wenjin@gmail.com";
            Dbpassword = "123456789";
        }

        //获取文本框数据
        String Username = edUserName.getText().toString();
        String Password = edPassword.getText().toString();
        if(Username.equals(DbUser)){
            if (Password.equals(Dbpassword)){
//                Result.setText("登录成功");
//                Toast.makeText(this, "登录成功", Toast.LENGTH_SHORT).show();
                Toast toast = Toast.makeText(this, "登录成功", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER,0,0);
                LinearLayout layout = (LinearLayout)toast.getView();
                ImageView img = new ImageView(getApplicationContext());
                img.setImageResource(R.drawable.wen);
                layout.addView(img,0);
                toast.show();
            }else{
//                Result.setText("密码错误，登陆失败");
//                Toast.makeText(this, "密码错误，登陆失败", Toast.LENGTH_SHORT).show();
                Toast toast = Toast.makeText(this, "密码错误，登陆失败", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER,0,0);
                LinearLayout layout = (LinearLayout)toast.getView();
                ImageView img = new ImageView(getApplicationContext());
                img.setImageResource(R.drawable.wen);
                layout.addView(img,0);
                toast.show();
            }
        }else {
//            Result.setText("用户名不存在，请核对");
//            Toast.makeText(this, "用户名不存在，请核对", Toast.LENGTH_SHORT).show();
            Toast toast = Toast.makeText(this, "用户名不存在，请核对", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER,0,0);
            LinearLayout layout = (LinearLayout)toast.getView();
            ImageView img = new ImageView(getApplicationContext());
            img.setImageResource(R.drawable.wen);
            layout.addView(img,0);
            toast.show();
        }
    }


}