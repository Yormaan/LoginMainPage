package com.pucmm.loginmainpage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class AdapterItemList extends BaseAdapter {

    Context take_item_context;
    List<SingleItemListInfo> list_of_single_items;

    public AdapterItemList(Context take_item_context, List<SingleItemListInfo> list_of_single_items) {
        this.take_item_context = take_item_context;
        this.list_of_single_items = list_of_single_items;
    }

    @Override
    public int getCount() {
        //return the list size item
        return list_of_single_items.size();
    }

    @Override
    public Object getItem(int position) {
        //return the exact puntual object of the object
        return list_of_single_items.get(position);
    }

    @Override
    public long getItemId(int position) {
        //return the id of the object position
        return list_of_single_items.get(position).getId();
    }
//This function allow me to inject the single item xml to the listView
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        LayoutInflater single_item_list_view_inflater = LayoutInflater.from(take_item_context);
        view = single_item_list_view_inflater.inflate(R.layout.single_item_list_view, null);
        ImageView avatar_image = view.findViewById(R.id.image_list_view_id);
        TextView title_of_single_item_lst_view = view.findViewById(R.id.title_single_item_list_view_id);
        TextView desc_of_single_item_lst_view = view.findViewById(R.id.desc_single_item_list_view_id);

        //get the current element position element

        avatar_image.setImageResource(list_of_single_items.get(position).getImage_avatar());
        title_of_single_item_lst_view.setText(list_of_single_items.get(position).getTitle());
        desc_of_single_item_lst_view.setText(list_of_single_items.get(position).getDescription());

        return view;


    }
}
