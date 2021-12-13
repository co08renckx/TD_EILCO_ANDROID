package com.example.td6;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RepoAdapter extends RecyclerView.Adapter<RepoAdapter.ViewHolder>{
    private final List<Repo> mRepos;

    public RepoAdapter(List<Repo> repos){
        mRepos = repos;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View contactView = inflater.inflate(R.layout.affichage_repos,parent,false);
        return new ViewHolder(contactView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Repo repos = mRepos.get(position);

        TextView idTextView = holder.IdTextView;
        idTextView.setText(repos.getId());

        TextView NameTextView = holder.NameTextView;
        NameTextView.setText(repos.getName());

        TextView FullNameTextView = holder.FullNameTextView;
        FullNameTextView.setText(repos.getFullName());

        TextView UrlTextView = holder.UrlTextView;
        UrlTextView.setText(repos.getHtml_url());
    }


    @Override
    public int getItemCount() {
        return mRepos.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        public TextView IdTextView;
        public TextView NameTextView;
        public TextView FullNameTextView;
        public TextView UrlTextView;

        public ViewHolder(View itemView){
            super(itemView);
            IdTextView =(TextView) itemView.findViewById(R.id.idRepo);
            NameTextView =(TextView) itemView.findViewById(R.id.nameRepo);
            FullNameTextView =(TextView) itemView.findViewById(R.id.fullnameRepo);
            UrlTextView =(TextView) itemView.findViewById(R.id.urlRepo);
        }
    }

}
