public class Main {
    public static void main(String[] args) {
        FirePokemon charmender = new FirePokemon("char", 200, 200, "berries", "grrrr", " has nice eyes ");
        FirePokemon machoke = new FirePokemon("machoke", 400, 400, "apple", "grrrr", "is very long");
        GrassPokemon venusaur = new GrassPokemon("ven", 150, 250, "gras", "vrrr", 500);
        GrassPokemon golem = new GrassPokemon("golem",180,280,"pear","grrrr",550);
        ElectricPokemon sandslash = new ElectricPokemon("sandlash", 300, 350, "coins", "sans", 98);
        ElectricPokemon shellder = new ElectricPokemon("shellder",380, 350,"stone","sans",99);
        WaterPokemon weepinbell = new WaterPokemon("weepinbell", 350, 120, "seefood", "sees", 500);
        WaterPokemon kingler = new WaterPokemon("kingler",320,250,"moss","sees",450);


        charmender.eats(charmender.getFood());
        charmender.speaks(charmender.getSound());
        System.out.println(charmender.toString());

        System.out.println();

        machoke.eats(machoke.getFood());
        machoke.speaks(machoke.getSound());
        System.out.println(machoke.toString());

        System.out.println();

        venusaur.eats(venusaur.getFood());
        venusaur.speaks(venusaur.getSound());
        System.out.println(venusaur.toString());

        System.out.println();

        golem.eats(golem.getFood());
        golem.speaks(golem.getSound());
        System.out.println(golem.toString());

        System.out.println();

        sandslash.eats(sandslash.getFood());
        sandslash.speaks(sandslash.getSound());
        System.out.println(sandslash.toString());

        System.out.println();

        shellder.eats(shellder.getFood());
        shellder.speaks(shellder.getSound());
        System.out.println(shellder.toString());

        System.out.println();

        weepinbell.eats(weepinbell.getFood());
        weepinbell.speaks(weepinbell.getSound());
        System.out.println(weepinbell.toString());

        System.out.println();

        kingler.eats(kingler.getFood());
        kingler.speaks(kingler.getSound());
        System.out.println(kingler.toString());
    }
}
