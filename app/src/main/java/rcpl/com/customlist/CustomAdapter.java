package rcpl.com.customlist;

import android.content.ContentResolver;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import rcpl.com.customlist.R;

/**
 * Created by rishavg on 6/8/17.
 */

public class CustomAdapter extends BaseAdapter{

    String country_name[];
    int flags[];
    LayoutInflater inflater;
    Context context;

    CustomAdapter(Context context,String country_name[],int flags[])
    {
        this.context=context;
        this.country_name=country_name;
        this.flags=flags;
        inflater=LayoutInflater.from(context);//*************
    }
    @Override
    public int getCount() {
        return country_name.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView=inflater.inflate(R.layout.custom_layout,null);
        ImageView iv=(ImageView)convertView.findViewById(R.id.country_flag);
        TextView tv=(TextView)convertView.findViewById(R.id.country_name);
        iv.setImageResource(flags[position]);
        tv.setText(country_name[position]);
        return convertView;
    }
}
