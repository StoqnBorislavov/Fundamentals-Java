package ObjectsAndClasses.Lab.Songs;

public class Song {
    private String typeList;
    private String name;
    private String type;

    public String getTypeList() {
        return typeList;
    }

    public String getName() {
        return name;
    }

    public Song(String typeList, String name, String type) {
        this.typeList = typeList;
        this.name = name;
        this.type = type;
    }
}
