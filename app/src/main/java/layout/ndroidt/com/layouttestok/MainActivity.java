package layout.ndroidt.com.layouttestok;


import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import layout.ndroidt.com.layouttestok.Adaptor.TabPageAdaptor;


public class MainActivity extends ActionBarActivity implements ActionBar.TabListener{

    private ViewPager mViewPager;
    private TabPageAdaptor mTabAdator;
    //private android.app.ActionBar mActionBar; // Actionbar เฉยๆไม่ได้
    private ActionBar actionBar;
    private String[] tabs = { "tab 1", "tab 2", "tab 3" };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //เชื่อน Adaptor
        mViewPager = (ViewPager) findViewById(R.id.viewpager);
        mTabAdator = new TabPageAdaptor(getSupportFragmentManager());
        mViewPager.setAdapter(mTabAdator);
        //จบเชื่อม จะทำแค่ส่วนนี้ก็ได้แต่จะไม่มี Tab เพราะจะ swape left or right only


        //test
        mViewPager.setTag("TeeOK");


        //seting ActionBar app.v7
        final ActionBar actionBar = getSupportActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        for (String tab_name : tabs) {
            actionBar.addTab(actionBar.newTab().setText(tab_name)
                    .setTabListener(this));
        }
        mViewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i2) {

            }

            @Override
            public void onPageSelected(int i) {
                Log.i("Check","setSelected");
                actionBar.setSelectedNavigationItem(i);
            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        });




    }


    @Override
    public void onTabSelected(ActionBar.Tab tab, android.support.v4.app.FragmentTransaction fragmentTransaction) {
        Log.i("Check","setCurrentItem Position"+tab.getPosition());
        mViewPager.setCurrentItem(tab.getPosition());
    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, android.support.v4.app.FragmentTransaction fragmentTransaction) {

    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, android.support.v4.app.FragmentTransaction fragmentTransaction) {

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


    String TabFragmentB;

    public void setTabFragmentB(String t){
        TabFragmentB = t;
    }

    public String getTabFragmentB(){
        return TabFragmentB;
    }
}
