package com.example.employeelogin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder>{
    private List<ListPojo> listArr;
    public ListAdapter(ListActivity listActivity, List<ListPojo> list) {
        listArr = list;
    }

    @NonNull
    @Override
    public ListAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_row, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ListAdapter.ViewHolder holder, int position) {

        holder.name.setText(listArr.get(position).getName());
        holder.age.setText(listArr.get(position).getAge());
        holder.cname.setText(listArr.get(position).getCname());
    }

    @Override
    public int getItemCount() {
        return listArr.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView name;
        private TextView age;
        private TextView cname;
        private View view;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            view = itemView;
            name = view.findViewById(R.id.name);
            age = view.findViewById(R.id.age);
            cname = view.findViewById(R.id.cname);

        }
    }
}
