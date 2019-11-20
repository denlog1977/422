package com.example.a422;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class BasketAdapter extends BaseAdapter {

    ArrayList<Product> goods;
    LayoutInflater layoutInflater;
    Context ctx;

    BasketAdapter (Context context, ArrayList<Product> products) {
        ctx = context;
        goods = products;
        layoutInflater = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }


    @Override
    public int getCount() {
        return goods.size();
    }

    @Override
    public Object getItem(int position) {
        return goods.get(position);
    }

    public Product getProduct(int position) {
        return goods.get(position);
    }


    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = convertView;

        if (view == null)
        {
            view = layoutInflater.inflate(R.layout.basket_item, parent,false);
        }

        Product product = getProduct(position);

        ((TextView) (view.findViewById(R.id.name))).setText(product.name);
        ((TextView) (view.findViewById(R.id.price))).setText(Integer.toString(product.price) + ",00 руб.");
        ((TextView) (view.findViewById(R.id.quantity))).setText("Количество: " + Integer.toString(product.quantity) + " шт.");
        ImageView imageView = (ImageView) view.findViewById(R.id.image);
        imageView.setImageResource(product.image);
//        CheckBox chekBox = (CheckBox) view.findViewById(R.id.selected);
//        chekBox.setOnCheckedChangeListener(checkedChangeListener);
        ((TextView) (view.findViewById(R.id.name2))).setText("Дополнительное описание товара (" + product.name + ")");
        ((TextView) (view.findViewById(R.id.price2))).setText("Цена скидкой: " + Integer.toString(product.price));
        ((TextView) (view.findViewById(R.id.quantity2))).setText("Допустимое количество по акции: " + Integer.toString(product.quantity));


        return view;
    }

//    OnCheckedChangeListener checkedChangeListener = new OnCheckedChangeListener() {
//        @Override
//        public void onCheckedChanged(RadioGroup group, int checkedId) {
//
//        }
//    };
}
