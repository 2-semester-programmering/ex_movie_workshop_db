package clbo.movieworkshop.models;

public class Movie implements Comparable<Movie> {

    // Year;Length;Title;Subject;Popularity;Awards
    private int id;
    private int year;
    private int length;
    private String title;
    private String subject;
    private int popularity;
    private String awards;

    public Movie(int id, int year, int length, String title, String subject, int popularity, String awards) {
        this.id = id;
        this.year = year;
        this.length = length;
        this.title = title;
        this.subject = subject;
        this.popularity = popularity;
        this.awards = awards;
    }

    public Movie() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getPopularity() {
        return popularity;
    }

    public void setPopularity(int popularity) {
        this.popularity = popularity;
    }

    public String getAwards() {
        return awards;
    }

    public void setAwards(String awards) {
        this.awards = awards;
    }

    @Override
    public int compareTo(Movie o) {
        // return: -1 if this is smaller than o,
        // 0 if they are equal,
        // 1 if this is larger than o
        // Ex: 5-10 = -5 then 5 (first) is smalest.
        // Ex: 5-5 = 0 then both are equal
        // Ex: 10-5 = 5 then 10 (first) is largest
        // debug: //System.out.print(Integer.parseInt(this.popularity) - Integer.parseInt(o.popularity) + ", ");
        return this.popularity - o.popularity;

        // if we would look inside
    }
}
