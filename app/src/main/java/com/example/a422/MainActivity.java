package com.example.a422;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    int currentPosition = 0;
    ArrayList<Product> products;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.listView);

        products = new ArrayList<Product>();
        products.add(new Product(1,2, "Танчик", R.drawable.tank));
        products.add(new Product(10,20, "Автомобильчик", R.drawable.am200));
        products.add(new Product(15,30, "Мотик", R.drawable.moto200));
        products.add(new Product(1,25, "Самолётик", R.drawable.flight200));
        products.add(new Product(90,40, "Вертолётик", R.drawable.helicopter200));
        products.add(new Product(3500,1, "Чувиха", R.drawable.girl01));
        products.add(new Product(5000,1, "Другая Чувиха", R.drawable.blondinka200));
        products.add(new Product(1500,1, "Чувиха не дорого", R.drawable.a3));
        products.add(new Product(6750,1, "Дорогая чувиха", R.drawable.a4));
        products.add(new Product(19990,0, "Всем чувихам Чувиха", R.drawable.chuvixa200));

        BasketAdapter adapter = new BasketAdapter(this, products);

        listView.setAdapter(adapter);

        Button buttonRemove = findViewById(R.id.buttonRemove);
        buttonRemove.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

//                View parent = (View) v.getParent();
//                TextView priceTextView = parent.findViewById(R.id.price);
//                String price = priceTextView .getText().toString();
//                Toast.makeText(getApplicationContext(), "price = " + price, Toast.LENGTH_SHORT).show();

//                Toast.makeText(MainActivity.this
//                        ,"- Удаление - позиции № " + Integer.toString(currentPosition)
//                        ,Toast.LENGTH_LONG)
//                        .show();

                //products.remove(currentPosition);
                //adapter.notifyDataSetChanged();

            }
        });

//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id){
//                currentPosition =  position;
////                adapter.notifyDataSetChanged();
//                Toast.makeText(getApplicationContext(), "currentPosition = " + Integer.toString(currentPosition) + " --- productsSize --- " + Integer.toString(products.size()), Toast.LENGTH_SHORT).show();
//            }
//        });
//
//        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
//            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id){
//                Toast.makeText(getApplicationContext(), " OnItemLongClick " + Integer.toString(currentPosition), Toast.LENGTH_SHORT).show();
//                return false;
//            }
//
//        });


    }


}
