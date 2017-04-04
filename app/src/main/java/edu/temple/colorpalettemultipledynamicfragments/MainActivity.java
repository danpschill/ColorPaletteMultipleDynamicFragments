package edu.temple.colorpalettemultipledynamicfragments;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements PaletteFragment.PaletteInterface {

    PaletteFragment paletteFragment;
    CanvasFragment canvasFragment;

    boolean twoPanes;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //  Determine if only one or two panes are visible
        twoPanes = (findViewById(R.id.container2) != null);



        paletteFragment = new PaletteFragment(twoPanes);
        //canvasFragment = new CanvasFragment(null, twoPanes);

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.container1, paletteFragment);
        fragmentTransaction.commit();

        if (savedInstanceState != null) {
            return;
        }




    }


    @Override
    public void getColor(String color) {
        new CanvasFragment().setColor(color);
    }
}
