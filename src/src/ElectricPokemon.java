public class ElectricPokemon extends Pokemon {

    int accuracy;

    public ElectricPokemon(String name, int weight, int hp, String food, String sound, int accuracy) {
        super(name, weight, hp, food, sound);
        this.accuracy = accuracy;
    }


    @Override
    public void eats(String food) {
        System.out.println(name + " eats " + food);
    }

    @Override
    public void speaks(String sound) {
        System.out.println(name + " speaks " + sound);
    }
    @Override
    public String toString() {
        return this.name + " has a weight of " + this.weight + " ,  hp " + this.hp + " , accuracy " + this.accuracy ;
    }

    public int getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }
}





