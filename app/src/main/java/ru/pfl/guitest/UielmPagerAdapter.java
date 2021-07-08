package ru.pfl.guitest;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

//public class UielmPagerAdapter extends RecyclerView.Adapter<UielmPagerAdapter.ViewHolder> {
public class UielmPagerAdapter extends FragmentStateAdapter {

    public UielmPagerAdapter(FragmentActivity fa) {
        super(fa);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        Fragment fragment = null;
        switch (position){
            case 0:
                fragment = UielmFragmentButtons.newInstance(null, null);
                break;
            case 1:
                fragment = UielmFragmentText.newInstance(null, null);
                break;
            case 2:
                fragment = UielmFragmentWidgets.newInstance(null, null);
                break;
        }
        return fragment;
    }

    @Override
    public int getItemCount() {
        return 3;
    }




    /*@NonNull
    @Override
    public UielmPagerAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_buttons, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {


    }



    @Override
    public int getItemCount() {
        return 3;
    }*/

    /*public UielmPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return UielmFragmentButtons.newInstance(null, null);
    }

    @Override
    public int getCount() {
        return 1;
    }*/

    /*class ViewHolder extends RecyclerView.ViewHolder {

        ViewHolder(View view) {
            super(view);

        }
    }*/
}
