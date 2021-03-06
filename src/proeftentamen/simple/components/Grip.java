package proeftentamen.simple.components;

import proeftentamen.simple.WeaponComponent;

// WeaponComponentDecorator
public class Grip extends WeaponComponentDecorator {

    private static Double ACCURACY_UPGRADE = 0.1;

    public Grip(WeaponComponent weaponComponent) {
        super(weaponComponent);
    }

    @Override
    public void shoot() {
        weaponComponent.addToAccuracy(ACCURACY_UPGRADE);
        weaponComponent.shoot();
    }
}
