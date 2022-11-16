package proxy;

public class ProxyFairy implements Subject{
    private RealSubject proxyTarget;

    public ProxyFairy(RealSubject proxyTarget) {
        this.proxyTarget = proxyTarget;
    }

    @Override
    public void getPermission() {
        //Lesser fairy
        if (this.proxyTarget.getId() >= 10 && 25>= this.proxyTarget.getId()) {
            this.proxyTarget.getPermission();
            System.out.println("Flower revive pixie dust.");
            System.out.println("Fairy type: Spring sprite");
        }
        //Greater fairy
        else if(this.proxyTarget.getId() >= 26 && 50 >= this.proxyTarget.getId()) {
            this.proxyTarget.getPermission();
            System.out.println("Deep sleep pixie dust.");
            System.out.println("Fairy type: Peaceful pixie");
        } else {
            System.out.println("Your magic has been used up!");
        }
    }
}
