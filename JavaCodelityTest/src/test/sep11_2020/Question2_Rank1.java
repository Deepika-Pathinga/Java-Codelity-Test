package test.sep11_2020;

import java.util.Comparator;

public class Question2_Rank1 implements Comparator<Question2_Student> 
{
    @Override
    public int compare(Question2_Student s1, Question2_Student s2) {
        return  s2.getMarks().compareTo(s1.getMarks());
     }
}
