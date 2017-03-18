package com.example.sumeet.sharedpreferencesassignment_1;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class ShowActivity extends AppCompatActivity {
    TextView pwd_show, sl_show, ru_show;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        pwd_show = (TextView) findViewById(R.id.pwd_tv_show);
        sl_show = (TextView) findViewById(R.id.SL_tv_show);
        ru_show = (TextView) findViewById(R.id.RU_tv_show);


        /** Getting the shared preference object that points to preferences resource available in this context */
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(this);

        /** Getting the values stored in the shared object via preference activity */

        String pwd = sp.getString("prefUserPassword", "Null");
        boolean sl = sp.getBoolean("prefLockScreen", false);
        String ru = sp.getString("prefupdateFrequency", "Null");

        /** Setting the values on textview objects to display in the ShowActivity */

        pwd_show.setText(pwd);
        sl_show.setText(Boolean.toString(sl));
        ru_show.setText(ru);


    }
}
