package hu.bme.mit.train.system;

import static org.junit.Assert.assertThat;

import org.junit.Assert;
import org.junit.Test;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;

public class Tachotest {
    
    @Test
public void givenTable_whenGet_returnsSuccessfully() {
    Table<Integer, Integer, Integer> universityCourseSeatTable 
      = HashBasedTable.create();
    universityCourseSeatTable.put(10, 10, 120);
    universityCourseSeatTable.put(11, 11, 60);
    universityCourseSeatTable.put(12, 12, 60);
    universityCourseSeatTable.put(13, 13, 120);

    int szam 
      = universityCourseSeatTable.get(10, 10);


      Assert.assertEquals(120, szam);

}

}