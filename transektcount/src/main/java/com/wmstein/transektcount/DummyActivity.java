/*
 * Copyright (c) 2016. Wilhelm Stein, Bonn, Germany.
 */

package com.wmstein.transektcount;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

/**************************************************************************************
 * Dummy to overcome Spinner deficiency
 * Re-initializes Spinner to work as exspected when repeatedly used in calling activity
 * Created by wmstein on 28.12.2016
 */
public class DummyActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        exit();
    }

    public void exit()
    {
        super.finish();
    }
    
}
