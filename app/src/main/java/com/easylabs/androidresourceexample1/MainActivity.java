package com.easylabs.androidresourceexample1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /*     Ресурcы
    *   layout-файлы - XML-файлs, содержащий в себе разметку для Activity(И не только...)
    *   string.xml - XML-файл, содержащий в себе строковые ресурсы (мастхев для локализации)
    *   drawable - директория, содержащия в себе различные изображения и стили
    *   colors.xml - XML-файл, содержащий значения по типу Ключ-значения, где
    *              ключ - это имя, значение - цвет.
    *   mipmap - директория, также содержащая в себе изображения. В этой директории находится икона приложения.
    *   style.xml - XML-файл, содержащий в себе темы для приложения
    * */

    TextView textViewForLocal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewForLocal = (TextView) findViewById(R.id.textViewForLocal);
        textViewForLocal.setText(getString(R.string.hello_world));
    }
}
