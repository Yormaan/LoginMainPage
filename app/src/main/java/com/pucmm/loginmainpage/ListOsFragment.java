package com.pucmm.loginmainpage;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;


public class ListOsFragment extends Fragment {

    private RecyclerView recycle_item_list_view;
    private List<SingleItemListInfo> array_info_item;

    @Override
    public View onCreateView(LayoutInflater inflater,  @Nullable ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View show_view = inflater.inflate(R.layout.fragment_list_os, container, false);
        recycle_item_list_view = show_view.findViewById(R.id.recycle_id);
        array_info_item = new ArrayList<>();
        recycle_item_list_view.setLayoutManager(new LinearLayoutManager(getContext()));
        recycle_item_list_view.setHasFixedSize(true);

        fill_list();
        AdapterItemList adapter = new AdapterItemList(array_info_item);
        recycle_item_list_view.setAdapter(adapter);


        return show_view;
    }

    private void fill_list() {
       array_info_item.add(new SingleItemListInfo(1, R.drawable.ic_cupcake,"CUPCAKE", "1.5"));
       array_info_item.add(new SingleItemListInfo(2, R.drawable.ic_donut, "DONUT", "1.6"));
       array_info_item.add(new SingleItemListInfo(3,R.drawable.ic_eclair, "ECLAIR", "2.0-2.1"));
       array_info_item.add(new SingleItemListInfo(4,R.drawable.ic_froyo, "FROYO", "2.2-2.2.3"));
       array_info_item.add(new SingleItemListInfo(5,R.drawable.ic_gingerbread, "GINGERBREAD", "2.3-2.3.7"));
       array_info_item.add(new SingleItemListInfo(6,R.drawable.ic_honeycomb, "HONEYCOMB", "3.0-3.2.6"));
       array_info_item.add(new SingleItemListInfo(7,R.drawable.ic_ice_cream, "ICE CREAM SANDWICH", "4.0-4.0.4"));
       array_info_item.add(new SingleItemListInfo(8,R.drawable.ic_jellybean, "JELLYBEAN", "4.1-4.3.1"));
       array_info_item.add(new SingleItemListInfo(9,R.drawable.ic_kitkat, "KITKAT", "4.4-4.4.4"));
       array_info_item.add(new SingleItemListInfo(10,R.drawable.ic_lollipop, "LOLLIPOP", "5.0-5.1.1"));
       array_info_item.add(new SingleItemListInfo(11, R.drawable.ic_marshmallow, "MARSHMALLOW", "6.0-6.0.1"));


    }
}