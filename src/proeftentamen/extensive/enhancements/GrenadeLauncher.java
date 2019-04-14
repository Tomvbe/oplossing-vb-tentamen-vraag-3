package proeftentamen.extensive.enhancements;

public class GrenadeLauncher implements Enhancement {

    Integer ammo;

    public GrenadeLauncher(Integer ammo) {
        this.ammo = ammo;
    }

    @Override
    public void activate() {
        if (ammo > 0) {
            System.out.println("Grenade launched!");
            ammo--;
        } else {
            System.out.println("Out of grenades!");
        }
    }
}
