package com.example.mihir.a1101037323;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.view.View.OnClickListener;


public class contactInformationActivity extends Activity
{
    private EditText et_name, et_address, et_CCno, et_phno, et_favfood;

    private String name, address, CCno, phno, favfood;

    Button regbtn;
    //StringBuilder build;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_information);
        et_name= (EditText) findViewById(R.id.name);
        et_address= (EditText) findViewById(R.id.address);
        et_CCno= (EditText) findViewById(R.id.CCno);
        et_phno= (EditText) findViewById(R.id.phno);
        et_favfood= (EditText) findViewById(R.id.favfood);
        regbtn=(Button) findViewById(R.id.regbtn);
        regbtn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v)
            {


                register();
                //validate();
                //Intent intent = new Intent(contactInformationActivity.this, checkoutActivity.class);
                //intent.putExtra("selectedCuisine");
                //startActivity(intent);


                if(!validate()==false)
                {

                    String name= et_name.getText().toString();
                    String address= et_address.getText().toString();
                    String CreditCardNo= et_CCno.getText().toString();
                    String PhoneNo= et_phno.getText().toString();
                    String FavouriteFood= et_favfood.getText().toString();

                    Intent intent = new Intent(contactInformationActivity.this, checkoutActivity.class);
                    intent.putExtra("Name", name);
                    intent.putExtra("Address", address);
                    intent.putExtra("Credit Card No", CreditCardNo);
                    intent.putExtra("Phone No", PhoneNo);
                    intent.putExtra("Favourite Food", FavouriteFood);


                    startActivity(intent);

                }

            }

            public void register()
            {
                intialize();
                if(!validate())
                {
                    Toast.makeText(contactInformationActivity.this,"Registration has failed", Toast.LENGTH_SHORT).show();
                }
                else
                {
                 registrationSuccess();
                }
            }

            public void registrationSuccess() {
            }

            public boolean validate()
            {
                boolean valid=true;
                if(name.isEmpty()||name.length()>32)
                {
                    et_name.setError("please Enter a valid name");
                    valid=false;
                }

                 if(address.isEmpty()||address.length()>20)
                {
                    et_address.setError("Please enter a valid address");
                    valid=false;
                }

               if(CCno.isEmpty()||CCno.length()<16)
                {
                    et_CCno.setError("Please enter a valid credit card number");
                    valid=false;
                }
                 if(phno.isEmpty()||phno.length()<10)
                {
                    et_phno.setError("Please enter a valid phone number");
                    valid=false;
                }

                if(favfood.isEmpty()||favfood.length()>30)
                {
                    et_favfood.setError("Please enter a valid food item");
                    valid=false;
                }

                return valid;

            }



            public void intialize()
            {
                name=et_name.getText().toString().trim();
                address=et_address.getText().toString().trim();
                CCno=et_CCno.getText().toString().trim();
                phno=et_phno.getText().toString().trim();
                favfood=et_favfood.getText().toString().trim();


            }
        });




        //TextView textView = (TextView) findViewById(R.id.textView);

        //final List<String> foodList= getIntent().getStringArrayListExtra("selectedItem");
        //build = new StringBuilder();

        //for(String det: foodList)
        //{
            //build.append(det+"\n");
            //foodList.add(det.toString());
        //}
        //textView.setText(build.toString());

    }

}
