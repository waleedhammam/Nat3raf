package com.hammam.nat3raf;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.LinearSnapHelper;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.DragEvent;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

public class DataViewer extends AppCompatActivity {


    public static int[] imagesID;
    private int IMAGE_COUNT;

    private ImagesAdapter mImagesAdapter;
    private RecyclerView mImagesList;

    private String TAG = DataViewer.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_viewer);

        Intent buttonClicked = getIntent();
        String buttonClickedName = buttonClicked.getStringExtra("INTENT_ITEM_NAME");

        Log.i(TAG, buttonClickedName);

        ItemsData itemsData = new ItemsData();
        imagesID = itemsData.activityData(buttonClickedName);
        IMAGE_COUNT = itemsData.dataCount(buttonClickedName);

        mImagesList = (RecyclerView) findViewById(R.id.rv_images_view);
        // set layout manager
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        mImagesList.setLayoutManager(layoutManager);
        mImagesList.setHasFixedSize(true);

        mImagesAdapter = new ImagesAdapter(IMAGE_COUNT);

        mImagesList.setAdapter(mImagesAdapter);

        // snaphelper is used to scroll by page
        LinearSnapHelper snapHelper = new LinearSnapHelper() {
            @Override
            public int findTargetSnapPosition(RecyclerView.LayoutManager layoutManager, int velocityX, int velocityY) {
                View centerView = findSnapView(layoutManager);
                if (centerView == null)
                    return RecyclerView.NO_POSITION;

                int position = layoutManager.getPosition(centerView);
                int targetPosition = -1;
                if (layoutManager.canScrollHorizontally()) {
                    if (velocityX < 0) {
                        targetPosition = position - 1;
                    } else {
                        targetPosition = position + 1;
                    }
                }

                final int firstItem = 0;
                final int lastItem = layoutManager.getItemCount() - 1;
                targetPosition = Math.min(lastItem, Math.max(targetPosition, firstItem));
                return targetPosition;
            }
        };

        snapHelper.attachToRecyclerView(mImagesList);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

}
