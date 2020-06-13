import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {
    private List<String> createList(String ... users){
        return new ArrayList<>(Arrays.asList(users))
    }

    @Test
    void everyStatementTest(){
    User user = new User("renata", "password", "renata.dimoska@yaho.com");
    assertEquals("renata","null" );
    assertEquals("renata.dimoska@yahoo.com", "null");
    assertEquals("renata", "renata");
    }


    @Test
    void testEveryPath(){

    }
}