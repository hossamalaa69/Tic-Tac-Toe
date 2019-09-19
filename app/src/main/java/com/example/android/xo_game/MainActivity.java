package com.example.android.xo_game;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    int CountPlay=0;
    char [][] arr=new char[3][3];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ResetArr();
    }

    public void ResetGame(View v)
    {
        ResetArr();
        CountPlay=0;
    }

    public void ResetArr()
    {
        CountPlay=0;

        for(int i=0;i<3;i++)
            for(int j=0;j<3;j++)
                arr[i][j]='0';

        Button b1=(Button)findViewById(R.id.button_00);
        Button b2=(Button)findViewById(R.id.button_01);
        Button b3=(Button)findViewById(R.id.button_02);
        Button b4=(Button)findViewById(R.id.button_10);
        Button b5=(Button)findViewById(R.id.button_11);
        Button b6=(Button)findViewById(R.id.button_12);
        Button b7=(Button)findViewById(R.id.button_20);
        Button b8=(Button)findViewById(R.id.button_21);
        Button b9=(Button)findViewById(R.id.button_22);

        b1.setText("");
        b2.setText("");
        b3.setText("");
        b4.setText("");
        b5.setText("");
        b6.setText("");
        b7.setText("");
        b8.setText("");
        b9.setText("");

    }

    public void CheckWin(char x)
    {
        //Check all rows
        if(arr[0][0]==arr[0][1]&&arr[0][1]==arr[0][2]&&arr[0][0]==x)
          MakeWinner(x);
        else if(arr[1][0]==arr[1][1]&&arr[1][1]==arr[1][2]&&arr[1][0]==x)
          MakeWinner(x);
        else if(arr[2][0]==arr[2][1]&&arr[2][1]==arr[2][2]&&arr[2][0]==x)
          MakeWinner(x);

        //check all columns
        else if(arr[0][0]==arr[1][0]&&arr[1][0]==arr[2][0]&&arr[0][0]==x)
            MakeWinner(x);
        else if(arr[0][1]==arr[1][1]&&arr[1][1]==arr[2][1]&&arr[0][1]==x)
            MakeWinner(x);
        else if(arr[0][2]==arr[1][2]&&arr[1][2]==arr[2][2]&&arr[0][2]==x)
            MakeWinner(x);

        //check diagonals
        else if(arr[0][0]==arr[1][1]&&arr[1][1]==arr[2][2]&&arr[0][0]==x)
            MakeWinner(x);
        else if(arr[0][2]==arr[1][1]&&arr[1][1]==arr[2][0]&&arr[0][2]==x)
            MakeWinner(x);

        else if(CountPlay==8)
        {
            Toast.makeText(getApplicationContext(),"Draw",Toast.LENGTH_SHORT).show();
        }

    }

    public void MakeWinner(char x)
    {
        if(x=='X')
        {
            Toast.makeText(getApplicationContext(), "Player1 won ", Toast.LENGTH_SHORT).show();
        }
        if(x=='O')
        {
            Toast.makeText(getApplicationContext(), "Player2 won ", Toast.LENGTH_SHORT).show();
        }
    }

    public void But00(View vi)
    {
        Button b1 = (Button) findViewById(R.id.button_00);

        if(b1.getText()=="X" || b1.getText()=="O")
        {
            Toast.makeText(getApplicationContext(), "Already chosen", Toast.LENGTH_SHORT).show();
            return;
        }

        if (CountPlay % 2 == 0)
        {
            b1.setText("X");
            arr[0][0]='X';
            CheckWin('X');
        }
        else
        {
            b1.setText("O");
            arr[0][0]='O';
            CheckWin('O');
        }
        CountPlay++;
    }
    public void But01(View vi)
    {
        Button b1 = (Button) findViewById(R.id.button_01);
        if(b1.getText()=="X" || b1.getText()=="O")
        {
            Toast.makeText(getApplicationContext(), "Already chosen", Toast.LENGTH_SHORT).show();
            return;
        }

        if (CountPlay % 2 == 0)
        {
            b1.setText("X");
            arr[0][1]='X';
            CheckWin('X');
        }
        else
        {
            b1.setText("O");
            arr[0][1]='O';
            CheckWin('O');
        }
        CountPlay++;
    }
    public void But02(View vi)
    {
        Button b1 = (Button) findViewById(R.id.button_02);
        if(b1.getText()=="X" || b1.getText()=="O")
        {
            Toast.makeText(getApplicationContext(), "Already chosen", Toast.LENGTH_SHORT).show();
            return;
        }

        if (CountPlay % 2 == 0)
        {
            b1.setText("X");
            arr[0][2]='X';
            CheckWin('X');
        }
        else
        {
            b1.setText("O");
            arr[0][2]='O';
            CheckWin('O');
        }
        CountPlay++;
    }
    public void But10(View vi)
    {
        Button b1 = (Button) findViewById(R.id.button_10);
        if(b1.getText()=="X" || b1.getText()=="O")
        {
            Toast.makeText(getApplicationContext(), "Already chosen", Toast.LENGTH_SHORT).show();
            return;
        }

        if (CountPlay % 2 == 0)
        {
            b1.setText("X");
            arr[1][0]='X';
            CheckWin('X');
        }
        else
        {
            b1.setText("O");
            arr[1][0]='O';
            CheckWin('O');
        }
        CountPlay++;
    }
    public void But11(View vi)
    {
        Button b1 = (Button) findViewById(R.id.button_11);
        if(b1.getText()=="X" || b1.getText()=="O")
        {
            Toast.makeText(getApplicationContext(), "Already chosen", Toast.LENGTH_SHORT).show();
            return;
        }

        if (CountPlay % 2 == 0)
        {
            b1.setText("X");
            arr[1][1]='X';
            CheckWin('X');
        }
        else
        {
            b1.setText("O");
            arr[1][1]='O';
            CheckWin('O');
        }
        CountPlay++;
    }
    public void But12(View vi)
    {
        Button b1 = (Button) findViewById(R.id.button_12);

        if(b1.getText()=="X" || b1.getText()=="O")
        {
            Toast.makeText(getApplicationContext(), "Already chosen", Toast.LENGTH_SHORT).show();
            return;
        }

        if (CountPlay % 2 == 0)
        {
            b1.setText("X");
            arr[1][2]='X';
            CheckWin('X');
        }
        else
        {
            b1.setText("O");
            arr[1][2]='O';
            CheckWin('O');
        }
        CountPlay++;
    }
    public void But20(View vi)
    {
        Button b1 = (Button) findViewById(R.id.button_20);

        if(b1.getText()=="X" || b1.getText()=="O")
        {
            Toast.makeText(getApplicationContext(), "Already chosen", Toast.LENGTH_SHORT).show();
            return;
        }

        if (CountPlay % 2 == 0)
        {
            b1.setText("X");
            arr[2][0]='X';
            CheckWin('X');
        }
        else
        {
            b1.setText("O");
            arr[2][0]='O';
            CheckWin('O');
        }
        CountPlay++;
    }
    public void But21(View vi)
    {
        Button b1 = (Button) findViewById(R.id.button_21);
        if(b1.getText()=="X" || b1.getText()=="O")
        {
            Toast.makeText(getApplicationContext(), "Already chosen", Toast.LENGTH_SHORT).show();
            return;
        }

        if (CountPlay % 2 == 0)
        {
            b1.setText("X");
            arr[2][1]='X';
            CheckWin('X');
        }
        else
        {
            b1.setText("O");
            arr[2][1]='O';
            CheckWin('O');
        }
        CountPlay++;
    }
    public void But22(View vi)
    {
        Button b1 = (Button) findViewById(R.id.button_22);

        if(b1.getText()=="X" || b1.getText()=="O")
        {
            Toast.makeText(getApplicationContext(), "Already chosen", Toast.LENGTH_SHORT).show();
            return;
        }

        if (CountPlay % 2 == 0)
        {
            b1.setText("X");
            arr[2][2]='X';
            CheckWin('X');
        }
        else
        {
            b1.setText("O");
            arr[2][2]='O';
            CheckWin('O');
        }
        CountPlay++;
    }

}

