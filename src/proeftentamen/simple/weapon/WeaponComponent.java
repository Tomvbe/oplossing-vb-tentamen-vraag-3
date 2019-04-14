package proeftentamen.simple.weapon;

public interface WeaponComponent {
    abstract void shoot();

    public void addToAccuracy(Double accuracy);

    public void addToDamage(Integer damage);
}
