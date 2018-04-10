package dkgroup.kz.androidlearning;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import dkgroup.kz.androidlearning.level1.home_animals.Cat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //TODO 2 подсказка
        Cat cat = new Cat();
        cat.stayStraightToDoor();
        //TODO 3 подсказка надо сделать так, чтобы при вызове .pawCount = 5 выходила ошибка
        Cat newCat = new Cat();
        newCat.setPawCount(5);
        newCat.pawCount = 5;
        Log.e("activity ", "count = " + newCat.getPawCount());
    }
}
