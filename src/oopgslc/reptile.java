package oopgslc;

public class reptile implements animal {
    public void crawl() {
        System.out.println("Crawling...");
    }

    public void layEggs() {
        System.out.println("Laying eggs...");
    }

    public void regulateBodyTemperature() {
        System.out.println("Regulating body temperature...");
    }

    @Override
    public void eat() {
        System.out.println("Eating like a reptile...");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeping like a reptile...");
    }

    @Override
    public void reptileSound() {
        System.out.println("Making reptile sounds...");
    }

	@Override
	public void chirping() {
		// TODO Auto-generated method stub
	}
}

