package pl.zajavka._warsztaty.w10.adapter;

import java.math.BigDecimal;

public class SonyTV implements Dimension{
    @Override
    public BigDecimal getDimension() {
        return BigDecimal.valueOf(49);
    }
}
