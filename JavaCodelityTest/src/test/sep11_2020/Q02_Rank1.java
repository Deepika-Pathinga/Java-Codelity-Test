package test.sep11_2020;

import java.util.Comparator;

public class Q02_Rank1 implements Comparator<Q02_Student> 
{
    @Override
    public int compare(Q02_Student s1, Q02_Student s2) {
        return  s2.getMarks().compareTo(s1.getMarks());
     }
}
