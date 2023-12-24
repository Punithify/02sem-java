class Discord {
    Discord() {
        System.out.println("Discord class");
    }

    public void getDiscord() {
        System.out.println("Found a Bot");

    }
}

class Credential extends Discord {

    Credential() {
        super();
    }

    public void callDiscord() {
        super.getDiscord();

    }
}

class SuperClass {
    public static void main(String[] args) {
        Credential cred = new Credential();
        cred.callDiscord();
    }
}