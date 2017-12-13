package com.example.mihir.a1101037323;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class checkoutActivity extends Activity {
    String Name;
    String Address;
    String Mobile;
    String Food;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout);


        Name= getIntent().getExtras().getString("Name");
        Address= getIntent().getExtras().getString("Address");
        Mobile= getIntent().getExtras().getString("Phone No");
        Food= getIntent().getExtras().getString("Favourite Food");

        TextView textView= (TextView) findViewById(R.id.textCheckout);
        textView.setText("Name- "+Name +"\n"+"Address- " +Address +"\n"+"Credit Card No- #: xxxx-xxxx-xxxx-xxxx"+"\n"+"Mobile No- " +Mobile+"\n"+"Favourite Food- "+Food);





    }



}
