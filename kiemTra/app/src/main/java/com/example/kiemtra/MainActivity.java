package com.example.kiemtra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.kiemtra.Adapter.ProductAdapter;
import com.example.lib.Model.ProductModel;
import com.example.lib.Model.user;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    ProductAdapter productAdapter;
    public static user temp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user user = new user();
        user.setTen("Long Đẹp trai");
        user.setNgaysinh("28/01/2000");
        user.setSex("Nam");
        user.setQuoctich("Viet Nam");
        user.setQue("Tp Hcm");
        user.setsCMND("23564564813");
        user.setNoiThuongChu("Chung cu Belleza");
        user.setGiatriden("30/08/2028");
        user.setImgHinh(R.drawable.imglong);

        user user1 = new user();
        user1.setTen("Nhất");
        user1.setNgaysinh("30/10/2000");
        user1.setSex("Nữ");
        user1.setQuoctich("Viet Nam");
        user1.setQue("Đồng Nai");
        user1.setsCMND("23564564813");
        user1.setNoiThuongChu("Ở đâu đó");
        user1.setGiatriden("30/08/2028");
        user1.setImgHinh(R.drawable.imgnhat);

        user user2 = new user();
        user2.setTen("Khoa Đẹp trai");
        user2.setNgaysinh("28/01/2000");
        user2.setSex("Male");
        user2.setQuoctich("Viet Nam");
        user2.setQue("Tp Hcm");
        user2.setsCMND("23564564813");
        user2.setNoiThuongChu("Chung cu Belleza");
        user2.setGiatriden("30/08/2028");

        user2.setImgHinh(R.drawable.imgkhoa);
        listView = findViewById(R.id.list_item);
        productAdapter = new ProductAdapter(this,R.layout.item);
        productAdapter.add(new ProductModel(user.getImgHinh(),user.getTen(),"086603364",user.getsCMND()));
        productAdapter.add(new ProductModel(user1.getImgHinh(),user1.getTen(),"0866033",user1.getsCMND()));
        productAdapter.add(new ProductModel(user2.getImgHinh(),user2.getTen(),"08603364",user2.getsCMND()));
        listView.setAdapter(productAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this,Detail.class);
                switch (position)
                {
                    case 0: temp= user;
                        break;
                    case 1:temp= user1;
                        break;
                    case 2: temp= user2;
                        break;
                }
                startActivity(intent);
            }
        });
    }
}