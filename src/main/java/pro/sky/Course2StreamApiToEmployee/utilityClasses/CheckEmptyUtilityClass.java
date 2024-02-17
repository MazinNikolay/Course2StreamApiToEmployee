package pro.sky.Course2StreamApiToEmployee.utilityClasses;

public class CheckEmptyUtilityClass {
    public static boolean checkEmptyData(String data) {
        return data.isEmpty() || data.isBlank();
    }

    public static boolean checkEmptyData(int data) {
        return data <= 0;
    }

    public static boolean checkEmptyData(double data) {
        return data <= 0;
    }
}
