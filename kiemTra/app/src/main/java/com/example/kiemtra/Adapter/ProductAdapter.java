package com.example.kiemtra.Adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.kiemtra.R;
import com.example.lib.Model.ProductModel;

import de.hdodenhof.circleimageview.CircleImageView;

public class ProductAdapter extends ArrayAdapter<ProductModel> {
    Activity context;
    int resource;
    public ProductAdapter(@NonNull Context context, int resource) {
        super(context, resource);
        this.context = (Activity) context;
        this.resource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = this.context.getLayoutInflater();
        View productView = layoutInflater.inflate(this.resource,null);

        CircleImageView imgPro = productView.findViewById(R.id.imgUser);
        TextView txtcmnd = productView.findViewById(R.id.txtcmnd);
        TextView txtname = productView.findViewById(R.id.txtName1);
        TextView phone = productView.findViewById(R.id.txtphone);

        ProductModel proModel = getItem(position);
        imgPro.setImageResource(proModel.getPic());
        txtname.setText(proModel.getName());
        txtcmnd.setText(proModel.getCmnd());
        phone.setText(proModel.getPhone());


        return productView;
    }
}

