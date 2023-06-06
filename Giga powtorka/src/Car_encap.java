public class Car_encap {


    private String make;
    private String model;
    private int year;

    Car_encap(String make, String model, int year){
        /*this.make = make;
        this.model = model;
        this.year = year;
         *///teraz można to zastępić setterami
        this.setMake(make);
        this.setModel(model);
        this.setYear(year);
    }

    Car_encap(Car_encap car){
//        this.setMake(car.getMake());
//        this.setModel(car.getModel());
//        this.setYear(car.getYear());
//        czyli to samo co w copy
        this.copy(car);
    }
    public String getMake(){
        return make;
    }
    public void setMake(String make){
        this.make = make;
    }
    public String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model = model;
    }
    public int getYear(){
        return year;
    }
    public void setYear(int year){
        this.year = year;
    }
    public void copy(Car_encap car){
        this.setMake(car.getMake());
        this.setModel(car.getModel());
        this.setYear(car.getYear());
    }
}
