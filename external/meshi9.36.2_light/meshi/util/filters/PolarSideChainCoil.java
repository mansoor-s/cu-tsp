package meshi.util.filters;

/**
 * Created by chen on 13/12/2015.
 */
public class PolarSideChainCoil implements Filter{
    private static Filter f1 = new PolarSideChains();
    private static Filter f2 = new SecondaryStructureFilter();

    public boolean accept(Object obj) {
        return f1.accept(obj) && (!f2.accept(obj));
    }
}