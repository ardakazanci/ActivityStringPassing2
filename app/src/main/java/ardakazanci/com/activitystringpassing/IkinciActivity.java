package ardakazanci.com.activitystringpassing;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.GridView;

/**
 * Created by ardakazanci on 12.03.2018.
 */

public class IkinciActivity extends AppCompatActivity {

    GridView gv;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        gv = (GridView) findViewById(R.id.gv);
        gv.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, VeriTutucu.spacecrafts));


    }
}
