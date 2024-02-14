
package com.example.gradecalculator;

        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.TextView;

        import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText ed1,ed2,ed3,ed4,ed5,ed6,ed7;
    TextView greeting;
    Button btn1,btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed1 = findViewById(R.id.editTextText);
        ed2 = findViewById(R.id.editTextText2);
        ed3 = findViewById(R.id.editTextText3);
        ed4 = findViewById(R.id.editTextText4);
        ed5 = findViewById(R.id.editTextText5);
        ed6 = findViewById(R.id.editTextText6);
        ed7 = findViewById(R.id.editTextText7);

        greeting=findViewById(R.id.greeting);
        greeting.setVisibility(View.INVISIBLE);

        ed5.setVisibility(View.INVISIBLE);
        ed6.setVisibility(View.INVISIBLE);

        btn1 = findViewById(R.id.button);
        btn2 = findViewById(R.id.button2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                marks();
            }

        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clear();
            }
        });

    }
    public void marks()
    {

        int m1,m2,m3,total;
        double avg;
        String grade;
        m1 = Integer.parseInt(ed2.getText().toString());
        m2 = Integer.parseInt(ed3.getText().toString());
        m3 = Integer.parseInt(ed4.getText().toString());

        total = m1 + m2 + m3;
        ed5.setText(String.valueOf(total));
        avg = total/3;
        ed6.setText(String.valueOf(avg));

        if(avg >= 85)
        {
            ed7.setText("A+");
            greeting.setText("Excellent !!!");
            greeting.setVisibility(View.VISIBLE);
        }
        else if(avg >= 70)
        {
            ed7.setText("A");
            greeting.setText("perfect !");
            greeting.setVisibility(View.VISIBLE);
        }

        else if(avg >= 65)
        {
            ed7.setText("A-");
            greeting.setText("Good !");
            greeting.setVisibility(View.VISIBLE);
        }


        else if(avg >= 60)
        {
            ed7.setText("B+");
            greeting.setText("Better !");
            greeting.setVisibility(View.VISIBLE);
        }
        else if(avg >= 60)
        {
            ed7.setText("B+");
            greeting.setText("Not that bad !");
            greeting.setVisibility(View.VISIBLE);
        }
        else if(avg >= 50)
        {
            ed7.setText("B-");
            greeting.setText("No worries !");
            greeting.setVisibility(View.VISIBLE);
        }
        else if(avg >= 45)
        {
            ed7.setText("C+");
            greeting.setText("Be better next time !");
            greeting.setVisibility(View.VISIBLE);
        }
        else if(avg >= 40)
        {
            ed7.setText("C");
            greeting.setText("Just keep trying.!");
            greeting.setVisibility(View.VISIBLE);
        }

        else
        {
            ed7.setText("Fail");
            greeting.setText("Better luck next time..!");
            greeting.setVisibility(View.VISIBLE);
        }

        ed5.setVisibility(View.VISIBLE);
        ed6.setVisibility(View.VISIBLE);
    }

    public void clear()
    {
        ed1.setText("");
        ed2.setText("");
        ed3.setText("");
        ed4.setText("");
        ed5.setText("");
        ed6.setText("");
        ed7.setText("");

        ed1.requestFocus();

        ed5.setVisibility(View.INVISIBLE);
        ed6.setVisibility(View.INVISIBLE);

    }

}