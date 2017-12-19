package cimdata.android.dez2017.fragmentseinfuehrung.activities;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import cimdata.android.dez2017.fragmentseinfuehrung.R;
import cimdata.android.dez2017.fragmentseinfuehrung.fragments.MainFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        displayFragment();
    }

    private void displayFragment() {

        // Zuerst brauchen wir eine Instanz des Fragments.
        MainFragment fragment = new MainFragment();

        // Dann benötigen wir den Fragment-Manager
        // Den instanziieren wir nicht, sondern holen ihn uns über den SupportedFragmentManager
        FragmentManager fragmentManager = getSupportFragmentManager();

        // Nun lassen wir uns vom Manager eine sogenannte Transaction erzeugen
        FragmentTransaction transaction = fragmentManager.beginTransaction();

        // Als nächstes fügen wir das Fragment ein
        // Parameter
        // 1. den Container als R.id, in den wir unser Fragment einfügen wollen
        // 2. das Fragment
        transaction.add(R.id.ly_container_fragment, fragment);

        // Zum Schluss committen wir die Transaction
        transaction.commit();

        /*
        Kurzschreibweise

        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.ly_container_fragment, new MainFragment())
                .commit();

        */
    }
}
