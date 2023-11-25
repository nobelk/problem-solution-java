package org.app;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

class Interval {
    public int start;
    public int end;

    public Interval(int start, int end){
        this.start = start;
        this.end = end;
    }
}

public class OverlappingInterval {

    public OverlappingInterval(){

    }

    public static List<Interval> merge(List<Interval> intervals){
        if (intervals.size() < 2){
            return intervals;
        }

        intervals.sort((a, b) -> Integer.compare(a.start, b.start));
        List<Interval> mergedInterval = new LinkedList<>();
        Iterator<Interval> intervalItr = intervals.iterator();
        Interval current = intervalItr.next();
        int start = current.start;
        int end = current.end;

        while(intervalItr.hasNext()){
            current = intervalItr.next();
            if(current.start <= end){
                end = Math.max(current.end, end);
            }
            else{ // non overlapping interval, add both
                mergedInterval.add(new Interval(start, end));
                start = current.start;
                end = current.end;
            }
        }

        // add the last remaining interval
        mergedInterval.add(new Interval(start, end));

        return mergedInterval;
    }


    public static void main(String[] args) {
        List<Interval> input = new ArrayList<Interval>();
        input.add(new Interval(1, 4));
        input.add(new Interval(2, 5));
        input.add(new Interval(7, 9));
        System.out.print("Merged intervals: ");
        for (Interval interval : OverlappingInterval.merge(input))
            System.out.print("[" + interval.start + "," + interval.end + "] ");
        System.out.println();

        input = new ArrayList<Interval>();
        input.add(new Interval(6, 7));
        input.add(new Interval(2, 4));
        input.add(new Interval(5, 9));
        System.out.print("Merged intervals: ");
        for (Interval interval : OverlappingInterval.merge(input))
            System.out.print("[" + interval.start + "," + interval.end + "] ");
        System.out.println();

        input = new ArrayList<Interval>();
        input.add(new Interval(1, 4));
        input.add(new Interval(2, 6));
        input.add(new Interval(3, 5));
        System.out.print("Merged intervals: ");
        for (Interval interval : OverlappingInterval.merge(input))
            System.out.print("[" + interval.start + "," + interval.end + "] ");
        System.out.println();
    }

}
