package com.example.taskforinterview2;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by zayed on 07-Feb-18.
 */

public class UserListAdapter extends ArrayAdapter<UsersDetails> {
    private Context context;
    static ArrayList<UsersDetails> usersDetailsArrayList;


    public UserListAdapter(@NonNull Context context, ArrayList<UsersDetails> usersDetailsArrayList) {
        super(context, R.layout.result_layout, usersDetailsArrayList);
        this.context = context;
        this.usersDetailsArrayList = usersDetailsArrayList;
    }


    class ViewHolder {
        TextView firstNameTV;
        TextView lastNameTV;
        TextView phoneTV;
        ImageView pictureIV;
    }


    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);

        final ViewHolder holder;

        if (convertView == null) {
            holder = new ViewHolder();
            convertView = inflater.inflate(R.layout.result_layout, parent, false);
            holder.firstNameTV = convertView.findViewById(R.id.TV_firstName);
            holder.lastNameTV = convertView.findViewById(R.id.TV_lastName);
            holder.phoneTV = convertView.findViewById(R.id.TV_phone);
            holder.pictureIV = convertView.findViewById(R.id.IV_picture);

            convertView.setTag(holder);
        } else {

            holder = (ViewHolder) convertView.getTag();
        }

        holder.firstNameTV.setText("first name: "+usersDetailsArrayList.get(position).getFirstName());
        holder.lastNameTV.setText("last name: "+usersDetailsArrayList.get(position).getLastName());
        holder.phoneTV.setText("phone: "+usersDetailsArrayList.get(position).getMobile());
        Picasso.with(context).load(usersDetailsArrayList.get(position).getUrl()).into(holder.pictureIV);

        return convertView;
    }
}
