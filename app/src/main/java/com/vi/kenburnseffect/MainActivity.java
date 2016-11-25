package com.vi.kenburnseffect;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Interpolator;

import com.flaviofaria.kenburnsview.KenBurnsView;
import com.flaviofaria.kenburnsview.RandomTransitionGenerator;
import com.flaviofaria.kenburnsview.Transition;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //init();
    }

    private void init(){
        KenBurnsView kenBurnsView = (KenBurnsView)findViewById(R.id.iv_ken_burns);
        kenBurnsView.setTransitionListener(new KenBurnsView.TransitionListener() {
            @Override
            public void onTransitionStart(Transition transition) {

            }

            @Override
            public void onTransitionEnd(Transition transition) {

            }
        });

        long duration = 3000;
        Interpolator interpolator = new Interpolator() {
            @Override
            public float getInterpolation(float v) {
                return 0;
            }
        };
        RandomTransitionGenerator generator = new RandomTransitionGenerator(duration,interpolator);
        kenBurnsView.setTransitionGenerator(generator);
    }
}
