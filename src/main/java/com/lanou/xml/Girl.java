package com.lanou.xml;

public class Girl {
 private Dog dog;
 private Boy boyFrirnd;

    public Girl() {
    }

    public Girl(Dog dog, Boy boyFrirnd) {
        this.dog = dog;
        this.boyFrirnd = boyFrirnd;
    }

    public Dog getDog() {
        return dog;
    }


    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public Boy getBoyFrirnd() {
        return boyFrirnd;
    }

    public void setBoyFrirnd(Boy boyFrirnd) {
        this.boyFrirnd = boyFrirnd;
    }

    @Override
    public String toString() {
        return "Girl{" +
                "dog=" + dog +
                ", boyFrirnd=" + boyFrirnd +
                '}';
    }
}
