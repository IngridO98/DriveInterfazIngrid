package com.example.driveinterfazingrid;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    DrawerLayout drawerLayout;
    ActionBarDrawerToggle actionBarDrawerToggle;
    NavigationView navigationView;
    FragmentManager fragmenManager;
    FragmentTransaction fragmentTransaction;
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawerLayout=findViewById(R.id.drawer);
        navigationView=findViewById(R.id.navigationView);
        navigationView.setNavigationItemSelectedListener(this);

        actionBarDrawerToggle =new ActionBarDrawerToggle(this, drawerLayout,toolbar,R.string.open, R.string.close);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.setDrawerIndicatorEnabled(true);
        actionBarDrawerToggle.syncState();


        fragmenManager=getSupportFragmentManager();
        fragmentTransaction=fragmenManager.beginTransaction();
        fragmentTransaction.add(R.id.container_fragment, new PrioridadFragment());
        fragmentTransaction.commit();

        bottomNavigationView=(BottomNavigationView) findViewById(R.id.bottonNaviga);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if(item.getItemId()==R.id.Prioridad){
                    showSelectedFragment(new PrioridadFragment());
                }
                if(item.getItemId()==R.id.Espacios){
                    showSelectedFragment(new DestacadosFragment());
                }
                if(item.getItemId()==R.id.Compartidos){
                    showSelectedFragment(new DestacadosFragment());
                }
                if(item.getItemId()==R.id.Archivos){
                    showSelectedFragment(new DestacadosFragment());
                }
                return true;
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.icon_toolbar,menu);
        return true;
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        drawerLayout.closeDrawer(GravityCompat.START);
        if(item.getItemId()==R.id.Reciente){
            //fragmenManager=getSupportFragmentManager();
            //fragmentTransaction=fragmenManager.beginTransaction();
            //fragmentTransaction.replace(R.id.container_fragment, new DestacadosFragment());
            //fragmentTransaction.commit();
            showSelectedFragment(new DestacadosFragment());
        }

        if(item.getItemId()==R.id.Destacados){
            //fragmenManager=getSupportFragmentManager();
            //fragmentTransaction=fragmenManager.beginTransaction();
            //fragmentTransaction.replace(R.id.container_fragment, new DestacadosFragment());
            //fragmentTransaction.commit();
            showSelectedFragment(new DestacadosFragment());

        }
        return true;
    }

    private void showSelectedFragment(Fragment fragment){
        getSupportFragmentManager().beginTransaction().replace(R.id.container_fragment,fragment)
        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE).commit();
    }
}