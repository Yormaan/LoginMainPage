package com.pucmm.loginmainpage;

import android.os.Bundle;
import android.widget.ListView;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.Arrays;


public class ListOsFragment extends Fragment {


    public ListOsFragment() {
    }

    private ListView item_list_view;
    private ArrayList<SingleItemListInfo> array_info_item;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater,  @Nullable ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View show_view = inflater.inflate(R.layout.fragment_list_os, container, false);
        array_info_item = new ArrayList<SingleItemListInfo>();
        item_list_view = show_view.findViewById(R.id.list_view_fragment_id);

        array_info_item.add(new SingleItemListInfo(R.drawable.ic_list_test_foreground,1, "CUPCAKE", "1.5"));
        array_info_item.add(new SingleItemListInfo(R.drawable.ic_list_test_foreground,2, "DONUT", "1.6"));
        array_info_item.add(new SingleItemListInfo(R.drawable.ic_list_test_foreground,3, "ECLAIR", "2.0-2.1"));
        array_info_item.add(new SingleItemListInfo(R.drawable.ic_list_test_foreground,4, "FROYO", "2.2-2.2.3"));
        array_info_item.add(new SingleItemListInfo(R.drawable.ic_list_test_foreground,5, "GINGERBREAD", "2.3-2.3.7"));
        array_info_item.add(new SingleItemListInfo(R.drawable.ic_list_test_foreground,6, "HONEYCOMB", "3.0-3.2.6"));
        array_info_item.add(new SingleItemListInfo(R.drawable.ic_list_test_foreground,7, "ICE CREAM SANDWICH", "4.0-4.0.4"));
        array_info_item.add(new SingleItemListInfo(R.drawable.ic_list_test_foreground,8, "JELLYBEAN", "4.1-4.3.1"));
        array_info_item.add(new SingleItemListInfo(R.drawable.ic_list_test_foreground,9, "KITKAT", "4.4-4.4.4"));
        array_info_item.add(new SingleItemListInfo(R.drawable.ic_list_test_foreground,10, "LOLLIPOP", "5.0-5.1.1"));
        array_info_item.add(new SingleItemListInfo(R.drawable.ic_list_test_foreground,11, "MARSHMALLOW", "6.0-6.0.1"));

        AdapterItemList adapter_list = new AdapterItemList(getContext(),array_info_item ) ;
        item_list_view.setAdapter(adapter_list);
                                        
        return show_view;
    }
}