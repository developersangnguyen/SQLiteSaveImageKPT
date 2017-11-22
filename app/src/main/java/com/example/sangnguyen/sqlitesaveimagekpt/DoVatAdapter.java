package com.example.sangnguyen.sqlitesaveimagekpt;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by SangNguyen on 10/10/2017.
 */

public class DoVatAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<DoVat> doVatList;

    public DoVatAdapter(Context context, int layout, List<DoVat> doVatList) {
        this.context = context;
        this.layout = layout;
        this.doVatList = doVatList;
    }

    @Override
    public int getCount() {
        return doVatList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }
    private class ViewHolder{
        TextView txtTen, txtMoTa;
        ImageView imgHinh;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if(convertView == null){
            holder = new ViewHolder();
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(layout,null);
            holder.txtTen = (TextView) convertView.findViewById(R.id.textViewTenCustom);
            holder.txtMoTa = (TextView) convertView.findViewById(R.id.textViewMoTaCustom);
            holder.imgHinh = (ImageView) convertView.findViewById(R.id.imageViewHinhCustom);
            convertView.setTag(holder);
        }else {
            holder = (ViewHolder) convertView.getTag();
        }
        DoVat doVat = doVatList.get(position);
        holder.txtTen.setText(doVat.getTen());
        holder.txtMoTa.setText(doVat.getMoTa());
        // chuyển byte[] sang bitmap

        byte[] hinhAnh = doVat.getHinh();
        Bitmap bitmap = BitmapFactory.decodeByteArray(hinhAnh,0,hinhAnh.length);
        holder.imgHinh.setImageBitmap(bitmap);
        return convertView;
    }
}
