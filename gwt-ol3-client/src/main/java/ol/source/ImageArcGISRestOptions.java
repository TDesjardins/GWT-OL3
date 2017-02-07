package ol.source;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * Image ArcGIS Rest Options.
 * 
 * @author Peter Zanetti
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class ImageArcGISRestOptions extends SourceOptions {

    @JsProperty
    public native void setCrossOrigin(String crossOrigin);

    @JsProperty
    public native String getCrossOrigin();

    @JsProperty
    public native void setImageLoadFunction(ImageLoadFunction imageLoadFunction);

    @JsProperty
    public native ImageLoadFunction getImageLoadFunction();

    @JsProperty
    public native void setParams(ImageArcGISRestParams params);

    @JsProperty
    public native ImageArcGISRestParams getParams();

    @JsProperty
    public native void setRatio(float ratio);

    @JsProperty
    public native float getRatio();

    @JsProperty
    public native void setResolutions(double[] resolutions);

    @JsProperty
    public native double[] getResolutions();

    @JsProperty
    public native void setUrl(String url);

    @JsProperty
    public native String getUrl();
}
