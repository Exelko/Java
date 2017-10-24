/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import io.fabric.sdk.android.Fabric;
import com.crashlytics.android.Crashlytics;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Fabric.with(this, new Crashlytics());
        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        findViewById(R.id.numbers).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openNumbersPage();
            }
        });

        findViewById(R.id.billy).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openBillyPage();
            }
        });

        findViewById(R.id.van).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openVanPage();
            }
        });

        findViewById(R.id.ricardo).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openRicardoPage();
            }
        });
    }

    private void logUser() {
        // TODO: Use the current user's information
        // You can call any combination of these three methods
        Crashlytics.setUserIdentifier("12345");
        Crashlytics.setUserEmail("symkach@fabric.io");
        Crashlytics.setUserName("Test User");
    }

    public void openBillyPage() {
        Intent i = new Intent(this, AnikiActivity.class);
        startActivity(i);

    }

    public void openVanPage() {
        Intent i = new Intent(this, VanActivity.class);
        startActivity(i);
    }

    public void openRicardoPage() {
        Intent i = new Intent(this, RicardoActivity.class);
        startActivity(i);
    }

    public void openNumbersPage() {
        Intent i = new Intent(this, NumbersActivity.class);
        startActivity(i);
    }
}
