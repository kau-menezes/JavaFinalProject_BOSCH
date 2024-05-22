package collections;
 
public class HashNode <T> {

    private Integer index;
    private T value;    
    
    public HashNode(Integer index, T value) {
        this.index = index;
        this.value = value;
    }

    public Integer getIndex() {
        return index;
    }
    
    public void setIndex(Integer index) {
        this.index = index;
    }
    
    public T getValue() {
        return value;
    }
    
    public void setValue(T value) {
        this.value = value;
    }
    
}
