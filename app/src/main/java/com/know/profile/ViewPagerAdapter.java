package com.know.profile;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager2.adapter.FragmentStateAdapter;

class ViewPagerAdapter extends FragmentStateAdapter {

    public Fragment[] screens;

   public ViewPagerAdapter(@NonNull FragmentActivity fm){
       super(fm);
       screens= new Fragment[]{new ProfileData(),new RequestFragment(), new RecommendFragment()};
   }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return screens[position];
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
