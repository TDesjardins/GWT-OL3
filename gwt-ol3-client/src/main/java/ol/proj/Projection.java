package ol.proj;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;
import ol.Coordinate;
import ol.Extent;

/**
 * Projection definition class. One of these is created for each projection
 * supported in the application and stored in the {@link ol.proj} namespace. You
 * can use these in applications, but this is not required, as API params and
 * options use {@link ol.proj.ProjectionLike} which means the simple string code
 * will suffice.
 *
 * You can use {@link ol.proj.get} to retrieve the object for a particular
 * projection.
 *
 * The library includes definitions for `EPSG:4326` and `EPSG:3857`, together
 * with the following aliases: * `EPSG:4326`: CRS:84,
 * urn:ogc:def:crs:EPSG:6.6:4326, urn:ogc:def:crs:OGC:1.3:CRS84,
 * urn:ogc:def:crs:OGC:2:84, http://www.opengis.net/gml/srs/epsg.xml#4326,
 * urn:x-ogc:def:crs:EPSG:4326 * `EPSG:3857`: EPSG:102100, EPSG:102113,
 * EPSG:900913, urn:ogc:def:crs:EPSG:6.18:3:3857,
 * http://www.opengis.net/gml/srs/epsg.xml#3857
 *
 * If you use proj4js, aliases can be added using `proj4.defs()`; see
 * [documentation](https://github.com/proj4js/proj4js).
 *
 * @author Tino Desjardins
 *
 */
@JsType(isNative = true)
public class Projection {

    public Projection(ProjectionOptions projectionOptions) {}
    
    /**
     * Get the code for this projection, e.g. 'EPSG:4326'.
     * 
     * @return {string} Code.
     */
    public native String getCode();

    /**
     * Get the validity extent for this projection.
     * 
     * @return {ol.Extent} Extent.
     */
    public native Extent getExtent();

    /**
     * Get the amount of meters per unit of this projection. If the projection
     * is not configured with `metersPerUnit` or a units identifier, the return
     * is `undefined`.
     * 
     * @return {number|undefined} Meters.
     */
    public native double getMetersPerUnit();

    /**
     * Get the resolution of the point in degrees or distance units. For
     * projections with degrees as the unit this will simply return the provided
     * resolution. The default for other projections is to estimate the point
     * resolution by transforming the 'point' pixel to EPSG:4326, measuring its
     * width and height on the normal sphere, and taking the average of the
     * width and height. An alternative implementation may be given when
     * constructing a projection. For many local projections, such a custom
     * function will return the resolution unchanged.
     * 
     * @param resolution
     *            Resolution in projection units.
     * @param point
     *            Point.
     * @return {number} Point resolution in projection units.
     */
    public native double getPointResolution(double resolution, ol.Coordinate point);

    /**
     * Get the units of this projection.
     * 
     * @return {ol.proj.Units} Units.
     */
    public native String getUnits();

    /**
     * Get the world extent for this projection.
     * 
     * @return {ol.Extent} Extent.
     */
    public native Extent getWorldExtent();

    /**
     * Is this projection a global projection which spans the whole world?
     * 
     * @return {boolean} Whether the projection is global.
     */
    public native boolean isGlobal();

    /**
     * Set if the projection is a global projection which spans the whole world
     * 
     * @param global
     *            Whether the projection is global.
     */
    public native void setGlobal(boolean global);

    /**
     * Set the validity extent for this projection.
     * 
     * @param extent
     *            Extent.
     */
    public native void setExtent(Extent extent);

    /**
     * Set the world extent for this projection.
     * 
     * @param worldExtent
     *            World extent [minlon, minlat, maxlon, maxlat].
     */
    public native void setWorldExtent(Extent worldExtent);

	/**
	 * 
	 * Transforms a coordinate from longitude/latitude to a different projection.
	 *
	 * @param coordinate
	 * @return
	 */
	@JsMethod(name = "fromLonLat", namespace = "ol.proj")
	public static native Coordinate fromLonLat(Coordinate coordinate);

	/**
	 * 
	 * Transforms a coordinate from source projection to destination projection.
	 * This returns a new coordinate (and does not modify the original).
	 *
	 * @param coordinate
	 * @param source
	 * @param target
	 * @return
	 */
	@JsMethod(name = "transform", namespace = "ol.proj")
	public static native Coordinate transform(Coordinate coordinate, String source, String target);

}
