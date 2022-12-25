public class Truck extends Car implements iRefueling{
    private int loadCapacity;

    public Truck(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void setFuelType(TypeFuel fuelType) {
        super.setFuelType(TypeFuel.DIESEL);
    }

    @Override
    public TypeFuel fuel() {
        return TypeFuel.DIESEL;
    }
}
//Принцип DIP нарушается (Абстракции не должны зависеть от деталей. Детали должны зависеть от абстракций.)
// В данном случае использование конкретного типа топлива нарушает этот принцип.
// Конкретизирование типа топлива должно происходить уже на этапе создание конкретного экземпляра класса.
