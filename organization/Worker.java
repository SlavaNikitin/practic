package organization;

import java.util.List;

public class Worker {
    
    private String family;
    private String name;
    private String surname;
    private String birthday;
    private List<Work> work;
    
    public void setFamily(String family) {
        this.family = family;
    }
 
    public void setName(String name) {
        this.name = name;
    }
    
    public void setSurname(String surname) {
        this.surname = surname;
    }
    
    public void setBirthday(String birthday){
        this.birthday = birthday;
    }
    
    public void setWork(List<Work> work){
        this.work = work;
    }
    
    public String getFamily() {
        return family;
    }
 
    public String getName() {
        return name;
    }
    
    public String getSurname(){
        return surname;
    }
    
    public String getBirthday(){
        return birthday;
    }
    
    public List<Work> getWork(){
        return work;
    }

    @Override
    public String toString() {
        return "Worker{" + "family=" + family + ", name=" + name + ", surname=" + surname + ", birthday=" + birthday + ", work=" + work + '}';
    }
}    
 
   

