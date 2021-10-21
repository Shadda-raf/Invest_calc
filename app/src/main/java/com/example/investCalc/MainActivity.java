package com.example.investCalc;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

//import com.google.android.material.floatingactionbutton.FloatingActionButton;
//import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import androidx.fragment.app.FragmentManager;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;
import androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback;

/*import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
*/
import com.example.investCalc.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    TabLayout tabLayout;
    ViewPager2 viewPager2;
    FragmentAdapter fragmentAdapter;

 /*   private EditText enter_term;
    private EditText enter_rate;
    private EditText enter_payment;
*/    private Button count_button;
  /*  private EditText result_main;
 */   @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = findViewById(R.id.tab_layout);
        viewPager2= findViewById(R.id.view_pager2);

        FragmentManager fm= getSupportFragmentManager();
        fragmentAdapter = new FragmentAdapter(fm,getLifecycle());
        viewPager2.setAdapter(fragmentAdapter);
         tabLayout.addTab(tabLayout.newTab().setText("Ввод данных"));
         tabLayout.addTab(tabLayout.newTab().setText("Результаты"));

         tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
             @Override
             public void onTabSelected(TabLayout.Tab tab) {
                 viewPager2.setCurrentItem(tab.getPosition());
             }

             @Override
             public void onTabUnselected(TabLayout.Tab tab) {

             }

             @Override
             public void onTabReselected(TabLayout.Tab tab) {

             }
         });

         viewPager2.registerOnPageChangeCallback(new OnPageChangeCallback(){
             @Override
             public void onPageSelected(int position){
                 super.onPageSelected(position);
             }
         });
/*


        enter_term=findViewById(R.id.enter_term);
        enter_rate=findViewById(R.id.enter_rate);
        enter_payment=findViewById(R.id.enter_payment);
       count_button=findViewById(R.id.count_button);
 /*       result_main=findViewById(R.id.result_main);

        count_button.setOnClickListener(new View.OnClickListener() {


            @Override
           public void onClick(View view) {
                @SuppressLint("ResourceType")
//Получение данных введенных пользователем и установка дефолтных значений
/*               double payment=0;
                int term=0;
                double rate=0;
                double sum=0;
                String result;
                double rateUser=Double.parseDouble(enter_rate.getText().toString());
                if (rateUser == 0) {
                    rate=4.5;
                }
                else{
                    rate=rateUser;
                }
                int termUser=Integer.parseInt(enter_term.getText().toString());
                if (termUser == 0) {
                    term=20;
                }
                else{
                    term=termUser;
                }
                double paymentUser=Double.parseDouble(enter_payment.getText().toString());
                if (paymentUser == 0) {
                    payment=200;
                }
                else{
                    payment=paymentUser;
                }

 //вычисление итоговой суммы
               double normRate=(rate/100)+1;
                for (int i=term;i>=0;i--){
                   sum=sum+(12*payment*Math.pow(normRate,i));
                }
              // result="1";
               // result_main.setText(result);
               // result_main.setText("Значения для вычислений"+ "\nСрок: " + term+"\nСтавка:"+rate+
               //         "\nЕжемесячный платеж: " + payment + "\nСумма составит: " + sum+ "$" );

            }*/
 //           });

        }

    }
