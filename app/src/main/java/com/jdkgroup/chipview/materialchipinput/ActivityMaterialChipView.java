package com.jdkgroup.chipview.materialchipinput;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import com.jdkgroup.chipview.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ActivityMaterialChipView extends AppCompatActivity {

    private static final String TAG = ActivityMaterialChipView.class.toString();
    @BindView(R.id.contacts_button) Button mContactListButton;
    @BindView(R.id.custom_chips_button) Button mCustomChipsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_material_chip_view);
        // butter knife
        ButterKnife.bind(this);

        mContactListButton.setOnClickListener(view -> {
            startActivity(new Intent(ActivityMaterialChipView.this, ActivityMaterialChipViewContactList.class));
        });

        mCustomChipsButton.setOnClickListener(view -> {
            startActivity(new Intent(ActivityMaterialChipView.this, ActivityMaterialChipViewDesign.class));
        });
    }
}
