package practice03.own_practice;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class Stream implements Iterator<Group>{
    private List<Group> groups;
    private int groupCount = 0;

    public Stream (List <Group> groups){
        this.groups = groups;
    }

    public int getGroupCount(){
        return groups.size();
    }
    @Override
    public boolean hasNext() {
        return groupCount < groups.size();
    }

    @Override
    public Group next() {
        if(!hasNext()){
            throw new NoSuchElementException("No more groups in stream");
        }
        return groups.get(groupCount++);
    }
    @Override
    public void remove(){
        if (groupCount <= 0 ){
            throw new IllegalStateException("You can't remove a group before the first next() call");
        }
        groups.remove(--groupCount);
    }

}
