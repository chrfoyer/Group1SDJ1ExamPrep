public abstract class  OnlineLesson extends Lesson{

    private boolean camera;


    public OnlineLesson(String topic, Date date, Time start, Time end, Resource[] res, boolean camera){
        super(topic, date, start, end, res);
        this.camera = camera;
    }

    public boolean isCameraRequired(){
        return camera;
    }

    public abstract String nameOfSoftware();

    //comparing object of OnlineLesson using superClass
    //not sure if it's correct
    public boolean equals(Object obj){
        if(!(obj instanceof OnlineLesson)){
            return false;
        }

        OnlineLesson other = (OnlineLesson) obj;
        return super.equals(other) && other.isCameraRequired() == isCameraRequired();
    }

    public String toString(){
        return super.toString() + "\n" + isCameraRequired();
    }

}
