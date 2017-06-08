package rcpl.com.customlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv=(ListView)findViewById(R.id.lv);
        final String country_name[]={"Australia","Bangladesh","England","India","Newzeland","Pakistan","South Africa","Sri Lanka"};
        int flag[]={R.drawable.australia , R.drawable.bangladesh , R.drawable.england , R.drawable.india , R.drawable.newzeland , R.drawable.pak , R.drawable.southafrica , R.drawable.srilanka};
        CustomAdapter adapter=new CustomAdapter(this,country_name,flag);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, ""+country_name[position], Toast.LENGTH_SHORT).show();
            }
        });
    }
}
