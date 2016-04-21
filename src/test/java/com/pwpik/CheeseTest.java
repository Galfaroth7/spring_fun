package com.pwpik;

import com.pwpik.cheese.Cheese;
import com.pwpik.cheese.CheeseRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
public class CheeseTest {

    @Autowired
    private CheeseRepository cheeses;

    @Test
    public void cheese_name(){
        Iterable<Cheese> result = cheeses.findAll();
        String nameOfFirst = result.iterator().next().getName();
        Assert.assertEquals("Edam", nameOfFirst);
    }

}