public class FirePokemon extends Pokemon {

    String special;


    public FirePokemon(String name, int weight, int hp, String food,String sound,String special) {
        super(name, weight, hp, food,sound);
        this.special=special;
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
        return this.name + " has a weight of " + this.weight + " ,  hp " + this.hp + " , " + this.special ;
    }

    public void setSpecial(String special) {
        this.special = special;
    }

    public String getSpecial() {
        return special;
    }

}
