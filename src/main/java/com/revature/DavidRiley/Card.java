package com.revature.DavidRiley;

public class Card {
    private int cardId;
    private String cost;
    private String typeId;
    private String name;
    private String artist;
    private String colorIdentity;
    private long multiverse;
    private String rarity;
    private String scryfallId;

    public Card(int cardId, String cost, String typeId, String name, String artist, String colorIdentity, long multiverse,
                String rarity, String scryfallId) {
        this.cardId = cardId;
        this.cost = cost;
        this.typeId = typeId;
        this.name = name;
        this.artist = artist;
        this.colorIdentity = colorIdentity;
        this.multiverse = multiverse;
        this.rarity = rarity;
        this.scryfallId = scryfallId;
    }

    public Card() {

    }

    @Override
    public String toString() {
        return "Card{" +
                "CardID='" + cardId + '\'' +
                ", cost='" + cost + '\'' +
                ", typeId='" + typeId + '\'' +
                ", name='" + name + '\'' +
                ", artist='" + artist + '\'' +
                ", colorIdentity='" + colorIdentity + '\'' +
                ", multiverse='" + multiverse + '\'' +
                ", rarity='" + rarity + '\'' +
                ", scryfallId='" + scryfallId + '\'' +
                "}";
    }

    public int getCardId() { return cardId; }
    public void setCardId(int cardId) { this.cardId = cardId; }
    public String getCost() { return cost; }
    public void setCost(String cost) { this.cost = cost; }
    public String getTypeId() { return typeId; }
    public void setTypeId(String typeId) { this.typeId = typeId; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getArtist() { return artist; }
    public void setArtist(String artist) { this.artist = artist; }
    public String getColorIdentity() { return colorIdentity; }
    public void setColorIdentity(String colorIdentity) { this.colorIdentity = colorIdentity; }
    public long getMultiverse() { return multiverse; }
    public void setMultiverse(long multiverse) { this.multiverse = multiverse; }
    public String getRarity() { return rarity; }
    public void setRarity(String rarity) { this.rarity = rarity; }
    public String getScryfallId() { return scryfallId; }
    public void setScryfallId(String scryfallId) { this.scryfallId = scryfallId; }
}
