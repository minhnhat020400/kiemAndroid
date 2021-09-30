package com.example.kiemtra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.lib.Model.user;

public class Detail extends AppCompatActivity {
    ImageView imgUser;
    public user temp= MainActivity.temp;
    TextView txtngaysinh,txtsex,txtquoctich,txtque,txtsCMND,txtnoiThuongChu,txtgiatriden,txtten;
    Button btnBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        txtgiatriden= findViewById(R.id.txtgiatriden);
        txtngaysinh= findViewById(R.id.txtngaysinh);
        txtsex= findViewById(R.id.txtsex);
        txtquoctich=findViewById(R.id.txtquoctich);
        txtque= findViewById(R.id.txtque);
        txtsCMND= findViewById(R.id.txtsCMND);
        txtnoiThuongChu= findViewById(R.id.txtnoiThuongChu);
        txtten= findViewById(R.id.txtten);
        imgUser= findViewById(R.id.imgHinh);
        btnBack= findViewById(R.id.button);

        txtgiatriden.setText(temp.getGiatriden());
        txtngaysinh.setText(temp.getNgaysinh());
        txtsex.setText(temp.getSex());
        txtquoctich.setText(temp.getQuoctich());
        txtque.setText(temp.getQue());
        txtsCMND.setText(temp.getsCMND());
        txtnoiThuongChu.setText(temp.getNoiThuongChu());
        txtten.setText(temp.getTen());
        imgUser.setImageResource(temp.getImgHinh());
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Detail.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}