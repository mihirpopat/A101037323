package com.example.mihir.a1101037323;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.AdapterView.OnItemSelectedListener;
import java.util.ArrayList;
import java.util.List;
import android.widget.Spinner;
import android.widget.TextView;


public class RestaurantActivity extends Activity {

    private Restaurant restaurants = new Restaurant();
    private FoodType foodtype = new FoodType();

    String cuisine;
    List<String> listRestaurants, listFoodType;
    ArrayList<String> checkedFoodType = new ArrayList<>();

    LinearLayout LL;
    Spinner sp;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant);

        //getIntent().hasExtra("selectedCuisine") ;
        cuisine = getIntent().getStringExtra("selectedCuisine");
        sp = (Spinner) findViewById(R.id.sp);
        btn = (Button) findViewById(R.id.btn);
        btn.setEnabled(false);
        listRestaurants = restaurants.getRestaurant(cuisine);

        ArrayAdapter<String> adapterRestaurant = new ArrayAdapter<String>(RestaurantActivity.this, android.R.layout.simple_spinner_dropdown_item, listRestaurants);
        sp.setAdapter(adapterRestaurant);

        LL = (LinearLayout) findViewById(R.id.LL);

        createFoodTypeCheckedBox();

        onClickOrder();

    }

    private void createFoodTypeCheckedBox()
    {
       sp.setOnItemSelectedListener(new OnItemSelectedListener() {
           @Override
           public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
           {
               String foodS= (String) parent.getItemAtPosition(position);
               TextView txtRestaurant =(TextView) findViewById(R.id.txtRestaurant);
               listFoodType= foodtype.getFoodType(foodS);
               LL.removeAllViews();


               for(int i=0;i<listFoodType.size();i++)
               {
                   final CheckBox cFood= new CheckBox(RestaurantActivity.this);
                   cFood.setText(listFoodType.get(i));

                   LL.addView(cFood);

                   cFood.setOnClickListener(new View.OnClickListener() {
                       @Override
                       public void onClick(View v)
                       {
                           if(cFood.isChecked())
                           {
                               checkedFoodType.add((String) cFood.getText());
                               btn.setEnabled(true);
                           }

                           else
                           {
                               checkedFoodType.remove((String) cFood.getText());
                               btn.setEnabled(false);
                           }
                       }
                   });
               }

           }

           @Override
           public void onNothingSelected(AdapterView<?> parent) {

           }
       });
    }
    private void onClickOrder()
    {
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(getBaseContext(),contactInformationActivity.class );
                i.putStringArrayListExtra("selectedItem",checkedFoodType);
                startActivity(i);

            }
        });
    }


}