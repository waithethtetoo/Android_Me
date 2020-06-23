package com.example.android.android_me.ui;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.example.android.android_me.R;
import com.example.android.android_me.data.AndroidImageAssets;

public class MasterListFragment extends Fragment {
   public MasterListFragment() {
   }

   @Nullable
   @Override
   public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
      View rootView = inflater.inflate(R.layout.fragment_master_list, container, false);
      GridView gridView = rootView.findViewById(R.id.images_grid_view);
      MasterListAdapter adapter = new MasterListAdapter(getContext(), AndroidImageAssets.getAll());
      gridView.setAdapter(adapter);
      return rootView;
   }
}
