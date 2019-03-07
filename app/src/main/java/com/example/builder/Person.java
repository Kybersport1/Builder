package com.example.builder;

public class Person {
    private String name;
    private int yob;//year of birth
    private int colorOfHair;
    private int growth;
    private int weight;
    private boolean children;

    private Person(){

    }

    public String getName() {
        return name;
    }

    public int getYob() {
        return yob;
    }

    public int getColorOfHair() {
        return colorOfHair;
    }

    public int getGrowth() {
        return growth;
    }

    public int getWeight() {
        return weight;
    }

    public boolean isChildren() {
        return children;
    }


    public static Builder newBuilder() {
        return new Person().new Builder();
    }

    public class Builder{
        private Builder(){

        }
        public Builder setName(String name) {
            Person.this.name = name;

            return this;
        }

        public Builder setYob(int yob) {
            Person.this.yob = yob;

            return this;
        }

        public Builder setColorOfHair(int colorOfHair) {
            Person.this.colorOfHair = colorOfHair;

            return this;
        }

        public Builder setGrowth(int growth) {
            Person.this.growth = growth;

            return this;
        }

        public Builder setWeight(int weight) {
            Person.this.weight = weight;

            return this;
        }

        public Builder setChildren(boolean children) {
            Person.this.children = children;

            return this;
        }

        public Person build() {
            return Person.this;
        }

    }
}
