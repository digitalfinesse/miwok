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
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import static com.example.android.miwok.R.id.colors;
import static com.example.android.miwok.R.id.family;
import static com.example.android.miwok.R.id.numbers;
import static com.example.android.miwok.R.id.phrases;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Ищем View, показывающую категорию number
        TextView buttonView = (TextView) findViewById(numbers);
        //Устанавливаем clicklistener на эту View
        buttonView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //создаём новое намерение на открытие {@link Numbersctivity}
                Intent numbersIntent = new Intent(MainActivity.this, NumbersActivity.class);
                // Стартуем новую активити
                startActivity(numbersIntent);
            }
        });

        // Ищем View, показывающую категорию family
        TextView buttonViewFamily = (TextView) findViewById(family);
        //Устанавливаем clicklistener на эту View
        buttonViewFamily.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent familyIntent = new Intent(MainActivity.this, FamilyActivity.class);
                startActivity(familyIntent);
            }
        });


        // Ищем View, показывающую категорию colors
        TextView buttonViewColors = (TextView) findViewById(colors);
        //Устанавливаем clicklistener на эту View
        buttonViewColors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent colorsIntent = new Intent(MainActivity.this, ColorsActivity.class);
                startActivity(colorsIntent);
            }
        });


        // Ищем View, показывающую категорию colors
        TextView buttonViewPhrases = (TextView) findViewById(phrases);
        //Устанавливаем clicklistener на эту View
        buttonViewPhrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent phrasesIntent = new Intent(MainActivity.this, PhrasesActivity.class);
                startActivity(phrasesIntent);
            }
        });

    }


}

