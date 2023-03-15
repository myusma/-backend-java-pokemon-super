public abstract class Pokemon {
    String name;
    int weight;
    int hp;
    String food;
    String sound;



    public Pokemon(String name, int weight, int hp, String food, String sound) {
        this.name = name;
        this.weight = weight;
        this.hp = hp;
        this.food = food;
        this.sound = sound;
    }

    public abstract void eats (String food);


    public abstract void speaks(String sound);




    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public int getHp() {
        return hp;
    }

    public String getFood() {
        return food;
    }
    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }


}
