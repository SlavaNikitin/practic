package organization;

public class Work {   

    private String title;

    public void setTitle(String title){
        this.title = title;
    }
    
    public String getTitle(){
        return title;
    }

    @Override
    public String toString() {
        return "Work{" + "title=" + title + '}';
    }
    
    
}
