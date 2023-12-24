class Builder implements Runnable {
    public String botName;
    protected String discordToken;

    public void run() {

    }

    public void setDetails(String botName, String discordToken) {
        if (discordToken.isEmpty()) {
            System.out.println("Token not found");
        }
        this.botName = botName;
        this.discordToken = discordToken;
    }

    public synchronized void setInfo() {
        try {
            setDetails("gateways's bot", "kajajas99923232");

        } catch (Exception e) {
            System.out.println("synchronized thread");
        }
    }

    public void showBotDetails() {
        System.out.println("Discord Bot with " + botName + " created in your account");

    }

    public void createGuild(String guildName) {
        System.out.println("Created a guild " + guildName + " associated to the bot");
    }

    public void getBotPermission(int permission) {
        boolean isAdmin = true;
        boolean isMod = true;
        boolean BAN_MEMBERS = true;
        boolean KICK_MEMBERS = true;
        if (permission == 0) {
            System.out.println("The Bot created has 0 permission");
        }
        if (isAdmin && isMod && BAN_MEMBERS && KICK_MEMBERS) {
            System.out.println("The Bot is set full permission");
        }

    }

    public void showBotDetails(String clientName) {
        System.out.println("Discord Bot with " + botName + " created for client" + clientName);
    }

}

class SlashCommands extends Builder {

    public void run() {
        super.createGuild("gateways guild");
    }

    public void getMembers() {
        System.out.println("Getting members of the text channel");
        System.out.println("Channel members are : Elumeveguy\n" + //
                "Emojorekes\n" + //
                "Eroxihisom\n" + //
                "Ulelabutuk\n" + //
                "Ayibiciqeb\n" + //
                "Oguyocuxas\n" + //
                "Uxibabujen\n" + //
                "Epiwimaguk\n" + //
                "Idenefibiy\n" + //
                "Amarebamat");

    }

    public void slashCommand(String user) {
        // String command='ban';
        System.out.println("Ban User ");
        System.out.println("user " + user + " is banned");

    }

}

class Client extends SlashCommands {
    public String name;
    public String discordServer;

    Client(String name, String discordServer) {
        this.name = name;
        this.discordServer = discordServer;
    }

    public void getBotDetails() {
        System.out.println("your account name is " + name);
        System.out.println("your Discord server name is " + discordServer);

    }
}

class Main {

    public static void main(String[] args) {

        Thread thread1 = new Thread(new Builder());
        thread1.setPriority(Thread.MAX_PRIORITY);
        Builder build = new Builder();
        build.setInfo();
        build.showBotDetails();
        build.getBotPermission(1);
        thread1.start();

        Thread thread2 = new Thread(new SlashCommands());
        thread2.start();

        Thread thread3 = new Thread(new Client("bob", "bob's server"));
        Client client = new Client("bob", "bob's server");
        client.getBotDetails();
        thread3.start();

        Thread thread4 = new Thread(new Builder());
        thread4.start();

        Thread thread5 = new Thread(new Builder());
        thread5.start();

    }

}