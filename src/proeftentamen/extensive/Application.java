package proeftentamen.extensive;

import proeftentamen.extensive.components.Grip;
import proeftentamen.extensive.components.Scope;
import proeftentamen.extensive.enhancements.FlashLight;
import proeftentamen.extensive.enhancements.GrenadeLauncher;

public class Application {
    public static void main(String[] args) {
        (new Application()).launch();
    }

    private void launch() {
        WeaponComponent sniper = new Gun(0.9, 50, 0);
        WeaponComponent pistol = new Gun(0.5, 25, 2);

        sniper.shoot();
        pistol.shoot();

        pistol = new Grip(pistol);
        sniper = new Grip(sniper);
        sniper = new Scope(sniper);

        sniper.shoot();
        pistol.shoot();

        pistol.addEnhancement(1, new FlashLight());
        pistol.triggerEnhancement(1);
        pistol.triggerEnhancement(1);
        pistol.triggerEnhancement(1);
        pistol.addEnhancement(2, new GrenadeLauncher(1));
        pistol.triggerEnhancement(2);
        pistol.triggerEnhancement(2);
        pistol.triggerEnhancement(2);

        // Won't do anything as sniper cannot have enhancements..
        sniper.addEnhancement(1, new FlashLight());
        sniper.triggerEnhancement(1);
    }
}
