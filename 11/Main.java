//interface

interface Discord {

    void discordBot();
}

class Guild implements Discord {
    public void discordBot() {
        System.out.println("Disord bot details");
    }
}

class Main {
    public static void main(String[] args) {
        Guild gl = new Guild();
        gl.discordBot();
    }
}
