package com.example.jekiansari.sig_kajianislam;

<<<<<<< HEAD
import android.app.AlarmManager;
import android.app.AlertDialog;
import android.app.PendingIntent;
=======
import android.app.AlertDialog;
>>>>>>> 36a34312acdeb43c37af31191fb0b192b4a27c35
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
<<<<<<< HEAD
import android.net.Uri;
=======
>>>>>>> 36a34312acdeb43c37af31191fb0b192b4a27c35
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
<<<<<<< HEAD
import com.bumptech.glide.Glide;
import com.example.jekiansari.sig_kajianislam.services.Config;
import com.example.jekiansari.sig_kajianislam.services.Receiver;
=======
import com.example.jekiansari.sig_kajianislam.services.Config;
>>>>>>> 36a34312acdeb43c37af31191fb0b192b4a27c35

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.InputStream;
import java.net.URL;
<<<<<<< HEAD
import java.util.Calendar;
=======
>>>>>>> 36a34312acdeb43c37af31191fb0b192b4a27c35
import java.util.HashMap;
import java.util.StringTokenizer;

public class DetailPublicActivity extends AppCompatActivity {
    ListView fruitsList;
<<<<<<< HEAD
    TextView NamaKajian, NamaPemateri, NamaTempat, Alamat, Kelurahan, Kecamatan, TanggalKajian, WaktuMulai, WaktuSelesai, KuotaPeserta, StatusPeserta, StatusBerbayar, Pengelola, KontakPengelola, Informasi, Posisi, urlgambarposter, urlgambartempat;
    ImageView GambarPoster, GambarTempat;
    Button gps, notif;
    String id, namakajian = null, namapemateri = null, namatempat = null, alamat = null, lat = null, lng = null, kelurahan = null, kecamatan = null, tanggalkajian = null, waktumulai = null, waktuselesai = null, kuotapeserta = null, statuspeserta = null, statusberbayar = null, pengelola = null, kontakpengelola = null, informasi = null, gambarposter = null, gambartempat = null;

=======
    TextView NamaKajian,NamaPemateri,NamaTempat,Alamat,Kelurahan,Kecamatan,TanggalKajian,WaktuMulai,WaktuSelesai,KuotaPeserta,StatusPeserta,StatusBerbayar,Pengelola,KontakPengelola,Informasi,Posisi,urlgambarposter,urlgambartempat;
    ImageView GambarPoster,GambarTempat;
    Button gps,notif;
>>>>>>> 36a34312acdeb43c37af31191fb0b192b4a27c35
    //    TextView tvNamaBencana;
//    String datas;
//    String data;
//    String url = "https://www.thecrazyprogrammer.com/example_data/fruits_array.json";
    ProgressDialog dialog;
    String test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailkajianpublic);

        //back buttonn
<<<<<<< HEAD
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
=======
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
>>>>>>> 36a34312acdeb43c37af31191fb0b192b4a27c35
        //end back button

        NamaKajian = (TextView) findViewById(R.id.namakajiandetailpublic);
        NamaPemateri = (TextView) findViewById(R.id.namapemateridetailpublic);
        NamaTempat = (TextView) findViewById(R.id.namatempatdetailpublic);
        Alamat = (TextView) findViewById(R.id.alamatdetailpublic);
        Kelurahan = (TextView) findViewById(R.id.kelurahandetailpublic);
        Kecamatan = (TextView) findViewById(R.id.kecamatandetailpublic);
        TanggalKajian = (TextView) findViewById(R.id.tanggalkajiandetailpublic);
        WaktuMulai = (TextView) findViewById(R.id.waktumulaidetailpublic);
<<<<<<< HEAD
        WaktuSelesai = (TextView) findViewById(R.id.waktuselesaidetailpublic);
=======
        WaktuSelesai = (TextView) findViewById(R.id.waktuselesai);
>>>>>>> 36a34312acdeb43c37af31191fb0b192b4a27c35
        KuotaPeserta = (TextView) findViewById(R.id.kuotapesertadetailpublic);
        StatusPeserta = (TextView) findViewById(R.id.statuspesertadetailpublic);
        StatusBerbayar = (TextView) findViewById(R.id.statusberbayardetailpublic);
        Pengelola = (TextView) findViewById(R.id.pengeloladetailpublic);
<<<<<<< HEAD
        KontakPengelola = (TextView) findViewById(R.id.kontakpengeloladetailpublic);
