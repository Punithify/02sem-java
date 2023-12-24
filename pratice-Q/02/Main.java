// Implement the concept of Static & Final Keyword based on your Domain.

class Builder {
    public String botName;
    protected String discordToken;

    Builder(String botName, String discordToken) {
        if (discordToken.isEmpty()) {
            System.out.println("Token not found");
        }
        this.botName = botName;
        this.discordToken = discordToken;
    }

    public void showBotDetails() {
        System.out.println("Discord Bot with " + botName + " created in your account");

    }

    public void createGuild(String guildName) {
        System.out.println("Created a guild " + guildName + " associated to the bot");
    }

    public final void showBotDetails(String clientName) {
        System.out.println("Discord Bot with " + botName + " created for client" + clientName);
    }

}

class SlashCommands extends Builder {

    SlashCommands() {
        super("botName", "discordToken");
    }

    public static void getMembers() { // static
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
    // cannot override final method
    // public final void showBotDetails() {
    // System.out.println("Discord Bot with " + botName + " created for client" +
    // clientName);
    // }

    public void slashCommand(String user) {
        // String command='ban';
        System.out.println("Ban User ");
        System.out.println("user " + user + " is banned");

    }

}

class Main {
    public static void main(String[] args) {
        Builder build = new Builder("user-list-bot", "skffdjdfjfjddd11");
        build.showBotDetails();
        build.createGuild("Mointer");
        SlashCommands cl = new SlashCommands();
        SlashCommands.getMembers();// static method call
        cl.slashCommand("bob");

    }
}