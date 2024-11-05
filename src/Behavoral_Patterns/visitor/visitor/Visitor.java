package visitor.visitor;

import visitor.shapes.Circle;
import visitor.shapes.CompoundShape;
import visitor.shapes.Dot;
import visitor.shapes.Rectangle;

public interface Visitor {
    String visitDot(Dot dot);

    String visitCircle(Circle circle);

    String visitRectangle(Rectangle rectangle);

    String visitCompoundGraphic(CompoundShape cg);
}
