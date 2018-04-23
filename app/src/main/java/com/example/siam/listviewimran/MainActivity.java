package com.example.siam.listviewimran;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView lv;
    private CustomeAdapter customeAdapter;
    private ArrayList<ImageModel> imageModelArrayList;
    private int[] myImageList = new int[]{R.drawable.aa, R.drawable.aa, R.drawable.aa, R.drawable.aa,R.drawable.aa};
    private String[] myImageNameList ={"Benz","lulu","sfijg","dfhd","ytdyt"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = (ListView) findViewById(R.id.listView_with_image);

        imageModelArrayList = populateList();
        Log.d("hjhjh",imageModelArrayList.size()+"");
        customeAdapter = new CustomeAdapter(this,imageModelArrayList);
        lv.setAdapter(customeAdapter);

    }

    private ArrayList<ImageModel> populateList(){

        ArrayList<ImageModel> list = new ArrayList<>();

        for(int i = 0; i <myImageNameList.length; i++){
            ImageModel imageModel = new ImageModel();
            imageModel.setName(myImageNameList[i]);
            imageModel.setImage_drawable(myImageList[i]);
            list.add(imageModel);
        }

        return list;

    }

}