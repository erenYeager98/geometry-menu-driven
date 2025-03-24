class Volume {
    private double length;
    private double width;
    private double height;

    public Volume(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double calculateVolume_rectangle() {
        return length * width * height;
    }

    public double caluculateVolume_cylinder() {
        return Math.PI * Math.pow(length / 2, 2) * height;
    }

    public double calculateVolume_sphere() {
        return (4.0 / 3.0) * Math.PI * Math.pow(length / 2, 3);
    }
    public double calculateVolume_cone() {
        return (1.0 / 3.0) * Math.PI * Math.pow(length / 2, 2) * height;
    } 
    public double calculateVolume_cube() {
        return Math.pow(length, 3);
    }
    public double calculateVolume_cuboid() {
        return length * width * height;
    }
}