=======
>>>>>>> 36a34312acdeb43c37af31191fb0b192b4a27c35
        Informasi = (TextView) findViewById(R.id.informasidetailpublic);
        Posisi = (TextView) findViewById(R.id.posisidetailpublic);
        urlgambarposter = (TextView) findViewById(R.id.urlgambarposter);
        urlgambartempat = (TextView) findViewById(R.id.urlgambartempat);
        GambarPoster = (ImageView) findViewById(R.id.gambarposterdetailpublic);
        GambarTempat = (ImageView) findViewById(R.id.gambartempatdetailpublic);
        gps = (Button) findViewById(R.id.btn_tunjuklokasi);
        notif = (Button) findViewById(R.id.btn_notifikasi);

        dialog = new ProgressDialog(this);
        dialog.setMessage("Loading....");
        dialog.show();
<<<<<<< HEAD

        gps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a Uri from an intent string. Use the result to create an Intent.
                Uri gmmIntentUri = Uri.parse("google.navigation:q="+lat+","+lng);

// Create an Intent from gmmIntentUri. Set the action to ACTION_VIEW
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
// Make the Intent explicit by setting the Google Maps package
                mapIntent.setPackage("com.google.android.apps.maps");

// Attempt to start an activity that can handle the Intent
                if (mapIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(mapIntent);
                }


            }
        });

        notif.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar cal = Calendar.getInstance();
                cal.set(Calendar.YEAR, Integer.valueOf(tanggalkajian.split("-")[0]));
                cal.set(Calendar.MONTH, Integer.valueOf(tanggalkajian.split("-")[1])-1);
                cal.set(Calendar.DAY_OF_MONTH, Integer.valueOf(tanggalkajian.split("-")[2]));
                cal.set(Calendar.HOUR_OF_DAY, Integer.valueOf(waktumulai.split(":")[0]));
                cal.set(Calendar.MINUTE, Integer.valueOf(waktumulai.split(":")[1]));


//                sevendayalarm.add(Calendar.DATE, 7);
//
                Intent intent = new Intent(DetailPublicActivity.this, Receiver.class);
                PendingIntent pendingIntent = PendingIntent.getBroadcast(DetailPublicActivity.this, 001, intent, 0);

                AlarmManager am = (AlarmManager)getSystemService(ALARM_SERVICE);
                am.set(AlarmManager.RTC_WAKEUP, cal.getTimeInMillis(), pendingIntent);
            }
        });
=======
>>>>>>> 36a34312acdeb43c37af31191fb0b192b4a27c35
        //button
//        edit.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent addId = getIntent();
//                final String id = addId.getStringExtra("Value");
////                final String loc = addId.getStringExtra("loc");
//                String loc = posisi.getText().toString().trim();
//                Intent i = new Intent(NewDetailActivity.this,NewEditActivity.class);
//                i.putExtra("Value",id);
//                i.putExtra("loc",loc);
//                startActivity(i);
//            }
//        });


//        hapus.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                AskOption();
////                Toast.makeText(DetailActivity.this,"hapus",Toast.LENGTH_LONG).show();
//            }
//        });
//        //end Button
        Intent addId = getIntent();
<<<<<<< HEAD
        final String id = addId.getStringExtra("id_kajian");
        String combine = Config.URL_SHOW_DETAIL_KAJIAN.concat(id).toString();
        Log.e("sempak", id + "{" + combine + "}");
=======
        final String id = addId.getStringExtra("Value");
        String combine = Config.URL_SHOW_DETAIL_KAJIAN.concat(id).toString();
        Log.e("sempak",id+"{"+combine+"}");
>>>>>>> 36a34312acdeb43c37af31191fb0b192b4a27c35
        StringRequest request = new StringRequest(combine, new Response.Listener<String>() {
            @Override
            public void onResponse(String string) {
                parseJsonData(string);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError volleyError) {
                Toast.makeText(getApplicationContext(), "Some error occurred!!", Toast.LENGTH_SHORT).show();
                dialog.dismiss();
                finish();
            }
        });

        RequestQueue rQueue = Volley.newRequestQueue(DetailPublicActivity.this);
        rQueue.add(request);
    }
<<<<<<< HEAD

=======
>>>>>>> 36a34312acdeb43c37af31191fb0b192b4a27c35
    //header button
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.homeAsUp) {
            finish();
            return true;
<<<<<<< HEAD
        } else if (id == R.id.refresh) {
=======
        }else if (id == R.id.refresh){
>>>>>>> 36a34312acdeb43c37af31191fb0b192b4a27c35
//            Intent intent = new Intent(MapsActivity.this, AddActivity.class);
//            MapsActivity.this.startActivity(intent);


            return true;
        }

        return super.onOptionsItemSelected(item);
    }
