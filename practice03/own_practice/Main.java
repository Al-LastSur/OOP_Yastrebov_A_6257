package practice03.own_practice;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;


public class Main{
public static void main (String[] args){
    List<Group> groupList1 = List.of(new Group("Group1"), new Group("Group2"), new Group("Group3"));
    Stream stream01 = new Stream (groupList1);
    List<Group> groupList2 = List.of(new Group("Group11"), new Group("Group22"));
    Stream stream02 = new Stream (groupList2);
    List<Group> groupList3 = List.of(new Group("Group111"), new Group("Group222"), new Group("Group333"), new Group("Group444"));
    Stream stream03 = new Stream (groupList3);

    List<Stream> streams = Arrays.asList(stream01, stream02, stream03);

    System.out.println("Before Sorting: ");
    for (Stream stream : streams){
        System.out.println("Stream with " + stream.getGroupCount() + "groups.");
    }
    Collections.sort (streams, new StreamComparator());

    System.out.println("After Sorting: ");
    for (Stream stream : streams){
        System.out.println("Stream with" + stream.getGroupCount() + "groups");
    }
}
}
