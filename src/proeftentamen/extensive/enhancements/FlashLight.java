package proeftentamen.extensive.enhancements;

public class FlashLight implements Enhancement {

    private boolean activated = false;

    @Override
    public void activate() {
        if (activated) {
            System.out.println("\nFlashlight off");
            activated = false;
        } else {
            System.out.println("\nFlashlight on");
            activated = true;
        }
    }
}
