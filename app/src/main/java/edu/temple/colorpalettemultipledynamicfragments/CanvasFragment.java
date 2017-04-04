package edu.temple.colorpalettemultipledynamicfragments;

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link CanvasFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 */
public class CanvasFragment extends Fragment {

    View coloredArea;

    String color;

    boolean twoPanes;

    private OnFragmentInteractionListener mListener;

    public CanvasFragment() {
        // Required empty public constructor
    }

    public CanvasFragment(String c) {
        this.color = c;
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        coloredArea = inflater.inflate(R.layout.fragment_canvas, container, false);

        //if(!twoPanes) {
        if(color != null) {
            try {

                coloredArea.setBackgroundColor(Color.parseColor(color));
            } catch (IllegalArgumentException e) {
                //Toast.makeText(MainActivity.this, "Select color.", Toast.LENGTH_SHORT).show();
            }
            //}
        }


        return coloredArea;
    }

    public void setColor(String color) {

        if (coloredArea != null) {

            try {
                coloredArea.setBackgroundColor(Color.parseColor(color));

            } catch (IllegalArgumentException e) {
                //Toast.makeText(MainActivity.this, "Select color.", Toast.LENGTH_SHORT).show();
            }

        }
    }


//    // TODO: Rename method, update argument and hook method into UI event
//    public void onButtonPressed(Uri uri) {
//        if (mListener != null) {
//            mListener.onFragmentInteraction(uri);
//        }
//    }

//    @Override
//    public void onAttach(Context context) {
//        super.onAttach(context);
//        if (context instanceof OnFragmentInteractionListener) {
//            mListener = (OnFragmentInteractionListener) context;
//        } else {
//            throw new RuntimeException(context.toString()
//                    + " must implement OnFragmentInteractionListener");
//        }
//    }
//
//    @Override
//    public void onDetach() {
//        super.onDetach();
//        mListener = null;
//    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
