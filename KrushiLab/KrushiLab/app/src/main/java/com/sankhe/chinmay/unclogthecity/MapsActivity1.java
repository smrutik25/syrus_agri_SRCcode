package com.sankhe.chinmay.unclogthecity;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity1 extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps1);
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

        // Add a marker in Sydney and move the camera
        LatLng pointer = new LatLng(19.075146, 72.996717);
        mMap.addMarker(new MarkerOptions().position(pointer).title("Public Toilet:Sector 17, Vashi, Navi Mumbai, Maharashtra 400703"));
        LatLng pointer1 = new LatLng(19.075424, 72.997692);
        mMap.addMarker(new MarkerOptions().position(pointer1).title("Smart She E-Toilet:Public Water Drinking Storage, Sector 9A, Vashi, Navi Mumbai, Maharashtra 400703"));
        LatLng pointer2 = new LatLng(19.045367, 72.893465);
        mMap.addMarker(new MarkerOptions().position(pointer2).title("Swachh Public Toilet:Chembur"));
        LatLng pointer3 = new LatLng(19.051662, 72.901385);
        mMap.addMarker(new MarkerOptions().position(pointer3).title("Public toilet, Bharat petroleum"));
        LatLng pointer4 = new LatLng(19.052589, 72.900856);
        mMap.addMarker(new MarkerOptions().position(pointer4).title("Sulabh Shauchalaya"));
        LatLng pointer5 = new LatLng(19.059721, 72.896461);
        mMap.addMarker(new MarkerOptions().position(pointer5).title("Sulabh\n" +
                "Public Bathroom"));
        LatLng pointer6 = new LatLng(19.060154, 72.896140);
        mMap.addMarker(new MarkerOptions().position(pointer6).title("Mahada\n" +
                "म्हाडा\n" +
                "Public Bathroom"));
        LatLng pointer7 = new LatLng(19.071668, 72.997795);
        mMap.addMarker(new MarkerOptions().position(pointer7).title("Public toilet\n" +
                "Public Bathroom"));
        LatLng pointer8 = new LatLng(19.063385, 72.998199);
        mMap.addMarker(new MarkerOptions().position(pointer8).title("Public toilet\n" +
                "Public Bathroom"));
        LatLng pointer9 = new LatLng(19.083779, 72.995003);
        mMap.addMarker(new MarkerOptions().position(pointer9).title("Public toilet\n" +
                "Public Bathroom"));
        LatLng pointer10 = new LatLng(19.068382, 72.996624);
        mMap.addMarker(new MarkerOptions().position(pointer10).title("Public toilet\n" +
                "Public Bathroom"));
        LatLng pointer11 = new LatLng(19.074374, 73.000987);
        mMap.addMarker(new MarkerOptions().position(pointer11).title("Public toilet\n" +
                "Public Bathroom"));

       //mMap.moveCamera(CameraUpdateFactory.(new LatLng(pointer));
    }
}
