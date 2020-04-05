package ru.geekbrains.hw7;

public class Cat{
    private String Name;
    private int sitost;
     boolean golod;

    public Cat(String name, int sitost) {
        Name = name;
        this.sitost = sitost;
        this.golod = true;
    }

    public void eat(Pleet pleet){
        if(golod && pleet.maloedi(sitost)) {
            golod = false;
        }
    }

    public void inf(){
        String goloden = !golod ? "Сыт" : "Голоден";
        System.out.println("Кот:" + goloden);
    }


}




