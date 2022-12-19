package com.dbcts.textskap;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseReference;

import java.util.ArrayList;

public class chatListAdapter extends BaseAdapter {

   private Activity mActivity;
   private DatabaseReference mDatabase;
   private  String mDisplayName;
   private ArrayList<DataSnapshot> mSnapshot;


    public chatListAdapter(Activity mActivity, DatabaseReference mDatabase, String mDisplayName) {
        this.mActivity = mActivity;
        this.mDatabase = mDatabase;
        this.mDisplayName = mDisplayName;
        mSnapshot = new ArrayList<>();
    }

    static class DesignMessageRow{
        TextView userName;
        TextView message;
        ViewGroup.LayoutParams layout;

    }








    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        if(view == null){


        }

        return view;
    }
}
