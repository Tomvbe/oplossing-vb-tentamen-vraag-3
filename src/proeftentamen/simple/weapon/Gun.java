package proeftentamen.simple.weapon;

public class Gun implements WeaponComponent {
    private Double accuracy;
    private Integer damage;

    public Gun(Double accuracy, Integer damage) {
        this.accuracy = accuracy;
        this.damage = damage;
    }

    public void shoot() {
        System.out.printf("\nShooting did %d damage with an accuracy of %.2f", damage, accuracy);
    }

    public void addToAccuracy(Double accuracy) {
        this.accuracy += accuracy;
    }

    public void addToDamage(Integer damage) {
        this.damage += damage;
    }
}
