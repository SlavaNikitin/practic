
package organization;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Unit {

    private String title;
    private Unit parent;
    private List<Unit> children;
    private Worker head;
    private Set<Worker> worker;
    
    public void setTitle(String title){
        this.title = title;
    }
    
    public void setParent(Unit parent){
        this.parent = parent;
    }
    
    public void setChildren(List<Unit> children){
        this.children = children;
    }
    
    public void setHead(Worker head){
        this.head = head;
    }
    
    public void setWorker(Set<Worker> worker){
        this.worker = worker;
    }
    
    public String getTitle(){
        return title;
    }
    
    public Unit getParent(){
        return parent;
    }
    
    public List<Unit> getChildren(){
        return children;
    }
    
    public Worker getHead(){
        return head;
    }
    
    public Set<Worker> getWorker(){
        return worker;
    }

    @Override
    public String toString() {
        return "Структурная единица{" + "название = " + title + ", родительская структурная единица = " + parent + ", дочерние структурные единицы = " + children + ", head = " + head + ", worker = " + worker + '}';
    }

    
    
    
}
