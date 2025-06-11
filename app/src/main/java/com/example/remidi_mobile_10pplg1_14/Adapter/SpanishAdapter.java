package com.example.remidi_mobile_10pplg1_14.Adapter;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.remidi_mobile_10pplg1_14.R;
import com.example.remidi_mobile_10pplg1_14.model.laliga;

import java.util.List;

public class SpanishAdapter extends RecyclerView.Adapter<SpanishAdapter.ViewHolder> {


    private List<laliga> teams;
    private Context context;

    public SpanishAdapter(Context context, List<laliga> teams) {
        this.context = context;
        this.teams = teams;
    }

    @NonNull
    @Override
    public SpanishAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.iteam_spain, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SpanishAdapter.ViewHolder holder, int position) {
        laliga team = teams.get(position);
        holder.tvTeamName.setText(team.getStrTeam());
        holder.tvSportName.setText(team.getStrSport());
        holder.tvidTeam.setText(team.getIdTeam());
        holder.tvstrdesc.setText(team.getStrDescriptionEN());
        Glide.with(context)
                .load(team.getStrTeamBadge())
                .into(holder.imgTeamBadge);

    }

    @Override
    public int getItemCount() {
        return teams.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvTeamName;
        ImageView imgTeamBadge;
        TextView tvSportName;
        TextView tvstrdesc;
        TextView tvidTeam;

        public ViewHolder(View itemView) {
            super(itemView);
            tvTeamName = itemView.findViewById(R.id.tvTeamName);
            tvSportName = itemView.findViewById(R.id.tvSportName);
            imgTeamBadge = itemView.findViewById(R.id.imgTeamBadge);
            tvidTeam = itemView.findViewById(R.id.tvidteam);
            tvstrdesc = itemView.findViewById(R.id.tvDescript);
        }
    }
}
