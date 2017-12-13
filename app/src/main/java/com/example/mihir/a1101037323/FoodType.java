package com.example.mihir.a1101037323;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mihir on 04-10-2017.
 */

public class FoodType
{
    List<String> getFoodType(String restaurant)
    {
        List<String> FoodTypes = new ArrayList<String>();

        if(restaurant.equals("Chipotle"))
        {
            FoodTypes.add("Burrito Bowl");
            FoodTypes.add("Tacos");

        }

        else if(restaurant.equals("AandW"))
        {
            FoodTypes.add("Chicken Burger");
            FoodTypes.add("Veggie Burger");

        }


        else if(restaurant.equals("Grazie"))
        {
            FoodTypes.add("Cheese Pizza");
            FoodTypes.add("Vegetable Pizza");

        }

        else if(restaurant.equals("FAmelia"))
        {
            FoodTypes.add("Pasta");
            FoodTypes.add("Pannini");

        }

        else if(restaurant.equals("HakkaLegend"))
        {
            FoodTypes.add("Veggie Balls");
            FoodTypes.add("Fried Rice");

        }
        else if(restaurant.equals("Mandarin"))
        {
            FoodTypes.add("Noodles");
            FoodTypes.add("Soup");

        }
        else if(restaurant.equals("TandooriFlames"))
        {
            FoodTypes.add("Idli");
            FoodTypes.add("Sev Puri");

        }
        else if(restaurant.equals("Gurulakshmi"))
        {
            FoodTypes.add("Masala Dosa");
            FoodTypes.add("Rava Dosa");

        }
        else if(restaurant.equals("NewYorkFries"))
        {
            FoodTypes.add("Poutine");
            FoodTypes.add("Fries");

        }
        else if(restaurant.equals("PhoVietnam"))
        {
            FoodTypes.add("Steamed rice with chicken");
            FoodTypes.add("Veggie Spring Rolls");

        }

        return FoodTypes;

    }
}