<<<<<<< HEAD

    //back menu
    @Override
    public boolean onSupportNavigateUp() {
=======
    //back menu
    @Override
    public boolean onSupportNavigateUp(){
>>>>>>> 36a34312acdeb43c37af31191fb0b192b4a27c35
        finish();
        return true;
    }
// end back menu
    // end header Buton

    void parseJsonData(String jsonString) {
        try {
            JSONObject object = new JSONObject(jsonString);
            JSONArray dben = object.getJSONArray("data");

            Log.v("objek", dben.toString());
            String[] namanya = new String[dben.length()];

<<<<<<< HEAD
=======
            String id,namakajian = null,namapemateri = null, namatempat=null, alamat = null, lat= null,lng = null,kelurahan = null,kecamatan = null,tanggalkajian = null,waktumulai = null,waktuselesai = null,kuotapeserta = null,statuspeserta = null,statusberbayar = null,pengelola = null,kontakpengelola = null,informasi = null,gambarposter = null,gambartempat = null;
>>>>>>> 36a34312acdeb43c37af31191fb0b192b4a27c35


            for (int i = 0; i < dben.length(); i++) {
                JSONObject c = dben.getJSONObject(i);

                id = c.getString("id_kajian");
                namakajian = c.getString("namakajian");
                namapemateri = c.getString("namapemateri");
                namatempat = c.getString("namatempat");
<<<<<<< HEAD
                lat = c.getString("lat");
                lng = c.getString("lng");
=======
                lat = c.getString("latitude");
                lng = c.getString("longtitude");
>>>>>>> 36a34312acdeb43c37af31191fb0b192b4a27c35
                alamat = c.getString("alamat");
                kelurahan = c.getString("kelurahan");
                kecamatan = c.getString("kecamatan");
                tanggalkajian = c.getString("tanggalkajian");
                waktumulai = c.getString("waktumulai");
                waktuselesai = c.getString("waktuselesai");
<<<<<<< HEAD
                kuotapeserta = c.getString("kuota");
=======
                kuotapeserta = c.getString("kuotapeserta");
>>>>>>> 36a34312acdeb43c37af31191fb0b192b4a27c35
                statuspeserta = c.getString("statuspeserta");
                statusberbayar = c.getString("statusberbayar");
                pengelola = c.getString("pengelola");
                kontakpengelola = c.getString("kontakpengelola");
                informasi = c.getString("informasi");
                gambarposter = c.getString("gambarposter");
                gambartempat = c.getString("gambartempat");

            }

//          set Text bencana
            NamaKajian.setText(namakajian);
<<<<<<< HEAD
            Posisi.setText("lat/lng:(" + lat + "," + lng + ")");
=======
            Posisi.setText("lat/lng:("+lat+","+lng+")");
>>>>>>> 36a34312acdeb43c37af31191fb0b192b4a27c35
            NamaTempat.setText(namatempat);
            NamaPemateri.setText(namapemateri);
            Alamat.setText(alamat);
            Kelurahan.setText(kelurahan);
            Kecamatan.setText(kecamatan);
            TanggalKajian.setText(tanggalkajian);
            WaktuMulai.setText(waktumulai);
            WaktuSelesai.setText(waktuselesai);
            KuotaPeserta.setText(kuotapeserta);
            StatusPeserta.setText(statuspeserta);
            StatusBerbayar.setText(statusberbayar);
            Pengelola.setText(pengelola);
            KontakPengelola.setText(kontakpengelola);
            Informasi.setText(informasi);
            urlgambartempat.setText(gambartempat);
            urlgambarposter.setText(gambarposter);
<<<<<<< HEAD
            String gbrPoster = Config.URL_GAMBAR + urlgambarposter.getText().toString();
            String gbrTempat = Config.URL_GAMBAR + urlgambartempat.getText().toString();
            // glide fungsi on
//            Log.i("gambar",gbrBncana);
//            Glide.with(NewDetailActivity.this).load(gbrBncana).into(ivGambar);
            Log.e("dancok", gbrPoster);
            Log.e("dancok", gbrTempat);
            Glide.with(this)
                    .load(gbrPoster)
                    .into(GambarPoster);

            Glide.with(this)
                    .load(gbrTempat)
                    .into(GambarTempat);
//            new ShowImage(GambarPoster).execute(gbrPoster);
//            new ShowImage(GambarTempat).execute(gbrTempat);
=======
            String gbrPoster = urlgambarposter.getText().toString();
            String gbrTempat = urlgambartempat.getText().toString();
            // glide fungsi on
//            Log.i("gambar",gbrBncana);
//            Glide.with(NewDetailActivity.this).load(gbrBncana).into(ivGambar);
            Log.e("dancok",gbrPoster);
            Log.e("dancok",gbrTempat);
            new ShowImage(GambarPoster).execute(gbrPoster);
            new ShowImage(GambarTempat).execute(gbrTempat);
>>>>>>> 36a34312acdeb43c37af31191fb0b192b4a27c35

            // err nya
//            String korbanall = tvKorbanTewas.getText().toString();
//            StringTokenizer stringTokenizer = new StringTokenizer(korbanall,";");
//            String tewas = stringTokenizer.nextToken();
//            String berat = stringTokenizer.nextToken();
//            String ringan = stringTokenizer.nextToken();

//            Log.e("silit",tewas+";"+berat+";"+ringan);
//            Log.e("silit",korbanall);
////
//            tvKorbanTewas.setText("Korban Tewas : "+tewas);
//            tvKorbanLBerat.setText("Luka Berat : "+berat);
//            tvKorbanLRingan.setText("Luka Ringan : "+ringan);
            // end errnya
//end settextBencana

        } catch (JSONException e) {
            e.printStackTrace();
        }

        dialog.dismiss();
    }

    // hapus
//    private AlertDialog AskOption(){
//        AlertDialog.Builder ad = new AlertDialog.Builder(NewDetailActivity.this)
//                .setTitle("Delete")
//                .setMessage("Anda Yakin Mau Menghapus.?")
//                .setIcon(R.drawable.common_google_signin_btn_icon_dark)
//                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialogInterface, int i) {
//                        hapusBencana();
//                        dialogInterface.dismiss();
//                        finish();
//                        Intent next = new Intent(NewDetailActivity.this,MapsActivity.class);
//                        startActivity(next);
//                    }
//                })
//                .setNegativeButton("No", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialogInterface, int i) {
//                        dialogInterface.dismiss();
//                    }
//                });
//        ad.show();
//        return null;
//    }

//    private void hapusBencana(){
//        Intent addId = getIntent();
//        final String id = addId.getStringExtra("Value");
//
//
//        class HapusBencana extends AsyncTask<String,String,String> {
//
//
//            ProgressDialog loading;
//
//            @Override
//            protected void onPreExecute() {
//                super.onPreExecute();
//                loading = ProgressDialog.show(NewDetailActivity.this,"Menghapus...","Tunggu...",false,false);
//            }
//
//            @Override
//            protected void onPostExecute(String s) {
//                super.onPostExecute(s);
//                loading.dismiss();
//                Toast.makeText(NewDetailActivity.this,s,Toast.LENGTH_LONG).show();
//
//            }
//
//            @Override
//            protected String doInBackground(String... args) {
//
//                HashMap<String,String> params = new HashMap<>();
//
//                params.put(Config.TAG_ID_BENCANA,id);
//                Log.d("id_bencana",id);
//
//                //lama
//                RequestHandler rh = new RequestHandler();
//                String res = rh.sendPostRequest(URL_HAPUS, params);
//                return res;
////                return null;
//            }
//        }
//
//        HapusBencana hb = new HapusBencana();
//        hb.execute();
//    }
    // end hapus

<<<<<<< HEAD
    private class ShowImage extends AsyncTask<String, Void, Bitmap> {
=======
    private class ShowImage extends AsyncTask<String,Void,Bitmap>{
>>>>>>> 36a34312acdeb43c37af31191fb0b192b4a27c35
        ImageView imageView;
        ImageView imageView2;


<<<<<<< HEAD
        public ShowImage(ImageView imageView) {
            this.imageView = imageView;
            this.imageView2 = imageView;
        }

=======
        public ShowImage(ImageView imageView){
            this.imageView = imageView;
            this.imageView2 = imageView;
        }
>>>>>>> 36a34312acdeb43c37af31191fb0b192b4a27c35
        /*
            doInBackground(Params... params)
                Override this method to perform a computation on a background thread.
         */
<<<<<<< HEAD
        protected Bitmap doInBackground(String... urls) {
            String urlOfImage = urls[0];
            Bitmap logo = null;
            try {
=======
        protected Bitmap doInBackground(String...urls){
            String urlOfImage = urls[0];
            Bitmap logo = null;
            try{
>>>>>>> 36a34312acdeb43c37af31191fb0b192b4a27c35
                InputStream is = new URL(urlOfImage).openStream();
                /*
                    decodeStream(InputStream is)
                        Decode an input stream into a bitmap.
                 */
                logo = BitmapFactory.decodeStream(is);
<<<<<<< HEAD
            } catch (Exception e) { // Catch the download exception
=======
            }catch(Exception e){ // Catch the download exception
>>>>>>> 36a34312acdeb43c37af31191fb0b192b4a27c35
                e.printStackTrace();
            }
            return logo;
        }
<<<<<<< HEAD

        protected void onPostExecute(Bitmap result) {
=======
        protected void onPostExecute(Bitmap result){
>>>>>>> 36a34312acdeb43c37af31191fb0b192b4a27c35
            imageView.setImageBitmap(result);
            imageView2.setImageBitmap(result);
        }
    }

}

