class Builder{
    public String botName;
    protected String discordToken;
    Builder(String botName,String discordToken){
        if(discordToken.isEmpty()){
            System.out.println("Token not found");
        }
        this.botName=botName;
        this.discordToken=discordToken;
    }
    public void showBotDetails(){
        System.out.println("Discord Bot with "+botName+" created in your account");

    }

    public void createGuild(String guildName){
        System.out.println("Created a guild "+guildName+" associated to the bot");
    }

    public void getBotPermission(int permission){
        boolean isAdmin=true;
        boolean isMod=true;
        boolean BAN_MEMBERS=true;
        boolean KICK_MEMBERS=true;
        if(permission==0){
            System.out.println("The Bot created has 0 permission");
        }
        if(isAdmin && isMod && BAN_MEMBERS && KICK_MEMBERS){
            System.out.println("The Bot is set full permission");
        }

    }

     public void showBotDetails(String clientName){
        System.out.println("Discord Bot with "+botName+" created for client"+clientName);
    } 

}

class SlashCommands extends Builder{

    SlashCommands(){
        super("botName","discordToken");
    }

    public void getMembers(){
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
    public void slashCommand(String user){
        // String command='ban';
        System.out.println("Ban User ");
        System.out.println("user "+user+" is banned");

    }

}

class Client extends SlashCommands{
    public String name;
    public String discordServer;
    Client(String name, String discordServer){
        this.name=name;
        this.discordServer=discordServer;
    }
    public void getBotDetails(){
        System.out.println("your account name is "+name);
                System.out.println("your Discord server name is "+discordServer);

    }
}

class Discordbot{
    public static void main(String[] args) {
        Builder build=new Builder("discordbot1", "skffdjdfjfjddd11");
        build.showBotDetails();
        build.createGuild("Mointer");
        build.getBotPermission(0);
        SlashCommands cl=new SlashCommands();
        cl.getMembers();

        //client
        Client client=new Client("ram", "ram's server");
        build.showBotDetails("ram");
        client.getBotDetails();


    }
}