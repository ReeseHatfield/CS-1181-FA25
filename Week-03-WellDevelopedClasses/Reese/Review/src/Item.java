public class Item {
    // POJO 
    String name;
    Integer id;

    public Item(String name, Integer id){
        this.name = name;
        this.id = id;
    }


    public Item(Item other) {
        this.name = other.name;
        this.id = other.id;
    }
}
