package com.example.mymaps;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */


    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        //   Mengambil data yang dikirim dari layer tadi
        Bundle extras = getIntent().getExtras();
        String value = extras.getString("key");



        //   If else berdasar parameter yang dikirim.
        if (value.equalsIgnoreCase("masjid")){

        //   Membuat Objek untuk Masjid terdekat
            LatLng masjid = new LatLng(-7.600289, 111.449133);
            mMap.addMarker(new MarkerOptions().position(masjid).title("Masjid Al-Ikhlas"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(masjid));

            LatLng masjid2 = new LatLng(-7.602633, 111.444126);
            mMap.addMarker(new MarkerOptions().position(masjid2).title("Masjid Al-Ukhuwah"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(masjid2));

            LatLng masjid3 = new LatLng(-7.599014, 111.438986);
            mMap.addMarker(new MarkerOptions().position(masjid3).title("Masjid Baitul Arifin"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(masjid3));

            LatLng masjid4 = new LatLng(-7.596162, 111.443714);
            mMap.addMarker(new MarkerOptions().position(masjid4).title("Masjid Al-Baroya"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(masjid4));

            LatLng masjid5 = new LatLng(-7.604183, 111.448409);
            mMap.addMarker(new MarkerOptions().position(masjid5).title("Masjid Suratmajan"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(masjid5));

            //   Objek ini khusus untuk lokasi user dan zoom levelnya
            LatLng latLng = new LatLng(-7.601697, 111.446606);
            float zoomLevel = 14.0f; //This goes up to 21
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(latLng, zoomLevel));

        } else if (value.equalsIgnoreCase("pom")){

            //   Membuat Objek untuk Masjid terdekat
            LatLng pom = new LatLng(-7.614651, 111.462884);
            mMap.addMarker(new MarkerOptions().position(pom).title("SPBU Gambiran"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(pom));

            LatLng pom2 = new LatLng(-7.595342, 111.426920);
            mMap.addMarker(new MarkerOptions().position(pom2).title("SPBU Maospati"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(pom2));

            LatLng pom3 = new LatLng(-7.598655, 111.441948);
            mMap.addMarker(new MarkerOptions().position(pom3).title("Pom Mini Kraton"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(pom3));

            LatLng pom4 = new LatLng(-7.562365, 111.448053);
            mMap.addMarker(new MarkerOptions().position(pom4).title("SPBU Barat"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(pom4));

            //   Objek ini khusus untuk lokasi user dan zoom levelnya
            LatLng latLng = new LatLng(-7.601697, 111.446606);
            float zoomLevel = 14.0f; //This goes up to 21
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(latLng, zoomLevel));


        } else if (value.equalsIgnoreCase("sekolah")){

            //   Membuat Objek untuk Masjid terdekat
            LatLng sekolah = new LatLng(-7.595895, 111.444101);
            mMap.addMarker(new MarkerOptions().position(sekolah).title("SDN Kraton 2"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(sekolah));

            LatLng sekolah2 = new LatLng(-7.596033, 111.444440);
            mMap.addMarker(new MarkerOptions().position(sekolah2).title("SMPN 2 Maospati"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(sekolah2));

            LatLng sekolah3 = new LatLng(-7.597375, 111.443816);
            mMap.addMarker(new MarkerOptions().position(sekolah3).title("SMPN 1 Maospati"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(sekolah3));

            LatLng sekolah4 = new LatLng(-7.597420, 111.429913);
            mMap.addMarker(new MarkerOptions().position(sekolah4).title("SMAN 3 Maospati"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(sekolah4));

            LatLng sekolah5 = new LatLng(-7.595704, 111.425656);
            mMap.addMarker(new MarkerOptions().position(sekolah5).title("SMAN 1 Maospati"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(sekolah5));

            //   Objek ini khusus untuk lokasi user dan zoom levelnya
            LatLng latLng = new LatLng(-7.601697, 111.446606);
            float zoomLevel = 14.0f; //This goes up to 21
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(latLng, zoomLevel));

        }

    }
}
