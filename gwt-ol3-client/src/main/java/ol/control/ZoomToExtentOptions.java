package ol.control;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * ZoomToExtent control options.
 *
 * @author sbaumhekel
 *
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class ZoomToExtentOptions extends ControlOptions {

    /**
     * CSS class name. Default is "ol-zoom-extent".
     * @param className
     *            class name
     */
    @JsProperty
    public native void setClassName(String className);

    /**
     * The extent to zoom to. If undefined the validity extent of the view
     * projection is used.
     * @param extent
     *            extent
     */
    @JsProperty
    public native void setExtent(ol.Extent extent);

    /**
     * Text label to use for the button. Default is "E". Instead of text, also a
     * Node (e.g. a span element) can be used.
     * @param label
     *            label
     */
    @JsProperty
    public native void setLabel(String label);

    /**
     * Text label to use for the button tip. Default is "Zoom to extent".
     * @param tipLabel
     *            tip label
     */
    @JsProperty
    public native void setTipLabel(String tipLabel);

}
