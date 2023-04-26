
public class FilmsManager {
    private String[] films = new String[0];
    private int limit;

    public FilmsManager() {
        this.limit = 5;
    }

    public FilmsManager(int limit) {
        this.limit = limit;
    }

    public void addFilm(String film) {

        String[] tmp = new String[films.length + 1];

        for (int i = 0; i < films.length; i++) {

            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;

        films = tmp;


    }

    public String[] findAll() {

        return films;
    }


    public String[] findLast() {
        int resultlength;
        if (films.length < limit) {
            resultlength = films.length;

        } else {
            resultlength = limit;
        }
        String[] tmp = new String[resultlength];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = films[films.length - 1 - i];
        }
        return tmp;
    }
}