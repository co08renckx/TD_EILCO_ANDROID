package com.example.td5;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ViewHolder> {

    private final List<Contact> mContacts;

    public ContactAdapter(List<Contact> contacts){
        mContacts = contacts;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View contactView = inflater.inflate(R.layout.item_contact,parent,false);
        return new ViewHolder(contactView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {


        Contact contact = mContacts.get(position);

        TextView firstNameTextView = holder.firstNameTextView;
        firstNameTextView.setText(contact.getmFirstName());

        TextView lastNameTextView = holder.lastNameTextView;
        lastNameTextView.setText(contact.getmLastName());

        ImageView image = holder.image;
        Glide.with(image).load(contact.getImageUrl()).placeholder(R.drawable.ic_launcher_background).into(image);
    }

    @Override
    public int getItemCount() {
        return mContacts.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        public TextView firstNameTextView;
        public TextView lastNameTextView;
        public ImageView image;

        public ViewHolder(View itemView){
            super(itemView);

            firstNameTextView =(TextView) itemView.findViewById(R.id.TVprenom);
            lastNameTextView =(TextView)  itemView.findViewById(R.id.TVnom);
            image = (ImageView)  itemView.findViewById(R.id.imageContact);
        }


    }
}
