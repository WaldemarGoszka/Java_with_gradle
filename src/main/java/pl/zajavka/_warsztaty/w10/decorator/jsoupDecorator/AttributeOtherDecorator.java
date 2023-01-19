package pl.zajavka._warsztaty.w10.decorator.jsoupDecorator;

import org.jsoup.nodes.Attribute;

public class AttributeOtherDecorator extends AttributeDecorator{
    public AttributeOtherDecorator(final Attribute attribute) {
        super(attribute);
    }

    @Override
    public String getKey() {
        System.out.println("Decorator other step");
        return super.getKey();
    }

}
