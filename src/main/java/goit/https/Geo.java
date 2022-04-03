package main.java.goit.https;

public class Geo {
        private float lat;
        private float lng;

    public float getLat() {
        return lat;
    }

    public void setLat(float lat) {
        this.lat = lat;
    }

    public float getLng() {
        return lng;
    }

    @Override
    public String toString() {
        return "Geo{" +
                "lat=" + lat +
                ", lng=" + lng +
                '}';
    }

    public void setLng(float lng) {
        this.lng = lng;
    }
}
