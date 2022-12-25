
/*
класс кроссовера

 */
public class CrossoverUtilityVehicle extends Car implements iRefueling {
    private boolean allWheeldrive;

    public boolean isAllWheeldrive() {
        return allWheeldrive;
    }

    public void setAllWheeldrive(boolean allWheeldrive) {
        this.allWheeldrive = allWheeldrive;
    }

    public CrossoverUtilityVehicle(boolean allWheeldrive) {
        this.allWheeldrive = allWheeldrive;
    }

    @Override
    public TypeFuel fuel() {
        return TypeFuel.GASOLINE;

    }

    @Override
    public void setFuelType(TypeFuel fuelType) {
        super.setFuelType(TypeFuel.GASOLINE);
    }
}
//Принцип DIP нарушается (Абстракции не должны зависеть от деталей. Детали должны зависеть от абстракций.)
// В данном случае использование конкретного типа топлива нарушает этот принцип.
// Конкретизирование типа топлива должно происходить уже на этапе создание конкретного экземпляра класса.
