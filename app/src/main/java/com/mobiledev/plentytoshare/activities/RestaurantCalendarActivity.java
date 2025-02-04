package com.mobiledev.plentytoshare.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.view.View;

import com.mobiledev.plentytoshare.R;
import com.mobiledev.plentytoshare.adapters.CharityRequestsRestaurant;
import com.mobiledev.plentytoshare.models.CalendarEvent;

import java.util.ArrayList;

public class RestaurantCalendarActivity extends AppCompatActivity
{
//    Button btn = (Button) findViewById(R.id.addEvent_btn);
    private ArrayList<CalendarEvent> restaurantEvents = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant_calendar);
    }

    public void yourMethodName(View v)
    {
        startActivity(new Intent(RestaurantCalendarActivity.this, CharityRequestsRestaurant.class));
    }

    public void onEventItemClick(int position) {
        Intent intent = new Intent(this, RestaurantEventBottomSheet.class);
        intent.putExtra("date", String.valueOf(restaurantEvents.get(position).getDate()));
        intent.putExtra("servings", String.valueOf(restaurantEvents.get(position).getNumOfServings()));
        intent.putExtra("time", String.valueOf(restaurantEvents.get(position).getPickupTime()));
        intent.putExtra("status", restaurantEvents.get(position).getStatus());
        startActivity(intent);
    }
}