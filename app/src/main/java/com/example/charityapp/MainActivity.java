package com.example.charityapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        Button buttonNavigate = findViewById(R.id.Login);

        // Устанавливаем обработчик нажатия на кнопку
        buttonNavigate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Переход на следующую активность
                navigateToNextActivity();
            }
        });
    }

    // Функция для перехода на следующую активность
    private void navigateToNextActivity() {
        // Создаём Intent для перехода на следующую активность
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);

        // Запускаем следующую активность
        startActivity(intent);
    }
}