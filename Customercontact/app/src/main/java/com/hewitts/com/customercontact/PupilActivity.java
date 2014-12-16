package com.hewitts.com.customercontact;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by CHAUHAN on 12/16/14.
 */
public class PupilActivity extends Activity {
    Spinner testPassed,lessonHad;
    List<String> lessonHadArray;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_pupil);
        testPassed = (Spinner) findViewById(R.id.testPassed);
        lessonHad =(Spinner) findViewById(R.id.lessonsHad);
        lessonHadArray = new ArrayList<String>();
        for(int i=0 ;i<=100;i++){
            lessonHadArray.add(""+i);
        }
        ArrayAdapter<CharSequence> testPassedAdapter = ArrayAdapter.createFromResource(this,R.array.testPassed,android.R.layout.simple_spinner_item);
        testPassedAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        testPassed.setAdapter(testPassedAdapter);
        ArrayAdapter<String> lessonHadAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,lessonHadArray);
        lessonHadAdapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        lessonHad.setAdapter(lessonHadAdapter);
    }
}
