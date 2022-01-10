package com.example.FardegDistro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


import android.widget.Button;
import android.widget.ImageView;
import android.content.Intent;

public class AdminCategoryActivity extends AppCompatActivity {
    private ImageView gmbr1, gmbr2, gmbr3, gmbr4;
    private ImageView gmbr5, gmbr6, gmbr7, gmbr8;
    private ImageView gmbr9, gmbr10, gmbr11, gmbr12;
    private Button LogoutBtn, CheckOrdersBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_category);

        LogoutBtn = findViewById(R.id.admin_logout_btn);
        LogoutBtn.setOnClickListener(view -> {
            Intent intent= new Intent(AdminCategoryActivity.this,MainActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(intent);
            finish();
        });
        CheckOrdersBtn = findViewById(R.id.check_orders_btn);


        CheckOrdersBtn.setOnClickListener(view -> {
            Intent intent= new Intent(AdminCategoryActivity.this,AdminNewOrdersActivity.class);
            startActivity(intent);
        });


        gmbr1 = findViewById(R.id.menu4);
        gmbr2 = findViewById(R.id.menu2);
        gmbr3 = findViewById(R.id.menu5);
        gmbr4 = findViewById(R.id.menu3);

        gmbr5 = findViewById(R.id.menu1);
        gmbr6 = findViewById(R.id.menu7);
        gmbr7 = findViewById(R.id.menu5);
        gmbr8 = findViewById(R.id.menu8);

        gmbr9 = findViewById(R.id.menu9);
        gmbr10 = findViewById(R.id.menu10);
        gmbr11 = findViewById(R.id.menu11);
        gmbr12 = findViewById(R.id.menu12);


        gmbr1.setOnClickListener(view -> {
            Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
            intent.putExtra("category", "Menu 4");
            startActivity(intent);
        });
        gmbr2.setOnClickListener(view -> {
            Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
            intent.putExtra("category", "Menu 2");
            startActivity(intent);
        });


        gmbr3.setOnClickListener(view -> {
            Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
            intent.putExtra("category", "Menu 5");
            startActivity(intent);
        });


        gmbr4.setOnClickListener(view -> {
            Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
            intent.putExtra("category", "Menu 3");
            startActivity(intent);
        });


        gmbr5.setOnClickListener(view -> {
            Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
            intent.putExtra("category", "Menu 1");
            startActivity(intent);
        });


        gmbr6.setOnClickListener(view -> {
            Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
            intent.putExtra("category", "Menu 7");
            startActivity(intent);
        });



        gmbr7.setOnClickListener(view -> {
            Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
            intent.putExtra("category", "Menu 6");
            startActivity(intent);
        });


        gmbr8.setOnClickListener(view -> {
            Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
            intent.putExtra("category", "Menu 8");
            startActivity(intent);
        });



        gmbr9.setOnClickListener(view -> {
            Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
            intent.putExtra("category", "Menu 9");
            startActivity(intent);
        });


        gmbr10.setOnClickListener(view -> {
            Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
            intent.putExtra("category", "Menu 10");
            startActivity(intent);
        });


        gmbr11.setOnClickListener(view -> {
            Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
            intent.putExtra("category", "Menu 11");
            startActivity(intent);
        });


        gmbr12.setOnClickListener(view -> {
            Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
            intent.putExtra("category", "Mobile Phones");
            startActivity(intent);
        });
    }

    @Override
    public void onBackPressed() {
        moveTaskToBack(false);

    }
}