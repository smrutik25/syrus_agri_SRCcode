package com.sankhe.chinmay.unclogthecity;

import android.content.Intent;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.File;

public class Camera extends AppCompatActivity {

    private Button btn;
    static final int cam_request=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);
        btn=(Button) findViewById(R.id.button0);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                File f2=getFile();
                intent.putExtra(MediaStore.EXTRA_OUTPUT, Uri.fromFile(f2));
                startActivityForResult(intent,cam_request);

            }
        });
    }

    public File getFile()
    {
        File SwaachPhotos=new File("Internal/DCIM");
        if (!SwaachPhotos.exists())
        {
            SwaachPhotos.mkdir();
        }
        File img=new File(SwaachPhotos,"img.jpg");
        return img;

    }

}
