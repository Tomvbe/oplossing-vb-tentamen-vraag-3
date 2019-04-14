package proeftentamen.simple.components;

import proeftentamen.simple.WeaponComponent;

public abstract class WeaponComponentDecorator implements WeaponComponent {
    WeaponComponent weaponComponent;

    public WeaponComponentDecorator(WeaponComponent weaponComponent) {
        this.weaponComponent = weaponComponent;
    }

    public void addToAccuracy(Double accuracy) {
        weaponComponent.addToAccuracy(accuracy);
    }

    public void addToDamage(Integer damage) {
        weaponComponent.addToDamage(damage);
    }

}
