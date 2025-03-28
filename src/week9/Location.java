package week9;

public class Location {
    private double latitude;
    private double longitude;

    public Location(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    @Override
    public boolean equals(Object obj) {
        if (!obj.getClass().equals(this.getClass())) {
            return false;
        }
        Location other=(Location) obj;
        if (Math.abs(this.latitude-other.latitude)>.001)
            return false;
        if (Math.abs(this.longitude-other.longitude)>.001){
            return false;
        }
        return true;
    }
}
