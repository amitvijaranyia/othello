package com.example.othello;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageButton[] imageButtonArray;
    TextView black_count, white_count;
    Button reset;
    int black = R.color.blackDark;
    int white = R.color.whiteDark;
    int blackLight = R.color.blackLight;
    int whiteLight = R.color.whiteLight;
    int holoBlueBright = R.color.holo_blue_bright;

    int[][] boardState = new int[8][8];
    boolean[][] validPoints;
    int numberOfTimesBothWereUnableToChoose;

    int turn = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FindViewById();

        startState();

        showValidPoints();

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetState();
            }
        });

        imageButtonArray[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(validPoints[0][0]) {
                    removePreviousValidPoints();
                    onButtonClicked(0, 0, imageButtonArray[0]);
                }
            }
        });
        imageButtonArray[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(validPoints[0][1]) {
                    removePreviousValidPoints();
                    onButtonClicked(0, 1, imageButtonArray[1]);
                }
            }
        });
        imageButtonArray[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(validPoints[0][2]) {
                    removePreviousValidPoints();
                    onButtonClicked(0, 2, imageButtonArray[2]);
                }
            }
        });
        imageButtonArray[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(validPoints[0][3]) {
                    removePreviousValidPoints();
                    onButtonClicked(0, 3, imageButtonArray[3]);
                }
            }
        });
        imageButtonArray[4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(validPoints[0][4]) {
                    removePreviousValidPoints();
                    onButtonClicked(0, 4, imageButtonArray[4]);
                }
            }
        });
        imageButtonArray[5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(validPoints[0][5]) {
                    removePreviousValidPoints();
                    onButtonClicked(0, 5, imageButtonArray[5]);
                }
            }
        });
        imageButtonArray[6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(validPoints[0][6]) {
                    removePreviousValidPoints();
                    onButtonClicked(0, 6, imageButtonArray[6]);
                }
            }
        });
        imageButtonArray[7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(validPoints[0][7]) {
                    removePreviousValidPoints();
                    onButtonClicked(0, 7, imageButtonArray[7]);
                }
            }
        });
        imageButtonArray[8].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(validPoints[1][0]) {
                    removePreviousValidPoints();
                    onButtonClicked(1, 0, imageButtonArray[8]);
                }
            }
        });
        imageButtonArray[9].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(validPoints[1][1]) {
                    removePreviousValidPoints();
                    onButtonClicked(1, 1, imageButtonArray[9]);
                }
            }
        });
        imageButtonArray[10].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(validPoints[1][2]) {
                    removePreviousValidPoints();
                    onButtonClicked(1, 2, imageButtonArray[10]);
                }
            }
        });
        imageButtonArray[11].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(validPoints[1][3]) {
                    removePreviousValidPoints();
                    onButtonClicked(1, 3, imageButtonArray[11]);
                }
            }
        });
        imageButtonArray[12].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(validPoints[1][4]) {
                    removePreviousValidPoints();
                    onButtonClicked(1, 4, imageButtonArray[12]);
                }
            }
        });
        imageButtonArray[13].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(validPoints[1][5]) {
                    removePreviousValidPoints();
                    onButtonClicked(1, 5, imageButtonArray[13]);
                }
            }
        });
        imageButtonArray[14].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(validPoints[1][6]) {
                    removePreviousValidPoints();
                    onButtonClicked(1, 6, imageButtonArray[14]);
                }
            }
        });
        imageButtonArray[15].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(validPoints[1][7]) {
                    removePreviousValidPoints();
                    onButtonClicked(1, 7, imageButtonArray[15]);
                }
            }
        });
        imageButtonArray[16].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(validPoints[2][0]) {
                    removePreviousValidPoints();
                    onButtonClicked(2, 0, imageButtonArray[16]);
                }
            }
        });
        imageButtonArray[17].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(validPoints[2][1]) {
                    removePreviousValidPoints();
                    onButtonClicked(2, 1, imageButtonArray[17]);
                }
            }
        });
        imageButtonArray[18].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(validPoints[2][2]) {
                    removePreviousValidPoints();
                    onButtonClicked(2, 2, imageButtonArray[18]);
                }
            }
        });
        imageButtonArray[19].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(validPoints[2][3]) {
                    removePreviousValidPoints();
                    onButtonClicked(2, 3, imageButtonArray[19]);
                }
            }
        });
        imageButtonArray[20].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(validPoints[2][4]) {
                    removePreviousValidPoints();
                    onButtonClicked(2, 4, imageButtonArray[20]);
                }
            }
        });
        imageButtonArray[21].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(validPoints[2][5]) {
                    removePreviousValidPoints();
                    onButtonClicked(2, 5, imageButtonArray[21]);
                }
            }
        });
        imageButtonArray[22].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(validPoints[2][6]) {
                    removePreviousValidPoints();
                    onButtonClicked(2, 6, imageButtonArray[22]);
                }
            }
        });
        imageButtonArray[23].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(validPoints[2][7]) {
                    removePreviousValidPoints();
                    onButtonClicked(2, 7, imageButtonArray[23]);
                }
            }
        });
        imageButtonArray[24].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(validPoints[3][0]) {
                    removePreviousValidPoints();
                    onButtonClicked(3, 0, imageButtonArray[24]);
                }
            }
        });
        imageButtonArray[25].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(validPoints[3][1]) {
                    removePreviousValidPoints();
                    onButtonClicked(3, 1, imageButtonArray[25]);
                }
            }
        });
        imageButtonArray[26].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(validPoints[3][2]) {
                    removePreviousValidPoints();
                    onButtonClicked(3, 2, imageButtonArray[26]);
                }
            }
        });
        imageButtonArray[27].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(validPoints[3][3]) {
                    removePreviousValidPoints();
                    onButtonClicked(3, 3, imageButtonArray[27]);
                }
            }
        });
        imageButtonArray[28].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(validPoints[3][4]) {
                    removePreviousValidPoints();
                    onButtonClicked(3, 4, imageButtonArray[28]);
                }
            }
        });
        imageButtonArray[29].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(validPoints[3][5]) {
                    removePreviousValidPoints();
                    onButtonClicked(3, 5, imageButtonArray[29]);
                }
            }
        });
        imageButtonArray[30].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(validPoints[3][6]) {
                    removePreviousValidPoints();
                    onButtonClicked(3, 6, imageButtonArray[30]);
                }
            }
        });
        imageButtonArray[31].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(validPoints[3][7]) {
                    removePreviousValidPoints();
                    onButtonClicked(3, 7, imageButtonArray[31]);
                }
            }
        });
        imageButtonArray[32].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(validPoints[4][0]) {
                    removePreviousValidPoints();
                    onButtonClicked(4, 0, imageButtonArray[32]);
                }
            }
        });
        imageButtonArray[33].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(validPoints[4][1]) {
                    removePreviousValidPoints();
                    onButtonClicked(4, 1, imageButtonArray[33]);
                }
            }
        });
        imageButtonArray[34].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(validPoints[4][2]) {
                    removePreviousValidPoints();
                    onButtonClicked(4, 2, imageButtonArray[34]);
                }
            }
        });
        imageButtonArray[35].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(validPoints[4][3]) {
                    removePreviousValidPoints();
                    onButtonClicked(4, 3, imageButtonArray[35]);
                }
            }
        });
        imageButtonArray[36].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(validPoints[4][4]) {
                    removePreviousValidPoints();
                    onButtonClicked(4, 4, imageButtonArray[36]);
                }
            }
        });
        imageButtonArray[37].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(validPoints[4][5]) {
                    removePreviousValidPoints();
                    onButtonClicked(4, 5, imageButtonArray[37]);
                }
            }
        });
        imageButtonArray[38].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(validPoints[4][6]) {
                    removePreviousValidPoints();
                    onButtonClicked(4, 6, imageButtonArray[38]);
                }
            }
        });
        imageButtonArray[39].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(validPoints[4][7]) {
                    removePreviousValidPoints();
                    onButtonClicked(4, 7, imageButtonArray[39]);
                }
            }
        });
        imageButtonArray[40].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(validPoints[5][0]) {
                    removePreviousValidPoints();
                    onButtonClicked(5, 0, imageButtonArray[40]);
                }
            }
        });
        imageButtonArray[41].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(validPoints[5][1]) {
                    removePreviousValidPoints();
                    onButtonClicked(5, 1, imageButtonArray[41]);
                }
            }
        });
        imageButtonArray[42].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(validPoints[5][2]) {
                    removePreviousValidPoints();
                    onButtonClicked(5, 2, imageButtonArray[42]);
                }
            }
        });
        imageButtonArray[43].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(validPoints[5][3]) {
                    removePreviousValidPoints();
                    onButtonClicked(5, 3, imageButtonArray[43]);
                }
            }
        });
        imageButtonArray[44].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(validPoints[5][4]) {
                    removePreviousValidPoints();
                    onButtonClicked(5, 4, imageButtonArray[44]);
                }
            }
        });
        imageButtonArray[45].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(validPoints[5][5]) {
                    removePreviousValidPoints();
                    onButtonClicked(5, 5, imageButtonArray[45]);
                }
            }
        });
        imageButtonArray[46].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(validPoints[5][6]) {
                    removePreviousValidPoints();
                    onButtonClicked(5, 6, imageButtonArray[46]);
                }
            }
        });
        imageButtonArray[47].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(validPoints[5][7]) {
                    removePreviousValidPoints();
                    onButtonClicked(5, 7, imageButtonArray[47]);
                }
            }
        });
        imageButtonArray[48].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(validPoints[6][0]) {
                    removePreviousValidPoints();
                    onButtonClicked(6, 0, imageButtonArray[48]);
                }
            }
        });
        imageButtonArray[49].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(validPoints[6][1]) {
                    removePreviousValidPoints();
                    onButtonClicked(6, 1, imageButtonArray[49]);
                }
            }
        });
        imageButtonArray[50].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(validPoints[6][2]) {
                    removePreviousValidPoints();
                    onButtonClicked(6, 2, imageButtonArray[50]);
                }
            }
        });
        imageButtonArray[51].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(validPoints[6][3]) {
                    removePreviousValidPoints();
                    onButtonClicked(6, 3, imageButtonArray[51]);
                }
            }
        });
        imageButtonArray[52].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(validPoints[6][4]) {
                    removePreviousValidPoints();
                    onButtonClicked(6, 4, imageButtonArray[52]);
                }
            }
        });
        imageButtonArray[53].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(validPoints[6][5]) {
                    removePreviousValidPoints();
                    onButtonClicked(6, 5, imageButtonArray[53]);
                }
            }
        });
        imageButtonArray[54].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(validPoints[6][6]) {
                    removePreviousValidPoints();
                    onButtonClicked(6, 6, imageButtonArray[54]);
                }
            }
        });
        imageButtonArray[55].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(validPoints[6][7]) {
                    removePreviousValidPoints();
                    onButtonClicked(6, 7, imageButtonArray[55]);
                }
            }
        });
        imageButtonArray[56].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(validPoints[7][0]) {
                    removePreviousValidPoints();
                    onButtonClicked(7, 0, imageButtonArray[56]);
                }
            }
        });
        imageButtonArray[57].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(validPoints[7][1]) {
                    removePreviousValidPoints();
                    onButtonClicked(7, 1, imageButtonArray[57]);
                }
            }
        });
        imageButtonArray[58].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(validPoints[7][2]) {
                    removePreviousValidPoints();
                    onButtonClicked(7, 2, imageButtonArray[58]);
                }
            }
        });
        imageButtonArray[59].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(validPoints[7][3]) {
                    removePreviousValidPoints();
                    onButtonClicked(7, 3, imageButtonArray[59]);
                }
            }
        });
        imageButtonArray[60].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(validPoints[7][4]) {
                    removePreviousValidPoints();
                    onButtonClicked(7, 4, imageButtonArray[60]);
                }
            }
        });
        imageButtonArray[61].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(validPoints[7][5]) {
                    removePreviousValidPoints();
                    onButtonClicked(7, 5, imageButtonArray[61]);
                }
            }
        });
        imageButtonArray[62].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(validPoints[7][6]) {
                    removePreviousValidPoints();
                    onButtonClicked(7, 6, imageButtonArray[62]);
                }
            }
        });
        imageButtonArray[63].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(validPoints[7][7]) {
                    removePreviousValidPoints();
                    onButtonClicked(7, 7, imageButtonArray[63]);
                }
            }
        });

    }

    public void FindViewById(){
        imageButtonArray = new ImageButton[]{
                findViewById(R.id.ib00), findViewById(R.id.ib01), findViewById(R.id.ib02), findViewById(R.id.ib03),
                findViewById(R.id.ib04), findViewById(R.id.ib05), findViewById(R.id.ib06), findViewById(R.id.ib07),
                findViewById(R.id.ib10), findViewById(R.id.ib11), findViewById(R.id.ib12), findViewById(R.id.ib13),
                findViewById(R.id.ib14), findViewById(R.id.ib15), findViewById(R.id.ib16), findViewById(R.id.ib17),
                findViewById(R.id.ib20), findViewById(R.id.ib21), findViewById(R.id.ib22), findViewById(R.id.ib23),
                findViewById(R.id.ib24), findViewById(R.id.ib25), findViewById(R.id.ib26), findViewById(R.id.ib27),
                findViewById(R.id.ib30), findViewById(R.id.ib31), findViewById(R.id.ib32), findViewById(R.id.ib33),
                findViewById(R.id.ib34), findViewById(R.id.ib35), findViewById(R.id.ib36), findViewById(R.id.ib37),
                findViewById(R.id.ib40), findViewById(R.id.ib41), findViewById(R.id.ib42), findViewById(R.id.ib43),
                findViewById(R.id.ib44), findViewById(R.id.ib45), findViewById(R.id.ib46), findViewById(R.id.ib47),
                findViewById(R.id.ib50), findViewById(R.id.ib51), findViewById(R.id.ib52), findViewById(R.id.ib53),
                findViewById(R.id.ib54), findViewById(R.id.ib55), findViewById(R.id.ib56), findViewById(R.id.ib57),
                findViewById(R.id.ib60), findViewById(R.id.ib61), findViewById(R.id.ib62), findViewById(R.id.ib63),
                findViewById(R.id.ib64), findViewById(R.id.ib65), findViewById(R.id.ib66), findViewById(R.id.ib67),
                findViewById(R.id.ib70), findViewById(R.id.ib71), findViewById(R.id.ib72), findViewById(R.id.ib73),
                findViewById(R.id.ib74), findViewById(R.id.ib75), findViewById(R.id.ib76), findViewById(R.id.ib77)};
        black_count = findViewById(R.id.black_count);
        white_count = findViewById(R.id.white_count);
        reset = findViewById(R.id.reset);
    }

    public void startState(){
        for(ImageButton imageButton : imageButtonArray){
            imageButton.setImageResource(holoBlueBright);
        }

        imageButtonArray[27].setImageResource(white);
        imageButtonArray[28].setImageResource(black);
        imageButtonArray[35].setImageResource(black);
        imageButtonArray[36].setImageResource(white);

        boardState[3][3] = 1;
        boardState[4][4] = 1;
        boardState[3][4] = 2;
        boardState[4][3] = 2;

        turn = 2;

        settingCount();
    }

    public void settingCount(){
        int countNumberOfBlack = 0, countNumberofWhite = 0;
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                if(boardState[i][j] == 1){
                    countNumberofWhite++;
                }
                else if(boardState[i][j] == 2){
                    countNumberOfBlack++;
                }
            }
        }
        white_count.setText(String.valueOf(countNumberofWhite));
        black_count.setText(String.valueOf(countNumberOfBlack));
    }

    public void onButtonClicked(int row, int col, ImageButton btn){
        if(turn == 1){
            changeColourOfButtonsOnBeingClicked(row, col, 2);
            boardState[row][col] = 1;
            int pos = 8*row+col;
            imageButtonArray[pos].setImageResource(white);
            char c = (char)(65+col);
            String str = ""+c;
            String str1 = String.valueOf(row+1);
            Toast.makeText(MainActivity.this,
                    "White at "+str1+"-"+str,
                    Toast.LENGTH_SHORT)
                    .show();
        }
        else{
            changeColourOfButtonsOnBeingClicked(row, col, 1);
            boardState[row][col] = 2;
            int pos = 8*row+col;
            imageButtonArray[pos].setImageResource(black);
            char c = (char)(65+col);
            String str = ""+c;
            String str1 = String.valueOf(row+1);
            Toast.makeText(MainActivity.this,
                    "Black at "+str1+"-"+str,
                    Toast.LENGTH_SHORT)
                    .show();
        }
        settingCount();
        if(turn == 1)
            turn = 2;
        else
            turn = 1;
        showValidPoints();
    }

    public void removePreviousValidPoints(){
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                if(validPoints[i][j]){
                    int pos = 8*i+j;
                    imageButtonArray[pos].setImageResource(holoBlueBright);
                }
            }
        }
    }

    public void changeColourOfButtonsOnBeingClicked(int row, int col, int num){
        int endNum = 0;
        if(num == 1)
            endNum = 2;
        else if(num == 2)
            endNum = 1;
        //check for num in left
        if (checkIfValidIndex(row, col - 1) && boardState[row][col-1] == num) {
            boolean haveToChange = false;
            for(int j = col-1; j >= 0; j--){
                if(boardState[row][j] == endNum)
                    haveToChange = true;
                else if(boardState[row][j] == 0)
                    break;
            }

            if(haveToChange){
                int j = col-1, i = row;
                while(checkIfValidIndex(i, j) && boardState[i][j] == num){
                    int pos = 8*i+j;
                    if(turn == 2) {
                        imageButtonArray[pos].setImageResource(black);
                        boardState[i][j] = 2;
                    }
                    else{
                        imageButtonArray[pos].setImageResource(white);
                        boardState[i][j] = 1;
                    }
                    j--;
                }
            }
        }
        //check for num in right
        if (checkIfValidIndex(row, col + 1) && boardState[row][col+1] == num) {
            boolean haveToChange = false;
            for(int j = col+1; j < 8; j++){
                if(boardState[row][j] == endNum)
                    haveToChange = true;
                else if(boardState[row][j] == 0)
                    break;
            }

            if(haveToChange){
                int j = col+1, i = row;
                while(checkIfValidIndex(i, j) && boardState[i][j] == num){
                    int pos = 8*i+j;
                    if(turn == 2) {
                        imageButtonArray[pos].setImageResource(black);
                        boardState[i][j] = 2;
                    }
                    else{
                        imageButtonArray[pos].setImageResource(white);
                        boardState[i][j] = 1;
                    }
                    j++;
                }
            }
        }
        //check for num in top
        if (checkIfValidIndex(row - 1, col) && boardState[row-1][col] == num) {
            boolean haveToChange = false;
            for(int i = row-1; i >= 0; i--){
                if(boardState[i][col] == endNum)
                    haveToChange = true;
                else if(boardState[i][col] == 0)
                    break;
            }

            if(haveToChange){
                int j = col, i = row-1;
                while(checkIfValidIndex(i, j) && boardState[i][j] == num){
                    int pos = 8*i+j;
                    if(turn == 2) {
                        imageButtonArray[pos].setImageResource(black);
                        boardState[i][j] = 2;
                    }
                    else{
                        imageButtonArray[pos].setImageResource(white);
                        boardState[i][j] = 1;
                    }
                    i--;
                }
            }
        }
        //check for num in bottom
        if (checkIfValidIndex(row + 1, col) && boardState[row+1][col] == num) {
            boolean haveToChange = false;
            for(int i = row+1; i < 8; i++){
                if(boardState[i][col] == endNum)
                    haveToChange = true;
                else if(boardState[i][col] == 0)
                    break;
            }

            if(haveToChange){
                int j = col, i = row+1;
                while(checkIfValidIndex(i, j) && boardState[i][j] == num){
                    int pos = 8*i+j;
                    if(turn == 2) {
                        imageButtonArray[pos].setImageResource(black);
                        boardState[i][j] = 2;
                    }
                    else{
                        imageButtonArray[pos].setImageResource(white);
                        boardState[i][j] = 1;
                    }
                    i++;
                }
            }
        }
        //check for num in left top
        if (checkIfValidIndex(row - 1, col - 1) && boardState[row-1][col-1] == num) {
            boolean haveToChange = false;
            for(int i = row-1, j = col-1; checkIfValidIndex(i, j); i--, j--){
                if(boardState[i][j] == endNum)
                    haveToChange = true;
                else if(boardState[i][j] == 0)
                    break;
            }

            if(haveToChange){
                int j = col-1, i = row-1;
                while(checkIfValidIndex(i, j) && boardState[i][j] == num){
                    int pos = 8*i+j;
                    if(turn == 2) {
                        imageButtonArray[pos].setImageResource(black);
                        boardState[i][j] = 2;
                    }
                    else{
                        imageButtonArray[pos].setImageResource(white);
                        boardState[i][j] = 1;
                    }
                    i--; j--;
                }
            }
        }
        //check for num in right top
        if (checkIfValidIndex(row - 1, col + 1) && boardState[row-1][col+1] == num) {
            boolean haveToChange = false;
            for(int i = row-1, j = col+1; checkIfValidIndex(i, j); i--, j++){
                if(boardState[i][j] == endNum)
                    haveToChange = true;
                else if(boardState[i][j] == 0)
                    break;
            }

            if(haveToChange){
                int j = col+1, i = row-1;
                while(checkIfValidIndex(i, j ) && boardState[i][j] == num){
                    int pos = 8*i+j;
                    if(turn == 2) {
                        imageButtonArray[pos].setImageResource(black);
                        boardState[i][j] = 2;
                    }
                    else{
                        imageButtonArray[pos].setImageResource(white);
                        boardState[i][j] = 1;
                    }
                    i--; j++;
                }
            }
        }
        //check for num in left bottom
        if (checkIfValidIndex(row + 1, col - 1) && boardState[row+1][col-1] == num) {
            boolean haveToChange = false;
            for(int i = row+1, j = col-1; checkIfValidIndex(i, j); i++, j--){
                if(boardState[i][j] == endNum)
                    haveToChange = true;
                else if(boardState[i][j] == 0)
                    break;
            }

            if(haveToChange){
                int j = col-1, i = row+1;
                while(checkIfValidIndex(i, j) && boardState[i][j] == num){
                    int pos = 8*i+j;
                    if(turn == 2) {
                        imageButtonArray[pos].setImageResource(black);
                        boardState[i][j] = 2;
                    }
                    else{
                        imageButtonArray[pos].setImageResource(white);
                        boardState[i][j] = 1;
                    }
                    i++; j--;
                }
            }
        }
        //check for num in right bottom
        if (checkIfValidIndex(row + 1, col + 1) && boardState[row+1][col+1] == num) {
            boolean haveToChange = false;
            for(int i = row+1, j = col+1; checkIfValidIndex(i, j); i++, j++){
                if(boardState[i][j] == endNum)
                    haveToChange = true;
                else if(boardState[i][j] == 0)
                    break;
            }

            if(haveToChange){
                int j = col+1, i = row+1;
                while(checkIfValidIndex(i, j) && boardState[i][j] == num){
                    int pos = 8*i+j;
                    if(turn == 2) {
                        imageButtonArray[pos].setImageResource(black);
                        boardState[i][j] = 2;
                    }
                    else{
                        imageButtonArray[pos].setImageResource(white);
                        boardState[i][j] = 1;
                    }
                    i++; j++;
                }
            }
        }
    }

    public void resetState(){
        //reseting board state
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                boardState[i][j] = 0;
            }
        }

        //reseting UI display state
        startState();
        showValidPoints();
    }

    public void showValidPoints(){

        validPoints = new boolean[8][8];

        int numberOfValidPoints = 0;
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                if(turn == 1){
                    if(checkValidPointsHelper(i, j, 2)) {
                        validPoints[i][j] = true;
                        numberOfValidPoints++;
                    }
                }
                else if(turn == 2){
                    if(checkValidPointsHelper(i, j, 1)) {
                        validPoints[i][j] = true;
                        numberOfValidPoints++;
                    }
                }
            }
        }
        if(numberOfValidPoints != 0) {
            updateDisplay();
            numberOfTimesBothWereUnableToChoose = 0;
        }
        else{
            numberOfTimesBothWereUnableToChoose++;
            if(numberOfTimesBothWereUnableToChoose == 2) {
                disableKeysAndDeclareWinner();
                return;
            }
            if(turn == 1) {
                turn = 2;
                Toast.makeText(MainActivity.this,
                        "No valid position for White, Pass to Black",
                        Toast.LENGTH_SHORT)
                        .show();
            }
            else {
                turn = 1;
                Toast.makeText(MainActivity.this,
                        "No valid position for Black, Pass to White",
                        Toast.LENGTH_SHORT)
                        .show();
            }
            showValidPoints();
        }
    }

    public boolean checkValidPointsHelper(int row, int col, int num){
        int endNum = 0;
        if(num == 1)
            endNum = 2;
        else if(num == 2)
            endNum = 1;
        if(boardState[row][col] == 0) {
            //check for num in left
            if (checkIfValidIndex(row, col - 1) && boardState[row][col-1] == num) {

                for(int j = col-1; j >= 0; j--){
                    if(boardState[row][j] == endNum)
                        return true;
                    else if(boardState[row][j] == 0)
                        break;
                }

            }
            //check for num in right
            if (checkIfValidIndex(row, col + 1) && boardState[row][col+1] == num) {

                for(int j = col+1; j < 8; j++){
                    if(boardState[row][j] == endNum)
                        return true;
                    else if(boardState[row][j] == 0)
                        break;
                }

            }
            //check for num in top
            if (checkIfValidIndex(row - 1, col) && boardState[row-1][col] == num) {

                for(int i = row-1; i >= 0; i--){
                    if(boardState[i][col] == endNum)
                        return true;
                    else if(boardState[i][col] == 0)
                        break;
                }

            }
            //check for num in bottom
            if (checkIfValidIndex(row + 1, col) && boardState[row+1][col] == num) {

                for(int i = row+1; i < 8; i++){
                    if(boardState[i][col] == endNum)
                        return true;
                    else if(boardState[i][col] == 0)
                        break;
                }

            }
            //check for num in left top
            if (checkIfValidIndex(row - 1, col - 1) && boardState[row-1][col-1] == num) {

                for(int i = row-1, j = col-1; checkIfValidIndex(i, j); i--, j--){
                    if(boardState[i][j] == endNum)
                        return true;
                    else if(boardState[i][j] == 0)
                        break;
                }

            }
            //check for num in right top
            if (checkIfValidIndex(row - 1, col + 1) && boardState[row-1][col+1] == num) {

                for(int i = row-1, j = col+1; checkIfValidIndex(i, j); i--, j++){
                    if(boardState[i][j] == endNum)
                        return true;
                    else if(boardState[i][j] == 0)
                        break;
                }

            }
            //check for num in left bottom
            if (checkIfValidIndex(row + 1, col - 1) && boardState[row+1][col-1] == num) {

                for(int i = row+1, j = col-1; checkIfValidIndex(i, j); i++, j--){
                    if(boardState[i][j] == endNum)
                        return true;
                    else if(boardState[i][j] == 0)
                        break;
                }

            }
            //check for num in right bottom
            if (checkIfValidIndex(row + 1, col + 1) && boardState[row+1][col+1] == num) {

                for(int i = row+1, j = col+1; checkIfValidIndex(i, j); i++, j++){
                    if(boardState[i][j] == endNum)
                        return true;
                    else if(boardState[i][j] == 0)
                        break;
                }

            }
        }
        return false;
    }

    public boolean checkIfValidIndex(int row, int col){
        if(row < 0 || row >= 8)
            return false;
        else if(col < 0 || col >= 8)
            return false;
        else
            return true;
    }

    public void updateDisplay(){
        if(turn == 1){
            for(int i = 0; i < 8; i++){
                for(int j = 0; j < 8; j++){
                    if(validPoints[i][j]){
                        int pos = 8*i+j;
                        imageButtonArray[pos].setImageResource(whiteLight);
                    }
                }
            }
        }
        else if(turn == 2){
            for(int i = 0; i < 8; i++){
                for(int j = 0; j < 8; j++){
                    if(validPoints[i][j]){
                        int pos = 8*i+j;
                        imageButtonArray[pos].setImageResource(blackLight);
                    }
                }
            }
        }
    }

    public void disableKeysAndDeclareWinner(){
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                boardState[i][j] = 3;
            }
        }
        int countNumberOfBlack = Integer.valueOf(black_count.getText().toString());
        int countNumberOfWhite = Integer.valueOf(white_count.getText().toString());
        Toast.makeText(
                MainActivity.this,
                countNumberOfBlack>countNumberOfWhite?"Black Wins, Press Reset to play again" : "White Wins, Press Reset to play again",
                Toast.LENGTH_SHORT)
                .show();
    }

}
