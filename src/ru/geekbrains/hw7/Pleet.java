package ru.geekbrains.hw7;



public class Pleet {
    private int food;

    public Pleet(int food) {
        this.food = food;
    }

     public boolean maloedi(int n){
        int razn = food - n;
        if(razn < 0) return false;
        food -= n;
        return true;
    }
    void addFood(int food){
        this.food += food;
    }

    void info(){
        System.out.println("Тарелка :" + food);
    }
}
