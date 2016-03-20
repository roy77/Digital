package de.neemann.digital.core.element;

import de.neemann.digital.gui.draw.shapes.Shape;

/**
 * @author hneemann
 */
public interface ShapeFactory {
    Shape create(ElementAttributes elementAttributes);
}