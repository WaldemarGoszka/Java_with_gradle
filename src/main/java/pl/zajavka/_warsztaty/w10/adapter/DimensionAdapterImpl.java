package pl.zajavka._warsztaty.w10.adapter;

import lombok.Data;

import java.math.BigDecimal;

@Data

public class DimensionAdapterImpl implements DimensionAdapter{
    private static final double INCH_TO_METER = 0.0254;
    private Dimension dimension;

    public DimensionAdapterImpl(Dimension dimension) {
        this.dimension = dimension;
    }

    @Override
    public BigDecimal getDimension() {
        return convertIntToMeter(dimension.getDimension());
    }

    private BigDecimal convertIntToMeter(BigDecimal inch) {
        return BigDecimal.valueOf(INCH_TO_METER).multiply(inch);
    }

}
