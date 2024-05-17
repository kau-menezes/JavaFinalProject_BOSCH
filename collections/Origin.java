package collections;

public class Origin {
    
    Integer size;
    
    Origin() {
        
        this.size = 0;
    }
    
    protected Integer getSize() {
        return this.size;
    }

    protected void setSize(Integer value)
    {
        this.size = value;
    }
}