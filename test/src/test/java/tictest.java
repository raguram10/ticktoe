import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class tictest {
    @Test
    void tictoetest()
    {
        tictoe tick=new tictoe(3);
        tick.move(1,0,0);
        tick.move(-1,1,1);
        //tick.move(1,0,1);
        //tick.move(-1,0,2);
        //tick.move(1,1,0);
        //tick.move(-1,2,0);
        Assert.assertEquals(3,tick.getWinner());

    }
}
