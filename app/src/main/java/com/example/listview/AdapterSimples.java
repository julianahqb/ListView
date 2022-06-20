package com.example.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class AdapterSimples extends BaseAdapter {

    private Context context;
    private String[] planetas = new String[]{"Mercúrio","Vênus","Terra",
            "Marte","Júpiter","Saturno","Urano","Netuno"};

    public AdapterSimples(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return planetas.length;
    }

    @Override
    public Object getItem(int position) {
        return planetas[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        String planeta = planetas[i];
        View v = LayoutInflater.from(context)
                .inflate(R.layout.adapter_simples,viewGroup,false);
        TextView textView = v.findViewById(R.id.text);
        textView.setText(planeta);
        return v;
    }
}