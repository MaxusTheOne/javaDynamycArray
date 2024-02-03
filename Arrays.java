public class Arrays {

  public void start() {
    var p1 = new Person("Markus bille");
    Person harry = new Person("Harry Potter");
    Person ron = new Person("Ron Weasley");
    Person hermione = new Person("Hermione Granger");

    var testArray = new DynamicArray();

    System.out.println("start size is: " + testArray.getSize());

    testArray.add(p1);
    System.out.println("added: " + testArray.get(0));
    testArray.add(harry);
    System.out.println("added: " + testArray.get(1));
    testArray.add(ron);
    System.out.println("added: " + testArray.get(2));
    testArray.add(hermione);
    System.out.println("added: " + testArray.get(3));

    System.out.println("current size is: " + testArray.getSize());

    testArray.remove(1);

    System.out.println(
      "removed index 1, size is now: " +
      testArray.getSize() +
      "\nindex 1 is now: " +
      testArray.get(1)
    );

    testArray.clear();
    System.out.println("Clearing array, size is now: " + testArray.getSize());
  }

  public class DynamicArray {

    private String[] dynamicArray = new String[20];
    private int arraySize = 0;

    public int getSize() {
      return arraySize;
    }

    public void add(Person person) {
      dynamicArray[arraySize] = person.getFullName();
      arraySize++;
    }

    public String get(int index) {
      return dynamicArray[index];
    }

    public void remove(int index) {
      arraySize--;
      if (index >= arraySize) {
        dynamicArray[index] = null;
      } else {
        this.moveIndex(index);
      }
    }

    public void remove() {
      dynamicArray[arraySize - 1] = null;
      arraySize--;
    }

    public void moveIndex(int index) {
      dynamicArray[index] = dynamicArray[index + 1];
      if (index != arraySize) {
        this.moveIndex(index + 1);
      } else {
        return;
      }
    }

    public void clear() {
      dynamicArray = new String[20];
      arraySize = 0;
    }
  }

  public static void main(String[] args) {
    Arrays app = new Arrays();
    app.start();
  }
}
