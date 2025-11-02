package task_13;

public class Shirt {
    private String code;
    private String name;
    private String color;
    private String size;

    public Shirt(String code, String name, String color, String size) {
        this.code = code;
        this.name = name;
        this.color = color;
        this.size = size;
    }

    // Конструктор из строки с разделителями
    public Shirt(String shirtData) {
        String[] parts = shirtData.split(",");
        if (parts.length >= 4) {
            this.code = parts[0];
            this.name = parts[1];
            this.color = parts[2];
            this.size = parts[3];
        }
    }

    @Override
    public String toString() {
        return "Код товара: " + code + "\n" +
                "Название: " + name + "\n" +
                "Цвет: " + color + "\n" +
                "Размер: " + size + "\n";
    }

    public String getCode() {
        return code;
    }
    public String getName() {
        return name;
    }
    public String getColor() {
        return color;
    }
    public String getSize() {
        return size;
    }
}