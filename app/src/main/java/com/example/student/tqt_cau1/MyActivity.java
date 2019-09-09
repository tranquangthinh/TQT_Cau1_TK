package com.example.student.tqt_cau1;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MyActivity extends AppCompatActivity {

    Button btnthoat,dangNhap;
    CheckBox cb,btnThoat;
    int i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        dangNhap = (Button) findViewById(R.id.btnDangNhap);
        cb = (CheckBox) findViewById(R.id.cbLuuTT);
        dangNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(cb.isChecked()){
                    Toast.makeText(MyActivity.this,"Chào mừng bạn đăng nhập hệ thống, thông tin của bạn đã được lưu",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MyActivity.this,"Chào mừng bạn đăng nhập hệ thống, thông tin của bạn không được lưu",Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnthoat = (Button) findViewById(R.id.btnThoat);
        btnthoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final AlertDialog.Builder mydialog = new AlertDialog.Builder(MyActivity.this);
                mydialog.setTitle("Thông báo");
                mydialog.setMessage("Bạn muốn thoát không?");
                mydialog.setPositiveButton("Có", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }
                });
                mydialog.setNegativeButton("Không", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
                AlertDialog alertDialog = mydialog.create();
                alertDialog.show();
            }
        });
    }
}
