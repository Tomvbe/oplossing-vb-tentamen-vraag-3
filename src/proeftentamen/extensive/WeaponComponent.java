package proeftentamen.extensive;

import proeftentamen.extensive.enhancements.Enhancement;

public interface WeaponComponent {
    abstract void shoot();

    public void addToAccuracy(Double accuracy);

    public void addToDamage(Integer damage);

    public void triggerEnhancement(Integer key);

    public void addEnhancement(Integer key, Enhancement enhancement);

    public void removeEnhancement(Integer key);
}
