package com.example.viewpagerfragment;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class SlideAdapter extends FragmentStateAdapter {
    public SlideAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        String data;
        switch (position) {
            case 0:
                data = "A";
            case 1:
                data = "B";
            case 2:
                data = "C";
            case 3:
                data = "D";
            case 4:
                data = "E";
            default:
                data = "";
                break;
        }
        return SlideFragment.newInstance(data);
    }

    @Override
    public int getItemCount() {
        return 5;
    }
}
