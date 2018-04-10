package dkgroup.kz.androidlearning.level1.home_animals;

import android.util.Log;

import dkgroup.kz.androidlearning.level1.Animal;

public class Cat extends Animal {

    public Cat(){
        //TODO 1 Подсказка
        makeSound();
    }

    //TODO 3 какой модификатор нужно сделать чтобы изменять данное поле можно было только при помощи setter
    public int pawCount;


    //TODO 2 какой модификатор доступа нужно поставить чтобы из класса MainActivity можно было получить доступ к методу stayStraightToDoor
    void stayStraightToDoor() {
        Log.e("Cat", "stayStraightToDoor");
    }

    public void setPawCount(int count) {
        Log.e("Cat", "set paw count");
        if (count > 4) {
            pawCount = 4;
        } else if (count < 0) {
            pawCount = 0;
        } else {
            pawCount = count;
        }
    }

    public int getPawCount() {
        return pawCount;
    }
}
