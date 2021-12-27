public class DiscordLesson extends OnlineLesson {
    private String channelName;

    public DiscordLesson(String topic, Date date, Time start, Time end, Resource[] res, boolean camera, String channel){
        super(topic, date, start, end, res, camera);
        this.channelName = channel;
    }

    public String getChannelName(){
        return channelName;
    }

    public String nameOfSoftware(){
        return "Discord";
    }

    public boolean equals(Object obj){
        if(!(obj instanceof DiscordLesson)){
            return false;
        }

        DiscordLesson other = (DiscordLesson) obj;
        return super.equals(other) && channelName.equals(other.channelName);
    }

    public String toString(){
        return super.toString() + "\n" + nameOfSoftware() + ", Channel: " + getChannelName();
    }

}
