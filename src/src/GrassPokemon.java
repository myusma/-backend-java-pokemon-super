public class GrassPokemon extends Pokemon{

    int attack;

    public GrassPokemon(String name, int weight, int hp, String food, String sound, int attack) {
        super(name, weight, hp, food, sound);
        this.attack = attack;
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
        return this.name + " has a weight of " + this.weight + " ,  hp " + this.hp + " , attack " + this.attack ;
    }
    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }
}
