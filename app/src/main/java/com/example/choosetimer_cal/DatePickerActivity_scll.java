package com.example.choosetimer_cal;


import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import java.util.Calendar;


/**
 * Created by 小乖 on 2018/4/10.
 * 日期选择
 */

public class DatePickerActivity_scll extends AppCompatActivity implements DatePicker.OnDateChangedListener {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_data_picker_scll);


//实例化控件
        DatePicker dp_test = (DatePicker) findViewById(R.id.btn_date_scll);
        TextView tv_date = (TextView) findViewById(R.id.tv_date_picker);
        Calendar calendar = Calendar.getInstance();
        Button btn_qd = (Button)findViewById(R.id.btn_qd);


        int year = calendar.get(Calendar.YEAR);
        int monthOfYear = calendar.get(Calendar.MONTH);
        int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
        dp_test.init(year, monthOfYear, dayOfMonth, this);


    }


//    点击日期后执行 onDateChanged()函数
    @Override
    public void onDateChanged(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
        String year1 = Integer.toString(year);
        String monthOfYear1 = Integer.toString(monthOfYear+1);
        String dayOfMonth1= Integer.toString(dayOfMonth);


//        数据传递给上一个活动
        Intent intent = new Intent();
        intent.putExtra("year",year1);
        intent.putExtra("monthOfYear",monthOfYear1);
        intent.putExtra("dayOfMonth",dayOfMonth1);

        setResult(RESULT_OK,intent);

    }

    public void onClick(View v) {
        if (v.getId() == R.id.btn_qd) {
           finish();
        }
    }

}

