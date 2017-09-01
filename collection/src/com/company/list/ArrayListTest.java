package com.company.list;

import com.company.models.Contract;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Ayupov on 20.04.2017.
 */
public class ArrayListTest {

    private ArrayList<Contract> contractArrayList;

    private final Contract CONTRACT = new Contract(1, "Sidikov", "Ypsupov", "02.02.02");
    private final Contract CONTRACT_1 = new Contract(1, "Sidikova", "Ypsupova", "02.02.02");
    private final Contract CONTRACT_2 = new Contract(1, "Sidikovs", "Ypsupovs", "02.02.02");
    @Before
    public void setUp() throws Exception {
        contractArrayList = new ArrayList<>();
        contractArrayList.add(CONTRACT);
        contractArrayList.add(CONTRACT_1);
        contractArrayList.add(CONTRACT_2);
    }

    @Test
    public void indexOfTest() throws Exception {
        int actual = contractArrayList.indexOf(CONTRACT_1);
        int expected = 1;
        assertEquals(actual, expected);
    }

}