package ch.cern.maps.utils;

public class Constants {
	
	public static final String APP_NAME = "CERNmaps";
	public static final String TAG = "CERNMAPS";
	
	public final static String TYPEFONT_NEOSANS = "NeoSans.ttf";
	
	public static final String JSON_TAG_TRAMS = "trams";
	public static final String JSON_TAG_TRAMS_LINE = "line";
	public static final String JSON_TAG_TRAMS_TIME = "time";
	
	public static final String JSON_TAG_BUILDINGS = "buildings";
	public static final String JSON_TAG_BUILDINGS_NAME = "name";
	public static final String JSON_TAG_BUILDINGS_NS = "NS";
	public static final String JSON_TAG_BUILDINGS_WE = "WE";
	
	public static final int MAP_HEIGHT = 6384;
	public static final int MAP_WIDTH = 3644;
	
	public static final double MAP_NORTH = 46.267;
	public static final double MAP_SOUTH = 46.227;
	public static final double MAP_WEST = 6.032;
	public static final double MAP_EAST = 6.065;
	
	public static final int LocateMeTreshold = 20000;
	public static final String LocationActionTag = "LocationRequest";
	public static final String LocationFlagLatitude = "LatitudeRequest";
	public static final String LocationFlagLongitude = "LongitudeRequest";
	public static final String LocationFlagAccuracy = "AccuracyRequest";
	public static final String ProvidersActionTag = "ProvidersRequest";
	public static final String GPSProvider = "GPSProvider";
	public static final String NetworkProvider = "NetworkProvider";
	public static final String OrientationActionTag = "OrientatonRequest";
	public static final String OrientationFlagAzimuth = "AzimuthRequest";
	public static final String GPSRequest = "SharedPreferencesGPS";
	public static final String SharedPreferences = "SharedPreferences";
	
}
