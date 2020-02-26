

import org.junit.Ignore;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Unit test for simple CollectionListSetMap.
 * Clayton Claassens 217299695
 * 3A
 * Assignment2
 * JUnit
 */
public class CollectionListSetMapTest
{
    public ColletionListSetMap collectionListSetMap;
    private String failMessage = "This is my failing test message";

    @Test
    public void testList()
    {

        collectionListSetMap = new ColletionListSetMap();
        List<Integer> actualList = collectionListSetMap.getList();
        List<Integer> expectedList = Arrays.asList(7,12,22);

        //ListTest
        assertEquals(actualList,expectedList);
        assertThat(actualList,hasItems(7));
        assertThat(actualList,hasItems(12));
        assertThat(actualList,hasItems(22));


    }

    @Test
    public void testSet(){

        collectionListSetMap = new ColletionListSetMap();

        HashSet<String> actualSet = collectionListSetMap.getSet();
        HashSet<String> expectedSet = new HashSet<String>();
        expectedSet.add("David");
        expectedSet.add("Luke");
        expectedSet.add("Riyaad");

        //SetTest
        assertEquals(actualSet, expectedSet);
        assertThat(actualSet,is(expectedSet));
        assertThat(actualSet,hasItems("Riyaad"));


    }
    //@Ignore
    @Test (timeout = 1000)
    public void testMap(){

        collectionListSetMap = new ColletionListSetMap();

        HashMap<String, String> actualMap = collectionListSetMap.getMap();
        HashMap<String, String> expectedMap = new HashMap();
        expectedMap.put("Cape Town", "South Africa");
        expectedMap.put("Luanda", "Angola");
        expectedMap.put("Yaounde", "Cameroon");

        //MapTest
        assertThat(actualMap,is(expectedMap));
        assertThat(actualMap.size(),is (3));


    }

    @Test
    public void failTest(){

        fail(failMessage);

    }

    @Ignore
    @Test
    public void disablingTest(){

        System.out.print("DisablingTest");
    }
}
