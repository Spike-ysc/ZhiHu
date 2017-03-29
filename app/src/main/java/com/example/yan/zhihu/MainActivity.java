package com.example.yan.zhihu;

import android.content.Context;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.view.Window;
import android.widget.ListView;

import com.ashokvarma.bottomnavigation.BottomNavigationBar;
import com.ashokvarma.bottomnavigation.BottomNavigationItem;

public class MainActivity extends AppCompatActivity implements BottomNavigationBar.OnTabSelectedListener {

    private BottomNavigationBar bar;
    private FloatingActionButton floating;
    private Toolbar toolbar;
    private Fragment currentFragment = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //悬浮按钮
        floating = (FloatingActionButton) findViewById(R.id.floating);
        //顶部导航
        toolbar = (Toolbar) findViewById(R.id.myToolBar);
        toolbar.inflateMenu(R.menu.menu_test);

        //底部菜单
        bar = (BottomNavigationBar) findViewById(R.id.main_bar);
        bar.setMode(BottomNavigationBar.MODE_FIXED)
                .setBackgroundStyle(BottomNavigationBar.BACKGROUND_STYLE_DEFAULT);
        bar.setAutoHideEnabled(true);
        bar.addItem(new BottomNavigationItem(R.drawable.item1).setActiveColorResource(R.color.blue))
                .addItem(new BottomNavigationItem(R.drawable.item2).setActiveColorResource(R.color.blue))
                .addItem(new BottomNavigationItem(R.drawable.item3).setActiveColorResource(R.color.blue))
                .addItem(new BottomNavigationItem(R.drawable.item4).setActiveColorResource(R.color.blue))
                .addItem(new BottomNavigationItem(R.drawable.item5).setActiveColorResource(R.color.blue))
                .setFirstSelectedPosition(0)
                .initialise();
        bar.setTabSelectedListener(this);
        bar.setFab(floating);
    }

    @Override
    public void onTabSelected(int position) {
        switch (position){
            case 0:
                Item1Fragment fragment1 = new Item1Fragment();
                switchFragment(fragment1);
//
//                getSupportFragmentManager().beginTransaction().replace(R.id.main_fragment, fragment1).commit();
                //Item1Fragment fragment1 = new Item1Fragment();
                //getSupportFragmentManager().beginTransaction().replace(R.id.main_fragment, fragment1).commit();
                break;
            case 1:
                Item2Fragment fragment2 = new Item2Fragment();
               switchFragment(fragment2);

               // FourthFragment fragment4 = new FourthFragment();
               // getSupportFragmentManager().beginTransaction().replace(R.id.allFrame, fragment4).commit();
                break;
            case 2:
                Item3Fragment fragment3 = new Item3Fragment();
                switchFragment(fragment3);
                break;
            case 3:
                Item4Fragment fragment4 = new Item4Fragment();
                switchFragment(fragment4);
            default:
                break;
        }
    }

    @Override
    public void onTabUnselected(int position) {
    }

    @Override
    public void onTabReselected(int position) {

    }
    private void switchFragment(Fragment targetfragment){
        FragmentTransaction transaction = getSupportFragmentManager()
                .beginTransaction();
        if(!targetfragment.isAdded()){
            if(currentFragment != null){
                transaction.hide(currentFragment);
            }
            transaction.add(R.id.main_fragment, targetfragment)
                    .commit();
        }else {
            transaction.hide(currentFragment)
                    .show(targetfragment)
                    .commit();
        }
        currentFragment = targetfragment;
    }

//    private void switchFragment(Fragment from, Fragment to){
//        if(from == null || to ==null){
//
//        }
//    }





















}
