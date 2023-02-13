public class Car {
    public String modelName;
    public int mileAge;

    public Car(String modelName, int mileAge) {
        this.modelName = modelName;
        this.mileAge = mileAge;
    }

    @Deprecated
    public void printCarDetails(){
        System.out.println(modelName + " - " + mileAge);
    }
    public void getCarDetails(){
        System.out.println(modelName);
        System.out.println(mileAge);
    }

}