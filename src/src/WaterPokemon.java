public class WaterPokemon extends Pokemon {
    int defence;


    public WaterPokemon(String name, int weight, int hp, String food, String sound, int defence) {
        super(name, weight, hp, food, sound);
        this.defence = defence;
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
        return this.name + " has a weight of " + this.weight + " ,  hp " + this.hp + " , defence " + this.defence ;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }
}
