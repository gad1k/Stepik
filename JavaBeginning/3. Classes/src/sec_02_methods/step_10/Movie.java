package sec_02_methods.step_10;

class Movie {
    private String title;
    private String desc;
    private int year;

    public Movie(String title, String desc, int year) {
        this.title = title;
        this.desc = desc;
        this.year = year;
    }

    public Movie(String title, int year) {
        this.title = title;
        this.desc = "empty";
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public String getDesc() {
        return desc;
    }

    public int getYear() {
        return year;
    }
}