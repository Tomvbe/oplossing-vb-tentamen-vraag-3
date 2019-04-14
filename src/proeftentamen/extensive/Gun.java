package proeftentamen.extensive;

import proeftentamen.extensive.enhancements.Enhancement;

import java.util.HashMap;
import java.util.Map;

public class Gun implements WeaponComponent {
    private Double accuracy;
    private Integer damage;
    private Integer numOfEnhancements;

    private Map<Integer ,Enhancement> enhancementMap;

    public Gun(Double accuracy, Integer damage, Integer numOfEnhancements) {
        this.accuracy = accuracy;
        this.damage = damage;
        this.numOfEnhancements = numOfEnhancements;
        enhancementMap = new HashMap<>();
    }

    public void shoot() {
        System.out.printf("\nShooting did %d damage with an accuracy of %.2f", damage, accuracy);
    }

    public void triggerEnhancement(Integer key) {
        if (enhancementMap.containsKey(key)) {
            enhancementMap.get(key).activate();
        }
    }

    public void addEnhancement(Integer key, Enhancement enhancement) {
        if (enhancementMap.size() < numOfEnhancements) {
            enhancementMap.put(key, enhancement);
        }
    }

    public void removeEnhancement(Integer key) {
        if (enhancementMap.containsKey(key)) {
            enhancementMap.remove(key);
        }
    }

    public void addToAccuracy(Double accuracy) {
        this.accuracy += accuracy;
    }

    public void addToDamage(Integer damage) {
        this.damage += damage;
    }
}
