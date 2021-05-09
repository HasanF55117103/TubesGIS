package com.bersama.mapsexample;

import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;

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

        // Add a marker in Sydney and move the camera
        LatLng user = new LatLng( -0.8558802, 119.88066);
        LatLng sigma = new LatLng(-0.892777778, 119.8863889);
        LatLng veteran = new LatLng(-0.899444444, 119.8977778);
        LatLng kihajar = new LatLng(-0.893333333, 119.8858333);
        LatLng kihajar2 = new LatLng(-0.893333333, 119.8852778);
        LatLng kihajar3 = new LatLng(-0.892222222, 119.8838889);
        LatLng uweburo = new LatLng(-0.836111111, 119.8833333);
        LatLng trans = new LatLng(-0.836666667, 119.8833333);
        LatLng trans2 = new LatLng(-0.838333333, 119.8833333);
        LatLng trans3 = new LatLng(-0.840277778, 119.8830556);
        LatLng trans4 = new LatLng(-0.842222222, 119.8830556);
        LatLng trans5 = new LatLng(-0.877777778, 119.8769444);
        LatLng trans6 = new LatLng(-0.846666667, 119.8825);
        LatLng trans7 = new LatLng( -0.850555556, 119.8827778);
        LatLng martadinata = new LatLng(-0.84, 119.8833333);
        LatLng martadinata2 = new LatLng(-0.853333333, 119.8836111);
        LatLng martadinata3 = new LatLng(-0.853611111, 119.8838889);
        LatLng martadinata4 = new LatLng(-0.853888889, 119.8838889);
        LatLng martadinata5 = new LatLng(-0.854166667, 119.8838889);
        LatLng tombolotutu = new LatLng(-0.884167, 119.88);
        LatLng budi = new LatLng(-0.883888889, 119.8791667);
        LatLng budi2 = new LatLng(-0.884722222, 119.8791667);
        LatLng thamrin = new LatLng(-0.895277778, 119.8802778);
        LatLng pemuda = new LatLng(-0.894166667, 119.8741667);
        LatLng pramuka = new LatLng(-0.894166667, 119.8711111);
        LatLng pramuka2 = new LatLng(-0.894166667, 119.8711111);
        LatLng wolter = new LatLng(-0.902777778, 119.8744444);
        LatLng otto = new LatLng(-0.891944444, 119.8791667);
        LatLng towua = new LatLng(-0.873888889, 119.8752778);
        LatLng towua2 = new LatLng(-0.921111111, 119.8780556);
        LatLng soekarno = new LatLng(-0.836944444, 119.8891667);

        //custom marker
