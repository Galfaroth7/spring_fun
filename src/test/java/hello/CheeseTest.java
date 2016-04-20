package hello;

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
        System.out.println(nameOfFirst);
        Assert.assertEquals("edam", nameOfFirst);
    }

    @Test
    public void store_cheese() {
        cheeses.save(new Cheese("Mozarella"));
    }

}