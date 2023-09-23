package ex08;

public class Ambiente {
    private float area;

    public Ambiente(float area) {
        this.area = area;
    }
    
    public float getArea() {
        return area;
    }
    
    public void setArea(float area) {
        this.area = area;
    }
    
    @Override
    public String toString() {
        return "Ambiente [area=" + area + "]";
    }
}