//        int tinggi = 100;
//        int lebar = 100;
//        BitmapDrawable bitmapStart = (BitmapDrawable)getResources().getDrawable(R.drawable.pin_map_hitam);
//        BitmapDrawable bitmapDes = (BitmapDrawable)getResources().getDrawable(R.drawable.pin_map_merah);
//        Bitmap s = bitmapStart.getBitmap();
//        Bitmap d = bitmapDes.getBitmap();
//        Bitmap markerStart = Bitmap.createScaledBitmap(s, lebar, tinggi, false);
//        Bitmap markerDes = Bitmap.createScaledBitmap(d, lebar, tinggi, false);

        //add marker to map
        mMap.addMarker(new MarkerOptions().position(sigma).title("Tokoh Kaos")
            .snippet("Kaos Distro Sigma")
                .icon(bitmapDescriptorFromVector(getApplicationContext(),R.drawable.pin_map_merah))
        );
        mMap.addMarker(new MarkerOptions().position(user).title("Marker for user")
            .snippet("Lokasi Pengguna")
                .icon(bitmapDescriptorFromVector(getApplicationContext(),R.drawable.pin_map_hitam))
        );
        mMap.addMarker(new MarkerOptions().position(veteran).title("Tokoh Kaos")
                .snippet("Toko yumna shop")
                .icon(bitmapDescriptorFromVector(getApplicationContext(),R.drawable.pin_map_merah))
        );        mMap.addMarker(new MarkerOptions().position(kihajar).title("Tokoh Kaos")
                .snippet("Toko pattinjho")
                .icon(bitmapDescriptorFromVector(getApplicationContext(),R.drawable.pin_map_merah))
        );        mMap.addMarker(new MarkerOptions().position(kihajar2).title("Tokoh Kaos")
                .snippet("Toko polos kece")
                .icon(bitmapDescriptorFromVector(getApplicationContext(),R.drawable.pin_map_merah))
        );        mMap.addMarker(new MarkerOptions().position(kihajar3).title("Tokoh Kaos")
                .snippet("Toko ayu fashion shop")
                .icon(bitmapDescriptorFromVector(getApplicationContext(),R.drawable.pin_map_merah))
        );        mMap.addMarker(new MarkerOptions().position(uweburo).title("Tokoh Kaos")
                .snippet("Toko black box")
                .icon(bitmapDescriptorFromVector(getApplicationContext(),R.drawable.pin_map_merah))
        );        mMap.addMarker(new MarkerOptions().position(trans).title("Tokoh Kaos")
                .snippet("Toko hikma")
                .icon(bitmapDescriptorFromVector(getApplicationContext(),R.drawable.pin_map_merah))
        );        mMap.addMarker(new MarkerOptions().position(trans2).title("Tokoh Kaos")
                .snippet("Toko muslimah shop")
                .icon(bitmapDescriptorFromVector(getApplicationContext(),R.drawable.pin_map_merah))
        );        mMap.addMarker(new MarkerOptions().position(martadinata).title("Tokoh Kaos")
                .snippet("Toko hayatun")
                .icon(bitmapDescriptorFromVector(getApplicationContext(),R.drawable.pin_map_merah))
        );        mMap.addMarker(new MarkerOptions().position(trans3).title("Tokoh Kaos")
                .snippet("Toko house of hijrah")
                .icon(bitmapDescriptorFromVector(getApplicationContext(),R.drawable.pin_map_merah))
        );        mMap.addMarker(new MarkerOptions().position(trans4).title("Tokoh Kaos")
                .snippet("Toko firdaus")
                .icon(bitmapDescriptorFromVector(getApplicationContext(),R.drawable.pin_map_merah))
        );        mMap.addMarker(new MarkerOptions().position(trans5).title("Tokoh Kaos")
                .snippet("Toko quality distro")
                .icon(bitmapDescriptorFromVector(getApplicationContext(),R.drawable.pin_map_merah))
        );        mMap.addMarker(new MarkerOptions().position(trans6).title("Tokoh Kaos")
                .snippet("Toko asty collection")
                .icon(bitmapDescriptorFromVector(getApplicationContext(),R.drawable.pin_map_merah))
        );        mMap.addMarker(new MarkerOptions().position(trans7).title("Tokoh Kaos")
                .snippet("Toko Black box 2")
                .icon(bitmapDescriptorFromVector(getApplicationContext(),R.drawable.pin_map_merah))
        );        mMap.addMarker(new MarkerOptions().position(martadinata2).title("Tokoh Kaos")
                .snippet("Toko megatama jaya")
                .icon(bitmapDescriptorFromVector(getApplicationContext(),R.drawable.pin_map_merah))
        );        mMap.addMarker(new MarkerOptions().position(martadinata3).title("Tokoh Kaos")
                .snippet("Toko andita")
                .icon(bitmapDescriptorFromVector(getApplicationContext(),R.drawable.pin_map_merah))
        );        mMap.addMarker(new MarkerOptions().position(martadinata4).title("Tokoh Kaos")
                .snippet("Toko bosyarahma")
                .icon(bitmapDescriptorFromVector(getApplicationContext(),R.drawable.pin_map_merah))
        );        mMap.addMarker(new MarkerOptions().position(martadinata5).title("Tokoh Kaos")
                .snippet("Toko Megatama jaya 2")
                .icon(bitmapDescriptorFromVector(getApplicationContext(),R.drawable.pin_map_merah))
        );        mMap.addMarker(new MarkerOptions().position(tombolotutu).title("Tokoh Kaos")
                .snippet("Toko pop clothing")
                .icon(bitmapDescriptorFromVector(getApplicationContext(),R.drawable.pin_map_merah))
        );        mMap.addMarker(new MarkerOptions().position(budi).title("Tokoh Kaos")
                .snippet("Toko rockfiller")
                .icon(bitmapDescriptorFromVector(getApplicationContext(),R.drawable.pin_map_merah))
        );        mMap.addMarker(new MarkerOptions().position(budi2).title("Tokoh Kaos")
                .snippet("Toko has#tag")
                .icon(bitmapDescriptorFromVector(getApplicationContext(),R.drawable.pin_map_merah))
        );        mMap.addMarker(new MarkerOptions().position(thamrin).title("Tokoh Kaos")
                .snippet("Toko goodness butik")
                .icon(bitmapDescriptorFromVector(getApplicationContext(),R.drawable.pin_map_merah))
        );        mMap.addMarker(new MarkerOptions().position(pemuda).title("Tokoh Kaos")
                .snippet("Toko zoso")
                .icon(bitmapDescriptorFromVector(getApplicationContext(),R.drawable.pin_map_merah))
        );        mMap.addMarker(new MarkerOptions().position(pramuka).title("Tokoh Kaos")
                .snippet("Toko enin")
                .icon(bitmapDescriptorFromVector(getApplicationContext(),R.drawable.pin_map_merah))
        );        mMap.addMarker(new MarkerOptions().position(pramuka2).title("Tokoh Kaos")
                .snippet("Toko owners")
                .icon(bitmapDescriptorFromVector(getApplicationContext(),R.drawable.pin_map_merah))
        );        mMap.addMarker(new MarkerOptions().position(wolter).title("Tokoh Kaos")
                .snippet("Toko eropa")
                .icon(bitmapDescriptorFromVector(getApplicationContext(),R.drawable.pin_map_merah))
        );        mMap.addMarker(new MarkerOptions().position(otto).title("Tokoh Kaos")
                .snippet("Toko Makassar jeans")
                .icon(bitmapDescriptorFromVector(getApplicationContext(),R.drawable.pin_map_merah))
        );        mMap.addMarker(new MarkerOptions().position(towua).title("Tokoh Kaos")
                .snippet("Toko rumah syar’i palu")
                .icon(bitmapDescriptorFromVector(getApplicationContext(),R.drawable.pin_map_merah))
        );        mMap.addMarker(new MarkerOptions().position(towua2).title("Tokoh Kaos")
                .snippet("Toko ags cloth")
                .icon(bitmapDescriptorFromVector(getApplicationContext(),R.drawable.pin_map_merah))
        );       mMap.addMarker(new MarkerOptions().position(soekarno).title("Tokoh Kaos")
                .snippet("Toko wana fashion")
                .icon(bitmapDescriptorFromVector(getApplicationContext(),R.drawable.pin_map_merah))
        );

//        mMap.addPolyline(new PolylineOptions().add(
//           user
//        );

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(user, 11.5f));
    }

    private BitmapDescriptor bitmapDescriptorFromVector(Context context,int vectorResId){
        Drawable vectorDrawable = ContextCompat.getDrawable(context,vectorResId);
        vectorDrawable.setBounds(0,0,vectorDrawable.getIntrinsicWidth(),
                vectorDrawable.getIntrinsicHeight());
        Bitmap bitmap = Bitmap.createBitmap(vectorDrawable.getIntrinsicWidth(),
                vectorDrawable.getIntrinsicHeight(),Bitmap.Config.ARGB_8888);
        Canvas canvas=new Canvas(bitmap);
        vectorDrawable.draw(canvas);
        return BitmapDescriptorFactory.fromBitmap(bitmap);
    }
}