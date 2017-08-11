package com.hammam.nat3raf.ImagesData;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.hammam.nat3raf.DataViewer;
import com.hammam.nat3raf.R;


public class ImagesAdapter extends RecyclerView.Adapter <ImagesAdapter.ImagesViewHolder> {

    private String TAG = ImagesAdapter.class.getSimpleName();
    private Context context;
    // How many image in the adapter
    private int mItemNumbers;

    // populate image number in the constructor
    public ImagesAdapter(int numberOfItems) {
        mItemNumbers = numberOfItems;
    }

    @Override
    public ImagesViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {

        // view context
        context = viewGroup.getContext();

        // the custom layout which is an imageview
        int layoutID = R.layout.images_list_items;

        LayoutInflater inflater = LayoutInflater.from(context);
        boolean shouldAttachToParentImediately = false;

        // create a view holder and return it
        View view = inflater.inflate(layoutID, viewGroup, shouldAttachToParentImediately);

        return new ImagesViewHolder (view);
    }

    @Override
    public void onBindViewHolder(ImagesViewHolder holder, int position) {
        Log.i(TAG, "POSITION#" + position);
        holder.bind(position);
    }

    @Override
    public int getItemCount() {
        return mItemNumbers;
    }

    // view holder class
    class ImagesViewHolder extends RecyclerView.ViewHolder {

        ImageView listItemImage;

        // set the constructor to receive image and pass it to parent
        public ImagesViewHolder(View itemView) {
            super(itemView);

            listItemImage = (ImageView) itemView.findViewById(R.id.image_data_viewer);
        }

        public void bind(int position) {
            Glide.with(context).load(DataViewer.imagesID[position]).into(listItemImage);
        }
    }
}


