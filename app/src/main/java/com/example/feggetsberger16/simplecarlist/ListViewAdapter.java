package com.example.feggetsberger16.simplecarlist;

import android.content.Context;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by feggetsberger16 on 07.03.2019.
 */

public class ListViewAdapter extends ArrayAdapter<Car>{
    private List<Car> cars = new ArrayList<>();
    private int layoutId;
    private LayoutInflater inflater;

    public ListViewAdapter(Context ctx, int layoutId, List<Car> cars) {
        super(ctx,layoutId,cars);
        this.cars = cars;
        this.layoutId = layoutId;
        this.inflater = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Car car = cars.get(position);
        View listItem = (convertView == null)?inflater.inflate(this.layoutId,null):convertView;
        ((TextView) listItem.findViewById(R.id.textView1)).setText(car.getFirst_name());
        ((TextView) listItem.findViewById(R.id.textView2)).setText(car.getLast_name());
        ((TextView) listItem.findViewById(R.id.textView3)).setText(car.getMake());
        ((TextView) listItem.findViewById(R.id.textView4)).setText(car.getModel());
        return listItem;
    }
}
