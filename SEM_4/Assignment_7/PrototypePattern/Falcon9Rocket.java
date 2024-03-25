package SEM_4.Assignment_7.PrototypePattern;

class Falcon9Rocket implements Rocket {
    public Rocket clone() {
        return new Falcon9Rocket();
    }

    public void ignite() {
        System.out.println("Falcon 9 Rocket ignited!");
    }
}

