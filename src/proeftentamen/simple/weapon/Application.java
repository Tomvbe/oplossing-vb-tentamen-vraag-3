package proeftentamen.simple.weapon;

import proeftentamen.simple.weapon.components.Grip;
import proeftentamen.simple.weapon.components.Scope;

public class Application {
    public static void main(String[] args) {
        (new Application()).launch();
    }

    private void launch() {
        WeaponComponent sniper = new Gun(0.9, 50);
        WeaponComponent pistol = new Gun(0.5, 25);

        pistol = new Grip(pistol);
        sniper = new Grip(sniper);
        sniper = new Scope(sniper);

        sniper.shoot();
        pistol.shoot();

    }
}
