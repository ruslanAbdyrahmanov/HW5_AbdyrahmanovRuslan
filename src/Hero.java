public class Hero {
    private int damage;

    private int health;
    private String superpower;

    public Hero(int damage, int health, String superpower) {
        this.damage = damage;
        this.health = health;
        this.superpower = superpower;
    }

    public Hero(int damage, int health) {
        this.damage = damage;
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public int getHealth() {
        return health;
    }

    public String getSuperpower() {
        return superpower;
    }
}
