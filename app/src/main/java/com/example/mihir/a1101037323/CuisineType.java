package com.example.mihir.a1101037323;

import android.app.Activity;

import android.support.annotation.IdRes;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;





public class CuisineType extends Activity {
    RadioGroup rgp;
   // RadioButton rBtn1, rBtn2, rBtn3, rBtn4, rBtn5;
    Button b2;
    String[] input;
    String[] cuisineArr;
    RadioButton rbtn;
    //boolean clicked=false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuisine_type);

        input = new String[1];
        cuisineArr = getResources().getStringArray(R.array.cuisine_options);
        b2 = (Button) findViewById(R.id.button2);

        rgp = (RadioGroup) findViewById(R.id.radioGroup);
        b2.setEnabled(false);
        createRadbtn();

        b2.setOnClickListener(new View.OnClickListener() {


                @Override
                public void onClick(View v)
                {

                        Intent intent = new Intent(CuisineType.this, RestaurantActivity.class);
                        intent.putExtra("selectedCuisine", input[0]);
                        startActivity(intent);

                        }
            });


    }

    private void createRadbtn() {
        for (int i = 0; i < cuisineArr.length; i++) {
            rbtn = new RadioButton(this);
            rbtn.setText(cuisineArr[i]);
            rbtn.setId(i);

            rgp.addView(rbtn);

            rgp.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                    rbtn = (RadioButton) findViewById(checkedId);
                    input[0] = rbtn.getText().toString();

                     TextView textView=(TextView) findViewById(R.id.textView2);
                    textView.setText(input[0]);


                    b2.setEnabled(true);
                }
            });

        }
    }
}
