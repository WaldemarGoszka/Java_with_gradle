package pl.zajavka._warsztaty.w10.decorator.jsoupDecorator;

import org.jsoup.nodes.Attribute;

public class AttributeBeforeDecorator extends AttributeDecorator{
    public AttributeBeforeDecorator(final Attribute attribute) {
        super(attribute);
    }

    @Override
    public String getKey() {
        System.out.println("Decorator before step");
        return super.getKey();
    }

}
