package com.example.jekiansari.sig_kajianislam;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import com.example.jekiansari.sig_kajianislam.Model.ListLocationModel;
import com.example.jekiansari.sig_kajianislam.Model.LocationModel;
import com.example.jekiansari.sig_kajianislam.services.ApiClient;
import com.example.jekiansari.sig_kajianislam.services.ApiService;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainUserActivity extends AppCompatActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainuser);

        //manggil di atas header / butom 3
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map_user);
        mapFragment.getMapAsync(this);

        SharedPreferences pref = getSharedPreferences("SP_USER",MODE_PRIVATE);
        TextView TextUsername = (TextView)findViewById(R.id.username);
        String username = pref.getString("username",null);
        TextUsername.setText("Hello, "+pref.getString("username",null));
        Log.e("username",username);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_user, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.Tambahkajian) {
            Intent intent = new Intent(MainUserActivity.this, MapsTambahActivity.class);
            startActivity(intent);
            return true;
        }else if (id == R.id.Cari){
            return true;
        }
//        else if (id == R.id.Register){
//            Intent intent = new Intent(MainUserActivity.this, TambahUserActivity.class);
//            startActivity(intent);
//            return true;
//        }
////        else if (id == R.id.Tambahkajian){
////            Intent intent = new Intent(MainActivity.this, MapsTambahActivity.class);
////            startActivity(intent);
////            return true;
////        }
        else if (id == R.id.Logout){
           SharedPreferences pref = getSharedPreferences("SP_USER",MODE_PRIVATE);
            SharedPreferences.Editor editor = pref.edit();

            Intent intent = new Intent(MainUserActivity.this, MainActivity.class);
            editor.clear();
            editor.commit();
            startActivity(intent);

            finish();
            return true;
//        }else if (id == R.id.refresh){
//
//            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney, Australia, and move the camera.
        LatLng sydney = new LatLng(-34, 151);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
    }
}
