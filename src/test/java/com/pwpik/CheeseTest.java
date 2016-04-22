package com.pwpik;

import com.pwpik.cheese.Cheese;
import com.pwpik.cheese.CheeseRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Collection;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
public class CheeseTest {

    @Autowired
    private CheeseRepository cheeses;

    @Test
    public void h2_data_correctness(){
        Assert.assertEquals("Edam", cheeses.findOne(1).getName());
        Assert.assertEquals(Integer.valueOf(1), cheeses.findByName("Edam").getId());
        Cheese threeFirst[] = cheeses.findByIdBetweenOrderByNameDesc(1,3)
                                     .toArray(new Cheese[3]);
        Assert.assertEquals("Rydzki", threeFirst[0].getName());
        Assert.assertEquals("Gouda", threeFirst[1].getName());
        Assert.assertEquals("Edam", threeFirst[2].getName());
    }

}