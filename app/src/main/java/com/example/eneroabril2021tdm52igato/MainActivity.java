package com.example.eneroabril2021tdm52igato;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    ImageButton btn00, btn01, btn02, btn10, btn11, btn12, btn20, btn21, btn22;
    TextView tvTitle;
    boolean turno;
    int tag00 = -1, tag01 = -1, tag02 = -1,tag10 = -1, tag11 = -1, tag12 = -1, tag20 = -1, tag21 = -1, tag22 = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn00 = findViewById(R.id.imgB00);
        btn01 = findViewById(R.id.imgB01);
        btn02 = findViewById(R.id.imgB02);
        btn10 = findViewById(R.id.imgB10);
        btn11 = findViewById(R.id.imgB11);
        btn12 = findViewById(R.id.imgB12);
        btn20 = findViewById(R.id.imgB20);
        btn21 = findViewById(R.id.imgB21);
        btn22 = findViewById(R.id.imgB22);
        tvTitle = findViewById(R.id.tvTitle);
    }

    public void reiniciar(View v)
    {
        btn00.setImageResource(R.drawable.gato);
        btn01.setImageResource(R.drawable.gato);
        btn02.setImageResource(R.drawable.gato);
        btn10.setImageResource(R.drawable.gato);
        btn11.setImageResource(R.drawable.gato);
        btn12.setImageResource(R.drawable.gato);
        btn20.setImageResource(R.drawable.gato);
        btn21.setImageResource(R.drawable.gato);
        btn22.setImageResource(R.drawable.gato);
        btn00.setEnabled(true);
        btn01.setEnabled(true);
        btn02.setEnabled(true);
        btn10.setEnabled(true);
        btn11.setEnabled(true);
        btn12.setEnabled(true);
        btn20.setEnabled(true);
        btn21.setEnabled(true);
        btn22.setEnabled(true);
        tvTitle.setText("GATO");
        tag00 = -1;
        tag01 = -1;
        tag02 = -1;
        tag10 = -1;
        tag11 = -1;
        tag12 = -1;
        tag20 = -1;
        tag21 = -1;
        tag22 = -1;
        turno = false;
    }

    public void revisarGanador()
    {
        //Revisar fila 1
        if ((tag00 == tag01 && tag00 == tag02))
        {
            if(tag00 == 1)
                tvTitle.setText("GANO X");
            else if (tag00 == 0)
                tvTitle.setText("GANO O");
        }
        //Revisar fila 2
        if ((tag10 == tag11 && tag10 == tag12))
        {
            if(tag10 == 1)
                tvTitle.setText("GANO X");
            else if(tag10 == 0)
                tvTitle.setText("GANO O");
        }
        //Revisar fila 3
        if ((tag20 == tag21 && tag20 == tag22))
        {
            if(tag20 == 1)
                tvTitle.setText("GANO X");
            else if(tag20 == 0)
                tvTitle.setText("GANO O");
        }
        //Revisar Columna 1
        if ((tag00 == tag10 && tag00 == tag20))
        {
            if(tag00 == 1)
                tvTitle.setText("GANO X");
            else if(tag00 == 0)
                tvTitle.setText("GANO O");
        }
        //Revisar Columna 2
        if ((tag01 == tag11 && tag01 == tag21))
        {
            if(tag01 == 1)
                tvTitle.setText("GANO X");
            else if(tag01 == 0)
                tvTitle.setText("GANO O");
        }
        //Revisar Columna 3
        if ((tag02 == tag12 && tag02 == tag22))
        {
            if(tag02 == 1)
                tvTitle.setText("GANO X");
            else if(tag02 == 0)
                tvTitle.setText("GANO O");
        }
        //Revisar Diagonal 1
        if ((tag00 == tag11 && tag00 == tag22))
        {
            if(tag00 == 1)
                tvTitle.setText("GANO X");
            else if(tag00 == 0)
                tvTitle.setText("GANO O");
        }
        //Revisar Diagonal 2
        if ((tag02 == tag11 && tag02 == tag20))
        {
            if(tag02 == 1)
                tvTitle.setText("GANO X");
            else if(tag02 == 0)
                tvTitle.setText("GANO O");
        }
    }

    public void Clickbtn00(View v)
    {
        if (turno)
        {
            btn00.setImageResource(R.drawable.ex);
            turno = false;
            tag00 = 1;
        }
        else
        {
            btn00.setImageResource(R.drawable.circle);
            turno = true;
            tag00 = 0;
        }
        btn00.setEnabled(false);
        revisarGanador();
    }

    public void Clicktbn01(View v)
    {
        if (turno)
        {
            btn01.setImageResource(R.drawable.ex);
            turno = false;
            tag01 = 1;
        }
        else
        {
            btn01.setImageResource(R.drawable.circle);
            turno = true;
            tag01 = 0;
        }
        btn01.setEnabled(false);
        revisarGanador();
    }

    public void Clicktbn02(View v)
    {
        if (turno)
        {
            btn02.setImageResource(R.drawable.ex);
            turno = false;
            tag02 = 1;
        }
        else
        {
            btn02.setImageResource(R.drawable.circle);
            turno = true;
            tag02 = 0;
        }
        btn02.setEnabled(false);
        revisarGanador();
    }

    public void Clicktbn10(View v)
    {
        if (turno)
        {
            btn10.setImageResource(R.drawable.ex);
            turno = false;
            tag10 = 1;
        }
        else
        {
            btn10.setImageResource(R.drawable.circle);
            turno = true;
            tag10 = 0;
        }
        btn10.setEnabled(false);
        revisarGanador();
    }

    public void Clicktbn11(View v)
    {
        if (turno)
        {
            btn11.setImageResource(R.drawable.ex);
            turno = false;
            tag11 = 1;
        }
        else
        {
            btn11.setImageResource(R.drawable.circle);
            turno = true;
            tag11 = 0;
        }
        btn11.setEnabled(false);
        revisarGanador();
    }

    public void Clicktbn12(View v)
    {
        if (turno)
        {
            btn12.setImageResource(R.drawable.ex);
            turno = false;
            tag12 = 1;
        }
        else
        {
            btn12.setImageResource(R.drawable.circle);
            turno = true;
            tag12 = 0;
        }
        btn12.setEnabled(false);
        revisarGanador();
    }

    public void Clicktbn20(View v)
    {
        if (turno)
        {
            btn20.setImageResource(R.drawable.ex);
            turno = false;
            tag20 = 1;
        }
        else
        {
            btn20.setImageResource(R.drawable.circle);
            turno = true;
            tag20 = 0;
        }
        btn20.setEnabled(false);
        revisarGanador();
    }

    public void Clicktbn21(View v)
    {
        if (turno)
        {
            btn21.setImageResource(R.drawable.ex);
            turno = false;
            tag21 = 1;
        }
        else
        {
            btn21.setImageResource(R.drawable.circle);
            turno = true;
            tag21 = 0;
        }
        btn21.setEnabled(false);
        revisarGanador();
    }

    public void Clicktbn22(View v)
    {
        if (turno)
        {
            btn22.setImageResource(R.drawable.ex);
            turno = false;
            tag22 = 1;
        }
        else
        {
            btn22.setImageResource(R.drawable.circle);
            turno = true;
            tag22 = 0;
        }
        btn22.setEnabled(false);
        revisarGanador();
    }
}