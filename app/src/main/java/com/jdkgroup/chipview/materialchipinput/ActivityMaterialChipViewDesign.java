package com.jdkgroup.chipview.materialchipinput;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.jdkgroup.chipview.R;
import com.pchmn.materialchips.ChipView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ActivityMaterialChipViewDesign extends AppCompatActivity {

    private static final String TAG = ActivityMaterialChipViewDesign.class.toString();
    @BindView(R.id.chip1)
    ChipView mChip1;
    @BindView(R.id.chip2)
    ChipView mChip2;
    @BindView(R.id.chip3)
    ChipView mChip3;
    @BindView(R.id.chip4)
    ChipView mChip4;
    @BindView(R.id.chip5)
    ChipView mChip5;
    @BindView(R.id.chip6)
    ChipView mChip6;
    @BindView(R.id.chip7)
    ChipView mChip7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_material_chip_view_design);
        // butter knife
        ButterKnife.bind(this);

        // chip 1
        mChip1.setOnChipClicked(view -> {
            Toast.makeText(ActivityMaterialChipViewDesign.this, mChip1.getLabel() + ": clicked", Toast.LENGTH_SHORT).show();
        });
        mChip1.setOnDeleteClicked(view -> {
            Toast.makeText(ActivityMaterialChipViewDesign.this, mChip1.getLabel() + ": delete clicked", Toast.LENGTH_SHORT).show();
        });

        // chip 2
        mChip2.setOnChipClicked(view -> {
            Toast.makeText(ActivityMaterialChipViewDesign.this, mChip2.getLabel() + ": clicked", Toast.LENGTH_SHORT).show();
        });

        // chip 3
        mChip3.setOnChipClicked(view -> {
            Toast.makeText(ActivityMaterialChipViewDesign.this, mChip3.getLabel() + ": clicked", Toast.LENGTH_SHORT).show();
        });
        mChip3.setOnDeleteClicked(view -> {
            Toast.makeText(ActivityMaterialChipViewDesign.this, mChip3.getLabel() + ": delete clicked", Toast.LENGTH_SHORT).show();
        });

        // chip 4
        mChip4.setOnChipClicked(view -> {
            Toast.makeText(ActivityMaterialChipViewDesign.this, mChip4.getLabel() + ": clicked", Toast.LENGTH_SHORT).show();
        });
        mChip4.setOnDeleteClicked(view -> {
            Toast.makeText(ActivityMaterialChipViewDesign.this, mChip4.getLabel() + ": delete clicked", Toast.LENGTH_SHORT).show();
        });

        // chip 5
        mChip5.setOnChipClicked(view -> {
            Toast.makeText(ActivityMaterialChipViewDesign.this, mChip5.getLabel() + ": clicked", Toast.LENGTH_SHORT).show();
        });

        // chip 6
        mChip6.setOnChipClicked(view -> {
            Toast.makeText(ActivityMaterialChipViewDesign.this, mChip6.getLabel() + ": clicked", Toast.LENGTH_SHORT).show();
        });
        mChip6.setOnDeleteClicked(view -> {
            Toast.makeText(ActivityMaterialChipViewDesign.this, mChip6.getLabel() + ": delete clicked", Toast.LENGTH_SHORT).show();
        });

        // chip 7
        mChip7.setOnChipClicked(view -> {
            Toast.makeText(ActivityMaterialChipViewDesign.this, mChip7.getLabel() + ": clicked", Toast.LENGTH_SHORT).show();
        });
        mChip7.setOnDeleteClicked(view -> {
            Toast.makeText(ActivityMaterialChipViewDesign.this, mChip7.getLabel() + ": delete clicked", Toast.LENGTH_SHORT).show();
        });
    }
}
