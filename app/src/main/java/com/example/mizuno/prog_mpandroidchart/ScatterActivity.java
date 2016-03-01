package com.example.mizuno.prog_mpandroidchart;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.github.mikephil.charting.charts.ScatterChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.ScatterData;
import com.github.mikephil.charting.data.ScatterDataSet;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class ScatterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scatter);

        ScatterChart scatterChart = (ScatterChart) findViewById(R.id.schart);

        ArrayList<Entry> entries = new ArrayList<>();
        entries.add(new Entry(4f, 0));
        entries.add(new Entry(8f, 1));
        entries.add(new Entry(6f, 2));
        entries.add(new Entry(12f, 3));
        entries.add(new Entry(18f, 4));
        entries.add(new Entry(9f, 5));

        ScatterDataSet dataset = new ScatterDataSet(entries, "# of Calls");

        ArrayList<String> labels = new ArrayList<String>();
        labels.add("January");
        labels.add("February");
        labels.add("March");
        labels.add("April");
        labels.add("May");
        labels.add("June");

        ScatterData data = new ScatterData(labels, dataset);
        scatterChart.setData(data);
        scatterChart.setDescription("Description");
        dataset.setColors(ColorTemplate.COLORFUL_COLORS); //
        dataset.setScatterShapeSize(10);
        dataset.setScatterShape(ScatterChart.ScatterShape.CIRCLE);
        scatterChart.animateY(5000);
    }
}
