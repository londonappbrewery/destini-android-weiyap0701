package com.londonappbrewery.destini;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    private QuestionAnswer[] myQuestions = new QuestionAnswer[] {
            new QuestionAnswer(R.string.T1_Story,R.string.T1_Ans1,R.string.T1_Ans2),
            new QuestionAnswer(R.string.T2_Story,R.string.T2_Ans1,R.string.T2_Ans2),
            new QuestionAnswer(R.string.T3_Story,R.string.T3_Ans1,R.string.T3_Ans2),
            new QuestionAnswer(R.string.T4_End,R.string.T4_EndAns1,R.string.T4_EndAns2),
            new QuestionAnswer(R.string.T5_End,R.string.T5_EndAns1,R.string.T5_EndAns2),
            new QuestionAnswer(R.string.T6_End,R.string.T6_EndAns1,R.string.T6_EndAns2)
    };

    Button ansButtonOne;
    Button ansButtonTwo;
    TextView storyTextView;
    int currentQuestion = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        ansButtonOne = (Button) findViewById(R.id.buttonTop);
        ansButtonTwo = (Button) findViewById(R.id.buttonBottom);
        storyTextView = (TextView) findViewById(R.id.storyTextView);

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        ansButtonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonOnePressed();
            }
        });

        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        ansButtonTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonTwoPressed();
            }
        });

    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        setQuestionAndButtons(0);

    }

    public void buttonOnePressed() {
        Log.d("button1","pressed");
        checkButtonOneAnswer();

    }

    public void buttonTwoPressed() {
        Log.d("button2","pressed");
        checkButtonTwoAnswer();
    }

    public void checkButtonOneAnswer() {
        switch (currentQuestion) {
            case 0:
                setQuestionAndButtons(2);
                currentQuestion = 2;
                break;
            case 1:
                setQuestionAndButtons(2);
                currentQuestion = 2;
                break;
            case 2:
                setQuestionAndButtons(5);
                currentQuestion = 5;
                break;
            default:
                Log.d("Default","Return no shit");
                break;
        }
    }

    public void checkButtonTwoAnswer() {
        switch (currentQuestion) {
            case 0:
                setQuestionAndButtons(1);
                currentQuestion = 1;
                break;
            case 1:
                setQuestionAndButtons(3);
                currentQuestion = 3;
                break;
            case 2:
                setQuestionAndButtons(4);
                currentQuestion = 4;
                break;
            default:
                Log.d("Default","Return no shit");
                break;
        }
    }

    public void setQuestionAndButtons(int questionNo) {

        int story = myQuestions[questionNo].getQuestionId();
        storyTextView.setText(story);

        int answerOne = myQuestions[questionNo].getAnswer1();
        ansButtonOne.setText(answerOne);

        int answerTwo = myQuestions[questionNo].getAnswer2();
        ansButtonTwo.setText(answerTwo);

        if(questionNo == 3 || questionNo == 4 || questionNo == 5) {
            ansButtonOne.setVisibility(View.GONE);
            ansButtonTwo.setVisibility(View.GONE);
        }
        else {
            ansButtonOne.setVisibility(View.VISIBLE);
            ansButtonTwo.setVisibility(View.VISIBLE);
        }

    }

}






































