package com.example.covid19_mah.ui;

import androidx.lifecycle.ViewModelProviders;

import android.app.AppComponentFactory;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ListView;
import android.os.Bundle;
import android.view.View;
import android.view.Menu;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.navigation.NavigationView;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import  android.webkit.WebView;
import android.widget.TextView;

import com.example.covid19_mah.R;


public class helpline extends Fragment {
    public helpline(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){

        View rootView = inflater.inflate(R.layout.symptoms_fragment, container, false);
        WebView heroespage = (WebView) rootView.findViewById(R.id.symptoms);
        heroespage.loadUrl("file:///android_asset/helpline.htm");
        return rootView;
    }
}
//}



 //   private HelplineViewModel mViewModel;

  //  public static helpline newInstance() {
   //     return new helpline();
 //   }

//ListView listView;
 //   @Override
 //   public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
  //                           @Nullable Bundle savedInstanceState) {

  //      View v =inflater.inflate(R.layout.helpline_fragment, container, false);
//
  //      return inflater.inflate(R.layout.helpline_fragment, container, false);
 //   }

  //  @Override
    //public void onActivityCreated(@Nullable Bundle savedInstanceState) {
   //     super.onActivityCreated(savedInstanceState);
   //     mViewModel = ViewModelProviders.of(this).get(HelplineViewModel.class);
   //     // TODO: Use the ViewModel

  //  }

//}
