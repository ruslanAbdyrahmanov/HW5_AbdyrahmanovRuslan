public class Main {
    public static void main(String[] args) {

        Boss boss = new Boss();
        boss.setHealth(500);
        boss.setDamage(40);
        boss.setDefens("Physical");
        System.out.println("boss health: "+boss.getHealth()+"\nDamage: "+boss.getDamage()+"\nDefens: "+boss.getDefens()) ;
    }
}