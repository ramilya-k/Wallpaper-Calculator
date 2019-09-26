public class Main {
    public static void main(String[] args) {
        double roomLength1 = 7;
        double roomLength2 = 4;
        double roomLength3 = 7;
        double roomLength4 = 4;
        double perimeter = roomLength1 + roomLength2 + roomLength3 + roomLength4;
        double rollWidth = 1.2;
        double count = (Math.ceil(perimeter / rollWidth));
        double rollLength = 10;
        double height = 2.9;
        int numberOfCanvas = (int) ((int) rollLength / height);
        int numberOfRolls = (int) count / numberOfCanvas;
        System.out.print(Math.ceil(numberOfRolls));
    }
}
