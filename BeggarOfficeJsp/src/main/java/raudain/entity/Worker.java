package raudain.entity;

import java.io.Serializable;

public class Worker implements Serializable {
    static final long serialVersionUID = 12346L;
    
    private short room;
    private String name;
    private String profession;
    private String endurance;
    private byte level;
    private long cost;


    /**
     * @return the room
     */
    public short getRoom() {

        return room;
    }


	/**
     * @param room the room to set
     */
    public void setRoom(final short room) {

        this.room = room;
    }

    /**
     * @return the name
     */
    public String getName() {

        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(final String name) {

        this.name = name;
    }

    /**
     * @return the profession
     */
    public String getProfession() {

        return profession;
    }

    /**
     * @param profession the profession to set
     */
    public void setProfession(final String profession) {

        this.profession = profession;
    }

    /**
     * @return the endurance
     */
    public String getEndurance() {

        return endurance;
    }

    /**
     * @param endurance the endurance to set
     */
    public void setEndurance(final String endurance) {

        this.endurance = endurance;
    }

    /**
     * @return the level
     */
    public byte getLevel() {

        return level;
    }

    /**
     * @param level the level to set
     */
    public void setLevel(final byte level) {

        this.level = level;
    }

    /**
     * @return the cost
     */
    public long getCost() {

        return cost;
    }

    /**
     * @param cost the cost to set
     */
    public void setCost(final long cost) {

        this.cost = cost;
    }
    
    @Override
	public String toString() {
		return "Worker [room=" + room + ", name=" + name + ", profession=" + profession + ", endurance=" + endurance
				+ ", level=" + level + ", cost=" + cost + "]";
	}

}
