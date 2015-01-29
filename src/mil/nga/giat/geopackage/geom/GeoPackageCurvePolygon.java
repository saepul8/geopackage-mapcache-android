package mil.nga.giat.geopackage.geom;

import java.util.ArrayList;
import java.util.List;

/**
 * GeoPackage Curve Polygon
 * 
 * @author osbornb
 */
public class GeoPackageCurvePolygon<T extends GeoPackageCurve> extends
		GeoPackageSurface {

	/**
	 * List of rings
	 */
	private List<T> rings = new ArrayList<T>();

	/**
	 * Constructor
	 * 
	 * @param hasZ
	 * @param hasM
	 */
	public GeoPackageCurvePolygon(boolean hasZ, boolean hasM) {
		super(GeometryType.CURVEPOLYGON, hasZ, hasM);
	}

	/**
	 * Constructor
	 * 
	 * @param type
	 * @param hasZ
	 * @param hasM
	 */
	protected GeoPackageCurvePolygon(GeometryType type, boolean hasZ,
			boolean hasM) {
		super(type, hasZ, hasM);
	}

	public List<T> getRings() {
		return rings;
	}

	public void setRings(List<T> rings) {
		this.rings = rings;
	}

	public void addRing(T ring) {
		rings.add(ring);
	}

	/**
	 * Get the number of rings
	 * 
	 * @return
	 */
	public int numRings() {
		return rings.size();
	}

}
