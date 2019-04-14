package proeftentamen.extensive.components;

import proeftentamen.extensive.WeaponComponent;
import proeftentamen.extensive.enhancements.Enhancement;

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

    public void triggerEnhancement(Integer key) {
        weaponComponent.triggerEnhancement(key);
    };

    public void addEnhancement(Integer key, Enhancement enhancement) {
        weaponComponent.addEnhancement(key, enhancement);
    };

    public void removeEnhancement(Integer key) {
        weaponComponent.removeEnhancement(key);
    };

}
