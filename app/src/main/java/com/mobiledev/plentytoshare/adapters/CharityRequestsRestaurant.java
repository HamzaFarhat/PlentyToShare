package com.mobiledev.plentytoshare.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.mobiledev.plentytoshare.R;

public class CharityRequestsRestaurant extends RecyclerView.Adapter<CharityRequestsRestaurant.MyViewHolder>
{
    //CALLING THE TEXT VIEW ID FROM LAYOUT
    public class MyViewHolder extends RecyclerView.ViewHolder
    {
        private TextView foodAvailable;

        public MyViewHolder(final View view)
        {
            super(view);
            this.foodAvailable = (TextView) view.findViewById(R.id.foodAvailable);
        }
    }

    @NonNull
    @Override
    public CharityRequestsRestaurant.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view_charity_requests_restaurant, parent, false);
        return new MyViewHolder(itemView);
    }

    //TO DISPLAY THE INFORMATION IN TEXT VIEW ID FROM LAYOUT
    @Override
    public void onBindViewHolder(@NonNull CharityRequestsRestaurant.MyViewHolder holder, int position)
    {
        //If want to hardcode values, also add a function in mainActivity if you want to push random information
        //String name = usersList.get(position);

        holder.foodAvailable.setText("Dummy information available from restaurant 1");
        //on click of the list items, send an intent to the create activity with all the data for that list item
//        if (holder != null) {
//            holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//
//                    Intent intent = new Intent(view.getContext(), Create.class);
//
//                    Bundle bundle = new Bundle();
//                    bundle.putInt("Id", location.getId());
//                    bundle.putString("address", location.getAddress());
//                    bundle.putString("longitude", location.getLongitude());
//                    bundle.putString("latitude", location.getLatitude());
//
//                    intent.putExtras(bundle);
//
//                    view.getContext().startActivity(intent, bundle);
//                }
//            });
//            holder.foodAvailable.setText(name);
//        }
    }

    @Override
    public int getItemCount()
    {
        return 0;
    }
}
