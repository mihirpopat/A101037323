package com.example.mihir.a1101037323;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mihir on 04-10-2017.
 */

public class Restaurant
{
    List<String> getRestaurant(String cuisine)
    {
        List <String> restaurants = new ArrayList<String>();


        if(cuisine.equals("American"))
        {
            restaurants.add("Chipotle");
            restaurants.add("AandW");

        }

        else if (cuisine.equals("Italian"))
        {
            restaurants.add("Grazie");
            restaurants.add("FAmelia");

        }
        else if (cuisine.equals("Chinese"))
        {
            restaurants.add("HakkaLegend");
            restaurants.add("Mandarin");

        }

        else if (cuisine.equals("Indian"))
        {
            restaurants.add("TandooriFlames");
            restaurants.add("Gurulakshmi");

        }


        else if (cuisine.equals("International"))
        {
            restaurants.add("NewYorkFries");
            restaurants.add("PhoVietnam");

        }
        return restaurants;

    }
}
