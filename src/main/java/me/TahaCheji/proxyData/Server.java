package me.TahaCheji.proxyData;

public enum Server {

    MAIN_HUB("HUB", "Lobby"),
    SKY_WARS_HUB("SW_HUB", "Skywars"),
    BRIDGE_WIZZERDS_HUB("BW_HUB", "Bridge Wizards"),
    MAGIC_TAG_HUB("MT_HUB", "Magic Tag");


    private final String text;
    private final String name;

    Server(String text, String name) {
        this.text = text;
        this.name = name;
    }

    public String getText() {
        return text;
    }
    public String getName() { return name; }

}
