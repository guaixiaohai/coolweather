package com.example.choosetimer_cal;

/**
 * Created by 小乖 on 2018/4/10.
 * 显示日历形式的时间选择器
 */

//guaixiaohai

import java.util.Calendar;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.app.DatePickerDialog.OnDateSetListener;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

/**
 * Created by ouyangshen on 2016/10/7.
 */
public class MainActivity extends AppCompatActivity implements OnClickListener {
       private TextView tv_date;
        @Override
        protected void onCreate(@Nullable Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);

                findViewById(R.id.ln_activity_main_rq).setOnClickListener(this);
                tv_date = findViewById(R.id.tv_date_picker);

        }
//对反馈数据的处理操作
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode){
            case 1:
                if(resultCode == RESULT_OK){
                    String year = data.getStringExtra("year");
                    String monthOfYear = data.getStringExtra("monthOfYear");
                    String dayOfMonth = data.getStringExtra("dayOfMonth");

                    tv_date.setText("您选择的日期是" + year + "年" + monthOfYear + "月" + dayOfMonth + "日");

                }
                break;
            default:
        }
    }

//启动日历的requestCode码
        @Override
        public void onClick(View v) {
                if (v.getId() == R.id.ln_activity_main_rq) {
                        startActivityForResult(new Intent(MainActivity.this,DatePickerActivity_scll.class),1);
                }

        }

}


















