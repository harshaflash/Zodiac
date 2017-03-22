package com.harsha.dell.zodiac;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    String s1 ,s2 ,s3;
    ImageView im;
    TextView t1,t2,t3;
    int a,b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        t1 = (TextView)findViewById(R.id.txt1);
        t2 = (TextView)findViewById(R.id.txt2);
        t3 = (TextView)findViewById(R.id.txt3);
        im = (ImageView)findViewById(R.id.img);

        s1 = getIntent().getExtras().getString("name");
        s2 = getIntent().getExtras().getString("date");
        s3 = getIntent().getExtras().getString("month");

        a = Integer.parseInt(s2);
        b = Integer.parseInt(s3);
        t1.setText(s1);

        switch(b)
        {
            case 1: {
                if (a <= 19) {
                    t2.setText("CAPRICORN");
                    im.setImageResource(R.drawable.cap);
                    t3.setText("Responsible\nDisciplined\nSelf-control\nGood managers");
                    break;
                } else {
                    t2.setText("Aquarius");
                    im.setImageResource(R.drawable.aq);
                    t3.setText("Progressive\nOriginal\nIndependent");
                    break;
                }
            }
            case 2: {
                if (a <= 18) {
                    t2.setText("Aquarius");
                    im.setImageResource(R.drawable.aq);
                    t3.setText("Progressive\nOriginal\nIndependent");
                    break;
                } else {
                    t2.setText("Pisces");
                    im.setImageResource(R.drawable.pices);
                    t3.setText("Compassionate\nArtistic\nIntuitive\nGentle\nWise\nMusical");
                    break;
                }
            }
            case 3: {
                if (a <= 20) {
                    t2.setText("Pisces");
                    im.setImageResource(R.drawable.pices);
                    t3.setText("Compassionate\nArtistic\nIntuitive\nGentle\nWise\nMusical");
                    break;
                } else {
                    t2.setText("Aries");
                    im.setImageResource(R.drawable.aries);
                    t3.setText("Highly simple\nStraight-forward in their dealings");
                    break;
                }
            }
            case 4: {
                if (a <= 19) {
                    t2.setText("Aries");
                    im.setImageResource(R.drawable.aries);
                    t3.setText("Highly simple \nStraight-forward in their dealings");
                    break;
                } else {
                    t2.setText("Taurus");
                    im.setImageResource(R.drawable.tarus);
                    t3.setText("Patient people \n Keep fighting for what they value and what they believe in");
                    break;
                }
            }
            case 5: {
                if (a <= 20) {
                    t2.setText("Taurus");
                    im.setImageResource(R.drawable.tarus);
                    t3.setText("Patient people \nKeep fighting for what they value and what they believe in");
                    break;
                } else {
                    t2.setText("Gemini");
                    im.setImageResource(R.drawable.gemini);
                    t3.setText("Smart \nAdjustable");
                    break;
                }
            }
            case 6: {
                if(a<=20)
                {
                    t2.setText("Gemini");
                    im.setImageResource(R.drawable.gemini);
                    t3.setText("Smart \nAdjustable");
                    break;
                }
                else
                {
                    t2.setText("Cancer");
                    im.setImageResource(R.drawable.cancer);
                    t3.setText(" Highly imaginative \n Loyal \n Emotional \n Sympathetic");
                    break;
                }
            }
            case 7:{
                if(a<=22)
                {
                    t2.setText("Cancer");
                    im.setImageResource(R.drawable.cancer);
                    t3.setText(" Highly imaginative \n Loyal \n Emotional \n Sympathetic");
                    break;
                }
                else
                {
                    t2.setText("Leo");
                    im.setImageResource(R.drawable.leo);
                    t3.setText(" Creative\n Passionate\n Generous\n Warm-hearted\n Cheerful\n Humorous");
                    break;
                }
            }
            case 8:{
                if(a<=22)
                {
                    t2.setText("Leo");
                    im.setImageResource(R.drawable.leo);
                    t3.setText(" Creative\n Passionate\n Generous\n Warm-hearted\n Cheerful\n Humorous");
                    break;
                }
                else
                {
                    t2.setText("Vigro");
                    im.setImageResource(R.drawable.vigro);
                    t3.setText("Loyal \nAnalytical \nKind \nHardworking \nPractical");
                    break;
                }
            }
            case 9: {
                if (a <= 22) {
                    t2.setText("Vigro");
                    im.setImageResource(R.drawable.vigro);
                    t3.setText("Loyal \nAnalytical \nKind \nHardworking \nPractical");
                    break;
                }
                else
                {
                    t2.setText("Libra");
                    im.setImageResource(R.drawable.libra);
                    t3.setText(" Cooperative\nDiplomatic\nGracious\n Fair-minded \n Social");
                    break;
                }
            }
            case 10:{
                if (a<=22)
                {
                    t2.setText("Libra");
                    im.setImageResource(R.drawable.libra);
                    t3.setText(" Cooperative\nDiplomatic\nGracious\nFair-minded \nSocial");
                    break;
                }
                else
                {
                    t2.setText("Scorpio");
                    im.setImageResource(R.drawable.scor);
                    t3.setText("Resourceful\nBrave\nPassionate\nStubborn\nA true friend");
                    break;
                }
            }
            case 11:{
                if (a<=22)
                {
                    t2.setText("Scorpio");
                    im.setImageResource(R.drawable.scor);
                    t3.setText("Resourceful\nBrave\nPassionate\nStubborn");
                    break;
                }
                else
                {
                    t2.setText("Sagittarius");
                    im.setImageResource(R.drawable.sag);
                    t3.setText("Generous\nIdealistic\nGreat sense of humor");
                    break;
                }
            }
            case 12:{
                if(a<=21)
                {
                    t2.setText("Sagittarius");
                    im.setImageResource(R.drawable.sag);
                    t3.setText("Generous\nIdealistic\nGreat sense of humor");
                    break;
                }
                else
                {
                    t2.setText("CAPRICORN");
                    im.setImageResource(R.drawable.cap);
                    t3.setText("Responsible\nDisciplined\nSelf-control\nGood managers");
                    break;
                }
            }
        }
    }
}
