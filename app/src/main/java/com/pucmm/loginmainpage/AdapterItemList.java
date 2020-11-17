package com.pucmm.loginmainpage;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class AdapterItemList extends RecyclerView.Adapter<AdapterItemList.ListHolder> {

    private List<SingleItemListInfo> data_single_item;


    public class ListHolder extends RecyclerView.ViewHolder {
        ImageView image_so_avatar;
        TextView title_so_list;
        TextView title_so_desc;

        public ListHolder(@NonNull @org.jetbrains.annotations.NotNull View itemView) {
            super(itemView);
            image_so_avatar = itemView.findViewById(R.id.image_list_view_id);
            title_so_list = itemView.findViewById(R.id.title_single_item_list_view_id);
            title_so_desc = itemView.findViewById(R.id.desc_single_item_list_view_id);

        }

    }

    public AdapterItemList(List<SingleItemListInfo> data) {
        data_single_item = data;
    }

    @NonNull
    @NotNull
    @Override
    public ListHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_item_list_view, null, false);
        return new ListHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull @NotNull ListHolder holder, int position) {

        holder.image_so_avatar.setImageResource(data_single_item.get(position).getImage_avatar());
        holder.title_so_list.setText(data_single_item.get(position).getTitle());
        holder.title_so_desc.setText(data_single_item.get(position).getDescription());


    }

    @Override
    public long getItemId(int position) {
        //return the id of the object position
        return data_single_item.get(position).getId();
    }

    @Override
    public int getItemCount() {
        //return the list size item
        return data_single_item.size();
    }


}
