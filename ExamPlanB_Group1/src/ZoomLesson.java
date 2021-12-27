public class ZoomLesson extends OnlineLesson{
    public String link;
    public boolean breakoutRooms;

    public ZoomLesson(String topic, Date date, Time start, Time end, Resource[] res, boolean camera, String link, boolean breakoutRooms){
        super(topic, date, start, end, res, camera);
        this.breakoutRooms = breakoutRooms;
        this.link = link;
    }

    public String getLink(){
        return link;
    }

    public boolean usesBreakoutRooms(){
        return breakoutRooms;
    }

    public String nameOfSoftware(){
        return "Zoom";
    }

    public boolean equals(Object obj){
        if(!(obj instanceof ZoomLesson)){
            return false;
        }

        ZoomLesson other = (ZoomLesson) obj;
        return super.equals(other) && getLink().equals(other.getLink()) && usesBreakoutRooms() == other.usesBreakoutRooms();
    }

    public String toString(){
        return super.toString() + "\n" + nameOfSoftware() + ", " + link + "\nUses breakout rooms: " + breakoutRooms;
    }
}
