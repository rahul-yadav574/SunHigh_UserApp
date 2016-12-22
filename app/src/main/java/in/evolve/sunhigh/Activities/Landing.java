package in.evolve.sunhigh.Activities;

import android.content.res.Configuration;
import android.os.PersistableBundle;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

import butterknife.BindView;
import butterknife.ButterKnife;
import in.evolve.sunhigh.Adapters.ViewPagerAdapter;
import in.evolve.sunhigh.Fragments.TabBoysPg;
import in.evolve.sunhigh.Fragments.TabGirlsPg;
import in.evolve.sunhigh.R;

public class Landing extends AppCompatActivity {


    private DrawerLayout drawerLayout;
    private TabLayout tabLayout;
    private NavigationView navigationView;
    private Toolbar toolbar;
    private ViewPager viewPager;
    private ActionBarDrawerToggle drawerToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing);

        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        viewPager = (ViewPager) findViewById(R.id.view_pager);
        navigationView = (NavigationView) findViewById(R.id.navigation_view);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        drawerToggle = new ActionBarDrawerToggle(Landing.this,drawerLayout,R.string.nav_open,R.string.nav_close);
        drawerLayout.addDrawerListener(drawerToggle);

        drawerToggle.syncState();


        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new TabBoysPg(),getString(R.string.boys));
        adapter.addFragment(new TabGirlsPg(),getString(R.string.girls));
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

    }




    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (drawerToggle.onOptionsItemSelected(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);


    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        drawerToggle.onConfigurationChanged(newConfig);
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        drawerToggle.syncState();
    }
}
