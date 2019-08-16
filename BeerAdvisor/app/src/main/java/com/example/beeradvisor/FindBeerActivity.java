package com.example.beeradvisor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Spinner;
import java.util.List;

import java.lang.invoke.MethodHandles;

public class FindBeerActivity extends AppCompatActivity {

    private BeerExpert expert = new BeerExpert();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_beer);
    }

    public void onClickFindBeer(View view){
        TextView brend = (TextView)findViewById(R.id.brend);
        Spinner color = (Spinner)findViewById(R.id.color);
        String beerType = String.valueOf(color.getSelectedItem());

        List<String> brandList = expert.getBrands(beerType);
        StringBuilder brandsFormatted = new StringBuilder();
        for(String brand : brandList){
            brandsFormatted.append(brand).append('\n');
        }
        brend.setText(brandsFormatted);
    }
}
