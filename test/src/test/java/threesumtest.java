

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import java.util.List;
import static java.util.Arrays.asList;


public class threesumtest {


    @Test
    public void testadd()
    {
        List<List<Integer>> res=asList(asList(-1,0,1),(asList(-1,-1,2)));
        List<List<Integer>> res1=threesum.main(new int[]{-6,-8,-9,4,-14,6,-10,7,12,13,4,9,7,14,-12,7,0,14,-1,-3,2,2,-3,11,-6,-10,-13,-13,1,-9,2,2,-2,8,-9,0,-9,-12,14,10,8,3,4,0,-6,7,14,9,6,-2,13,-15,8,-5,3,-13,-8,5,-11,0,11,6,-13,-14,-9,-15,-7,-11,10,-7,14,4,3,3,11,13,-13,11,-1,0,-6,-10,0,9,0,10,11,0,0,-14,-15,-12,-1,10,12,-2,2,-10,2,-2,-10,2,-13,1,12,5,-1,-15,1,5,-8,3,10,8});
        //Assert.assertTrue(res.size()==res1.size()&&res.containsAll(res1)&&res1.containsAll(res));
        for(List<Integer> g:res1)
            System.out.println(g);
    }
    @Test
    void pa()
    {
        String s="[()]{}{[()()]()}";
        Assert.assertTrue(para.main(s));
    }
    @Test
    void palin()
    {
        String st="aba";
        Assert.assertEquals("aba",palin.main(st));
    }

}
