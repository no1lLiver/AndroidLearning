package dkgroup.kz.androidlearning.level1;

import dkgroup.kz.androidlearning.level1.home_animals.Cat;

public class Zoo  {
    //TODO 4 подсказка, сделать так чтобы cat.takeToZoo нельзя было вызвать
    public Zoo() {
        Tiger tiger = new Tiger();
        tiger.takeToZoo();
        Cat cat = new Cat();
        cat.takeToZoo();
    }
}
