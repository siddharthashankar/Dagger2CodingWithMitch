package com.sid.dagger.dagger2codingwithmitch.ui.auth.main;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.sid.dagger.dagger2codingwithmitch.BaseActivity;
import com.sid.dagger.dagger2codingwithmitch.R;
import com.sid.dagger.dagger2codingwithmitch.ui.auth.main.profile.ProfileFragment;

public class MainActivity extends BaseActivity {
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        testFragment();
    }

    private void testFragment(){
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.main_container, new ProfileFragment())
                .commit();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.logout:
                sessionManager.logout();
                return true;
            default:
                return super.onOptionsItemSelected(item);

        }
    }
}