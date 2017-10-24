public class Guest {
    private String name;
    private String address;
    private Video video;

    public Guest (String name, String address){
        this.name = name;
        this.address = address;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAddress(){
        this.address = address;
    }

    public String getAddress(){
        return address;
    }

    public void borrow (Video video){
        this.video = video;
    }

   public String returnVideo(){
        if (video != null){
            return name + " is currently borrowing the " + video.getTitle() + ".";
        }else{
            return name + " is not borrowing anything currently.";
        }
    }
}
