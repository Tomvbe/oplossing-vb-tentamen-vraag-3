package proeftentamen.simple.components;

import proeftentamen.simple.WeaponComponent;

public class Scope extends WeaponComponentDecorator {

    private static Double ACCURACY_UPGRADE = 0.5;

    public Scope(WeaponComponent weaponComponent) {
        super(weaponComponent);
    }

    @Override
    public void shoot() {
        weaponComponent.addToAccuracy(ACCURACY_UPGRADE);
        weaponComponent.shoot();
    }
}
