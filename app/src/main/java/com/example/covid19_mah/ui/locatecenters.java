package com.example.covid19_mah.ui;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import com.example.covid19_mah.R;

public class locatecenters extends Fragment {
    public locatecenters(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){

        View rootView = inflater.inflate(R.layout.locatecenters_fragment, container, false);
        WebView heroespage = (WebView) rootView.findViewById(R.id.locatecenters);
        heroespage.loadUrl("file:///android_asset/locatecenters.htm");
        return rootView;
    }
}

   // private LocatecentersViewModel mViewModel;

   // public static locatecenters newInstance() {
   //     return new locatecenters();
  //  }

  //  @Override
  //  public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
  //                           @Nullable Bundle savedInstanceState) {
  //      return inflater.inflate(R.layout.locatecenters_fragment, container, false);
  //  }
//
  //  @Override
 //   public void onActivityCreated(@Nullable Bundle savedInstanceState) {
 ///       super.onActivityCreated(savedInstanceState);
  ///      mViewModel = ViewModelProviders.of(this).get(LocatecentersViewModel.class);
    //    // TODO: Use the ViewModel
    //}

//}
